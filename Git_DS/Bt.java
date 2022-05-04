class Bt
{
node root;
	 static class node
	{
     int data;
     node right;
	 node left;
      node(int n) //node class ka constructor
      {
	   data=n;
	   right=null;
	   left=null;
      }
	}
	Bt(int n)
	{
	root=new node(n);
	}
	
	void printInorder(node n)
	{
	if(n==null)
	{
	//System.out.println("empty tree");
	return;
	}
	printInorder(n.left);
	System.out.print(n.data+ " ");
	printInorder(n.right);
	}
	void printPreorder(node n)
    {
        if (n == null)
            return;
         System.out.print(n.data + " ");
       printPreorder(n.left);
      printPreorder(n.right);
    }
	void printPostorder(node n)
    {
        if (n == null)
            return;
 
        printPostorder(n.left);
 
       
        printPostorder(n.right);
 
       
        System.out.print(n.data + " ");
    }
	/* void inorder()
	{
		printInorder(root);
	} */
	public static void main(String args[])
	{
	Bt b=new Bt(11);
	b.root=new node(11);
	b.root.left=new node(22);
	b.root.right=new node(33);
	b.root.left.left=new node(44);
	b.root.left.right=new node(55);
	b.root.right.right=new node(66);
	System.out.println("inorder");
	//b.inorder();
	b.printInorder(b.root);
	System.out.println();
	System.out.println("preorder");
	b.printPreorder(b.root);
	System.out.println();
	System.out.println("postorder");
	b.printPostorder(b.root);
	}
}

	
	