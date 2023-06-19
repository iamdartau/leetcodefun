public class SolutionAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));//false
        System.out.println(isAnagram("anagram", "anagram"));//true
        System.out.println(isAnagram("ac", "bb"));//false
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] store = new int[26];
        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}
