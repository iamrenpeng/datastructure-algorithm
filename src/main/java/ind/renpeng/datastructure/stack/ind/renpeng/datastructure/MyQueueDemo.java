package ind.renpeng.datastructure.stack.ind.renpeng.datastructure;

public class MyQueueDemo {
    public static void main(String[] args) {
        MyArrayQueue<Integer> queue=new MyArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue.toString());
        }
        queue.dequeue();
        System.out.println(queue.toString());
    }
}
