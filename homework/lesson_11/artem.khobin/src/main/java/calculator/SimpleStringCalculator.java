package calculator;

/**
 * Created by Dev on 19.11.2016.
 */
public class SimpleStringCalculator {

  public int add(String expression) {
    if (expression.length() == 0) {
      return 0;
    }

    int result = 0;
    int[] operands = processExpression(expression);

    for (int operand : operands) {
      if (operand < 0) {
        return -1;
      }
      if (operand > 1000) {
        continue;
      }
      result += operand;
    }

    return result;
  }

  private int[] processExpression(String expression) {
    String delimiters = "+|,";
    if ( ! Character.isDigit(expression.charAt(0)) ) {
      delimiters += expression.charAt(0);
    }
    System.out.println(delimiters);
    String[] stringResult = expression.split("[" + delimiters + "]");
    int[] result = new int[stringResult.length];

    for (int i = 0; i < stringResult.length; i++) {
      if (stringResult[i].length() == 0) {
        continue;
      }
      result[i] = Integer.parseInt(stringResult[i]);
    }
    return result;
  }
}
