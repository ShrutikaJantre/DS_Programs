import java.util.*;
class BalanceSymbol
{
	int size;
	static int top;
	static	char a[];
	BalanceSymbol(int size)
	{
	this.size=size;
	a=new char[size];
	top=-1;
	}

	void push(char ch)
	{
	if(top >=size-1)
	{
	System.out.println("not space overfloww");
	return ;
	}
	else
	a[++top]=ch;
	}
	
	char pop()
	{
		if(top<0)
		{
			System.out.println("underflow");
			return 0;
		}
		else
			return a[top--];
	}


	public static void main(String args[])
	{
		int c=0,p=0,c1=0,p1=0,p2=0,c2=0;
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	BalanceSymbol obj=new BalanceSymbol(2000);
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='{')
		{
			c++;
	       obj.push(ch);
		   
	       continue;
	    }
		else if(ch=='}')
		{
				p++;
				obj.pop();
			}
		else if(ch=='(')
		{
			c1++;
	       obj.push(ch);
	       continue;
	    }
		else if(ch==')')
		{
				p1++;
				obj.pop();
			}
		else if(ch=='[')
		{
			c2++;
	       obj.push(ch);
	       continue;0
	    }
		else if(ch==']')
		{
				p2++;
				obj.pop();
			}
	}
	if(c==p && c1==p1 && c2==p2)
		System.out.println("balanced hai sb thk hai");
	else
		System.out.println("not balance");
	}
}
				
	
	