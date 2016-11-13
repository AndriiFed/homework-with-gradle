package calculator;

import java.lang.Character;
import java.lang.Integer;

public class SimpleStringCalculator {
  private static String delimiter = ",|\\.|\\+";
  private static final int MAX_INTEGER = 1000;

  private String getExpressionWithoutNewDelimiter(String expression) {
    if (!Character.isDigit(expression.charAt(0))) {
      delimiter += "|\\" + expression.charAt(0);
      expression = expression.substring(1);
    }
    return expression;
  }

  private String[] splitNumbersArray(String expression) {
    String[] numbersArray;
    expression = expression.trim();

    if (expression.isEmpty()) {
      numbersArray = new String[] {"0"};
      return numbersArray;
    }

    expression = getExpressionWithoutNewDelimiter(expression);
    numbersArray = expression.split(delimiter);

    for (int i = 0; i < numbersArray.length; i++) {
      if (numbersArray[i].isEmpty()) {
        numbersArray[i] = "0";
      }
    }

    if (!isNumbersPositiveArrayValid(numbersArray)) {
      numbersArray = new String[] {"-1"};
    }
    return numbersArray;
  }

  private boolean isNumbersPositiveArrayValid(String[] inputArray) {
    for (String number : inputArray) {
      if (Integer.parseInt(number) < 0) {
        return false;
      }
    }
    return true;
  }

  public int add(String expression) {
    int sum = 0;
    int value;
    String[] numbersArray = splitNumbersArray(expression);

    for (String number : numbersArray) {
      value = Integer.parseInt(number);
      if (value <= MAX_INTEGER) {
        sum += value;
      }
    }
    return sum;
  }
}
