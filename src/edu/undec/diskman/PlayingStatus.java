package edu.undec.diskman;

import java.awt.Color;

public class PlayingStatus extends Status{
  @Override
  public void playPressed(Diskman diskman) {
    diskman.setStatus(new PausedStatus());
    diskman.setLedColor(Color.BLUE);
  }

  @Override
  public void stoppedPressed(Diskman diskman) {
    diskman.setStatus(new StoppedStatus());
    diskman.setLedColor(Color.LIGHT_GRAY);
  }

  @Override
  public String toString() {
    return "Playing";
  }
}
