package NumberFive.Model;

import NumberFive.Decorator.CarDecorator;
import NumberFive.Interface.ICar;

public class GNC extends CarDecorator {

    public GNC(ICar wrapper) {
        super(wrapper);
    }

    public Float calculateAditionalGNCCost(Float price){
        Float f = price * 0.15f;
        return f;
    }

    public Float calculateAditional(Float price) {
        Float aFloat = calculateAditionalGNCCost(price);
        float v = super.getWrapper().calculateAditional(price);
        return v + aFloat;
    }

    public Float calculateTotal() {
        return this.getPrice() + calculateAditional(this.getPrice());
    }

    @Override
    public String toString() {
        return super.toString()+"\n Has GNC";
    }

}
