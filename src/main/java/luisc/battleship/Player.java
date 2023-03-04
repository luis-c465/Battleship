package luisc.battleship;

import luisc.lib.Obj;

public class Player extends Obj {

  public boolean placingShips = true;

  public Board ships;
  public Board shots;
  public ShipPlacer shipPlacer;

  public Player(App a) {
    super(a);
    ships = new Board(a, this);
    shots = new Board(a, this);
    shipPlacer = new ShipPlacer(a, this);

    ships.setup();
    shots.setup();
    shipPlacer.setup();
  }

  @Override
  protected void _update() {
    ships.update();
    shots.update();

    if (placingShips) {
      shipPlacer.update();
    }
  }

  @Override
  public String toString() {
    return "Player [ships=" + ships + "\n, shots=" + shots + "]";
  }
}
