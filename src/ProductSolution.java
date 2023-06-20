import java.util.Arrays;
import java.util.HashSet;

public class ProductSolution {

  public static void main(String[] args) {
    System.out.print(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    int prefix = 1, postfix = 1;
    for (int i = 0; i < nums.length; i++) {
      result[i] = prefix;
      prefix *= nums[i];
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= postfix;
      postfix *= nums[i];
    }
    return result;
  }
}
