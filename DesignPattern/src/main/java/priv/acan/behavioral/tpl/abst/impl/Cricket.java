package priv.acan.behavioral.tpl.abst.impl;

import priv.acan.behavioral.tpl.abst.Game;

/**
 * @author acan
 * @since 2023/03/03 20:56
 */
public class Cricket extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
