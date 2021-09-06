package dataStructure;

import java.util.Iterator;

public class MyStack<T> implements Stack<T>,Iterable<T>{
    private T[] array;
    private int size = 0;

    public MyStack(){
        array = (T[])new Object[size];
    }
    public void push(T string){
        T[] updated = (T[])new Object[size+1];
        for(int i = 0; i < size;i++){
            updated[i] = array[i];
        }
        updated[size] = string;
        array = updated;
        size++;
    }
    public T pop(){
        if(size == 0)
            return null;
        T lifo = array[size-1];
        T[] updated = (T[])new Object[size-1];
        for(int i = 0; i < size-1; i++){
            updated[i] = array[i];
        }
        array = updated;
        size--;
        return lifo;
    }
    public T peek(){
        if(size == 0)
            return null;
        return array[size-1];
    }
    public void clear(){
        array = (T[])new Object[0];
        size = 0;
    }
    public boolean contains(T string){
        for(T item : array)
            if(item.equals(string))
                return true;
        return false;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public Iterator<T> iterator(){
        return new StackIterator<T>();
    }

    private class StackIterator<T> implements Iterator<T>{
        int cursor = size-1;
        public boolean hasNext(){
            return cursor > -1;
        }
        public T next(){
            return (T)array[cursor--];
        }
    }
}
