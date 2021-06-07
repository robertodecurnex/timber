package ptc.timber.log;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TimberJavaTest {
  @SuppressWarnings("ConstantConditions")
  @Test public void nullTree() {
    try {
      Timber.plant((Timber.Tree) null);
      fail();
    } catch (IllegalArgumentException ignored) {
    }
  }

  @SuppressWarnings("ConstantConditions")
  @Test public void nullTreeArray() {
    try {
      Timber.plant((Timber.Tree[]) null);
      fail();
    } catch (IllegalArgumentException ignored) {
    }
    try {
      Timber.plant(new Timber.Tree[] { null });
      fail();
    } catch (IllegalArgumentException ignored) {
    }
  }
}
