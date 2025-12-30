


class avr {
    public static void main (String[] args) {
        
    }
}

class AVL{
    Node root;
    
    int height(Node node){
        if(node == null)
            return 0;
        return node.height;
    }
    
    int balanceFactor(Node node){
        if(node == null)
            return 0;
        return height(node.llink) - height(node.rlink);
    }
  
    
    Node rlinkrotation(Node y){
        Node x = y.llink;
        Node t = x.rlink;
        
        x.rlink = y;
        y.llink = t;
        
        int lheightY = (y.llink != null) ? y.llink.height : 0;
        int rheightY = (y.rlink != null) ? y.rlink.height : 0;
        
        if(lheightY > rheightY){
            y.height = lheightY + 1;
        }else{
            y.height = rheightY + 1;        
        }
        int lheightX = (x.llink != null) ? x.llink.height : 0;
        int rheightX = (x.rlink != null) ? x.rlink.height : 0;
        
        if(lheightX > rheightX){
            x.height = lheightX + 1;
        }else{
            x.height = rheightX + 1;        
        }
        return x;
    }
}

class Node {
	int data;
	int height;
	Node llink;
	Node rlink;
	Node(int data) {
		this.data = data;
		this.height = 1;
		llink = null;
		rlink = null;
	}
}

