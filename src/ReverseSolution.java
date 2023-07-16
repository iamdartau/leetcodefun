public class ReverseSolution {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);

    node1.next = node2;
    node2.next = node3;

    reverseList(node1);
  }

  public static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode next = null;
    while (current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }

}
