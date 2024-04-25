package com.example.websockettest.socket;

import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author acan
 * @version 2023/06/04 22:07
 */
@Component
@Slf4j
@ServerEndpoint("websocket/username")
public class WebSocket {

    private static AtomicInteger onlineClient = new AtomicInteger(0);

    private static Map<String, Session> onlineClientMap = new ConcurrentHashMap<>();

    private static final String USER_NAME = "username";

    @OnOpen
    public void onOpen(Session session, @PathParam(USER_NAME) String username) {
        String id = session.getId();
        onlineClient.incrementAndGet();
        onlineClientMap.put(id, session);
        log.info("time [{}] link user [{}] open, link order [{}], total link count [{}]",
                new Date(),
                username,
                id,
                onlineClient
        );
    }

    @OnClose
    public void onClose(Session session, @PathParam(USER_NAME) String username) {
        String id = session.getId();
        onlineClient.decrementAndGet();
        onlineClientMap.remove(id);
        log.info("time [{}] link user [{}] close, link order [{}], total link count [{}]",
                new Date(),
                username,
                id,
                onlineClient
        );
    }

    @OnError
    public void onError(Throwable error, Session session, @PathParam(USER_NAME) String username) {
        log.error("error", error);
    }

    @OnMessage
    public void onMessage(Session session, String message, @PathParam(USER_NAME) String username) throws IOException {
        log.info("time [{}] recieve user [{}] message [{}]",
                new Date(),
                session.getId(),
                message
        );
        sendAllMessage(message);
    }

    private void sendAllMessage(String message) {
        for (String id : onlineClientMap.keySet()) {
            onlineClientMap.get(id).getAsyncRemote().sendText(message);
        }
    }
}
