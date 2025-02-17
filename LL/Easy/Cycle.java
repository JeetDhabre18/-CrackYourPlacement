package LL.Easy;

public class Cycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode hare=head;
        ListNode turtle=head;

        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle)
               return true;
        }
        
        
        return false;
    }

    
}
