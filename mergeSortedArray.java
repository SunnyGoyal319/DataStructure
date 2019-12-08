import java.util.*;
class mergeSortedArray
{
    public static void mergeSorted(int a1[],int a2[],int n,int m)
    {
        int a3[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(a1[i]<a2[j])
            {
                a3[k]=a1[i];
                i++;
            }
            else
            {
                a3[k]=a2[j];
                j++;
            }
            k++;
        }
        if(i>=n)
        {
            while(j<m)
            {
                a3[k]=a2[j];
                j++;
                k++;
            }
        }
        if(j>=m)
        {
            while(i<n)
            {
                a3[k]=a2[i];
                i++;
                k++;
            }
        }
        for(int l=0;l<n+m;l++)
        {
            System.out.print(a3[l]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of first array");
        int n=obj.nextInt();
        System.out.println("Enter elementf of first array");
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
            a1[i]=obj.nextInt();
        System.out.println("Enter size of second array");
        int m=obj.nextInt();
        int a2[]=new int[m];
        System.out.println("Enter elements of second array");
        for(int i=0;i<m;i++)
            a2[i]=obj.nextInt();

        System.out.println("Sorted Merged Array:-");
        mergeSorted(a1,a2,n,m);
        
    }
}