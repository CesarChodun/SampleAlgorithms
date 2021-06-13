package chodun.dev.sum3;

import java.util.*;

public class Intermediate3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> firstNumber = new HashSet<>();
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                int missing = -(nums[j] + nums[k]);
                if (firstNumber.contains(missing)) {
                    answer.add(List.of(missing, nums[j], nums[k]));
                }
            }
            firstNumber.add(nums[j]);
        }
        return new ArrayList<>(answer);
    }
}
