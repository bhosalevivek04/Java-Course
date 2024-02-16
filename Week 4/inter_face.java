interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code,compile,run: faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class inter_face {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer obj = new Developer();
        obj.devApp(desk);
    }
}
