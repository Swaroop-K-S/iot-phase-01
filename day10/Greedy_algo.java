package day10;

public class Greedy_algo {
    public static void main(String[] args) {
        int  [] a= {1,2,3,5,6};
        int [] b= {3,4,5,7,8};
        int Lastend = b[0];
        System.out.println("Selected Activity : A");
        for(int i =1;i<a.length;i++){
            if(a[i]>=Lastend){
                System.out.println("Selected Activity : "+(char)('A' + i));
                Lastend=b[i];
            }
        }
    }
}