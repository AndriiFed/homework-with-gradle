import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import exersice.TopLevelClass;
import exersice.logger.InitOrderLogger;
import exersice.GrandParentClass;
import exersice.ParentClass;

public class MyInitOrderTest {
  @Test
  public void checkClassesCostructors() throws Exception {
    TopLevelClass tp = new TopLevelClass();
    assertNotNull(tp);
    assertTrue(InitOrderLogger.getInstance().getLogString().equals("init_order: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15"));
    assertNotNull(new GrandParentClass());
    assertNotNull(new ParentClass());
  }
}
