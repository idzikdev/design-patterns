package army;

public class Captain extends Officer {
    private static final int code = 5;
    private static final String name = "Captain";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(Rank.CAPTAIN)
                && message.getCode() == code) {
            System.out.println(name + " get message : " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}