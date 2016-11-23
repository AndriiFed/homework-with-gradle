import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.anyOf;

import algo.*;

public class AcceptanceTests {
  private List<Integer> list;

  @Before
  public void setUp() {
    list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
  }

  @Test
  public void testFetchingElementsByIndex() {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    assertThat(list.get(0), is(10));
    assertThat(list.get(1), is(20));
    assertThat(list.get(2), is(30));
    assertThat(list.get(3), is(40));
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
    List<Integer> list = new ArrayList<>();

    assertThat(list.isEmpty(), is(true));
  }

  @Test
  public void onNonEmptyList_isEmpty_returnsFalse() {
    List<Integer> list = new ArrayList<>();
    list.add(10);

    assertThat(list.isEmpty(), is(false));
  }

  @Test
  public void onNoneEmptyList_size_returnsNumberOfItems() {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);

    assertThat(list.size(), is(2));
  }

  @Test
  public void afterClearMethodCall_listShouldBeEmpty() {
    list.clear();

    assertThat(list.isEmpty(), is(true));
  }

  @Test (timeout = 2000)
  public void addingPlentyElements() {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i <= 10_000; i++) {
      list.add(i);
    }

    assertThat(list.get(0), is(0));
    assertThat(list.get(500), is(500));
    assertThat(list.get(1_000), is(1_000));
    assertThat(list.get(5_000), is(5_000));
    assertThat(list.get(10_000), is(10_000));
  }

  @Test
  public void iteratorOverallTest() {
    List<Integer> list = new ArrayList<>();
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
    List<Integer> list = new ArrayList<>();
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
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);

    assertThat(list.iterator().next(), is(10));
  }

  @Test
  public void reverseIteratorTest() {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);

    assertThat(list.reverseIterator().previous(), is(20));
  }

  @Test
  public void randomIteratorTest() {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);

    assertThat(list.randomIterator().next(), anyOf(is(10), is(20)));
  }
}
