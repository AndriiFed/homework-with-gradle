package exersice;

import exersice.logger.InitOrderLogger;

public class TopLevelClass extends ParentClass {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(0);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(0);

  {
    InitOrderLogger.logAndGetInstance(0);
  }

  static {
    InitOrderLogger.logAndGetInstance(0);
  }

  public TopLevelClass() {
    InitOrderLogger.logAndGetInstance(0);
  }
}
