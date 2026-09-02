package day11;

public class Grid {
 public static void main(String[] arsg) {
	 int rows=3;
	 int cols=3;
	 int[][] dp=new int[rows][cols];
	 for(int j=0;j<cols;j++) {
		 dp[0][j]=1;
	 }
	 for(int i=0;i<rows;i++) {
		 dp[i][0]=1;
	 }
	 for(int i=1;i<rows;i++) {
		 for(int j=1;j<cols;j++) {
			 dp[i][j]=dp[i-1][j] +dp[i][j-1];
		 }
		 System.out.println("Number of paths="+dp[rows-1][cols-1]);	
		 }
 }
}
