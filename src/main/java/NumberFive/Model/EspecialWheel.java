package NumberFive.Model;

import NumberFive.Decorator.CarDecorator;
import NumberFive.Interface.ICar;

public class EspecialWheel extends CarDecorator {

    public EspecialWheel(ICar wrapper) {
        super(wrapper);
    }


    public Float calculateAditionalWheelCost(Float price){
        Float f = price * 0.03f;
        return f;
    }

    public Float calculateAditional(Float price) {
        Float aFloat = calculateAditionalWheelCost(price);
        float v = super.getWrapper().calculateAditional(price);
        return v + aFloat;
    }

    public Float calculateTotal() {
        return this.getPrice() + calculateAditional(this.getPrice());
    }

    @Override
    public String toString() {
        return super.getWrapper().toString()+"\n Has EspecialWheels";
    }

}
