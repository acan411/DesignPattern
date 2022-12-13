package acan.structural.adapter.in.advance;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4Player::playMp4() " + fileName);
    }
}
