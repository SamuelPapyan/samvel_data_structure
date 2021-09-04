package dataStructure;

public interface List {
    String get(int index);
    void add(String element);
    void remove(int index);
    int indexOf(String element);
    int getSize();
}
