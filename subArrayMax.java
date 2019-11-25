import java.util.Scanner;

public class subArrayMax {

    static int findMax(int arr[],int start,int end)
    {
        int max  = Integer.MIN_VALUE;
        for(int i = start;i<=end;i++)
        {
            if(max <  arr[i])
            {
                max = arr[i];
            }
        }
        return  max;
    }

    static int subArray(int arr[], int n ,int k) 
    { 
        int count=0;
        for(int i=0; i <n; i++) 
        { 
            for (int j=i; j<n; j++) 
            {
                int max = findMax(arr, i,j);
                if(max > k)
                    count++; 
            } 
        } 
        return count;
    } 
    public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();

        int arr[] =  new int [n];


        for(int i = 0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        System.out.println(subArray(arr, n,k));

        in.close();
    }
}