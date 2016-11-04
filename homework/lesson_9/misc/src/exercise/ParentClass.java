package exersice;

import exersice.logger.InitOrderLogger;

public class ParentClass extends GrandParentClass {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(0);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(0);

  {
    InitOrderLogger.logAndGetInstance(0);
  }

  static {
    InitOrderLogger.logAndGetInstance(0);
  }

  public ParentClass() {
    InitOrderLogger.logAndGetInstance(0);
  }
}
