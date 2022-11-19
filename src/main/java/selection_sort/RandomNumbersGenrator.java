package selection_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersGenrator {

    public static List<Integer> generateRandomNumsList(int listSize, int numsInListRange) {
        List<Integer> randomNums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < listSize; i++) {
            randomNums.add(random.nextInt(numsInListRange));
        }

        return randomNums;
    }
}
