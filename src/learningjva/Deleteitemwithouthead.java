package learningjva;

public class Deleteitemwithouthead {

	public static void main(String[] args) {
		Linklistexample list=new Linklistexample();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        deleteNode(list.get());
        

	}
	static void deleteNode(Node node)
    {
         node.data=node.next.data;
         node.next=node.next.next;
    }

}
