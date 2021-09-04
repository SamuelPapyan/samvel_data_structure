package dataStructure;

import java.util.Iterator;

public class LinkedList implements List, Iterable<String>{
    private int size = 0;
    private Node node;
    private class Node{
        String value;
        Node next;

        public Node(String value){
            this.value = value;
            next = null;
        }
    }
    public String get(int index){
        int counter = 0;
        Node noder = node;
        while(noder != null){
            if(counter == index)
                return noder.value;
            counter++;
            noder = noder.next;
        }
        return null;
    }
    private Node getNodeByIndex(int index){
        int cursor = 0;
        if(index < size && index >= 0){
            Node noder = node;
            while(cursor != index){
                noder = noder.next;
                cursor++;
            }
            return noder;
        }
        return null;
    }
    public void add(String string){
        if(node == null){
            node = new Node(string);
            return;
        }
        Node noder = node;
        while(noder.next != null){
            noder = noder.next;
        }
        noder.next = new Node(string);
        size++;
    }
    public void remove(int index){
        Node node1 = getNodeByIndex(index);
        Node node2 = getNodeByIndex(index-1);
        node2.next = node1.next;
    }
    public int indexOf(String string){
        int cursor = 0;
        Node noder = node;
        while(noder != null){
            if(noder.value.equals(string))
                return cursor;
            noder = noder.next;
            cursor++;
        }
        return -1;
    }
    public int getSize(){
        return size;
    }

    public Iterator<String> iterator() {
        return new LinkedListIterator(this);
    }

    class LinkedListIterator implements Iterator<String>{
        Node current;
        public LinkedListIterator(LinkedList linkedList){
            current = linkedList.node;
        }
        public boolean hasNext(){
            return current != null;
        }
        public String next(){
            String val = current.value;
            current = current.next;
            return val;
        }
    }
}
