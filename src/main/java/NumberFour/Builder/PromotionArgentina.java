package NumberFour.Builder;

import NumberFour.Models.Alarm;
import NumberFour.Models.Discount;
import NumberFour.Models.Gift;
import NumberFour.Models.Promotion;
import NumberThree.Interface.IPolicy;
import NumberThree.Models.ThridPartyPolicy;

public class PromotionArgentina implements IPromotionBuilder {
    private Promotion result;

    public PromotionArgentina() {
        reset();
    }

    public void reset() {
        this.result = new Promotion();
    }

    public void buildPolicy() {
        IPolicy iPolicy = new ThridPartyPolicy();
        result.setPolicy(iPolicy);
    }

    public void buildGift() {
        Alarm a = new Alarm(0f);
        Gift g1 = new Gift(a);
        result.setGift(g1);
    }

    public void buildDiscount() {
        Discount d1 = new Discount(0.2f, "Fuel charge until $500 complete");
        result.setDiscount(d1);
    }

    public Promotion getResult() {
        Promotion promotion = this.result;
        reset();
        return promotion;
    }
}
