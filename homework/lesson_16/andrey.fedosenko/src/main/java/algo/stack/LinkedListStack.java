package algo.stack;

public class LinkedListStack<T> implements Stack<T> {
  private Node first;

  private class Node {
    private T item;
    private Node next;
  }

  public LinkedListStack() {
    first = null;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void push(T item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
  }

  public T pop() {
    T item;
    if (isEmpty()) {
      return null;
    }
    item = first.item;
    first = first.next;
    return item;
  }

}
