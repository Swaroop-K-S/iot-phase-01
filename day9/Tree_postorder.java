package DAY9;

public class Tree_postorder {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			}
	}
static void postorder(Node root) {
	if(root == null) {
		return;
	}
	
	postorder(root.left);
	postorder(root.right);
	System.out.println(root.data+" ");
	
}
public static void main(String[]args) {
	Node root = new Node(1);
	root.right = new Node(2);
	root.left = new Node(3);
	root.left.right = new Node(4);
	root.left.left = new Node(5);
	postorder(root);
}
}



