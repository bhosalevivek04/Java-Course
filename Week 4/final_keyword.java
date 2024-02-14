//final - variable, method, class

class Calc{
    public void show(){
        System.out.println("By Vivek");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{ 
    //cannot inherit from final Calc class
    public void show(){
        //show() in AdvCalc cannot override show() in Calc
        System.out.println("By John");
    }

}
public class final_keyword {
    public static void main(String[] args) {
        
        AdvCalc obj=new AdvCalc();
        obj.show();
        obj.add(10,20);
        
        
        // final int num=9;
        // // num=8;   cannot assign a value to final variable -num
        // System.out.println(num);
    }
}
