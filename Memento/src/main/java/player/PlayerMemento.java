package player;

import java.util.Date;

public class PlayerMemento {
    private String name;
    private int respect;
    private Date date;

    PlayerMemento(String name, int respect, Date date) {
        this.name = name;
        this.respect = respect;
        this.date = date;
    }

    String getName() {
        return name;
    }

    int getRespect() {
        return respect;
    }

    Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return new StringBuilder("Player ")
                .append("name " + name + ", ")
                .append("respect " + respect + ", ")
                .append("date " + date + "\n")
                .toString();

    }
}