class Laptop {
    String model;
    int price;
    // String serial;
    // public String toString(){
    // return model + " : "+price;
    // }

    // public boolean equals(Laptop that)
    // {
    // return this.model.equals(that.model) && this.price == that.price;
    // }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class string_hashcode {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "HP";
        obj.price = 10000;
        Laptop obj1 = new Laptop();
        obj1.model = "HP";
        obj1.price = 10000;
        System.out.println(obj.equals(obj1));
        // System.out.println(obj.toString());
    }
}
// right click + source action + Generate hashcode() and equals()