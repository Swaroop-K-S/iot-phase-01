package day10;

import java.util.*;

class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

public class Huffman {

    static void print(Node root, String code) {

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " = " + code);
            return;
        }

        print(root.left, code + "0");
        print(root.right, code + "1");
    }

    public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D'};
        int[] freq = {5, 2, 1, 1};

        PriorityQueue<Node> q =
            new PriorityQueue<>((a, b) -> a.freq - b.freq);

        for (int i = 0; i < ch.length; i++)
            q.add(new Node(ch[i], freq[i]));

        while (q.size() > 1) {

            Node a = q.poll();
            Node b = q.poll();

            Node newNode = new Node('-', a.freq + b.freq);

            newNode.left = a;
            newNode.right = b;

            q.add(newNode);
        }

        print(q.poll(), "");
    }
}