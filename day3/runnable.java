package day3;

public class runnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Numbers:" + i);
        }
    }

    public static void main(String[] args) {
        runnable task = new runnable();
        Thread t1 = new Thread(task);
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread:" + i);
        }
    }

}
