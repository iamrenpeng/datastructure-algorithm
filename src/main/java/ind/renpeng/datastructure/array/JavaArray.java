package ind.renpeng.datastructure.array;

public class JavaArray {
    public static void main(String[] args) {
        //第一种方式 动态初始化 数组的的定义和赋值操作分开进行
        int[] scores=new int[10];

        for (int i=0; i<scores.length;i++){
            scores[i]=i;
        }

        for (int score:
             scores) {
            System.out.println(score);
        }

        //第二种方式 静态初始化 数组的定义和赋值一起进行

        int[] colors=new int[]{1,2,3};
        //int[] colors={1,2,3};
        for (int color:
             colors) {
            System.out.println(color);
        }
    }
}
