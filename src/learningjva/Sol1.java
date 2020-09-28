package learningjva;

public class Sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,5,5,6,6,6,7,5,5,5,5,5,5,5};
		int sum= 11;
		int actualsum=0;
		int k=0;
		
		for (int i=0;i<arr.length;i++)
		{
			
			actualsum=arr[i]+actualsum;
			//System.out.println(actualsum);
			
			 if (actualsum>sum)
			{
				while (actualsum>sum)
				{
					actualsum=actualsum-arr[k];
					k++;
				}
				
			}
			if (actualsum==sum)
			{
				for (int j=k;j<=i;j++)
				{
				System.out.println(arr[j]);
				}
				break;
			}
			
				
		}
		
	}

}
