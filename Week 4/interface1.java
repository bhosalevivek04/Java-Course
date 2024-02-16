interface A {
    // interface means a contract or agreement, it is not an object. It cannot have
    // any state but can have methods
    // use interface instead of public abstract
    int age = 20; // final and static
    String area = "Loni";

    void show();

    void config();

    void run();
}

interface X {
    void run();
}

interface Y extends X {
    // interface - interface -> extends
    // class - class -> extends
    // class - interface ->implements
}

class B implements A, Y {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config..");
    }

    public void run() {
        System.out.println("in run");
    }

}

public class interface1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        obj.run();
        // A.area="Sangamner"; //accessing the static variable through interface name
        System.out.println(A.area);
    }
}
