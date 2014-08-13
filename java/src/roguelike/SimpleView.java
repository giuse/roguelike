package roguelike;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 13:11 PM
 */
public class SimpleView extends JPanel implements View, Constants  {

    final int size;
    final int side;
    private JFrame frame;
    private GameState gameState;
    private int[][] gameStateArray;
    final int cellSize = 15;

    public void paintComponent (Graphics g) {
        // paint the background
        g.setColor (Color.white);
        g.fillRect (0, 0, side, side);

        // paint the contents of each cell
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // paint cell depending on what's in it
                g.setColor (chooseColor (gameStateArray, i, j));
                g.fillRect(i * cellSize, j* cellSize, cellSize, cellSize);
            }
        }

    }

    private Color chooseColor (int[][] gameStateArray, int x, int y) {
        switch (gameStateArray[x][y]) {
            case EMPTY:
                return Color.white;
            case AGENT:
                return Color.cyan;
            case WALL:
                return Color.blue;
            case IMMOVABLE:
                return Color.pink;
            case HOLE:
                return Color.black;
            case NIHILIST:
                return Color.orange;
            case EXIT:
                return Color.green;
            default:
                throw new RuntimeException("I don't know what " + gameStateArray[x][y] + " means.");
        }
    }

    public void setFrame (JFrame frame) {
            this.frame = frame;
            //updateTitle ();
        }

    public SimpleView (int size){
        this.size = size;
        side = size * cellSize;
    }

    public void setContents(GameState gameState) {
        this.gameState = gameState;
        this.gameStateArray = gameState.arrayForm();
    }


    public void update() {
        repaint();
    }

    public Dimension getPreferredSize () {
            return new Dimension (side + 100, side + 100);
    }
}
