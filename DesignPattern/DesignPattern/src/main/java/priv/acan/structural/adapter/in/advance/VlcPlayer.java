package priv.acan.structural.adapter.in.advance;

import priv.acan.structural.adapter.in.advance.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer::playVlc() " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
