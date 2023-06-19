import java.util.Arrays;
import java.util.HashMap;

public class SolutionTwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i!=j && nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return new int[1];
    }
}
