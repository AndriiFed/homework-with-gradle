import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import algo.BinarySearch;
import algo.BubbleSortBinarySearch;
import algo.InsertionSortBinarySearch;

import java.util.Arrays;

public class BinarySearchTest {
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

    assertThat(index, is(0));
  }

  @Test
  public void test_InsertionSortBinarySearch_WithUnSortedArray() {
    BinarySearch bin = new InsertionSortBinarySearch();

    MyObject obj1 = new MyObject();
    MyObject obj2 = new MyObject();
    MyObject obj3 = new MyObject();
    MyObject obj4 = new MyObject();
    MyObject obj5 = new MyObject();
    MyObject obj6 = new MyObject();

    obj1.value = 2;
    obj2.value = 1;
    obj3.value = 3;
    obj4.value = 4;
    obj5.value = 6;
    obj6.value = 5;

    MyObject[] objects = {obj1, obj2, obj3, obj4, obj5, obj6};
    int index = bin.perform(objects, obj5);

    assertThat(index, is(5));
  }

  @Test
  public void test_InsertionSortBinarySearch_WithSortedArray() {
    BinarySearch bin = new InsertionSortBinarySearch();

    MyObject obj1 = new MyObject();
    MyObject obj2 = new MyObject();
    MyObject obj3 = new MyObject();
    MyObject obj4 = new MyObject();
    MyObject obj5 = new MyObject();
    MyObject obj6 = new MyObject();

    obj1.value = 1;
    obj2.value = 2;
    obj3.value = 3;
    obj4.value = 4;
    obj5.value = 5;
    obj6.value = 6;

    MyObject[] objects = {obj1, obj2, obj3, obj4, obj5, obj6};
    int index = bin.perform(objects, obj1);

    /* // Sorting test
    for (int i = 0; i < objects.length; i++) {
      System.out.println(objects[i].value);
    }
    */

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
