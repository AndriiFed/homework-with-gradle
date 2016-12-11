package algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class PriorityQueue<T extends Comparable> implements Iterable<T> {
  private Object[] elements = new Object[20];
  private int size = 0;
  private Comparator<T> comparator;

  public PriorityQueue() {}

  public PriorityQueue(Comparator<T> comparator) {
    this.comparator = comparator;
  }

  public void insert(T item) {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, elements.length * 2);
    }

    elements[++size] = item;
    swim(size);
  }

  public T min() {
    final T min = (T)elements[1];
    exchange(1, size);
    elements[size] = null;
    size--;
    sink(1);

    return min;
  }

  private boolean largerOrEqual(int prev, int next) {
    if (comparator == null) {
      return ((Comparable)elements[prev]).compareTo(elements[next]) > -1;
    } else {
      return comparator.compare((T)elements[prev], (T)elements[next]) > -1;
    }
  }

  private void swim(int node) {
    while (!isRoot(node) && largerOrEqual(getParentIndex(node), node)) {
      exchange(node, getParentIndex(node));
      node = getParentIndex(node);
    }
  }

  private void sink(int node) {
    while (getLeftChildIndex(node) <= size) {
      int child = getChildIndex(node);
      if (largerOrEqual(node, child)) {
        exchange(node, child);
        node = child;
      } else {
        break;
      }
    }
  }

  private int getChildIndex(int node) {
    int leftChild = getLeftChildIndex(node);
    if (leftChild != size && largerOrEqual(getLeftChildIndex(node), getRightChildIndex(node))) {
      return getRightChildIndex(node);
    }
    return leftChild;
  }

  private int getLeftChildIndex(int node) {
    return node * 2;
  }

  private int getRightChildIndex(int node) {
    return node * 2 + 1;
  }

  private boolean isRoot(int node) {
    return node == 1;
  }

  private int getParentIndex(int node) {
    return node / 2;
  }

  private void exchange(int prev, int next) {
    T tmp = (T)elements[prev];
    elements[prev] = elements[next];
    elements[next] = tmp;
  }

  @Override
  public Iterator<T> iterator() {
    return new PriorityQueueIterator<T>(elements);
  }

  class PriorityQueueIterator<T> implements Iterator<T> {
    private Object[] elements;
    private int index = 1;

    PriorityQueueIterator(Object[] elements) {
      this.elements = elements;
    }

    public boolean hasNext() {
      return (index < elements.length && elements[index] != null);
    }

    public T next() {
      return (T)elements[index++];
    }
  }
}
