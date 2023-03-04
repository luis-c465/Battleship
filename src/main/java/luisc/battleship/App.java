package luisc.battleship;

import luisc.lib.BaseApp;
import luisc.lib.HelpModal;
import processing.event.MouseEvent;

/**
 * Main class for the application
 */
public final class App extends BaseApp {

  public int p1Wins = 0;
  public int p2Wins = 0;

  // Game classes
  public AppIntro intro;
  public Header header;
  public HelpModal helpModal;

  public Player p1;
  public Player p2;

  @Override
  public void draw() {
    defaultSettings();

    // intro.update();
    // if (doingIntro) {
    //   return;
    // }

    header.update();

    helpModal.update();
  }

  @Override
  protected void setupAppClasses() {
    intro = new AppIntro(this);
    intro.setup();

    header = new Header(this);
    header.setup();

    helpModal = new HelpModal(this);
    helpModal.setup();

    p1 = new Player(this);
    p1.setup();

    p2 = new Player(this);
    p2.setup();

    println(p1);
    println(p2);
  }

  @Override
  public String getWindowTitle() {
    return "RICODE Encryption & Decryption";
  }

  public void mouseClicked(MouseEvent e) {
    helpModal.mouseClicked();
  }
}
