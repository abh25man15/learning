package learningjva;

public class RecursionDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int row=0;
		static int col=0;
		public static void main(String args[]) throws FileNotFoundException
		{
		Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
		//Scanner sc=new Scanner(System.in);
		int tcs = sc.nextInt();
		while(tcs>0)
		{
		row = sc.nextInt();
		col = sc.nextInt();
		int matrix[][] = new int [row][col];
		int output[][] = new int [row][col];
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
		matrix[i][j] = sc.nextInt();
		output[i][j] = matrix[i][j];
		}
		}
		print(matrix);
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		boolean check[][] = new boolean [row][col];
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z= sc.nextInt();
		print( dfs(matrix,x,y,z,check,output));
		System.out.println();
		tcs--;
		}
		}

		private static void print(int[][] matrix) {
		for(int i=0;i<row;i++)
		{
		for(int j=0;j<col;j++)
		{
		System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
		}

		}

		private static int[][] dfs(int[][] matrix, int x, int y, int z, boolean[][] check,int[][] output) {

		if(check[x][y])
		{
		return output;
		}
		output[x][y]=z;
		check[x][y]=true;
		if(x+1<row && check[x+1][y]!=true && matrix[x+1][y]==matrix[x][y])
		{
		dfs(matrix,x+1,y,z,check,output);
		}
		if(x-1>=0 && check[x-1][y]!=true && matrix[x-1][y]==matrix[x][y])
		{
		dfs(matrix,x-1,y,z,check,output);
		}
		if(y+1<col && check[x][y+1]!=true && matrix[x][y+1]==matrix[x][y])
		{
		dfs(matrix,x,y+1,z,check,output);
		}
		if(y-1>=0 && check[x][y-1]!=true && matrix[x][y-1]==matrix[x][y])
		{
		dfs(matrix,x,y-1,z,check,output);
		}
		return output;
		}

		}
	}

}
