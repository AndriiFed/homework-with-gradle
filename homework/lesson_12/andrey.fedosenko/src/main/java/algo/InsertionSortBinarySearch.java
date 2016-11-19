package algo;

public class InsertionSortBinarySearch extends BinarySearch {

  @Override
  protected Object[] sort(Object[] unsorted) {
    Object temp;
    Comparable acompArray;
    int jj;

    for (int i = 1; i < unsorted.length; i++) {
      temp = unsorted[i];
      jj = i;
      acompArray = (Comparable) unsorted[jj - 1];

      while (jj > 0 && acompArray.compareTo(temp) > 0) {
        unsorted[jj] = unsorted[jj - 1];
        jj--;
      }
      unsorted[jj] = temp;
    }
    return unsorted;
  }
}
