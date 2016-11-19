package algo;

public class BubbleSortBinarySearch extends BinarySearch {

  @Override
  protected Object[] sort(Object[] unsorted) {
    Object temp;
    for (int i = 0; i < unsorted.length - 1; i++) {
      for (int j = 1; j < unsorted.length - i; j++) {

        Comparable acompArray = (Comparable) unsorted[j - 1];
        if (acompArray.compareTo(unsorted[j]) > 0) {
          temp = unsorted[j - 1];
          unsorted[j - 1] = unsorted[j];
          unsorted[j] = temp;
        }
      }
    }
    return unsorted;
  }

}
