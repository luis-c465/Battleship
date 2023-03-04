package luisc.battleship;

import luisc.lib.Obj;
import luisc.lib.PC;

public class ShipPlacer extends Obj {

  public Player player;
  public int placingShip = 5;
  public int minPlacingShip = 2;

  @Override
  protected void _update() {}

  public void onMouseClick() {
    // First find the location for the ship
    // Then check if the ship can be placed there
    if (
      p.mouseX < Board.PADDING_LEFT || p.mouseX > Board.PADDING_LEFT + 7 * 50
    ) {
      return;
    } else if (
      p.mouseY < Board.PADDING_TOP || p.mouseY > Board.PADDING_TOP + 7 * 50
    ) {
      return;
    }

    if (placingShip < minPlacingShip) {
      player.placingShips = false;
      return;
    }

    int row = (int) ((p.mouseY - Board.PADDING_TOP) / ShipViewer.SIZE);
    int col = (int) ((p.mouseX - Board.PADDING_LEFT) / ShipViewer.SIZE);

    p.println(player);
    if (p.mouseButton == PC.LEFT) {
      // Check if the ship can be placed there
      if (placingShip == ShipViewer.Aircraft) {
        // Check if the ship can be placed there
        if (row + placingShip > 7) {
          return;
        }
        for (int i = 0; i < placingShip; i++) {
          if (a.player.ships.ships[row + i][col].value != -1) {
            return;
          }
        }
        // Place the ship
        for (int i = 0; i < placingShip; i++) {
          a.player.ships.ships[row + i][col].value = placingShip;
        }
      } else if (placingShip == ShipViewer.Battleship) {
        // Check if the ship can be placed there
        if (col + placingShip > 7) {
          return;
        }
        for (int i = 0; i < placingShip; i++) {
          if (a.player.ships.ships[row][col + i].value != -1) {
            return;
          }
        }
        // Place the ship
        for (int i = 0; i < placingShip; i++) {
          a.player.ships.ships[row][col + i].value = placingShip;
        }
      } else if (placingShip == ShipViewer.Destroyer) {
        // Check if the ship can be placed there
        if (row + placingShip > 7) {
          return;
        }
        for (int i = 0; i < placingShip; i++) {
          if (a.player.ships.ships[row + i][col].value != -1) {
            return;
          }
        }
        // Place the ship
        for (int i = 0; i < placingShip; i++) {
          a.player.ships.ships[row + i][col].value = placingShip;
        }
      } else if (placingShip == ShipViewer.Submarine) {
        // Check if the ship can be placed there
        if (col + placingShip > 7) {
          return;
        }
        for (int i = 0; i < placingShip; i++) {
          if (a.player.ships.ships[row][col + i].value != -1) {
            return;
          }
        }
      }
    }
  }

  public ShipPlacer(App app, Player player) {
    super(app);
    this.player = player;
  }
}
