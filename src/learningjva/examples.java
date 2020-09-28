package learningjva;

public class examples {

	public static void main(String[] args) {
		int arr1[] =  {1,3,5,7};//i
		int arr2[]= {2,4,6,8};//k
		int arr3[]= new int[8];//j
		int i=0,k=0;
		for (int j=0;j<arr3.length;j++) {
			if(i==arr1.length)
			{
				arr3[j]=arr2[k];
				k++;
				
			}
			else if (k==arr2.length)
			{
				arr3[j]=arr1[i];
				i++;
			}
			
			else if (arr1[i]>arr2[k])
			{
				arr3[j]=arr2[k];
				k++;
			}
			else
				{arr3[j]=arr1[i];
			    i++;
			    }
		}
		int count=arr3.length/2;
		int sum= arr3[count]+arr3[count-1];
		System.out.println(sum);
		
	}
	   
}
