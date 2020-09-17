package NumberFive.Decorator;

import NumberFive.Interface.ICar;
import NumberFive.Model.Car;

public abstract class CarDecorator extends Car implements ICar {
    private ICar wrapper;

    public CarDecorator(ICar wrapper, String plate, Float price, Float aditionalCost) {
        super(plate, price, aditionalCost);
        this.wrapper = wrapper;
    }

    public CarDecorator(ICar wrapper) {
        this.wrapper = wrapper;
    }

    public ICar getWrapper() {
        return wrapper;
    }

}
