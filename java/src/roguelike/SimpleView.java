package roguelike;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 13:11 PM
 */
public class SimpleView extends JPanel implements View  {

    final int size;
    private JFrame frame;
    private GameState gameState;

    public void paintComponent (Graphics g1) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

            }
        }

    }

    public SimpleView (int size){
        this.size = size;
    }

    public void setContents(GameState gameState) {
        this.gameState = gameState;
    }


    public void update() {
        }
}
