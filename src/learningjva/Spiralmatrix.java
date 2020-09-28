package learningjva;

public class Spiralmatrix {

	public static void main(String[] args) {
		int arr[][]=new int[4][4];
        //int output[][]=new int[4][4];
        int k=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=k++;
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        int i=0;
        int j=0;
        int right=arr[j].length;
        int left=0;
        int down=arr[i].length;
        int up=0;
        boolean flag=true;
        while(flag)
        {
            flag=false;
            while(j<right)
            {
                System.out.print(arr[i][j] +" ");
                j++;
                flag=true;
            }
            j--;
            i++;
            right--;
            while(i<down)
            {
                System.out.print(arr[i][j] +" ");
                i++;
                flag=true;
            }
            i--;
            j--;
            down--;
            while(j>=left)
            {
                System.out.print(arr[i][j] +" ");
                j--;
                flag=true;
            }
            j++;
            i--;
            left++;
            while(i>up)
            {
                System.out.print(arr[i][j] +" ");
                i--;
                flag=true;
            }
            i++;
            j++;
            up++;
        }

	}

}
