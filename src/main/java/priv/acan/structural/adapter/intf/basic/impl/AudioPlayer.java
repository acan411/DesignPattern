package priv.acan.structural.adapter.intf.basic.impl;

import priv.acan.structural.adapter.constant.AudioType;
import priv.acan.structural.adapter.intf.basic.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case MP3 -> System.out.println("AudioPlayer::play " + fileName);
            case VLC, MP4 -> new MediaAdapter(audioType).play(audioType, fileName);
        }
    }
}
