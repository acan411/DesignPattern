package priv.acan.behavioral.pojo.ab.impl;

import priv.acan.behavioral.pojo.ab.Game;

/**
 * @author acan
 * @since 2023/03/03 20:59
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
