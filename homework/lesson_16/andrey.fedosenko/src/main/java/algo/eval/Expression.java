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
    System.out.println(buffer);
    return Double.parseDouble(buffer);
  }

  public double evaluate(String exprStr) {

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
        System.out.println(operations);
        switch (operations) {
          case '+': result += operands.pop();
            break;
          case '-': result -= operands.pop();
            break;
          case '*': result *= operands.pop();
            break;
          case '/': result /= operands.pop();
            break;
          default:
        }
        operands.push(result);
      }
    }
    return operands.pop();
  }
}
