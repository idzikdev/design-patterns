package player;

import java.util.ArrayList;
import java.util.List;

public class PlayerCareTaker extends BaseLogger {
    private List<PlayerMemento> list = new ArrayList<>();

    public String addMemento(PlayerMemento playerMemento) {
        list.add(playerMemento);
        logger.info("Player Data saved : " + playerMemento.toString());
        return playerMemento.toString();
    }

    public PlayerMemento getMemento(int index) {
        PlayerMemento playerMemento = list.get(index);
        logger.info("Player Data loaded : " + playerMemento.toString());
        return playerMemento;
    }

    List<PlayerMemento> getList() {
        return list;
    }
}