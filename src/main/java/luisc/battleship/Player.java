package luisc.battleship;

import luisc.lib.Obj;

public class Player extends Obj {

  public static final int PADDING_TOP_SHIPS = 100;
  public static final int PADDING_LEFT_SHIPS = 50;

  public static final int PADDING_TOP_SHOTS = 100;
  public static final int PADDING_LEFT_SHOTS = 500;

  public boolean placingShips = true;

  public Board ships;
  public Board shots;
  public ShipPlacer shipPlacer;

  public Player(App a) {
    super(a);
    ships = new Board(a, this, PADDING_LEFT_SHIPS, PADDING_TOP_SHIPS);
    shots = new Board(a, this, PADDING_LEFT_SHOTS, PADDING_TOP_SHOTS);

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
