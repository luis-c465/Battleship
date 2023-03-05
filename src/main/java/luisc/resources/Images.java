package luisc.resources;

import luisc.lib.BaseApp;
import luisc.lib.ResourceHolder;
import processing.core.PImage;

public class Images extends ResourceHolder<PImage> {

  public PImage intro;
  public PImage tutorial;
  public PImage miss;
  public PImage amog;
  public PImage shotAmog;

  @Override
  protected void load() {
    intro = p.loadImage("intro2.png");
    tutorial = p.loadImage("instructions.png");

    miss = p.loadImage("miss.png");
    amog = p.loadImage("amog.png");
    shotAmog = p.loadImage("shot-amog.png");
  }

  public Images(BaseApp p) {
    super(p);
  }
}
