package DAY9;

import DAY9.Tree_postorder.Node;

public class Tree_Inorder {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			}
	}
static void inorder(Node root) {
	if(root == null) {
		return;
	}
	
	inorder(root.left);
	System.out.println(root.data+" ");
	inorder(root.right);
	}
public static void main(String[]args) {
	Node root = new Node(1);
	root.right = new Node(2);
	root.left = new Node(3);
	root.left.right = new Node(4);
	root.left.left = new Node(5);
	inorder(root);
}
}




	


