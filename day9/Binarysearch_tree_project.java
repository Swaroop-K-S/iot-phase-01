package DAY9;

public class Binarysearch_tree_project {
	static class Node {
	        int data;
	        Node left, right;

	        Node(int data) {
	            this.data = data;
	        }
	    }
	static Node insert(Node root, int data) {
	    	if (root == null)
	            return new Node(data);
	    	if (data < root.data)
	            root.left = insert(root.left, data);
	        else
	            root.right = insert(root.right, data);
	    	return root;
	    }
	static void preorder(Node root) {
	    	if (root == null)
	            return;
	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }
	    public static void main(String[] args) {
	    	Node root = null;
	    	root = insert(root, 50);
	        insert(root, 30);
	        insert(root, 70);
	        insert(root, 20);
	        insert(root, 40);
	        insert(root, 60);
	        insert(root, 80);
	        System.out.print("Preorder: ");
	        preorder(root);
	    }
	}


