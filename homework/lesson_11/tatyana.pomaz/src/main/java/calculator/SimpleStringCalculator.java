package calculator;

public class SimpleStringCalculator {
  private String pattern = "[,+\\s]+";
  private static final int MAX_VALUE = 1000;
  
  public int add(String expression) {
    if (expression.length() - 1 == 0) {
      return 0;
    }
    int result = 0;
    String[] splitExpression = getSplitExpression(expression);

    for (String value : splitExpression) {
      int number = Integer.parseInt(value);
      if (number < 0) {
        return -1;
      }
      if (number < MAX_VALUE) {
        result += number;
      }
    }
    return result;
  }

  private String[] getSplitExpression(String expression) {
    expression = removeFirstCustomSeparator(expression);
    return expression.split(pattern);
  }
  
  private String removeFirstCustomSeparator(String expression) {
    if (!Character.isDigit(expression.charAt(0))) {
      pattern = "[" + expression.charAt(0) + ",+\\s]+";
      return expression.substring(1);
    }
    return expression;
  }
  
}