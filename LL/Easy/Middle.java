package LL.Easy;

public class Middle {
    public int size(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }

    public ListNode middleNode(ListNode head) {
        ListNode hare=head,turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        int size=size(head);
        if(size%2==0) 
            return turtle.next;
        return turtle;
    }
    
}
