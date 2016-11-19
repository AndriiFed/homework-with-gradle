package algo;

public interface ReverseIterator<Item> {
  boolean hasPrevious();
  Item previous();
}
