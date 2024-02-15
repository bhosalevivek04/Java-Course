abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

class WagonR extends Car // concrete class
{
    public void drive() {
        System.out.println("Driving in Wagon R");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

public class abstract_keyword {
    public static void main(String[] args) {
        // Car obj=new Car(); //you can't create object of Abstract Class directly
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
