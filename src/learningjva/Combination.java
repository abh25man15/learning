package learningjva;

public class Combination {

	public static void main(String[]args) {
	     int count=0;
		 int coins[]= {10,20,50,100};
	     int quantity[]= {4,4,2,2};
	     int output[]=new int[200];
	     int sum=100;
	     combination(coins,0,sum,0,output,0,quantity);  
}

		private static void combination(int[] coins, int coinindex, int sum, int current,int []output,int outputindex,int[] quantity) {
			
			if(coinindex>=coins.length)
				return;
			if(current>sum)
				return;
			if(current==sum)
			{
				int count = 0;
				count++;
				
	            for(int i=0;i<outputindex;i++) 
	        	
	            System.out.print(output[i]+" , ");
				System.out.println("");
				return;
			}
			if(quantity[coinindex]>0)
			{
			output[outputindex]=coins[coinindex];
			quantity[coinindex]--;
			combination(coins,coinindex,sum,current+coins[coinindex],output,outputindex+1,quantity);
			quantity[coinindex]++;
			}
			combination(coins,coinindex+1,sum,current,output,outputindex,quantity);

		}
	
}


