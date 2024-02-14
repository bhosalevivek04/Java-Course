class Calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

public class inheritance {
    public static void main(String[] args) {
        VeryAdvCalc calc=new VeryAdvCalc();
        int r1=calc.add(2, 03);
        int r2=calc.sub(5, 3);
        int r3=calc.multi(5, 3);
        int r4=calc.div(6, 3);
        double r5=calc.power(2, 2);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}

//multple inheritance not available in Java