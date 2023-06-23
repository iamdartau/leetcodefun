import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class PSolution {

  public static void main(String[] args) {
    System.out.println(isValid("(){}}{"));
    System.out.println(isValid("(]"));
    System.out.println(isValid("(){}{}"));
    System.out.println(isValid("()"));
    System.out.println(isValid("()[]{}"));
  }


  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] chars = s.toCharArray();
    if (s.length() % 2 != 0) {
      return false;
    }
    for (int i = 0; i < chars.length; i++) {
      if (!stack.isEmpty()) {
        if (stack.peek() == '(' && chars[i] == ')' ||
            stack.peek() == '{' && chars[i] == '}' ||
            stack.peek() == '[' && chars[i] == ']') {
          stack.pop();
        } else {
          stack.push(chars[i]);
        }
      } else if (
          stack.isEmpty() &&
              chars[i] == '}' ||
              chars[i] == ']' ||
              chars[i] == ')') {
        return false;
      } else {
        stack.push(chars[i]);

      }

      if (stack.isEmpty() && i == chars.length-1) {
        return true;
      }
    }
    return false;
  }
}


