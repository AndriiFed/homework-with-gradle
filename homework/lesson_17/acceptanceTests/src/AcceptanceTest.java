import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import algo.PriorityQueue;
import algo.PQSorter;

import java.util.Arrays;

public class AcceptanceTest {
  @Test
  public void priorityQueueTest() {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    pq.insert(10);
    pq.insert(30);
    pq.insert(20);
    pq.insert(30);
    pq.insert(40);

    assertThat(pq.min(), is(10));
    assertThat(pq.min(), is(20));
    assertThat(pq.min(), is(30));
    assertThat(pq.min(), is(30));
    assertThat(pq.min(), is(40));
  }

  @Test
  public void priorityQueueSortTestAscendingOrder() {
    PQSorter sorter = new PQSorter(PQSorter.Order.ASCENDING);
    String[] unsorted = {"I", "like", "Java", "but", "sometimes", "I", "feel", "like", "Java", "doesn't", "like", "me"};

    assertThat(sorter.<String>sort(unsorted),
      is(new String[] {"I", "I", "Java", "Java", "but", "doesn't", "feel", "like", "like", "like", "me", "sometimes"}));
  }

  @Test
  public void priorityQueueSortTestDescendingOrder() {
    PQSorter sorter = new PQSorter(PQSorter.Order.DESCENDING);
    String[] unsorted = {"I", "like", "Java", "but", "sometimes", "I", "feel", "like", "Java", "doesn't", "like", "me"};

    assertThat(sorter.<String>sort(unsorted),
      is(new String[] {"sometimes", "me", "like", "like", "like", "feel", "doesn't", "but", "Java", "Java", "I", "I"}));
  }
}
