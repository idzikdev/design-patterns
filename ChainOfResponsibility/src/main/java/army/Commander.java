package army;

public class Commander extends Officer {
    private static final int code = 10;
    private static final String name = "Commander";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(Rank.COMMANDER)
                && message.getCode() == code) {
            System.out.println(name + " get message : " + message.getContent());
        } else {
            System.out.println("Do not who should take this order");
        }
    }
}