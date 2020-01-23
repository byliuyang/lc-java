import java.util.HashMap;
import java.util.Map;

/**
 * @author Harry Liu
 * @version Sept 11, 2019
 *
 * @challenge https://leetcode.com/problems/two-sum
 * @solution Search from two sides and eliminate a group of possible combinations each time.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[]{-1, -1};
        }

        if (nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> seen = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            int num = nums[idx];
            int complement = target - num;

            if (seen.containsKey(complement)) {
                int prevIdx = seen.get(complement);
                return new int[]{prevIdx, idx};
            }
            seen.put(num, idx);
        }
        return new int[]{-1, -1};
    }
}