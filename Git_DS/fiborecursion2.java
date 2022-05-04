import java.util.*;
class fiborecursion2
{
static int n1=0,n2=1,n3;
static int fibo(int n)
{
if(n==0)
return 0;
if(n==1||n==2)
return 1;

return fibo(n-1)+fibo(n-2);
}


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of term u want  to prn t");
int n=sc.nextInt();

for(int i=0;i<n;i++)
System.out.println(fibo(i) + " ");
}
}