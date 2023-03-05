package luisc.battleship;

import luisc.lib.PC;
import luisc.lib.TwoDArrayClickable;

public class ShipViewer extends TwoDArrayClickable {

  public static final int SIZE = 50;

  public static final int Aircraft = 5;
  public static final int Battleship = 4;
  public static final int Destroyer = 3;
  public static final int Submarine = 3;
  public static final int Patrol = 2;

  // Should be a different class but I'm lazy, lol
  public static final int Hit = 1;
  public static final int Miss = 0;
  public static final int Default = -1;

  public int value = Default;
  public boolean hit = false;

  @Override
  protected void _update() {
    p.rectMode(PC.CORNER);
    p.noFill();
    p.strokeWeight(2);
    p.stroke(0);
    p.rect(x, y, SIZE, SIZE);

    p.textAlign(PC.CENTER);
    p.textSize(20);
    p.text("" + value, x + SIZE / 2, y + SIZE / 2);
  }

  @Override
  public String toString() {
    return "" + value + (hit ? "hit" : "");
  }

  public ShipViewer(App a, int r, int c, int px, int py) {
    super(a, r, c);
    x = px + col * SIZE;
    y = py + row * SIZE;
  }
}
