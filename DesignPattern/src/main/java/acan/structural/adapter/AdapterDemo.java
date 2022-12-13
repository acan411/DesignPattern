package acan.structural.adapter;

import acan.structural.adapter.in.common.AudioPlayer;

public class AdapterDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "mp3 file");
        audioPlayer.play("mp4", "mp4 file");
        audioPlayer.play("vlc", "vlc file");
        audioPlayer.play("avi", "avi file");
    }
}
