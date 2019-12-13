package player;

import java.util.Date;

public class DataProvider {
    private String name;
    private int respect;
    private Date date;

    public DataProvider(String name, int respect, Date date) {
        this.name = name;
        this.respect = respect;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public int getRespect() {
        return respect;
    }

    public String getName() {
        return name;
    }
}