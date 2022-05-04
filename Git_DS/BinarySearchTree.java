class BinarySearchTree{

	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	
	void printPreorder(Node n){
		if(n==null){
			return;
		}
		System.out.print(n.data+" ");
		printPreorder(n.left);
		printPreorder(n.right);
	}

	Node insertdata(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key <= root.data){
			root.left = insertdata(root.left,key);
		}
		else
			root.right = insertdata(root.right,key);
		
		return root;		
	}
	
	Node deletedata(Node root, int key){
		if(root == null){
			return root;
		}
		if(key < root.data){
			root.left = deletedata(root.left, key);
		}
		else if(key > root.data)
			root.right = deletedata(root.right, key);
		else{
		//case 1,2
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
		//case 3
		root.data = minvalue(root.right);
		//call inorder method and replace with successor node
		root.right = deletedata(root.right,root.data);
		}
		return root;
	}
	
	int minvalue(Node root){
		int x = root.data;
		while(root.left != null){
			x = root.left.data;
			root=root.left;
		}
		return x;
	}
	
	void insert(int key){
		root = insertdata(root, key);
		
	}
	
	void preorder(){
		printPreorder(root);
	}
	
	public static void main(String[] args){
		BinarySearchTree b1 = new BinarySearchTree();
		b1.insert(3);
		b1.insert(13);
		b1.insert(23);
		b1.insert(43);
		b1.insert(52);
		b1.insert(15);
		b1.insert(5);
		
		b1.preorder();
		System.out.println(" ");
		b1.deletedata(b1.root,43);
		b1.preorder();
		
			
		
	}
}