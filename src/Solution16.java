import java.util.HashMap;

public class Solution16 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer>map=new HashMap<>();
       while(head!=null){
            map.put(head,head.val);
             if (map.containsKey(head.next))return true;
           head=head.next;
       }
       return false;
    }
}
