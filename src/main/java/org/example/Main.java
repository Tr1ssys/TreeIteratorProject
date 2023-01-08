package org.example;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(4, new Node(3), new Node(5));
        root.right = new Node(7);
        BSTIterator iterator = new BSTIterator(root); // итератор в глубину (depth iterator)
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        DFSIterator iterator1 = new DFSIterator(root); // итератор обхода в ширину
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+ " ");
        }
    }
}