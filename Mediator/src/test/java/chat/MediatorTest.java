package chat;

import org.junit.Test;

public class MediatorTest {
    @Test(expected = Test.None.class)
    public void chat_mediator_test(){
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Tomasz");
        User user2 = new UserImpl(mediator, "Pawel");

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hi All");
    }
}
