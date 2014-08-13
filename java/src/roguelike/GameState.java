package roguelike;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 12:20 PM
 */
public class GameState {

    public GameState (int size) {
        this.size = size;
    }

    public final int size;

    public int[][] walls; // positions of movable walls
    public int[][] immovableWalls; // positions of immovable walls - should never change
    public int[][] holes; // positions of holes - should also not change
    // public int[] start; // starting position
    public int[] exit; // position of the exit from the level

    public int[] agent; //position of the agent

    public int[][] nihilists; // positions of nihilists

}
