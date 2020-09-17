package NumberFive.Model;

import NumberFive.Interface.ICar;

public abstract class Car implements ICar {
    private String plate;
    private Float price;
    private Float aditionalCost;

    public Car(String plate, Float price, Float aditionalCost) {
        this.plate = plate;
        this.price = price;
        this.aditionalCost = aditionalCost;
    }

    public Car() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getAditionalCost() {
        return aditionalCost;
    }

    public void setAditionalCost(Float aditionalCost) {
        this.aditionalCost = aditionalCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n " + plate + '\'' +
                "\n " + price +
                "\n " + aditionalCost +
                '}';
    }
}
