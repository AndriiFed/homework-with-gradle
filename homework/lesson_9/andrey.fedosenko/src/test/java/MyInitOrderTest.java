import org.junit.Test;
import static org.junit.Assert.assertTrue;

import exersice.TopLevelClass;
import exersice.logger.InitOrderLogger;
import exersice.GrandParentClass;
import exersice.ParentClass;

public class MyInitOrderTest {
  @Test
  public void checkGrandParentInit() throws Exception {
    GrandParentClass gpc = new GrandParentClass();
    assertTrue(InitOrderLogger.getInstance().getLogString().equals("init_order: 1 2 7 8 9"));
  }

  @Test
  public void checkParentInit() throws Exception {
    ParentClass pc = new ParentClass();
    assertTrue(InitOrderLogger.getInstance().getLogString().equals("init_order: 1 2 7 8 9 3 4 7 8 9 10 11 12"));
  }
}
