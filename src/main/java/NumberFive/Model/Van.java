package NumberFive.Model;

public class Van extends Car {
    public Van(String plate, Float price, Float aditionalCost) {
        super(plate, price, 0.05f);
    }

    public Float calculateAditional(Float price) {
        return price * 0.05f;
    }

    public Float calculateTotal() {
        return this.getPrice() + calculateAditional(this.getPrice());
    }
}
