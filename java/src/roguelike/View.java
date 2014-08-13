package roguelike;

/**
 * Created by IntelliJ IDEA.
 * User: togelius
 * Date: //140813
 * Time: 12:17 PM
 */
public interface View {

    public void setContents (GameState gameState);

    public void update ();

}
