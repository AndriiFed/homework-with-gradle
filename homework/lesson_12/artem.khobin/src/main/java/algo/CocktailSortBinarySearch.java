package algo;

public class CocktailSortBinarySearch extends BinarySearch {
  protected Object[] sort(Object[] toSort) {
    int exchanges;
    int start = 0;
    int end = toSort.length - 1;
    while (start <= end) {
      exchanges = 0;
      for (int i = start; i < end; i++) {
        if (((Comparable) toSort[i]).compareTo(toSort[i + 1]) > 0) {
          Object temp = toSort[i + 1];
          toSort[i + 1] = toSort[i];
          toSort[i] = temp;
          exchanges++;
        }
      }
      end--;

      for (int j = end; j > start; j--) {
        if (((Comparable) toSort[j]).compareTo(toSort[j - 1]) < 0) {
          Object temp = toSort[j - 1];
          toSort[j - 1] = toSort[j];
          toSort[j] = temp;
          exchanges++;
        }
      }
      start++;

      if (exchanges == 0) {
        break;
      }
    }

    return toSort;
  }
}
