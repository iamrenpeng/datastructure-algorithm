package ind.renpeng.datastructure.array;

public class MyArrayDemo {
    public static void main(String[] args) {

        MyArray<Integer> myArray=new MyArray(20);
        for (int i = 0; i <10 ; i++) {
            myArray.addLast(i);
        }
        myArray.set(2,22);
        System.out.println(myArray);

        myArray.remove(2);
        System.out.println(myArray);
        myArray.removeFirst();
        System.out.println(myArray);
        myArray.removeLast();
        System.out.println(myArray);

        for (int i = 7; i <11 ; i++) {
            myArray.addLast(i);
        }
        System.out.println(myArray);
    }
}
