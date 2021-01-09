package classwork.chapter14;

public class Storage<T> {

    private Object[] objects = new Object[16];
    private int size = 0;

    void add(T o) {
        objects[size++] = o;
    }

    T getByIndex(int index) {
        return (T) objects[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

}
