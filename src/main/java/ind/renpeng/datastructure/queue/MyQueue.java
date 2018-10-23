package ind.renpeng.datastructure.queue;

public interface MyQueue<E> {

    public void enqueue(E e);
    public E dequeue();
    public E getFront();
    public boolean isEmpty();
    public int getSize();
}
