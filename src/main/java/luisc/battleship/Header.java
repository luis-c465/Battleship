package luisc.battleship;

import luisc.lib.BaseHeader;

public class Header extends BaseHeader {

  @Override
  protected void _update() {
    p.textSize(40);
  }

  public Header(App app) {
    super(app);
  }
}
