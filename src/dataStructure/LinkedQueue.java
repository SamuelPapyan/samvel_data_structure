package dataStructure;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T>, Iterable<T>{
    private class Node{
        T value;
        Node next;
        public Node(T value){
            this.value = value;
            next = null;
        }
    }
    private Node top;
    private int size = 0;
    public void enqueue(T value){
        if(size == 0){
            top = new Node(value);
        }
        else{
            Node curr = top;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node(value);
        }
        size++;
    }
    public T dequeue(){
        if(top == null)
            return null;
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }
    public T peek(){
        return top.value;
    }
    public int getSize(){
        return size;
    }
    public boolean contains(T value){
        Node curr = top;
        while(curr != null)
            if(curr.value.equals(value))
                return true;
        return false;
    }
    public void clear(){
        top = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public Iterator<T> iterator(){
        return new QueueIterator<T>();
    }

    private class QueueIterator<T> implements Iterator<T> {
        Node current = top;
        public boolean hasNext(){
            return current != null;
        }
        public T next(){
            T val = (T)current.value;
            current = current.next;
            return val;
        }
    }
}
