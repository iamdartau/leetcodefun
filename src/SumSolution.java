import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumSolution {

  public static void main(String[] args) {
//    List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//    System.out.println(lists);
//    System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
//    System.out.println(search(new int[]{-1,0,3,5,9,12}, 13));
//    System.out.println(search(new int[]{-1,0,3,5,9,12}, 3));
    System.out.println(search(new int[]{-1,0,3,5,9,12}, 0));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    LinkedList<List<Integer>> sol = new LinkedList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int target = -nums[i];
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
          if (nums[left] + nums[right] == target) {
            ArrayList<Integer> miniSol = new ArrayList<>();
            miniSol.add(nums[i]);
            miniSol.add(nums[left]);
            miniSol.add(nums[right]);
            sol.add(miniSol);
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            left++;
            right--;
          } else if (nums[left] + nums[right] > target) {
            right--;
          } else {
            left++;
          }
        }
      }
    }
    return sol;
  }

  public static int search(int[] nums, int target) {
    int middle, left, right;
    left = 0;
    right = nums.length - 1;
    while (left<=right){
      middle = left + ((right - left)/2);
      if (target == nums[middle]) return middle;
      if (target>nums[middle]){
        left = middle+1;
      }else {
        right = middle-1;
      }
    }
    return -1;
  }
}