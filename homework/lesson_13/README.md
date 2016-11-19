
Домашнее задание:

Написать свою реализацию LinkedList.

Ознакомтесь с теорией: [Doubly or Bi-directional Linked List](https://en.wikipedia.org/wiki/Linked_list#Doubly_linked_list)

List должен реализовывать следующие операции
```java
  void add(Item item); // добавление нового элемента указанного типа
  Item get(int index); // поиск элемента по указанному индексу
  void remove(int index); // удаление элемента по указанному индексу
  boolean isEmpty();
  int size();
  void clear();
  Iterator<Item> iterator(); // Итератор, для перебора списка в прямом порядке
  ReverseIterator<Item> reverseIterator(); // Итератор, для перебора списка в обратном порядке
```

В директории `misc` вы найдёте Java интерфейсы, необходимые для реализации задания и пример определения LinkedList класса.
