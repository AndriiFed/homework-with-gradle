import org.junit.Before;
import org.junit.Test;

import algo.queue.LinkedListQueue;
import algo.queue.Queue;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class QueueTests {

  private Queue<Integer> queue;

  @Before
  public void setUp() throws Exception {
    queue = new LinkedListQueue<>();
  }

  @Test
  public void testSimpleAddition() {
    queue.enqueue(10);

    assertThat(queue.dequeue(), is(10));
  }

  @Test
  public void testFewAdditionsInRow() {
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    assertThat(queue.dequeue(), is(10));
    assertThat(queue.dequeue(), is(20));
    assertThat(queue.dequeue(), is(30));
  }

  @Test
  public void testAdditionAndRemoval() {
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    queue.dequeue();
    queue.dequeue();

    queue.enqueue(40);

    assertThat(queue.dequeue(), is(30));
    assertThat(queue.dequeue(), is(40));
  }

  @Test
  public void testMoreAdditions() {
    for (int i = 0; i < 20; i++) {
      queue.enqueue(i);
    }

    for (int i = 0; i < 20; i++) {
      assertThat(queue.dequeue(), is(i));
    }
  }
}
