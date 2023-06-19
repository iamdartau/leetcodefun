import java.util.HashMap;

public class SolutionRoman {


    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
        System.out.println(romanToInt("LVIII")); // 58
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int previous = 0;
        for (char c : s.toCharArray()) {
            int currValue = map.get(c);
            if (currValue > previous) {
                result += currValue - 2 * previous;
            } else {
                result += currValue;
            }
            previous = currValue;
        }
        return result;
    }

}


