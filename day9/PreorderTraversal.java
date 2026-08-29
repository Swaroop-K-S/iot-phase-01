package day9;

public class PreorderTraversal {
     static class Node{
    	 int data;
    	 Node left;
    	 Node right;
    	 Node(int data){
    		 this.data=data;
    	 }
         // Added 'static' so it can be called from main without creating an instance
    	 static void preorder(Node root) {
    		 if(root==null) {
    			 return;
    		 }
    		 System.out.println(root.data+"");
             preorder(root.left);
             preorder(root.right);
    	 }
     }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);  
        // Called using the class name Node since it's a static method now
        Node.preorder(root);
	}
}
