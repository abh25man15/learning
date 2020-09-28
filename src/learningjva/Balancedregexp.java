package learningjva;

public class Balancedregexp {

	public static void main(String[] args) {
		{        // Scanner sc=new Scanner(System.in);
            Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
         int tc=sc.nextInt();
        while(tc>0)
        {
            String str=sc.next();
            int current=str.length();
            int previous=Integer.MAX_VALUE;
            while(str.length()>0 && current<previous)
            {
                previous=str.length();
                str=str.replace("()", "");
                str=str.replace("[]", "");
                str=str.replace("{}", "");
                current=str.length();
            }
            if(str.length()>0)
                System.out.println("not balanced");
            else
                System.out.println("balanced");
        tc--;
        }
    }
}

	}

}
