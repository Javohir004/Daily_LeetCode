package uz.jvh.daily_leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
}   }
