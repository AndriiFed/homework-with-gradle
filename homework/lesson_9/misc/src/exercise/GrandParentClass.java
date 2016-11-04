package exersice;

import exersice.logger.InitOrderLogger;

public class GrandParentClass {
  private InitOrderLogger l1 = InitOrderLogger.logAndGetInstance(0);
  private static InitOrderLogger l2 = InitOrderLogger.logAndGetInstance(0);

  {
    InitOrderLogger.logAndGetInstance(0);
  }

  static {
    InitOrderLogger.logAndGetInstance(0);
  }

  public GrandParentClass() {
    InitOrderLogger.logAndGetInstance(0);
  }
}
