import java.util.*;
class pythagoreanTriplets
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
            arr[i]=arr[i]*arr[i];
        }
        int a,b,c,flag=0;
        Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            int l=size-2;
            int r=size-1;
            a=arr[i];
            while(l>i)
            {
                b=arr[l];
                c=arr[r];
                int thirdSide=c-b;
                if(thirdSide==a)
                {
                    flag=1;
                    break;
                }
                else if(thirdSide > a)
                {
                    r--;
                }
                else
                {
                    l--;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}