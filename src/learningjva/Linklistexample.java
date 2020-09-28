package learningjva;

public class Linklistexample {
private Node head;
    
    // add node 
    public void add(int value)
    {
        Node temp=new Node(value);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node localhead=head;
            while(localhead.next!=null)
            {
                localhead=localhead.next;
            }
            localhead.next=temp;
        }
    }
//    1 --> 2 --> 3 --> null
    public void delete(int i)
    {
        int count=2;
        if(head==null)
        {
            return;
        }
        else
        {
            if(i==1)
            {
                head=head.next;
            }
            else
            {
                Node localhead=head;
                while(localhead!=null && i>count)
                {
                    localhead=localhead.next;
                    count++;
                }
                if(localhead!=null && localhead.next!=null)
                {
                    localhead.next=localhead.next.next;
                }
            }
        }
    }
	public Node get() {
		// TODO Auto-generated method stub
		return head.next.next;
	}

}
