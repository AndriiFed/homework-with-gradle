package algo;

public class ArrayList<T> implements List<T> {
  private Object[] arrayList = new Object[0];

  @Override
  public int size() {
    return arrayList.length;
  }

  @Override
  public void clear() {
    arrayList = new Object[0];
  }

  @Override
  public boolean isEmpty() {
    return arrayList.length == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public T get(int index) {
    if (isEmpty()) {
      return null;
    }
    return (T) arrayList[index];
  }

  @Override
  public void add(T item) {
    int length = arrayList.length;
    Object[] buffer = new Object[length + 1];

    System.arraycopy(arrayList, 0, buffer, 0, length);
    buffer[length] = item;
    arrayList = buffer;
  }

  @Override
  public void remove(int index) {

    if (isEmpty()) {
      return;
    }

    int length = arrayList.length;
    Object[] buffer = new Object[length - 1];
    System.arraycopy(arrayList, 0, buffer, 0, index);
    System.arraycopy(arrayList, index + 1, buffer, index, length - index - 1);
    arrayList = buffer;

  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayListIterator<T>(0);
  }

  @Override
  public ReverseIterator<T> reverseIterator() {
    return new ArrayListReverseIterator<T>(arrayList.length - 1);
  }

  @Override
  public Iterator<T> randomIterator() {
    int random = (int) Math.floor(Math.random() * (arrayList.length - 1));
    return new ArrayListIterator<T>(random);
  }

  public class ArrayListIterator<T> implements Iterator<T> {
    private int index;

    public ArrayListIterator(int index) {
      this.index = index;
    }

    public boolean hasNext() {
      return index < arrayList.length;
    }

    @SuppressWarnings("unchecked")
    public T next() {
      return (T) arrayList[index++];
    }

  }

  public class ArrayListReverseIterator<T> implements ReverseIterator<T> {
    private int index;

    public ArrayListReverseIterator(int index) {
      this.index = index;
    }

    public boolean hasPrevious() {
      return index >= 0;
    }

    @SuppressWarnings("unchecked")
    public T previous() {
      return (T) arrayList[index--];
    }

  }

}
