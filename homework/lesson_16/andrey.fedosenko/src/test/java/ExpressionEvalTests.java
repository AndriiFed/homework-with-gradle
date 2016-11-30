import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import algo.eval.Expression;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ExpressionEvalTests {

  private Expression expression;

  @Before
  public void setUp() throws Exception {
    expression = new Expression();
  }

  @Test
  public void testSimpleNullExpression() throws Exception {
    assertThat(expression.evaluate(""), is(0.0));
    assertThat(expression.evaluate("("), is(0.0));
    assertThat(expression.evaluate(")"), is(0.0));
    assertThat(expression.evaluate("()"), is(0.0));
  }

  @Test
  public void testNoBracketExpression() throws Exception {
    assertThat(expression.evaluate("1 + 1"), is(0.0));
    assertThat(expression.evaluate("1000 + 23"), is(0.0));
    assertThat(expression.evaluate("(1000 + 23"), is(0.0));
    assertThat(expression.evaluate("(1000 + 23"), is(0.0));
    assertThat(expression.evaluate("(1000 - 23)"), is(977.0));
  }

  @Test
  public void testBigAndSmallNumbersExpression() throws Exception {
    assertThat(expression.evaluate("(1000 + ((200 + 100) * (20 / 5)))"), is(2200.0));
  }


}
