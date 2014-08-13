package roguelike;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 12:20 PM
 */
public class GameState implements Constants {

    public GameState (int size) {
        this.size = size;
    }

    public final int size;

    public int[][] walls; // positions of movable walls
    public int[][] immovableWalls; // positions of immovable walls - should never change
    public int[][] holes; // positions of holes - should also not change
    public int[][] nihilists; // positions of nihilists
    public int[] exit; // position of the exit from the level
    public int[] agent; //position of the agent

    public int[][] arrayForm () {
        int[][] array = new int[size][size];
        for (int i = 0; i < walls.length; i++)
            array[walls[i][0]][walls[i][1]] = WALL;
        for (int i = 0; i < immovableWalls.length; i++)
            array[immovableWalls[i][0]][immovableWalls[i][1]] = IMMOVABLE;
        for (int i = 0; i < holes.length; i++)
                    array[holes[i][0]][holes[i][1]] = HOLE;
        for (int i = 0; i < walls.length; i++)
                    array[nihilists[i][0]][nihilists[i][1]] = NIHILIST;
        array[exit[0]][exit[1]] = EXIT;
        array[agent[0]][agent[1]] = AGENT;
        return array;
    }


}
