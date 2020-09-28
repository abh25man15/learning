// Reverse number
package learningjva;

public class Examples2 {

	public static void main(String[] args) {
		String str= "My.name.is.abhay";
        char arr[]= str.toCharArray();
        int i=0;
        int j=str.length()-1;
        
        while (i<j) {
			
			char temp= arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
			
		}
        for (int k = 0; k < arr.length; k++) {
			
        	System.out.print(arr[k]);
		}
        
        
        
         }
	}
