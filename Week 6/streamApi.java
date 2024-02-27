import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2);

        // Stream<Integer> s1=nums.stream(); // returns a Stream of the list elements
        // //Stream can't be reused

        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // Stream<Integer> s3=s2.map(n->n*2);
        // // s3.forEach((n)-> System.out.println(n)); //forEach method
        // int result=s3.reduce(0,(c,e)->c+e);

        int result =nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // int sum=0;
        // for(int n:nums)
        // {
        // if(n%2==0){
        // n=n*2;
        // sum=sum+n;
        // }
        // }
        // System.out.println(sum);
    }
}
