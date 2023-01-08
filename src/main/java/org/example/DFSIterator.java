package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class DFSIterator {      //Итератор в ширину (Depth First Iterator)
    Queue<Node> queue = new LinkedList<>();

    public DFSIterator(Node root) {
        queue.offer(root);
    }

    public int next(){
        Node res;
        res = queue.poll();
        if(res.left != null){
            queue.offer(res.left);
        }
        if(res.right!=null){
            queue.offer(res.right);
        }
        return res.data;
    }
    public boolean hasNext(){
        return !queue.isEmpty();
    }
}
