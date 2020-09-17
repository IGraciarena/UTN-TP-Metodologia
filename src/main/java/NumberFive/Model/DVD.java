package NumberFive.Model;

import NumberFive.Decorator.CarDecorator;
import NumberFive.Interface.ICar;

public class DVD extends CarDecorator {

    public DVD(ICar wrapper) {
        super(wrapper);
    }

    public Float calculateAditionalDVDCost(Float price) {
        Float f = price * 0.05f;
        return f;
    }

    public Float calculateAditional(Float price) {
        Float aFloat = calculateAditionalDVDCost(price);
        float v = super.getWrapper().calculateAditional(price);
        return v + aFloat;
    }

    public Float calculateTotal() {
        return this.getPrice() + calculateAditional(this.getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + "\n Has DVD";
    }
}
