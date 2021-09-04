package dataStructure;

import java.util.Iterator;

public class MyQueue<T> implements Queue<T>, Iterable<T>{
    private T[] array;
    private int size = 0;

    public MyQueue(){
        array = (T[])new Object[size];
    }
    public void enqueue(T string){
        T[] updated = (T[])new Object[size+1];
        for(int i = 0; i < size;i++){
            updated[i] = array[i];
        }
        updated[size] = string;
        array = updated;
        size++;
    }
    public T dequeue(){
        if(size == 0)
            return null;
        T fifo = array[0];
        T[] updated = (T[])new Object[size-1];
        for(int i = 1; i < size; i++){
            updated[i-1] = array[i];
        }
        array = updated;
        size--;
        return fifo;
    }
    public T peek(){
        if(size == 0)
            return null;
        return array[0];
    }
    public int getSize(){
        return size;
    }
    public boolean contains(T string){
        for(T item : array)
            if(item.equals(string))
                return true;
        return false;
    }
    public T[] toArray(){
        return array;
    }
    public void clear(){
        array = (T[])new Object[0];
        size = 0;
    }
    public Iterator<T> iterator(){
        return new QueueIterator<T>();
    }
    private class QueueIterator<T> implements Iterator<T> {
        int cursor = 0;
        public boolean hasNext(){
            return cursor < size;
        }
        public T next(){
            return (T)array[cursor++];
        }
    }
}
