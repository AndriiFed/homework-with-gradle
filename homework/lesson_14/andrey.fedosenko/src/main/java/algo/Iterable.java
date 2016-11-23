package algo;

public interface Iterable<T> {

  Iterator<T> iterator();

  ReverseIterator<T> reverseIterator();
}
