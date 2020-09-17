package NumberFour.Builder;

public class Director {
    private IPromotionBuilder iPromotionBuilder;

    public Director(IPromotionBuilder iPromotionBuilder) {
        this.iPromotionBuilder = iPromotionBuilder;
    }

    public void changeBuilder(IPromotionBuilder iPromotionBuilder) {
        this.iPromotionBuilder = iPromotionBuilder;
    }

    public void build() {
        iPromotionBuilder.buildDiscount();
        iPromotionBuilder.buildGift();
        iPromotionBuilder.buildPolicy();
    }
}
