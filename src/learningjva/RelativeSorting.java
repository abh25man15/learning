package learningjva;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class RelativeSorting {
    static HashMap<Integer,Integer> map;
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner sc=new Scanner(new File("/root/eclipse-workspace/test/data/bfs.txt"));
        //Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0)
        {
            map=new HashMap<Integer,Integer>();
            int s1=sc.nextInt();
            int s2=sc.nextInt();
            int arr1[]=new int[s1];
            int arr2[]=new int[s2];
            for(int i=0;i<s1;i++)
            {
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<s2;i++)
            {
                arr2[i]=sc.nextInt();
                map.put(arr2[i], i);
            }
            print(arr1);
            System.out.println("");
            System.out.println("----------------------");
            print(sort(arr1,0,s1-1));
            tc--;
        }
        
     }

    private static int[] sort(int[] arr1, int l, int r) {
        
        if(l<r)
        {
            int mid=(r-l)/2+l;
            sort(arr1,l,mid);
            sort(arr1,mid+1,r);
            mergesort(arr1,l,mid,r);
        }
        return arr1;
    }

    private static void mergesort(int[] arr1, int l, int mid, int r) {
        int k=0;
        int left[]=new int[mid-l+1];
        int right[]=new int[r-mid];
        for(int i=l;i<=mid;i++)
        {
            left[k]=arr1[i];
            k++;
        }
        k=0;
        for(int i=mid+1;i<=r;i++)
        {
            right[k]=arr1[i];
            k++;
        }
    //    System.out.println("left "+l+", "+mid);
    //    print(left);
    //    System.out.println("right "+(mid+1)+" , "+r);
    //    print(right);
        k=l;
        int i=0,j=0;
        while(i<left.length&&j<right.length)
        {
            if(map.containsKey(left[i])||map.containsKey(right[j]))
            {
                if(map.containsKey(left[i])&&map.containsKey(right[j]))
                {
                    if(map.get(left[i])<map.get(right[j]))
                    {
                        arr1[k]=left[i];
                        i++;
                        k++;
                    }
                    else
                    {
                        arr1[k]=right[j];
                        j++;
                        k++;
                    }
                }
                else
                {
                    if(map.containsKey(right[j]))
                    {
                        arr1[k]=right[j];
                        j++;
                        k++;
                    }
                    else
                    {
                        arr1[k]=left[i];
                        i++;
                        k++;
                    }
                }
            }
            else
            {
                if(left[i]<right[j])
                {
                    arr1[k]=left[i];
                    i++;
                    k++;
                }
                else
                {
                    arr1[k]=right[j];
                    j++;
                    k++;
                }
            }
        }
        while(i<left.length)
        {
            arr1[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            arr1[k]=right[j];
            j++;
            k++;
        }
    //    print(arr1);
    }

    private static void print(int[] matrix) {
        for(int j=0;j<matrix.length;j++)
            {
                 System.out.print(matrix[j]+" ");
            }
        System.out.println(" ");
    }
    
}
