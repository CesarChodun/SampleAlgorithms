package chodun.dev.sum3;

import java.util.*;

public class Pro3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        int first, last;
        Arrays.sort(nums);
        for (int j = 1; j < nums.length; j++) {
            first = j - 1; last = j + 1;
            while (first >= 0 && last < nums.length) {
                int sum = nums[first] + nums[j] + nums[last];
                if (sum == 0) {
                    answer.add(List.of(nums[first], nums[j], nums[last]));
                    first--; last++;
                } else if (sum < 0) {
                    last++;
                } else {
                    first--;
                }
            }
        }
        return new ArrayList<>(answer);
    }
}
