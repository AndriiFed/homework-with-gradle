package exersice.logger;

public class InitOrderLogger {
  private static InitOrderLogger instance;
  private String logString = "init_order:";

  private InitOrderLogger() {}

  public static InitOrderLogger getInstance() {
    if (instance == null) {
      instance = new InitOrderLogger();
    }
    return instance;
  }

  public static InitOrderLogger logAndGetInstance(int order) {
    getInstance().logOrder(order);

    return getInstance();
  }

  private void logOrder(int order) {
    logString += String.format(" %d", order);
  }

  public String getLogString() {
    return logString;
  }
}
