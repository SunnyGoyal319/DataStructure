import java.util.*;
class secondLargest
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int first,second;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        first=second=-9999;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second &&arr[i]!=first)
            {
                second=arr[i];
            }
        }
        System.out.println("Largest - "+first);
        System.out.println("Second - "+second);
        obj.close();
    }
}