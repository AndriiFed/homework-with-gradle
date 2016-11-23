import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import algo.LinkedList;

public class LinkedListTest {
  LinkedList<String> list;
  @Before
  public void init() {
    list = new LinkedList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
  }

  @Test
  public void testAddToList() {
    LinkedList<String> list = new LinkedList<>();
    assertThat(list.size(), is(0));
    list.add("cc");
    assertThat(list.size(), is(1));
    list.add("dd");
    assertThat(list.size(), is(2));
  }

  @Test
  public void testGetItemFromList() {
    assertThat(list.get(0), is("a"));
    assertThat(list.get(1), is("b"));
    assertThat(list.get(2), is("c"));
    assertThat(list.get(3), is("d"));
    assertThat(list.get(4), is("e"));
  }

  @Test
  public void testRemoveItemFromList() {
    list.remove(0);
    assertThat(list.get(0), is("b"));
    list.remove(1);
    assertThat(list.get(1), is("d"));
    list.remove(2);
    assertThat(list.get(1), is("d"));
  }

  @Test
  public void testClearList() {
    list.clear();
    assertThat(list.isEmpty(), is(true));
  }
}
