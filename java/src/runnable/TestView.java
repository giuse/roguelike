package runnable;

import roguelike.GameState;
import roguelike.SimpleView;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 13:19 PM
 */
public class TestView {


    public static void main(String[] args) {
        GameState state = new GameState (3);
        state.agent = new int[]{0,0};
        state.exit = new int[]{2,2};
        state.nihilists = new int[][]{{0,2}, {2,0}};
        state.walls = new int[][]{{0,1}, {1,1}};
        state.immovableWalls = new int[][]{{1,0}};
        state.holes = new int[][]{{1,2}};

        SimpleView view = new SimpleView(state.size);
        view.setContents(state);
        view.update();

    }






}
