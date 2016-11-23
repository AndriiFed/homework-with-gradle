import algo.BubbleSortBinarySearch;

import algo.CocktailSortBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BinarySearchTest {
  @Test
  public void testPerformBubbleSort() {
    BubbleSortBinarySearch searcher = new BubbleSortBinarySearch();
    TestObject obj1 = new TestObject(1);
    TestObject obj2 = new TestObject(4);
    TestObject obj3 = new TestObject(2);
    TestObject obj4 = new TestObject(7);
    TestObject obj5 = new TestObject(-2);

    TestObject[] haystack = {obj1, obj2, obj3, obj4, obj5};

    int index = searcher.perform(haystack, obj3);
    assertThat(index, is(2));

    index = searcher.perform(haystack, obj5);
    assertThat(index, is(0));
  }

  @Test
  public void testPerformCocktailSort() {
    CocktailSortBinarySearch searcher = new CocktailSortBinarySearch();
    TestObject obj1 = new TestObject(1);
    TestObject obj2 = new TestObject(4);
    TestObject obj3 = new TestObject(2);
    TestObject obj4 = new TestObject(7);
    TestObject obj5 = new TestObject(-2);

    TestObject[] haystack = {obj1, obj2, obj3, obj4, obj5};

    int index = searcher.perform(haystack, obj4);
    assertThat(index, is(4));

    index = searcher.perform(haystack, obj5);
    assertThat(index, is(0));
  }

  class TestObject implements Comparable<TestObject> {
    int value;
    public TestObject(int value) {
      this.value = value;
    }

    public String toString() {
      return "" + value;
    }

    public int compareTo(TestObject that) {
      return this.value - that.value;
    }
  }
}
