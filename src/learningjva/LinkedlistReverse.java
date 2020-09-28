package learningjva;

public class LinkedlistReverse {
	Node reverseList(Node head)
    {
       Node previous=null;
       Node current=head;
       Node next=null;
       
       while(current!=null)
       {
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
       }
       return previous;
    }
}
