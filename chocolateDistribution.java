import java.util.*;
/*
 * chocolateDistribution
 */
public class chocolateDistribution {

    static int findDiff(int arr[],int n,int m)
    {
        if(m == 0 || n == 0)
            return 0;
        if(m>n)
            return -1;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<n-m+1;i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if(diff<min)
            {
                min = diff;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();

        int arr[]= new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        System.out.println("Minimum Difference is :"+findDiff(arr,n,m));

        in.close();
    }
}