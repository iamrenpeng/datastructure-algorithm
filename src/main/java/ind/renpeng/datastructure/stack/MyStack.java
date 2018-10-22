package ind.renpeng.datastructure.stack;

public interface MyStack<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
