package algo;

public interface Iterable<Item> {
  Iterator<Item> iterator();
  ReverseIterator<Item> reverseIterator();
}
