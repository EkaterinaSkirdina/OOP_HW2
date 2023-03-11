package SeminarsHW.HW2;

public class Human extends Buyer{

    @Override
    public void setMakeOrder() {
        isMakeOrderBuyer = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderBuyer = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderBuyer;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderBuyer;
    }

    @Override
    String getName() {
        return name;
    }
    
}
