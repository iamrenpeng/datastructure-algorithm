package ind.renpeng.datastructure.stack.ind.renpeng.datastructure;

import ind.renpeng.datastructure.array.MyArray;

public class MyArrayQueue<E> implements MyQueue<E>  {
    MyArray<E> array;

    public MyArrayQueue(int capacity){
        array=new MyArray<>(capacity);
    }

    public MyArrayQueue(){
        array=new MyArray<>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeLast();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append("queue:");
       sb.append("[");
        for (int i = 0; i <array.getSize() ; i++) {
            sb.append(array.get(i));
            if(i!=array.getSize()-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
