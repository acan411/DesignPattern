package priv.acan.structural.adapter.intf.basic;

import priv.acan.structural.adapter.constant.AudioType;

public interface MediaPlayer {

    void play(AudioType audioType, String fileName);
}
