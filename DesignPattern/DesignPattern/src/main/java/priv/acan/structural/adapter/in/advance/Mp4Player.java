package priv.acan.structural.adapter.in.advance;

import priv.acan.structural.adapter.in.advance.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player::playMp4() " + fileName);
    }
}
