package day10;

public class Huffman_coding {
    public static void main(String[] args) {
        String message = "AAAABBCCD";
        System.out.println("Message : " + message);
        int a = 0, b = 0, c = 0, d = 0;
        for (char ch : message.toCharArray()) {
            if (ch == 'A')
                a++;
            else if (ch == 'B')
                b++;
            else if (ch == 'C')
                c++;
            else if (ch == 'D')
                d++;
        }
        System.out.println("\nFrequency : ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
