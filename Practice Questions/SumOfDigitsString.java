public class SumOfDigitsString {
    public static void main(String[] args) {
        String str = "abc123";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
