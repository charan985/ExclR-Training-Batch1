 public class Ltc004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead; 
        int carry = 0; 
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; 
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; 
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; 
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next; 
        }

        return dummyHead.next; 
    }

    public static ListNode createList(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ltc004 solution = new Ltc004();

        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        ListNode result = solution.addTwoNumbers(l1, l2);

        
        printList(result); 
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}