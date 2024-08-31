/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode rt = new ListNode();
        ListNode rtH = rt;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        while (list1 != null || list2 != null) {
            if (list1.val == list2.val) {
                ListNode n1 = new ListNode(list1.val, null);
                ListNode n2 = new ListNode(list2.val, null);
                ListNode smol = n1.val >= n2.val ? n2 : n1;
                ListNode large = n1.val < n2.val ? n2 : n1;
                rt.next = smol;
                rt = rt.next;
                rt.next = large;
                list2 = list2.next;
                list1 = list1.next;
            } else if (list2.val > list1.val) {
                ListNode n1 = new ListNode(list1.val, null);
                rt.next = n1;
                list1 = list1.next;
            } else {
                ListNode n2 = new ListNode(list2.val, null);
                rt.next = n2;
                list2 = list2.next;
            }
            if (list2 == null && list1 != null) {
                rt=rt.next;
                rt.next=list1;
                break;
            }
            if (list2 != null && list1 == null) {
                rt=rt.next;
                rt.next=list2;
                break;
            }
            if (list2 == null && list1 == null) {
                break;
            }
            rt = rt.next;
        }

        return rtH.next;
    }
}