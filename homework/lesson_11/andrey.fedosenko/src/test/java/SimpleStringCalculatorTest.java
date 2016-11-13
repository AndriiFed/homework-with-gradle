import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import calculator.SimpleStringCalculator;

public class SimpleStringCalculatorTest {
  private SimpleStringCalculator calc;

  @Before
  public void setUp() {
    calc = new SimpleStringCalculator();
  }

  @Test
  public void testSimpleCalc_getSum() {
    assertThat(calc.add("1+2+3+4+5+6"), is(21));
  }

  @Test
  public void testSimpleCalc_emptyExpression() {
    assertThat(calc.add(""), is(0));
    assertThat(calc.add("  "), is(0));
  }

  @Test
  public void testSimpleCalc_anyNumbersInExpression() {
    assertThat(calc.add(""), is(0));
    assertThat(calc.add("1"), is(1));
    assertThat(calc.add("1+2+3"), is(6));
  }

  @Test
  public void testSimpleCalc_checkAllDefaultDelimiters() {
    assertThat(calc.add("1+2+3"), is(6));
    assertThat(calc.add("1,2,3"), is(6));
    assertThat(calc.add("1.2.3"), is(6));
  }

  @Test
  public void testSimpleCalc_checkAllDefaultDelimitersSameTime() {
    assertThat(calc.add("1+2,3.4+5,6"), is(21));
  }

  @Test
  public void testSimpleCalc_addNewDelimiter() {
    assertThat(calc.add("#1+2,3#4+5,6"), is(21));
  }

  @Test
  public void testSimpleCalc_addNegativeNumber() {
    assertThat(calc.add("#1+2,3#4+5,-6"), is(-1));
  }

  @Test
  public void testSimpleCalc_addHigherThenMaxNumber() {
    assertThat(calc.add("#1+2,3#4+5,6,1001"), is(21));
  }

}
