package army;

public class Message {
    private String content;
    private int code;
    private Rank rank;

    public Message(String content, int code, Rank rank) {
        this.content = content;
        this.code = code;
        this.rank = rank;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }

    public Rank getRank() {
        return rank;
    }
}