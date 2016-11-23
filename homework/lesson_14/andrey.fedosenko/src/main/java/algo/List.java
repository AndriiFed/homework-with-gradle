package algo;

public interface List<T> extends Iterable<T>, RandomlyIterable<T> {

  void add(T item);

  T get(int index);

  void remove(int index);

  boolean isEmpty();

  int size();

  void clear();

}
