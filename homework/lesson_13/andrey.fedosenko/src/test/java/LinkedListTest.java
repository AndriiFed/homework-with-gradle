import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import algo.*;

public class LinkedListTest {
  private List<Integer> list;

  @Before
  public void setUp() {
    list = new LinkedList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
  }

  @Test
  public void testFetchingElementsByIndex() {
    List<Integer> list = new LinkedList<>();

    list.add(0);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);

    assertThat(list.get(0), is(0));
    assertThat(list.get(1), is(1));
    assertThat(list.get(2), is(2));
    assertThat(list.get(3), is(3));
    assertThat(list.get(4), is(4));
    assertThat(list.get(5), is(5));
    assertThat(list.get(6), is(6));
    assertThat(list.get(7), is(7));
    assertThat(list.get(8), is(8));
    assertThat(list.get(9), is(9));
  }

  @Test
  public void iteratorStringTest() {
    List<String> list = new LinkedList<>();
    list.add("Hello ");
    list.add("Teddy ");
    list.add("Bear");

    String result = "";
    Iterator<String> iter = list.iterator();
    while(iter.hasNext()) {
      result += iter.next();
    }

    assertThat(result, is("Hello Teddy Bear"));
  }

  @Test
  public void testInsertion_thenGetOfFirstElem() {
    assertThat(list.get(0), is(10));
  }

  @Test
  public void testInsertion_thenGetOfSecondElem() {
    assertThat(list.get(1), is(20));
  }

  @Test
  public void testInsertion_thenGetOfThirdElem() {
    assertThat(list.get(2), is(30));
  }

  @Test
  public void removalOfFirstElement() {
    list.remove(0);

    assertThat(list.get(0), is(20));
  }

  @Test
  public void removalOfLastElement() {
    list.remove(3);

    assertThat(list.get(2), is(30));
  }

  @Test
  public void removalElementInTheMiddle() {
    list.remove(1);

    assertThat(list.get(0), is(10));
    assertThat(list.get(1), is(30));
  }

  @Test
  public void removalThreeElementsOneByOne() {
    list.remove(0);
    list.remove(0);
    list.remove(0);

    assertThat(list.get(0), is(40));
  }

  @Test
  public void onEmptyList_isEmpty_returnsTrue() {
    List<Integer> list = new LinkedList<>();

    assertThat(list.isEmpty(), is(true));
  }

  @Test
  public void onNonEmptyList_isEmpty_returnsFalse() {
    List<Integer> list = new LinkedList<>();
    list.add(10);

    assertThat(list.isEmpty(), is(false));
  }

  @Test
  public void onNoneEmptyList_size_returnsNumberOfItems() {
    List<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);

    assertThat(list.size(), is(2));
  }

  @Test
  public void afterClearMethodCall_listShouldBeEmpty() {
    list.clear();

    assertThat(list.isEmpty(), is(true));
  }

  @Test
  public void iteratorOverallTest() {
    List<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    int sum = 0;
    Iterator<Integer> iter = list.iterator();
    while(iter.hasNext()) {
      sum += iter.next();
    }

    assertThat(sum, is(10 + 20 + 30));
  }

  @Test
  public void reverseIteratorOverallTest() {
    List<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);

    int sum = 0;
    ReverseIterator<Integer> iter = list.reverseIterator();
    while(iter.hasPrevious()) {
      sum += iter.previous();
    }

    assertThat(sum, is(30 + 20 + 10));
  }

  @Test
  public void iteratorOrderTest() {
    List<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);

    assertThat(list.iterator().next(), is(10));
  }

  @Test
  public void reverseIteratorTest() {
    List<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);

    assertThat(list.reverseIterator().previous(), is(20));
  }
}
