Домашнее задание:

* Реализовать Priority Queue, основанную на [min-heap property](https://xlinux.nist.gov/dads/HTML/minheapprop.html)

  ```java
  public class PriorityQueue<T> {
    public void insert(T item) {
      // your code here
    }

    public T min() {
      // your code here
    }
  }
  ```

* Напишите итератор для Priority Queue
  > Используйте [java.lang.Iterable](https://docs.oracle.com/javase/7/docs/api/java/lang/Iterable.html) интерфейс

3. На основе Priority Queue напишите функцию сортировки, использующую Heap sort метод

  ```java
  public class PQSorter {
    public static enum Order {
      ASCENDING, DESCENDING;
    }

    public <T> T[] sort(T[] unsorted) {
      // your code here
    }
  }

  ```

  > Используйте [java.util.Comparator](https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html) интерфейс
