package ind.renpeng.datastructure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray<E> {
    private E[] data;
    private int size;

    public MyArray(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public MyArray() {
        this(10);
    }

    /**
     * 获取数组大小
     *
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 获取数组容量
     *
     * @return
     */
    public int getCapacity() {
        return this.data.length;
    }

    /**
     * 判断数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在最后添加元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 在开始添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 指定的位置添加元素
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (size == data.length) {
            resize(data.length*2);
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index is must >0 and < size");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取指定索引的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed");
        }
        return data[index];
    }

    /**
     * 修改指定索引的元素
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("set failed");
        }
        data[index] = e;
    }

    /**
     * 判断元素是不是存在
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    /**
     * 查询元素的索引
     *
     * @param e
     * @return 如果不存在返回-1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    /**
     * 删除指定索引的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("remove failed");
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        if(size==data.length/4||size>0){
            resize(data.length/2);
        }
        return ret;
    }

    /**
     * 删除第一个元素
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除最后一个元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 删除指定的元素
     *
     * @param e
     * @return
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1)
            remove(index);
    }

    /**
     * 调整数组大小
     * @param newCapacity
     */
    private void resize(int newCapacity){
        E[] newData=(E[]) new Object[newCapacity];
        for (int i = 0; i <size ; i++) {
            newData[i]=data[i];
        }
        data=newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("array:size= %d ,capacity= %d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}

