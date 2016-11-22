package algo;

public class LinkedList<T> implements List<T> {
  private Node<T> lastNode;
  private Node<T> firstNode;
  private int size;

  private static class Node<T> {
    T value;
    Node<T> next;
    Node<T> previous;

    public Node(T value) {
      this.value = value;
    }
  }

  public class IteratorCl<T> implements Iterator<T> {
    Node<T> current;

    public IteratorCl(Node<T> newNode) {
      current = newNode;
    }

    public boolean hasNext() {
      return current != null;
    }

    public T next() {
      T temp = current.value;
      current = current.next;
      return temp;
    }
  }

  public class ReverseIteratorCl<T> implements ReverseIterator<T> {
    Node<T> current;

    public ReverseIteratorCl(Node<T> newNode) {
      current = newNode;
    }

    public boolean hasPrevious() {
      return current != null;
    }

    public T previous() {
      T temp = current.value;
      current = current.previous;
      return temp;
    }
  }

  public boolean isEmpty() {
    return firstNode == null;
  }

  public int size() {
    return size;
  }

  public void clear() {
    firstNode = null;
    lastNode = null;
    size = 0;
  }

  public void add(T item) {
    Node<T> newNode = new Node<T>(item);

    if (this.isEmpty()) {
      firstNode = newNode;
      lastNode = newNode;
    } else {
      lastNode.next = newNode;
      newNode.previous = lastNode;
      lastNode = newNode;
    }
    size++;
  }

  public T get(int index) {
    Node<T> current = firstNode;

    for (int i = 0; i < index; i++) {
      if (current.next == null) {
        break;
      }
      current = current.next;
    }
    return current.value;
  }

  public void remove(int index) {
    Node<T> remNode = firstNode;

    for (int i = 0; i < index; i++) {
      remNode = remNode.next;
    }

    if (remNode == firstNode) {
      firstNode = remNode.next;
    } else {
      remNode.previous.next = remNode.next;
    }

    if (remNode == lastNode) {
      lastNode = remNode.previous;
    } else {
      remNode.next.previous = remNode.previous;
    }
    size--;
  }

  public Iterator<T> iterator() {
    return new IteratorCl<T>(firstNode);
  }

  public ReverseIterator<T> reverseIterator() {
    return new ReverseIteratorCl<T>(lastNode);
  }

}
