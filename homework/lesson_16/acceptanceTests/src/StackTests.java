import org.junit.Test;

import algo.stack.LinkedListStack;
import algo.stack.Stack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StackTests {
  @Test
  public void testSimpleElemAddition() {
    Stack<Integer> stack = new LinkedListStack<>();

    stack.push(10);

    assertThat(stack.pop(), is(10));
  }

  @Test
  public void testFewElemsAdditionAndPop() {
    Stack<Integer> stack = new LinkedListStack<>();

    stack.push(10);
    stack.push(20);

    stack.pop();

    assertThat(stack.pop(), is(10));
  }

  @Test
  public void testManyAdditions() {
    Stack<Integer> stack = new LinkedListStack<>();

    for (int i = 0; i < 20; i++) {
      stack.push(i);
    }

    for (int i = 19; i >= 0; i--) {
      assertThat(stack.pop(), is(i));
    }
  }
}
