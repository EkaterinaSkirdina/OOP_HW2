package SeminarsHW.HW2;

public interface QueueBehaviour {
    void takeinQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
