import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parellelStream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }
        // int sum1 = nums.stream()
        // .map(i -> i * 2)
        // .reduce(0, (c, e) -> c + e);

        long starSeg = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeg = System.currentTimeMillis();

        long starPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i ->{
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                return  i * 2;
            })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(/* sum1 + " " + */ sum2 + " " + sum3);
        System.out.println("Seq: " + (endSeg - starSeg));
        System.out.println("Para: " + (endPara - starPara));
    }
}