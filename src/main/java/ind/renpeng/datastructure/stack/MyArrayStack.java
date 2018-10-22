package ind.renpeng.datastructure.stack;

import ind.renpeng.datastructure.array.MyArray;

public class MyArrayStack<E> implements MyStack<E> {

    MyArray<E> array;

    public MyArrayStack(int capacity){
        array=new MyArray<>(capacity);
    }

    public MyArrayStack(){
        array=new MyArray<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    /**获取栈的容量
     * @return
     */
    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("stack:");
        sb.append("[");
        for (int i = 0; i <getSize() ; i++) {
            sb.append(array.get(i));
            if(i!=getSize()-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();

    }
}
