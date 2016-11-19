package algo;

public abstract class BinarySearch {

  public final int perform(Object[] unsorted, Object toFind) {
    Object[] objects = sort(unsorted);
    return binarySearch(objects, toFind);
  }

  protected abstract Object[] sort(Object[] unsorted);

  private int binarySearch(Object[] sorted, Object toFind) {
    int low = 0;
    int high = sorted.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      Comparable midVal = (Comparable) sorted[mid];
      int cmp = midVal.compareTo(toFind);
      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -(low + 1);
  }

}
