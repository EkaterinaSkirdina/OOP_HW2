package SeminarsHW.HW2;

public abstract class Buyer implements BuyerBehaviour{
    protected String name;
    protected boolean isMakeOrderBuyer;
    protected boolean isTakeOrderBuyer;
    abstract String getName();
}
