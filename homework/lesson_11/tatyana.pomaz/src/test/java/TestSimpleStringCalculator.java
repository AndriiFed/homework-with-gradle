import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import calculator.SimpleStringCalculator;

public class TestSimpleStringCalculator {
  private SimpleStringCalculator calc;
	
  @Before
  public void setUp() {
    calc = new SimpleStringCalculator();
  }
  
  @Test
  public void simpleCalcTest_whenExpressionIsEmpty() {
    assertThat(calc.add(" "), is(0));
  }
  
  @Test
  public void simpleCalcTest_whenSeparatorIsPlus() {
    assertThat(calc.add("1+2+3"), is(6));
	assertThat(calc.add("2+485+3"), is(490));
	assertThat(calc.add("5 + 4 + 93"), is(102));
	assertThat(calc.add("1010+4+9"), is(13));
  }
  
  @Test
  public void simpleCalcTest_whenSeparatorIsComma() {
    assertThat(calc.add("1,2,3"), is(6));
	assertThat(calc.add("1,24,3,84"), is(112));
	assertThat(calc.add("3 , 4, 9,1"), is(17));
  }
  
  @Test
  public void simpleCalcTest_whenSeparatorIsPlusAndComma() {
    assertThat(calc.add("1+2,3"), is(6));
	assertThat(calc.add("11+25,3,87"), is(126));
	assertThat(calc.add("3, 4+9,5 + 1"), is(22));
  }
  
  @Test
  public void simpleCalcTest_withCustomCharacter() {
    assertThat(calc.add("#2,2,1001+2#2"), is(8));
	assertThat(calc.add("&3+1,8&2&5"), is(19));
	assertThat(calc.add("$1 + 1 $ 7 , 5 $  2"), is(16));
	assertThat(calc.add(";52+1;2,4;2"), is(61));
  }
  
  @Test
  public void simpleCalcTest_withNegativeNumbers() {
    assertThat(calc.add("#-1,5,3025+8#1"), is(-1));
	assertThat(calc.add("3+11,8+254,-5"), is(-1));
	assertThat(calc.add("1,-184,7,62,-2"), is(-1));
  }
}