package priv.acan.structural.adapter.in.basic;

import priv.acan.structural.adapter.in.advance.AdvancedMediaPlayer;
import priv.acan.structural.adapter.in.advance.Mp4Player;
import priv.acan.structural.adapter.in.advance.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType.toLowerCase()) {
            case "vlc" -> advancedMediaPlayer = new VlcPlayer();
            case "mp4" -> advancedMediaPlayer = new Mp4Player();
            default -> {
            }
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()) {
            case "vlc" -> advancedMediaPlayer.playVlc(fileName);
            case "mp4" -> advancedMediaPlayer.playMp4(fileName);
            default -> {
            }
        }
    }
}
