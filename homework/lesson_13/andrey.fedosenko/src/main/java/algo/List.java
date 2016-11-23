package algo;

public interface List<T> {
  void add(T item);

  T get(int index);

  void remove(int index);

  boolean isEmpty();

  int size();

  void clear();

  Iterator<T> iterator();

  ReverseIterator<T> reverseIterator();
}
