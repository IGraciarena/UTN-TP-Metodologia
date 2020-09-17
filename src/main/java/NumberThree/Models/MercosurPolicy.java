package NumberThree.Models;

import NumberThree.Decorator.PolicyDecorator;
import NumberThree.Interface.IPolicy;

public class MercosurPolicy extends PolicyDecorator {

    private Float recarge;

    public MercosurPolicy(Float recarge, IPolicy iPolicy) {
        super(iPolicy);
        this.recarge = recarge;
    }

    public Float calculatePolicy(Car c) {
        Float temp = super.getWrapper().calculatePolicy(c);
        float v = (temp) * this.recarge;
        return  v+temp;
    }

    public Float getRecarge() {
        return recarge;
    }

    public void setRecarge(Float recarge) {
        this.recarge = recarge;
    }

    @Override
    public String toString() {
        return "MercosurPolicy{" +
                "recarge=" + recarge +
                '}';
    }
}
