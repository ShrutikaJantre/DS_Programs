

class BalanceParenthesis
{
	static void balance(String str)
	{
		int n = str.length();
		char stk[] = new char[50];
		int count=0; char ch; int j=0; char c;
		for(int i = 0; i<n; i++)
		{
			ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{')
				{
					stk[j]=ch;
					j++;
					count=1;
				}
				else if(ch==')')
				{
					if(count==1)
						j--;
					c=stk[j];
					if(n==0 || c != '(')
					{
						System.out.println("Unbalanced Parentheses");
						return;
					}
				}
				else if(ch=='}')
				{
					if(count==1)
						j--;
					c=stk[j];
					if(n==0 || c != '{')
					{
						System.out.println("Unbalanced Parentheses");
						return;
					}
				}
				else if(ch==']')
				{
					if(count==1)
						j--;
					c=stk[j];
					if(n==0 || c != '[')
					{
						System.out.println("Unbalanced Parentheses");
						return;
					}
				}
			
		}
		System.out.println("Balanced Parentheses");
	}
	
	public static void main(String args[])
	{
		String shiv = "";
		balance(shiv);
		
	}
}