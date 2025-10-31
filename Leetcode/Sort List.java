/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> ll=new ArrayList<>();
        while(head!=null){
            ll.add(head.val);
            head=head.next;
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<ll.size();i++){
            arr[i]=ll.get(i);
        }
        Arrays.sort(arr);
        
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int val:arr){
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return dummy.next;
    }
}
