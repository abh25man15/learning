package learningjva;

public class Permutationexample {

	public static void main(String[] args) {
	       String str="abcd";
	       boolean check[]=new boolean[str.length()];
	       char output[]=new char[str.length()];
	       permutation(str.toCharArray(),output,check,0);
		}

		private static void permutation(char[] charArray,char[] output, boolean[] check,int index) {
			
			if(index == charArray.length)
			{
				for(int i=0;i<output.length;i++)
					System.out.print(output[i]);
				System.out.println("");
				return;
			}
		
			for(int i=0;i<charArray.length;i++)
			{
				if(check[i]==false)
				{
					output[index]=charArray[i];
					check[i]=true;
					permutation(charArray,output,check,index+1);
					check[i]=false;
				}
			}
			return;
		}
}