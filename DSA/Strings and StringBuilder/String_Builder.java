public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();//its are muttable
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.deleteCharAt(0));
        
    }
}
