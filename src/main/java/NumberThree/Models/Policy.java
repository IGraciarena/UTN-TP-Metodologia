package NumberThree.Models;

import NumberThree.Interface.IPolicy;

public abstract class Policy implements IPolicy {
    private Float policyValue;

    public Policy(Float policyValue) {
        this.policyValue = policyValue;
    }

    public Float getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(Float policyValue) {
        this.policyValue = policyValue;
    }

    public Float calculatePolicy(Car c) {
        return c.getPrice()*this.policyValue;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyValue=" + policyValue +
                '}';
    }
}
