class bst {
	public static void main (String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 12);
		bst.root = bst.insert(bst.root, 5);
		bst.root = bst.insert(bst.root, 4);
		bst.root = bst.insert(bst.root , 6);
		bst.root = bst.insert(bst.root, 9);
		bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root , 11);
        bst.root = bst.insert(bst.root , 13);
        bst.root = bst.insert(bst.root , 7);
 
        bst.display(bst.root);
        
		// Node root;
		// Node n1 = new Node(10);
		// Node n2 = new Node(20);
		// Node n3 = new Node(30);
		// Node n4 = new Node(40);
		// Node n5 = new Node(60);
		// Node n6 = new Node(50);

		// root = n1;
		// n1.rlink = n2;
		// n1.rlink.llink = n3;
		// n1.llink = n4;
		// n1.llink.rlink = n5;
		// n1.llink.rlink.llink = n6;


		// System.out.println(root.data);
		// System.out.println(n2.llink.data);


	}
}
class BinarySearchTree {
	Node root;
	BinarySearchTree() {
		root = null;
	}
	Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		if(data < root.data) {
			root.llink = insert(root.llink, data);
		} else {
			root.rlink = insert(root.rlink, data);
		}
		return root;
	}
	void display(Node root){
	    if(root != null){
	        display(root.llink);
	        System.out.println(root.data);
	        display(root.rlink);
	    }
	}
	
}
class Node {
	int data;
	Node llink;
	Node rlink;
	Node(int data) {
		this.data = data;
		llink = null;
		rlink = null;
	}
}
