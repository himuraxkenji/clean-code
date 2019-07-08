package edu.undec.diskman;

import java.awt.Color;

public class Diskman {
  private Status status;
  private Color ledColor;

  public Diskman() {
    status = new StoppedStatus();
    ledColor = Color.LIGHT_GRAY;
  }

  public String getStatus() {
    return status.toString();
  }

  public void playPressed() {
    status.playPressed(this);
  }

  public void stoppedPressed() {
    status.stoppedPressed(this);
  }

  public Color getLedColor() {
    return ledColor;
  }

  public void setStatus(Status newStatus) {
    status = newStatus;
  }

  public void setLedColor(Color newColor) {
    ledColor = newColor;
  }
}
