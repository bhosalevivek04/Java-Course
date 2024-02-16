enum Laptop {
    Macbook(1000), XPS(800), Surface(2000), Thinkpad(500);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

public class enum_class {
    public static void main(String[] args) {
        // Laptop laptop = Laptop.Macbook;
        // System.out.println(laptop + ":" + laptop.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}
