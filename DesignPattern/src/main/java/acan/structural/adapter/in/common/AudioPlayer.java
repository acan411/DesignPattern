package acan.structural.adapter.in.common;

import acan.structural.adapter.in.basic.MediaAdapter;
import acan.structural.adapter.in.basic.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()) {
            case "mp3" -> System.out.println("AudioPlayer::play() " + fileName);
            case "vlc", "mp4" -> new MediaAdapter(audioType).play(audioType, fileName);
            default -> System.out.println(audioType + " format not supported");
        }
    }
}
