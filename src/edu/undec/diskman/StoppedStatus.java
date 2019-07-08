package edu.undec.diskman;

import java.awt.Color;

public class StoppedStatus extends Status {

  @Override
  public void playPressed(Diskman diskman) {
    diskman.setStatus(new PlayingStatus());
    diskman.setLedColor(Color.GREEN);
  }

  @Override
  public void stoppedPressed(Diskman diskman) {

  }

  @Override
  public String toString() {
    return "Stopped";
  }
}
