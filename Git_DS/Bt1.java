class Bt1
{
node root;
	 static class node
	{
     int data;
     node right;
	 node left;
      node(int n)
      {
	   data=n;
	   right=null;
	   left=null;
      }
	}
	Bt1(int n)
	{
	root=new node(n);
	}
	
	void printInorder(node n)
	{
	if(n==null)
	{
	return;
	}
	printInorder(n.left);
	System.out.print(n.data+ " ");
	printInorder(n.right);
	}
	void inorder()
	{
		printInorder(root);
	}
	
	node insert(node n,int key)
	{
		if(n==null)
		{
			n=new node(key);
			return n;
		}
		if(key <=  n.data)
			n.left=insert(n.left,key);
		else
			n.right=insert(n.right,key);
		return n;
	}
	 void insert1(int n)
	{
		root=insert(root,n);
	} 
			
	public static void main(String args[])
	{
	Bt1 b=new Bt1(11);
	b.insert1(22);
	b.insert1(20);
	b.insert1(30);
	b.insert1(23);
	b.insert1(13);
	b.insert1(73);
	b.insert1(28);
	b.inorder();
	
	
	}
}

	
	