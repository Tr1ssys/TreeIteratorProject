package org.example;

public class Node {
    public Node left, right;

    public int data;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
