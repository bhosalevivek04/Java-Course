public class Conditional {
    public static void main(String[] args) {
        int x =11;
        int y=10;
        int z=60;
        if(x>y&&x>z)
            System.out.println("x is greater than both of the other numbers");
        else if(y>x && y>z)
            System.out.println("y is greater than both of the other numbers");
        else
            System.out.println("z is greater than both of the other numbers or no number is greater");
        /*
        if(x>y)
        {
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("x is not greater than y");
        }*/


        // x=8;
        // if(x>10)
        // {
        //    System.out.println("Hello");
        // }
        // else{
        //     System.out.println("Bye");
        // }    
    }
}
