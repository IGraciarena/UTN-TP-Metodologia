package NumberFour.Models;

import NumberThree.Interface.IPolicy;

public class Promotion {
    private IPolicy policy;
    private Gift gift;
    private Discount discount;

    public Promotion() {
    }

    public Promotion(IPolicy policy, Gift gift, Discount discount) {
        this.policy = policy;
        this.gift = gift;
        this.discount = discount;
    }

    public IPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(IPolicy policy) {
        this.policy = policy;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "\nPromotion{" +
                "\n " + policy +
                "\n " + gift +
                "\n " + discount +
                '}';
    }
}
