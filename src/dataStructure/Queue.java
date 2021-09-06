package dataStructure;

public interface Queue<T> {
    void enqueue(T string);
    T dequeue();
    T peek();
    int getSize();
    void clear();
    boolean contains(T string);
    boolean isEmpty();
}
