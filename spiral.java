import java.util.*;
class spiral
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int r=obj.nextInt();
		int c=obj.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=obj.nextInt();
			}		
		}
		int rowno=0;
		int columnno=0;
		while(rowno<r && columnno<c)
		{
			for(int i=columnno;i<c;i++)
			{
				System.out.print(arr[rowno][i]+" ");
			}
			rowno++;
			for(int i=rowno;i<r;i++)	
			{
				System.out.print(arr[i][c-1]+" ");
			}
			c--;
			if(rowno<r)
			{
				for(int i=c-1;i>=columnno;i--)
				{
					System.out.print(arr[r-1][i]+" ");
				}
				r--;
			}	
			if(columnno<c)
			{
				for(int i=r-1;i>=rowno;i--)
				{
					System.out.print(arr[i][columnno]+" ");
				}
				columnno++;
			}
		}	
	}	
	
}