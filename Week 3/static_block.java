//static block is use for initialize the static variables

class Mobile {
    String brand;
    int Price;
    static String name;
    
    static{
        name="Phone";
        System.out.println("in Static block");
    }
    public Mobile()
    {
        brand="";
        Price=200;
        System.out.println("Inside constructor");
    }
    public void show(){
        System.out.println(brand+" : "+Price+" : "+name);
    }
    public static void show1()
    {
        System.out.println("Inside static block");
    }
}

public class static_block {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Mobile");
        // Mobile mobile=new Mobile();
        // mobile.brand="Apple";
        // mobile.Price=10000;
        // mobile.name="Iphone 7 Plus";

        // Mobile mobile2=new Mobile();
        // mobile2.brand="Samsung";
        // mobile2.Price=8000;
        // mobile2.name="Galaxy S9";

        // mobile.show();
        // mobile2.show();
        Mobile.show1();
    }
}
