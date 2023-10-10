package codingtest.leetcode;



public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next = new ListNode();
        listNode.next.val = 1;
        listNode.next.next = new ListNode();
        listNode.next.next.val = 2;

        new RemoveDuplicatesFromSortedList().deleteDuplicates(listNode);
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val){
            return head.next;
        }else{
            return head;
        }
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
}
