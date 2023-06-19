import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SolutionGroup {

    public static void main(String[] args) {
        System.out.println(
                groupAnagrams(
                        new String[]{
                                "eat",
                                "tea",
                                "tan",
                                "ate",
                                "nat",
                                "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) return result;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hashes = new int[26];
            for (char c : s.toCharArray()) {
                hashes[c - 'a']++;
            }
            String key = Arrays.toString(hashes);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}
