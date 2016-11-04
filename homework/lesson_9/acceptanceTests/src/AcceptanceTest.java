import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import exersice.logger.InitOrderLogger;
import exersice.TopLevelClass;

public class AcceptanceTest {
  @Test
  public void testTheOrderOfInitialization() {
    TopLevelClass topClass = new TopLevelClass(); // init logger and fill in the order

    assertThat(InitOrderLogger.getInstance().getLogString(), is("init_order: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"));
  }
}
