package army;

public class Rookie extends Officer {
    private static final int code = 1;
    private static final String name = "Rookie";

    @Override
    public String processMessage(Message message) {
        if (message.getRank().equals(Rank.ROOKIE)
                && message.getCode() == code) {
            return (name + " get message : " + message.getContent());
        }
        return getSuperiorOfficer().processMessage(message);
    }
}