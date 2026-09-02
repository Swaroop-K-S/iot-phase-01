package day11;

public class MatrixTranspose {
   public static void main(String[] args) {
	   int[][] matrix= {
			   {1,2,3},
			   {4,5,6}
	          };
	   System.out.println("Transpose:");
	   for(int j=0;j<3;j++) {
		   for(int i=0;i<2;i++)
		   {  
			   System.out.print(matrix[i][j]+" ");
			   }
		   System.out.println();
		   }
	   }
}
