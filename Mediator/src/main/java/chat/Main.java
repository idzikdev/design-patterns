package chat;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Tomasz");
        User user2 = new UserImpl(mediator, "Pawel");
        User user3 = new UserImpl(mediator, "Marcin");
        User user4 = new UserImpl(mediator, "Lukasz");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }
}