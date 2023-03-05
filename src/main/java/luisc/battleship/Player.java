package luisc.battleship;

import luisc.lib.Obj;

public class Player extends Obj {

  public Player otherPlayer;
  public boolean tookShot = false;
  public int num = 0;

  public static final int PADDING_TOP_SHIPS = 100;
  public static final int PADDING_LEFT_SHIPS = 50;

  public static final int PADDING_TOP_SHOTS = 100;
  public static final int PADDING_LEFT_SHOTS = 500;

  public boolean placingShips = true;

  public Board ships;
  public Board shots;
  public ShipPlacer shipPlacer;
  public ShotPlacer shotPlacer;

  public Player(App a, int n) {
    super(a);
    this.num = n;

    ships = new Board(a, this, PADDING_LEFT_SHIPS, PADDING_TOP_SHIPS);
    shots = new Board(a, this, PADDING_LEFT_SHOTS, PADDING_TOP_SHOTS);

    shipPlacer = new ShipPlacer(a, this);
    shotPlacer = new ShotPlacer(a, this);

    ships.setup();
    shots.setup();
    shipPlacer.setup();
    shotPlacer.setup();
  }

  @Override
  protected void _update() {
    ships.update();
    shots.update();

    if (tookShot) {
      otherPlayer.tookShot = false;

      a.player = otherPlayer;
    }
  }

  @Override
  public String toString() {
    return "Player [ships=" + ships + "\n, shots=" + shots + "]";
  }
}
