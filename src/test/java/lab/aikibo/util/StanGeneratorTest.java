package lab.aikibo.util;

import junit.framework.Assert;
import org.junit.Test;
import lab.aikibo.util.StanGenerator;

public class StanGeneratorTest {

  @Test
  public void testGenerate() {
    StanGenerator gen = new StanGenerator();
    System.out.println("STAN : " + gen.generate());
  }
}
