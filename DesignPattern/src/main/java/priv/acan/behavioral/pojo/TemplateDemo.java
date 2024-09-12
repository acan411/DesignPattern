package priv.acan.behavioral.pojo;

import priv.acan.behavioral.pojo.abst.Game;
import priv.acan.behavioral.pojo.abst.impl.Cricket;
import priv.acan.behavioral.pojo.abst.impl.Football;

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
