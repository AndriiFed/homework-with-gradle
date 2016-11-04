import org.junit.Test;

import exersice.GrandParentClass;
import exersice.ParentClass;
import exersice.TopLevelClass;

public class MyInitOrderTest {
  @Test
  public void checkClassesCostructors() throws Exception {
    new GrandParentClass();
    new ParentClass();
    new TopLevelClass();
  }

}
