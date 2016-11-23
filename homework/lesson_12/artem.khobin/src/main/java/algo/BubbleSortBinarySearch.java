package algo;

import java.util.Arrays;

/**
 * Created by Dev on 19.11.2016.
 */
public class BubbleSortBinarySearch extends BinarySearch {
  protected Object[] sort(Object[] toSort) {
    //Arrays.sort(toSort);
    int exchanges;
    for (int i = 0; i < toSort.length - 1; i++) {
      exchanges = 0;
      for (int j = 0; j < toSort.length - 1 - i; j++) {
        if (((Comparable) toSort[j]).compareTo(toSort[j + 1]) > 0) {
          Object temp = toSort[j + 1];
          toSort[j + 1] = toSort[j];
          toSort[j] = temp;
          exchanges++;
        }
      }

      if (exchanges == 0) {
        break;
      }
    }

    return toSort;
  }
}
