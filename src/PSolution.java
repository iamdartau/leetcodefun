public class PSolution {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(isPalindrome("race a car"));
  }

  public static boolean isPalindrome(String s) {
    int pointerA = 0;
    int pointerB = s.length() - 1;
    while (pointerA < pointerB) {
      Character a = s.charAt(pointerA);
      Character b = s.charAt(pointerB);
      if (!Character.isLetterOrDigit(a)) {
        pointerA++;
        continue;
      }
      if (!Character.isLetterOrDigit(b)) {
        pointerB--;
        continue;
      }

      if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
        return false;
      }
      pointerA++;
      pointerB--;
    }
    return true;
  }

}
