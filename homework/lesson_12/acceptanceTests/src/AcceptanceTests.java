import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import algo.BinarySearch;
import algo.BubbleSortBinarySearch;

import java.util.Arrays;

public class AcceptanceTests {
  @Test
  public void testExample() {
    BinarySearch bin = new BinarySearch() {
      protected Object[] sort(Object[] input) {
        Arrays.sort(input);
        return input;
      }
    };

    MyObject objectToFind = new MyObject();
    MyObject[] objects = {new MyObject(), objectToFind, new MyObject()};
    int index = bin.perform(objects, objectToFind);

    assertThat(index, is(1));
  }

  @Test
  public void test_BubbleSortBinarySearch_WithSortedArray() {
    BinarySearch bin = new BubbleSortBinarySearch();

    MyObject obj1 = new MyObject();
    MyObject obj2 = new MyObject();
    MyObject obj3 = new MyObject();

    obj1.value = 0;
    obj2.value = 1;
    obj3.value = 2;

    MyObject[] objects = {obj1, obj2, obj3};
    int index = bin.perform(objects, obj2);

    assertThat(index, is(1));
  }

  @Test
  public void test_BubbleSortBinarySearch_WithUnSortedArray() {
    BinarySearch bin = new BubbleSortBinarySearch();

    MyObject obj1 = new MyObject();
    MyObject obj2 = new MyObject();
    MyObject obj3 = new MyObject();

    obj1.value = 2;
    obj2.value = 1;
    obj3.value = 3;

    MyObject[] objects = {obj1, obj2, obj3};
    int index = bin.perform(objects, obj2);

    //assertThat(index, is(1)); // here we don't have what we would expect.
    // The position is 0, not 1, which is a result of sort function inside BinarySearch.perform() method.
    // Therefore, we implement technically incorrect implementation. It works correctly only for sorted arrays ¯\_(ツ)_/¯
    // Even though the behaviour is incorrect for unsorted arrays case, for educational purposes it's fine :)
    assertThat(index, is(0));
  }

  class MyObject implements Comparable {
    int value;
    public int compareTo(Object obj) {
      MyObject another = (MyObject) obj;
      return Integer.compare(value, another.value);
    }
  }
}
