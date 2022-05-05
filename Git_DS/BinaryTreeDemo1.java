class Node{
	int key;
	Node left;
	Node right;
	public Node(int item){
		key = item;
		left=null;
		right=null;
	}
}

class BinaryTreeDemo1{
	Node root;
	
	BinaryTreeDemo1(){
		root = null;
	}
	
	void preorder(Node node){
		if(node==null)
		return;
		System.out.print(node.key+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	void inorder(Node node){
		if(node==null)
		return;
		inorder(node.left);
		System.out.print(node.key+" ");
		inorder(node.right);
		
	}
	
	void postorder(Node node){
		if(node==null)
		return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.key+" ");
	}
	
	void preorder(){preorder(root);}
	void inorder(){inorder(root);}
	void postorder(){postorder(root);}
	
	public static void main(String[] args){
		BinaryTreeDemo1 tree = new BinaryTreeDemo1();
		
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
		
		System.out.println("");
		tree.preorder();
		System.out.println("");
		tree.inorder();
		System.out.println("");
		tree.postorder();
	}
}