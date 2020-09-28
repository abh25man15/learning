package learningjva;

public class TransposeMatrix {

	public static void main(String[] args) {
		int arr[][]= new int [4][4];
		int k=0;
		// Enter value in matrix
		for (int i = 0; i < 4; i++) {
			k++;
			for (int j = 0; j < 4; j++) {
				arr[i][j]= k;
			}
		}
		// Print Before matrix 
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
        System.out.println("");
        //swap matrix values
        for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++) {
				int temp= arr[j][i];
				arr[j][i]= arr[i][j];
				arr[i][j]= temp;
			}
		}
        // Print after matrix
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println("");
		}
	}

}
