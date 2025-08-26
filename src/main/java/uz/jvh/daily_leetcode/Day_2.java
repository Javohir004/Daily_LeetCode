package uz.jvh.daily_leetcode;

public class Day_2 {

    /** Name: Linked list
     *  type: medium
     *  num:  19. Remove Nth Node From End of List
     */
    public static void day_2(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;


        ListNode listNode = new ListNode(0);
        listNode.next = head;

        ListNode first = listNode;
        ListNode second = listNode;

        for(int i = 1; i <= n; i++){
            first = first.next;
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        ListNode.printList(listNode.next);
    }
}
