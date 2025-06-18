package algorithms.beginner;

import java.util.ArrayList;
import java.util.List;

public class MinMaxOfAnArray {
    public List<Integer> MinAndMaxOfAnArray(List<Integer> array) {
        if (array == null || array.isEmpty()) {
            return new ArrayList<>();
        }

        int min = array.getFirst();
        int max = array.getFirst();

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        List<Integer> minAndMaxArray = new ArrayList<>();
        minAndMaxArray.add(min);
        minAndMaxArray.add(max);

        return minAndMaxArray;
    }
}
