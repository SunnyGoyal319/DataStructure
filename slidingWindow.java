import java.util.*;
public class slidingWindow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Window size");
        int wSize=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("MAx of all subarrays: ");
        for(int i=0;i<size-wSize+1;i++)
        {
            int max=arr[i];
            for(int j=i;j<i+wSize;j++)
            {
                if(arr[j]>max)
                    max=arr[j];
            }
            System.out.println(max+" " );
        }
    }
}