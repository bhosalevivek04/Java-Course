import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10); //<> in that we provide Wrapper class not primitives
//        list.add(10);
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        list.add(18);
//        list.add(15);
//        list.add(156);
//        list.add(1045);
//        list.add(1064);
//        list.add(1560);

        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }


        //        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.size());

//        System.out.println(list);
    }
}
