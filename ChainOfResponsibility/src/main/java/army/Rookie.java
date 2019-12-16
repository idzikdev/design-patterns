package army;

public class Rookie extends Officer {
    private static final int code = 1;
    private static final String name = "Rookie";

    @Override
    public void processMessage(Message message) {
        if (message.getRank().equals(Rank.ROOKIE)
                && message.getCode() == code) {
            System.out.println(name + " get message : " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}