package algo.eval;

import algo.stack.LinkedListStack;
import algo.stack.Stack;

public class Expression {
  private Stack<Character> operators = new LinkedListStack<>();
  private Stack<Double> operands = new LinkedListStack<>();
  private int numSize = 0;

  private double getNumber(String exprStr, int begin) {
    String buffer = exprStr.substring(begin);
    String[] splitArray  = buffer.split(" |\\)");
    buffer = splitArray[0];
    numSize = buffer.length();
    return Double.parseDouble(buffer);
  }

  private boolean isRightExpression(String exprStr) {
    int exprLength = exprStr.length();

    if (exprStr.length() < 7) {
      return false;
    }

    if (!exprStr.substring(0, 1).equals("(") || !exprStr.substring(exprLength - 1, exprLength).equals(")")) {
      return false;
    }
    return true;
  }

  public double evaluate(String exprStr) {

    if (!isRightExpression(exprStr)) {
      return 0.0;
    }

    for (int i = 0; i < exprStr.length(); i++) {
      char ch = exprStr.charAt(i);

      if ("*/+-".indexOf(ch) != -1) {
        operators.push(ch);
      } else if (Character.isDigit(ch)) {
        operands.push(getNumber(exprStr, i));
        i += numSize - 1;
      } else if (ch == ')') {
        double result = operands.pop();
        char operations = operators.pop();
        switch (operations) {
          case '+': result += operands.pop();
            break;
          case '-':  result = operands.pop() - result;
            break;
          case '*': result *= operands.pop();
            break;
          case '/': result = operands.pop() / result;
            break;
          default:
        }
        operands.push(result);

      }
    }
    return operands.pop();
  }
}
