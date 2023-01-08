package org.example;


import java.util.Deque;
import java.util.LinkedList;


class BSTIterator {             //Итератор бинарного дерева в глубину

    Deque<Node> queue;
    Node cur;
    public BSTIterator(Node root) {
        cur = root;
        queue = new LinkedList<>();
        while (cur != null) {
            queue.offerLast(cur);
            cur = cur.left;
        }
    }
    public int next() {
        Node res = null;
        while (res == null && (cur != null || !queue.isEmpty())) {
            if (cur != null) {
                queue.offerLast(cur);
                cur = cur.left;
            } else {
                cur = queue.pollLast();
                res = cur;
                cur = cur.right;
            }
        }
        return res.data;
    }

    public boolean hasNext() {
        return cur != null || !queue.isEmpty();
    }
}