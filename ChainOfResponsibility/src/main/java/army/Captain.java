package army;

public class Captain extends Officer {

    private static final int code = 5;
    private static final String name = "Captain";

    @Override
    public String processMessage(Message message) {
        if (message.getRank().equals(Rank.CAPTAIN)
                && message.getCode() == code) {
            return (name + " get message : " + message.getContent());
        }
        return getSuperiorOfficer().processMessage(message);
    }
}