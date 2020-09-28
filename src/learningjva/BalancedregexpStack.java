package learningjva;

public class BalancedregexpStack {

	public static void main(String[] args) {
		   {        // Scanner sc=new Scanner(System.in);
	            Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
	         int tc=sc.nextInt();
	        while(tc>0)
	        {
	            String str=sc.next();
	            Stack<Character> stack= new Stack<Character>();
	            HashMap<Character,Character> map = new HashMap<Character,Character>();
	            map.put('(', ')');
	            map.put('[', ']');
	            map.put('{', '}');
	            for(int i=0;i<str.length();i++)//    [()]
	            {
	                if(stack.isEmpty())
	                    stack.add(str.charAt(i));
	                else if(map.get(stack.peek())==str.charAt(i))
	                {
	                    stack.pop();
	                }
	                else
	                    stack.add(str.charAt(i));
	            }
	            if(!stack.isEmpty())
	                System.out.println("not balanced");
	            else
	                System.out.println("balanced");
	        tc--;
	        }
	    }
	}

	}

}
