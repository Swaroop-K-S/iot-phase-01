package Day9;



public class PostOrder {
	static class Node{
   	 int data;
   	 Node left;
   	 Node right;
   	 Node(int data){
   		 this.data=data;
   	 }
   	 void postorder(Node root) {
   		 if(root == null) {
   	        return;
   	    }

   	    postorder(root.left);
   	    postorder(root.right);
   	    System.out.println(root.data);
   	}
   	 }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.postorder(root);

	}

}
