package lamzin.service;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnalyzerTest {

  private Analyzer analyzer = new Analyzer();

  @Test
  public void shouldReturnTrueForMessageWithName() {
    assertTrue("expected true", analyzer.isNameTagged("has name: Rudolf"));
  }

  @Test
  public void shouldReturnFalseForMessageWithoutNames() {
    assertFalse("expected false", analyzer.isNameTagged("doesn't have any names"));
  }
}
