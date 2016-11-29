package algo.eval;

import algo.stack.LinkedListStack;
import algo.stack.Stack;

public class Expression {
  private Stack<Character> operators = new LinkedListStack<>();
  private Stack<Double> operands = new LinkedListStack<>();

  public double evaluate(String exprStr) {
    for (int i = 0; i < exprStr.length(); i++) {
      char ch = exprStr.charAt(i);
      if ("*/+-".indexOf(ch) != -1) {
        operators.push(ch);
      } else if (Character.isDigit(ch)) {
        operands.push((double)Character.getNumericValue(ch));
      } else if (ch == ')') {
        double result = operands.pop();
        char operations = operators.pop();

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
