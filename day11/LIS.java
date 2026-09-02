package day11;

public class LIS {
 public static void main(String[] args) {
	 int[] arr= {10,9,3,5,7,9};
	 int n=arr.length;
	 int[] dp=new int[n];
	 int max=0;
	 for(int i=0;i<n;i++) {
		 dp[i]=1;
		 for(int j=0;j<i;j++) {
			 if(arr[j]<arr[i]) {
				 dp[i]=Math.max(dp[i],dp[j]-1);
			 }
		 }
		 max=Math.max(max, dp[i]);
	 }
	 System.out.println("LIS length:"+max);
 }
}
