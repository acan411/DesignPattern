package priv.acan.behavioral.tpl;

import priv.acan.behavioral.tpl.abst.Game;
import priv.acan.behavioral.tpl.abst.impl.Cricket;
import priv.acan.behavioral.tpl.abst.impl.Football;

/**
 * @author acan
 * @since 2023/03/03 21:00
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
