package learningjva;

public class FindmiddlenodeLinkedlist {
	int getMiddle(Node head)
    {
         Node temp1=head;
         Node temp2=head;
         while(temp2!=null && temp2.next!=null)
         {
             temp1=temp1.next;
             temp2=temp2.next;
             if(temp2!=null)
                temp2=temp2.next;    
         }
         return temp1.data;
    }
}
