package luisc.battleship;

import luisc.lib.TwoDArrayClickable;

public class ShipViewer extends TwoDArrayClickable {

  public int value = -1;
  public boolean hit;

  private static final int SIZE = 50;

  private static final int Aircraft = 5;
  private static final int Battleship = 4;
  private static final int Destroyer = 3;
  private static final int Submarine = 3;
  private static final int Patrol = 2;

  // Should be a different class but I'm lazy, lol
  private static final int Hit = 1;
  private static final int Miss = 0;

  @Override
  protected void _update() {
    // TODO Show a ship
  }

  @Override
  protected void calc() {
    x = Board.PADDING_LEFT + col * SIZE;
    y = Board.PADDING_TOP + row * SIZE;
  }

  @Override
  public String toString() {
    return "" + value + (hit ? "hit" : "");
  }

  public ShipViewer(App a, int r, int c) {
    super(a, r, c);
  }
}
