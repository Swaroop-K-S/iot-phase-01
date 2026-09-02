package day9;

public class LCA_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findLCA(Node root, int n1, int n2) {
    	if (root == null) {
            return null;
        }
        if (n1 < root.data && n2 < root.data) {
            return findLCA(root.left, n1, n2);
        }
        if (n1 > root.data && n2 > root.data) {
            return findLCA(root.right, n1, n2);
        }
        return root;
    }
    public static void main(String[] args) {
    	Node root = new Node(10);
    	root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(17);
        int n1 = 2;
        int n2 = 7;
        Node LCA = findLCA(root, n1, n2);
        if (LCA != null) {
            System.out.println("LCA of " + n1 + " and " + n2
                    + " is: " + LCA.data);
        } else {
            System.out.println("LCA does not exist");
        }
    }
}