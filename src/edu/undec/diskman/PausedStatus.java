package edu.undec.diskman;

import java.awt.Color;

public class PausedStatus extends Status {
  @Override
  public void playPressed(Diskman diskman) {
    diskman.setStatus(new PlayingStatus());
    diskman.setLedColor(Color.GREEN);
  }

  @Override
  public void stoppedPressed(Diskman diskman) {
    diskman.setStatus(new StoppedStatus());
    diskman.setLedColor(Color.LIGHT_GRAY);
  }

  @Override
  public String toString() {
    return "Paused";
  }
}
