package SeminarsHW.HW2;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Покупатель";
        
        Market market = new Market();

        market.acceptToMarket(human);
        market.takeinQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
