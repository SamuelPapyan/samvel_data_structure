package dataStructure;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T>, Iterable<T>{
    private class Node{
        T value;
        Node next;
        public Node(T value){
            this.value = value;
        }
    }
    private int size = 0;
    private Node top;

    public void push(T string){
        if(size == 0){
            top = new Node(string);
        }
        else{
            Node curr = top;
            while(curr.next != null)
                curr = curr.next;
            curr.next = new Node(string);
        }
        size++;
    }
    public T pop(){
        if(size == 0)
            return null;
        Node curr = top;
        if(size > 1){
            while(curr.next.next != null)
                curr = curr.next;
            T lifo = curr.next.value;
            curr.next = null;
            size--;
            return lifo;
        }
        else{
            T lifo = curr.value;
            top = null;
            size--;
            return lifo;
        }
    }
    public T peek(){
        Node curr = top;
        while(curr.next != null)
            curr = curr.next;
        return curr.value;
    }
    public void clear(){
        top = null;
        size = 0;
    }
    public boolean contains(T string){
        Node curr = top;
        while(curr != null){
            if(curr.value.equals(string)){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int getSize() {
        return size;
    }
    public Iterator<T> iterator(){
        return new StackIterator<T>();
    }
    private class StackIterator<T> implements Iterator<T>{
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
