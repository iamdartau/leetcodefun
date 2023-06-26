public class PSolution {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(isPalindrome("race a car"));
  }

  public static boolean isPalindrome(String s) {
    char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
    int pointerA = 0;
    int pointerB = chars.length-1;
    while (pointerA < pointerB) {
      if (chars[pointerA] != chars[pointerB]){
        return false;
      }
      pointerA++;
      pointerB--;
    }
    return true;
  }

}
