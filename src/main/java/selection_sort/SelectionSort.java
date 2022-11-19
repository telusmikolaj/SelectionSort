package selection_sort;

import java.util.Collections;
import java.util.List;

public class SelectionSort {

    public static List<Integer> sort(List<Integer> numsArray) {

        int n = numsArray.size();
        int minIndex = 0;

        for (int i = 0; i < n-1; i++) {
            minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (numsArray.get(j) < numsArray.get(minIndex)) {
                    Collections.swap(numsArray, j, minIndex);
                }
            }
        }
        return numsArray;
    }
}
