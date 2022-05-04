import java.util.*;
class lineardelete
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be delete in array");
        int t=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==t)
            {
			a[i]=a[i+1];
			
            }
        }
		 for(int i=0;i<n-1;i++)
        {
           System.out.println(a[i]);
        }
    }
}