import java.util.*;
class findPairs
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,m;
        System.out.println("Enter size of first array");
        n=obj.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter size of second array");
        m=obj.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter sum");
        int k=obj.nextInt();
        System.out.println("Enter values of first array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=obj.nextInt();
        }
        System.out.println("Enter values of second array");
        for(int i=0;i<m;i++)
        {
            arr2[i]=obj.nextInt();
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(arr1[i]);
        }
        for(int j=0;j<m;j++)
        {
            if(li.contains(k-arr2[j]))
            {
                System.out.println(k-arr2[j]+" "+arr2[j]);
            }
        }
    }
}