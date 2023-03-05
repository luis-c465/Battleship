package luisc.battleship;

import luisc.lib.KeyboardBtn;
import luisc.lib.Obj;
import luisc.lib.PC;

public class Turn extends Obj {

  public static final int x = App.cw;
  public static final int y = App.ch;

  public int round_x = x;
  public int round_y = y + 100;
  public String pName = "NULL";

  public EnterBtn enterBtn;

  protected void _setup() {
    enterBtn = new EnterBtn(a);
    enterBtn.setup();
  }

  protected void _update() {
    p.background(0);
    p.textAlign(PC.CENTER);
    p.textSize(30);
    p.text("Turn over, pass the computer to the next player", x, y - 100);
    p.textSize(60);
    p.text("Press enter to continue", x, y + 100);

    enterBtn.update();
    if (enterBtn.clicked) {
      a.turnOver = false;
      enterBtn.clicked = false;

      a.player.tookShot = false;
      a.player = a.player.otherPlayer;
    }
  }

  private class EnterBtn extends KeyboardBtn {

    protected void _setup() {
      x = App.cw;
      y = 800;

      w = 200;
      h = 100;
      img = r.i.enter;

      kc = PC.ENTER;
    }

    public EnterBtn(App app) {
      super(app);
    }
  }

  public Turn(App app) {
    super(app);
  }
}
