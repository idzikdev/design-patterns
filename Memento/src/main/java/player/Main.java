package player;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData("idzik", 100, new Date());
        PlayerCareTaker playerCareTaker = new PlayerCareTaker();
        playerData.changeRespect(200);
        playerData.changeRespect(205);
        playerCareTaker.addMemento(playerData.save());
        playerData.changeRespect(100);
        playerCareTaker.addMemento(playerData.save());
        playerData.load(playerCareTaker.getMemento(playerCareTaker.getList().size() - 2));
    }
}