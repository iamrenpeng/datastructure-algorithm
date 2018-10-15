package ind.renpeng.datastructure.mylinkedlist;

import com.sun.xml.internal.bind.AnyTypeAdapter;

import java.util.Iterator;

/**
 * @author: renpeng
 * @email: renp90@qq.com
 * @createTime: 2018/4/24 9:09
 * @description:
 */
public class MyLinkedList<T> implements Iterable<T> {
    private static class Node<T>{
        public Node(T t,Node<T> prev,Node<T> next)
        {
            this.data=t;
            this.prev=prev;
            this.next=next;
        }
        private Node<T> prev;
        private Node<T> next;
        private T data;

    }
    private  class LinkedListIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
    public MyLinkedList(){

    }
    public void clear(){}
    public int size(){return 0;}
    public  boolean isEmpty(){return true;}
    public boolean add(T t){return true;}
    public void  add(int idx,T t){}
    public T get(int idx){return null;}
    public T set(int idx,T t) {return null;}
    public T remove(int idx){return null;}
    private void addBefore(Node<T> p,T t){}
     private T remove(Node<T> node){return null;}
     private Node<T> getNode(int idx){return null;}

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
    private int theSize;
    private int modCount=0;
    private Node<T> beaginMarker;
    private Node<T> endMarker;

}
