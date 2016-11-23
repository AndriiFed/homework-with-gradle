package algo;

public interface List<Item> extends Iterable<Item>, RandomlyIterable<Item> {
  void add(Item item);
  Item get(int index);
  void remove(int index);
  boolean isEmpty();
  int size();
  void clear();
}
