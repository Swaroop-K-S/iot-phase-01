package day10;

public class Jump_Game {

    public static void main(String[] args) {

        int[] a = {2,1, 1, 0, 4};
        int maxreach=0;
        for(int i =0;i<a.length;i++){
            if (i>maxreach) {
                break;
            }
            maxreach=Math.max(maxreach, i+a[i]);
        }
        if (maxreach>=a.length-1) {
            System.out.println("Can reach the last Position !");
        }else{
            System.out.println("Cannot reach the last Position !");
        }

    }
}