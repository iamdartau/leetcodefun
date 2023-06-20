import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopSolution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> frmap = new HashMap<>();
        for (int num : nums) {
            frmap.put(num, frmap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (a, b) -> a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it: frmap.entrySet()) {
            priorityQueue.add(it);
            if (priorityQueue.size()>k) priorityQueue.poll();
        }
        int i = k;
        while (!priorityQueue.isEmpty()){
            result[--i] = priorityQueue.poll().getKey();
        }
        return result;
    }
}
