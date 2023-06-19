import java.util.HashMap;

public class SolutionRoman {


    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
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
        for (Character c : s.toCharArray()) {
            int current = map.get(c);
            if (current < previous){
                result -= current;
            }else {
                result += current;
            }
            previous = current;
        }
        return result;
    }

}


