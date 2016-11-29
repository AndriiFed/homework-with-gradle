package algo.queue;

public class LinkedListQueue<T> implements Queue<T> {

  private Node<T> first;
  private Node<T> last;

  private static class Node<T> {
    private T item;
    private Node<T> next;
  }

  public LinkedListQueue() {
    first = null;
    last  = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void enqueue(T item) {
    Node<T> oldLast = last;
    last = new Node<T>();
    last.item = item;
    last.next = null;
    if (isEmpty()) {
      first = last;
    } else {
      oldLast.next = last;
    }
  }

  public T dequeue() {
    T item;

    if (isEmpty()) {
      return null;
    }

    item = first.item;
    first = first.next;
    if (isEmpty()) {
      last = null;
    }
    return item;
  }

}


