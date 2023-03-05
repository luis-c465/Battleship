package luisc.battleship;

import luisc.lib.BaseHeader;
import luisc.resources.Colors;

public class Header extends BaseHeader {

  @Override
  protected void _update() {
    p.textSize(20);
    if (a.player.placingShips) {
      p.text("Player " + a.player.num + " Place your ships", App.cw, 20);
    } else {
      p.text("Player " + a.player.num + " Take your shot", App.cw, 20);
    }

    p.textSize(30);
    p.fill(Colors.success);
    if (a.player.placingShips) {
      p.text("Your Ships", App.cw / 2, 80);
    } else {
      p.text("Shots", App.cw / 2 + 450, 80);
    }

    p.fill(255);
    if (!a.player.placingShips) {
      p.text("Your Ships", App.cw / 2, 80);
    } else {
      p.text("Shots", App.cw / 2 + 450, 80);
    }
  }

  public Header(App app) {
    super(app);
  }
}
