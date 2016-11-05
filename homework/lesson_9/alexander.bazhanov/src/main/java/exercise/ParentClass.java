package exersice;

import exersice.logger.InitOrderLogger;

public class ParentClass extends GrandParentClass {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(10);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(3);

  {
    InitOrderLogger.logAndGetInstance(11);
  }

  static {
    InitOrderLogger.logAndGetInstance(4);
  }

  public ParentClass() {
    InitOrderLogger.logAndGetInstance(12);
  }
}
