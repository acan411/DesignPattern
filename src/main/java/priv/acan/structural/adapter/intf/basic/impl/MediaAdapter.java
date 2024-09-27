package priv.acan.structural.adapter.intf.basic.impl;

import priv.acan.structural.adapter.constant.AudioType;
import priv.acan.structural.adapter.intf.advance.AdvancedMediaPlayer;
import priv.acan.structural.adapter.intf.advance.impl.Mp4Player;
import priv.acan.structural.adapter.intf.advance.impl.VlcPlayer;
import priv.acan.structural.adapter.intf.basic.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        switch (audioType) {
            case VLC -> advancedMediaPlayer = new VlcPlayer();
            case MP4 -> advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case VLC -> advancedMediaPlayer.playVlc(fileName);
            case MP4 -> advancedMediaPlayer.playMp4(fileName);
        }
    }
}
