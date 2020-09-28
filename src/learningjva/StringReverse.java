package learningjva;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "i.like.this.program.very.much";
 char arr[]= s.toCharArray();
 int i=0;
 int k=0;
 int j= s.length()-1;
 while ( i<j)
 {
	 char temp=arr[j];
	 arr[j]=arr[i];
	 arr[i]=temp;
	 i++;
	 j--;
 }
 for (int l=0;l<s.length();l++)
 {
	 if (arr[l]=='.')
	 {
		 j=l-1;
		 while (k<j)
		 {
			 char temp=arr[j];
			 arr[j]=arr[k];
			 arr[k]=temp;
			 k++;
			 j--;
		 }
		 k=l+1;
	 }
 }
 for (int l=0;l<s.length();l++) {
	 System.out.print(arr[l]);
 }
 
	}

}
