package algo;

public interface List<Item> {
  void add(Item item);
  Item get(int index);
  void remove(int index);
  boolean isEmpty();
  int size();
  void clear();
  Iterator<Item> iterator();
  ReverseIterator<Item> reverseIterator();
}
