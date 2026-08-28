import java.util.Indicator

public class Demo1 extends Threads {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method" + i);
        }
    }

    public static void main(String[] args) {
        Demo1 bb = new Demo1();
        bb.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main method" + i);
        }
    }
}