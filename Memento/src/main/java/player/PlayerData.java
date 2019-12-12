package player;

import java.util.Date;

public class PlayerData {
    private String name;
    private int respect;
    private Date date;

    public PlayerData(String name, int respect, Date date) {
        this.name = name;
        this.respect = respect;
        this.date = date;
    }

    public PlayerMemento save() {
        return new PlayerMemento(this.name, this.respect, this.date);
    }

    String load(PlayerMemento playerMemento) {
        this.name = playerMemento.getName();
        this.respect = playerMemento.getRespect();
        this.date = playerMemento.getDate();
        return playerMemento.toString();
    }

    void changeRespect(int respect) {
        this.respect = respect;
    }
}