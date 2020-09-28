package learningjva;

import com.sun.source.tree.WhileLoopTree;

public class MatrixExamples {

	public static void main(String[] args) {
	  	int arr[][]= new int[4][4];
	  	int k=1;
	  	for (int i = 0; i <4; i++) {
			for (int j = 0; j < 4; j++) {
				 arr[i][j]=k++;
			}
		}
	  	
	  	for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println("");
		}
	  	int j=0;
	  	int i=0;
		int right= arr[j].length;
		int left=0;
		int down= arr[i].length;
		int up=0;
		boolean flag=true;
		while(flag)
		{
			flag=false;
		while(j<right)
		{
			System.out.print(arr[i][j]+ " ");
			j++;
			flag=true;
		}
		j--;
		i++;
		right--;
		while (i<down) 
		{
			System.out.println(arr[i][j]+ " ");
			i++;
			flag=true;
		}
		i--;
		j--;
		down--;
	    while(j>=left)
	    {
	    	System.out.println(arr[i][j]+ " ");
	    	j--;
	    	flag=true;
	    }
	    i--;
	    j++;
	    left++;
	    while(i>=up)
	    {
	    	System.out.println(arr[i][j]+ " ");
	    	i--;
	    	flag=true;
	    }
	    i++;
	    j++;
	    up++;
	}
	}
}
