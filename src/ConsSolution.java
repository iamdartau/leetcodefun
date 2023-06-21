import java.util.HashSet;

public class ConsSolution {

  public static void main(String[] args) {
    System.out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
  }

  public static int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int answer = 1;
    HashSet<Integer> set = new HashSet<>();
    for (Integer num : nums) {
      set.add(num);
    }
    for (Integer num : nums) {
      if (!set.contains(num - 1)) {
        int count = 1;
        while (set.contains(num + 1)) {
          num++;
          count++;
        }
        answer = Math.max(count, answer);
      }
    }

    return answer;
  }

}
