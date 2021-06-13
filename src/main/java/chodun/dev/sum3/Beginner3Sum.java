package chodun.dev.sum3;

import java.util.*;

public class Beginner3Sum {

    private boolean sumsToZero(final List<Integer> triplet) {
        int sum = 0;
        for (int v : triplet) {
            sum += v;
        }
        return sum == 0;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    var triplet = List.of(nums[i], nums[j], nums[k]);
                    if (sumsToZero(triplet)) {
                        answer.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(answer);
    }
}
