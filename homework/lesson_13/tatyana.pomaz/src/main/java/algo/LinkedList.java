package algo;

public class LinkedList<T> implements List<T> {
  private Node<T> lastNode;
  private Node<T> firstNode;
  private int size;
  
  private static class Node<T> {
    T value;
    Node<T> next;
    Node<T> previous;

    private Node(T value) {
      this.value = value;
    }
  }  

  public void add(T item) {
    Node<T> newNode = new Node<T>(item);
    if (isEmpty()) {
      firstNode = newNode;
    } else {
      lastNode.next = newNode;
      newNode.previous = lastNode;  
    }
    lastNode = newNode;
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
    Node<T> current = firstNode;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    if (current == firstNode) {
      firstNode = current.next;
    } else {
      current.previous.next = current.next;
    }

    if (current == lastNode) {
      lastNode = current.previous;
    } else {
      current.next.previous = current.previous;
    }
    size--;
  }
  
  public boolean isEmpty() {
    return size == 0;  
  }
  
  public int size() {
    return size;  
  }
  
  public void clear() {
    firstNode = lastNode = null; 
    size = 0;
  }
  
  public Iterator<T> iterator() {
    Iterator<T> iterator = new IteratorOfList<T>(firstNode);
    return iterator;  
  }
  
  public ReverseIterator<T> reverseIterator() {
    ReverseIterator<T> reverseIterator = new ReverseIteratorOfList<T>(lastNode);
    return reverseIterator; 
  }
  
  public class IteratorOfList<T> implements Iterator {
    Node<T> current;
 
    IteratorOfList(Node<T> node) {
      current = node;
    }
 
    public boolean hasNext() {
      return current != null;
    }
 
    public T next() {
      T item = current.value;
      current = current.next;
      return item;
    }  
  }
  
  public class ReverseIteratorOfList<T> implements ReverseIterator {
    Node<T> current;
 
    ReverseIteratorOfList(Node<T> node) {
      current = node;
    }
 
    public boolean hasPrevious() {
      return current != null;
    }
 
    public T previous() {
      T item = current.value;
      current = current.previous;
      return item;
    }
  }
  
}
