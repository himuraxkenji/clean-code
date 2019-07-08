import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

import edu.undec.diskman.Diskman;

public class DiskmanTest {

  @Test
  public void testDiskmanIsStoppedWhenCreated() {
    Diskman diskman = new Diskman();
    assertEquals("Stopped", diskman.getStatus());
  }

  @Test
  public void testDiskmanIsPlayingWhenPlayPressed() {
    Diskman diskman = new Diskman();
    diskman.playPressed();
    assertEquals("Playing", diskman.getStatus());
    assertEquals(Color.GREEN, diskman.getLedColor());
  }

  @Test
  public void testDiskmanPausedWhenIsPlayingAndPlayPressed() {
    Diskman diskman = new Diskman();
    diskman.playPressed();
    diskman.playPressed();
    assertEquals("Paused", diskman.getStatus());
    assertEquals(Color.BLUE, diskman.getLedColor());
  }

  @Test
  public void testDiskmanIsPlayingWhenIsPausedAndPlayPressed() {
    Diskman diskman = new Diskman();
    diskman.playPressed();
    diskman.playPressed();
    diskman.playPressed();
    assertEquals("Playing", diskman.getStatus());
    assertEquals(Color.GREEN, diskman.getLedColor());
  }

  @Test
  public void testDiskmanIsStoppedWhenPlayingAndStopPressed() {
    Diskman diskman = new Diskman();
    diskman.playPressed();
    diskman.stoppedPressed();
    assertEquals("Stopped", diskman.getStatus());
    assertEquals(Color.LIGHT_GRAY, diskman.getLedColor());
  }

}
