import java.util.*;
class subArrays
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int key=obj.nextInt();
        int sum=arr[0];
        int start=0;
        int end=0;
        while(end<arr.length)
        {
            if(sum==key)
            {
                System.out.println("starting index : "+start+", Ending index : "+end);
            }
            if(sum<=key)
            {
                end++;
                if(end<arr.length)
                {
                    sum=sum+arr[end];
                }
            }
            else
            {
                sum=sum-arr[start];
                start++;
            }
        }
    }
}