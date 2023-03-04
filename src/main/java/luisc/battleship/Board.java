package luisc.battleship;

import java.util.Arrays;
import luisc.lib.Obj;

public class Board extends Obj {

  public Player player;

  public static final int PADDING_TOP = 100;
  public static final int PADDING_LEFT = 100;

  public ShipViewer[][] ships = new ShipViewer[7][7];

  @Override
  protected void _update() {
    // Update all the ships
    for (int i = 0; i < ships.length; i++) {
      for (int j = 0; j < ships[i].length; j++) {
        ships[i][j].update();
      }
    }
  }

  @Override
  public String toString() {
    return Arrays.deepToString(ships);
  }

  public Board(App a, Player p) {
    super(a);
    this.player = p;

    for (int i = 0; i < ships.length; i++) {
      for (int j = 0; j < ships[i].length; j++) {
        ships[i][j] = new ShipViewer(a, i, j);
      }
    }
  }
}
