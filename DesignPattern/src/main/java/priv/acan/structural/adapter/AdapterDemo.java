package priv.acan.structural.adapter;

import priv.acan.structural.adapter.intf.basic.impl.AudioPlayer;
import priv.acan.structural.adapter.constant.AudioType;

public class AdapterDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP3, "mp3 file");
        audioPlayer.play(AudioType.MP4, "mp4 file");
        audioPlayer.play(AudioType.VLC, "vlc file");
    }
}
