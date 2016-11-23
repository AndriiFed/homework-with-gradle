package algo;

public abstract class BinarySearch {
  public final int perform(Object[] unsorted, Object toFind) {
    Object[] array = unsorted.clone();
    return binarySearch(sort(array), toFind);
  }

  protected abstract Object[] sort(Object[] toSort);

  private int binarySearch(Object[] sorted, Object toFind) {
    int firstPos = 0;
    int lastPos = sorted.length;
    int check;
    while (firstPos < lastPos) {
      check = (lastPos + firstPos) / 2;
      if (((Comparable) sorted[check]).compareTo(toFind) == 0) {
        return check;
      } else if (((Comparable) sorted[check]).compareTo(toFind) < 0) {
        firstPos = check + 1;
      } else {
        lastPos = check;
      }
    }

    return -1;
  }
}
