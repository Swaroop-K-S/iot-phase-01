package day9;
import java.util.*;
public class Diameterof_binarytree{
	static class Node {
		int data;
		Node left,right;
		Node(int data){
			this.data =data;
			}
	}
		static int diameter=0;
		static int height(Node root) {
			if(root==null) 
				return 0;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			diameter = Math.max(diameter,leftHeight+ rightHeight);
			return 1 + Math.max(leftHeight, rightHeight);
			}
			public static void main(String[]args) {
				Node root = new Node(1);
				root.left = new Node(2);
				root.right = new Node(3);
				root.left.left = new Node(4);
				root.right.right= new Node(5);
				height(root);
				System.out.println("Diametr = "+ diameter);
				
			}
		}


