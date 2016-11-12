package exersice;

import exersice.logger.InitOrderLogger;

public class TopLevelClass extends ParentClass {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(13);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(5);

  {
    InitOrderLogger.logAndGetInstance(14);
  }

  static {
    InitOrderLogger.logAndGetInstance(6);
  }

  public TopLevelClass() {
    InitOrderLogger.logAndGetInstance(15);
  }
}
