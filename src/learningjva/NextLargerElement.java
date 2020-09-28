package learningjva;

public class NextLargerElement {

	public static void main(String[] args) {
		 {        // Scanner sc=new Scanner(System.in);
	            Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
	         int tc=sc.nextInt();
	        while(tc>0)
	        {
	            int size=sc.nextInt();
	            Stack<Integer> stack1= new Stack<Integer>();
	            Stack<Integer> stack2= new Stack<Integer>();
	            for(int i=0;i<size;i++)
	            {
	                stack1.add(sc.nextInt());
	                System.out.print(stack1.peek()+" ");
	            }
	            for(int i=0;i<size;i++)
	                stack2.add(stack1.pop());
	            System.out.println(" ");
	            stack1.clear();
	            while(!stack2.isEmpty())
	            {
	                int current=stack2.pop();
	                while(!stack2.isEmpty())
	                {
	                    int next=stack2.peek();
	                    if(next>current)
	                    {
	                        System.out.print(next +" ");
	                        break;
	                    }
	                    else
	                    {
	                        stack2.pop();
	                        stack1.add(next);
	                    }
	                }
	                if(stack2.isEmpty())
	                    System.out.print("-1"+" ");

	                while(!stack1.isEmpty())
	                {
	                    stack2.add(stack1.pop());
	                }
	            }
	            System.out.println("");
	        tc--;
	        }
	    }
	}
	}

}
