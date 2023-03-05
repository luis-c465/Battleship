package luisc.battleship;

import controlP5.ControlP5;
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

  @Override
  protected void createControllers() {
    difficulty =
      a.cp5
        .addScrollableList("dropdown")
        .setPosition(650, 0)
        .setSize(130, 500)
        .setBarHeight(30)
        .setItemHeight(20)
        .addItems(new String[] { "Easy (3 Ships & See)", "Medium (5 Ships)" })
        .setLabel("Difficulty")
        .close()
        .hide();

    difficulty
      .getValueLabel()
      .align(ControlP5.LEFT, ControlP5.BOTTOM_OUTSIDE)
      .setPaddingX(0)
      .setFont(r.f.nunito)
      .setSize(12);

    difficulty
      .getCaptionLabel()
      .align(ControlP5.LEFT, ControlP5.BOTTOM_OUTSIDE)
      .setPaddingX(0)
      .setFont(r.f.nunito)
      .setSize(12);

    controllers.add(difficulty);
  }

  public Header(App app) {
    super(app);
  }
}
