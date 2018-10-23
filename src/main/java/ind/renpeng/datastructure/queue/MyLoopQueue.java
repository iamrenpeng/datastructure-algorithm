package ind.renpeng.datastructure.queue;

public class MyLoopQueue<E> implements MyQueue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public MyLoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public MyLoopQueue() {
        this(10);
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(data.length * 2);
        }
        data[(tail + 1) % data.length] = e;
        size++;
        tail=(tail+1)%data.length;
    }

    private void resize(int capacity) {
        E[] newData = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {

        if (tail == front)
            throw new IllegalArgumentException("queue is empty");
        E ret = data[front];
        size--;
        data[front]=null;
        front=(front+1)%data.length;
        if (size == getCapacity() / 4 && getCapacity()/2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (tail == front)
            throw new IllegalArgumentException("queue is empty");
        E ret = data[front];
        return ret;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("queue:");
        sb.append("[");
        for (int i = front; i != tail; i = (i + 1) % data.length) {
            sb.append(data[i]);
            if ((i + 1) % data.length != tail) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayQueue<Integer> queue = new MyArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue.toString());
        }
        queue.dequeue();
        System.out.println(queue.toString());
    }
}
