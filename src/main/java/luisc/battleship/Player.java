package luisc.battleship;

import luisc.lib.Obj;

public class Player extends Obj {

  public Board ships;
  public Board shots;

  public Player(App a) {
    super(a);
    ships = new Board(a);
    shots = new Board(a);

    ships.setup();
    shots.setup();
  }

  @Override
  protected void _update() {
    ships.update();
    shots.update();
  }

  @Override
  public String toString() {
    return "Player [ships=" + ships + "\n, shots=" + shots + "]";
  }
}
