package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < twoSum.length; i++) {
            map.put(target-twoSum[i], twoSum[i]);
        }


    }
}
