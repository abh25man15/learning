package learningjva;

class Position implements Comparable
{
    int x;
    int y;
    int distance;
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
}

public class BFSExample {
    
    
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
        //Scanner sc=new Scanner(System.in);// when just 
        int tcs = sc.nextInt();
        while(tcs>0)
        {
            
            Queue<Position> pq = new PriorityQueue<Position>();
            int minimum=Integer.MAX_VALUE;
            int row = sc.nextInt();
            int column = sc.nextInt();
            boolean check[][]=new boolean[row][column];
            int arr[][]=new int[row][column];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    if(arr[i][j]==2)
                    {
                        Position p=new Position();
                        p.x=i;
                        p.y=j;
                        p.distance=0;
                        pq.add(p);
                        break;
                    }
                }
            }
            while(!pq.isEmpty())
            {
                Position p = pq.poll();
                check[p.x][p.y]=true;
                if(arr[p.x][p.y]==3)
                {
                    if(p.distance<minimum)
                        minimum=p.distance;
                }
                if(p.x-1>=0 && check[p.x-1][p.y]==false && arr[p.x-1][p.y]!=1 )
                {
                    Position p1=new Position();
                    p1.x=p.x-1;
                    p1.y=p.y;
                    p1.distance=p.distance+1;
                    pq.add(p1);    
                }
                if(p.y-1>=0 && check[p.x][p.y-1]==false && arr[p.x][p.y-1]!=1)
                {
                    Position p1=new Position();
                    p1.x=p.x;
                    p1.y=p.y-1;
                    p1.distance=p.distance+1;
                    pq.add(p1);    
                }
                if(p.x+1<row && check[p.x+1][p.y]==false && arr[p.x+1][p.y]!=1)
                {
                    Position p1=new Position();
                    p1.x=p.x+1;
                    p1.y=p.y;
                    p1.distance=p.distance+1;
                    pq.add(p1);    
                }
                if(p.y+1<column && check[p.x][p.y+1]==false && arr[p.x][p.y+1]!=1)
                {
                    Position p1=new Position();
                    p1.x=p.x;
                    p1.y=p.y+1;
                    p1.distance=p.distance+1;
                    pq.add(p1);    
                }
            }
            System.out.println(minimum);
          tcs--;
        }
    }

}