Домашнее задание:

Задание представляет собой реализацию "Template Method" design pattern, с использованием алгоритмов поиска и сортировки.

До того как приступить к выполнению задания, ознакомьтесь со следующими алгоритмами:
* [Template Method design pattern](https://sourcemaking.com/design_patterns/template_method)
* [Binary Search - бинарный поиск](https://www.youtube.com/watch?v=JQhciTuD3E8)
* [Bubble Sort - сортировка пузырьком](https://www.youtube.com/watch?v=lyZQPjUT5B4)

Как вы успели заметить, для работы binary search, необходимым условием является сортировка входных данных.
Напишите класс, BinarySearch, метод `perform` которого, принимает любой, отсортированный либо неотсортированный, массив объектов произвольного типа данных и объект этого типа данных для дальнейшего поиска.

```java
package algo;

public abstract class BinarySearch {
  public final int perform(Object[] unsorted, Object toFind) {
    // your code here
  }

  protected abstract Object[] sort(Object[] unsorted);

  private int binarySearch(Object[] sorted, Object toFind) {
    // it's linear search :) here should be your implementation of binary search instead
    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i].equals(toFind)) {
        return i;
      }
    }
    return -1;
  }
}
```

В вашем решении должна быть минимум одна реализация сортировки, название класса вы можете найти в `AcceptanceTests.java`

> Как дополнительное задание, добавьте любую другую реализацию сортировки, кроме обязательной сортировки пузырьком.

> До написания своих юнит-тестов, прочитайте комментарий к `test_BubbleSortBinarySearch_WithUnSortedArray` в `AcceptanceTests.java`. Это поможет сократить время на поиск несуществующих проблем.
