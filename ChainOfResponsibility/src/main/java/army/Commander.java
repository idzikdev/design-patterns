package army;

public class Commander extends Officer {
    private static final int code = 10;
    private static final String name = "Commander";

    @Override
    public String processMessage(Message message) {
        if (message.getRank().equals(Rank.COMMANDER)
                && message.getCode() == code) {
            return (name + " get message : " + message.getContent());
        }
        return "Do not who should take this order";
    }
}