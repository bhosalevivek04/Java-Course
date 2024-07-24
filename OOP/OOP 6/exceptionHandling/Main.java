package com.vivek.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
//            divide(a,b);
//            throw new Exception("just for fun");
        String name="Vivek";
        if (name.equals("Vivek")){
            throw new MyException("Name is Vivek");
        }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal Exception");
        }
        finally {
            System.out.println("This will always execute finally block" ) ;
        }

    }
    static int divide(int a,int b) throws ArithmeticException { //throws is used for declare exception
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
