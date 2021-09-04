package dataStructure;

import java.util.Iterator;

public class ArrayList implements List, Iterable<String>{
    private String[] array;
    private int size = 0;
    private int capacity;

    public String get(int index){
        if(index >= size || index < 0)
            return null;
        return array[index];
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public int indexOf(String string){
        for(int i = 0; i < size;i++){
            if(array[i].equals(string)){
                return i;
            }
        }
        return -1;
    }

    public void add(String string){
        String[] updated;
        if(size+1 > capacity){
            updated = new String[capacity*2];
        }else{
            updated = new String[size+1];
        }
        for(int i = 0; i < size; i++){
            updated[i] = array[i];
        }
        updated[size] = string;
        array = updated;
        size++;
        capacity = array.length;
    }

    public void remove(int index){
        String[] updated = new String[capacity];
        for(int i = 0,k=0; i < size;i++){
            if(i!=index){
                updated[k++] = array[i];
            }
        }
        array = updated;
        size--;
    }

    public ArrayList(){
        array = new String[10];
        capacity = array.length;
    }

    public ArrayList(int capacity){
        array = new String[capacity];
        this.capacity = array.length;
    }

    public Iterator<String> iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<String> {
        int cursor = 0;
        public boolean hasNext(){
            return cursor < size;
        }
        public String next(){
            return array[cursor++];
        }
    }
}
