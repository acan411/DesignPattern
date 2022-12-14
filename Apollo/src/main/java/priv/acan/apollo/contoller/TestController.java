package priv.acan.apollo.contoller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.enums.PropertyChangeType;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acan
 * @version 2022/12/15 00:31
 */
@RestController("/acan")
public class TestController {

    @RequestMapping("/test")
    public void test() {
        String namespace = "TEST1.namespase1";
        String propertyName = "String";
        String oldValue = "acanonnn";
        String newValue = "acan6666";
        Map<String, ConfigChange> map = new HashMap<>();
        ConfigChangeEvent configChangeEvent = new ConfigChangeEvent(namespace, map);

        ConfigChange change1 = new ConfigChange(namespace, propertyName, oldValue, newValue, PropertyChangeType.MODIFIED);
        map.put("testConfig1", change1);

        System.out.println(ConfigService.getAppConfig());

        for (String key : configChangeEvent.changedKeys()) {
            ConfigChange change = configChangeEvent.getChange(key);
        }
        System.out.println(ConfigService.getAppConfig());

    }
}
