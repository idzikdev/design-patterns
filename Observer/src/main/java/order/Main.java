package order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, Status.REGISTERED);
        TextMessage textMessage = new TextMessage();
        order.registerObserver(textMessage);
        System.out.println("-----------------");
        order.changeOrderStatus(Status.SENT);
        order.changeOrderStatus(Status.RECEIVED);
        order.changeOrderStatus(Status.REGISTERED);
    }
}