package NumberFive.Model;

public class Truck extends Car {
    public Truck(String plate, Float price) {
        super(plate, price, 0.1f);
    }

    public Float calculateAditional(Float price) {
        return price * 0.1f;
    }

    public Float calculateTotal() {
        return this.getPrice() + calculateAditional(this.getPrice());
    }
}
