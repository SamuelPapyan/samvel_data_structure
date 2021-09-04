package dataStructure;

public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    int getSize();
    void clear();
    boolean contains(T string);
}
