package civilization;

import java.util.ArrayList;
import java.util.List;

public class Units extends BaseLogger{
    private List<Command> list = new ArrayList<>();

    public void addToList(Command command) {
        list.add(command);
    }

    public void run(){
        if(list.isEmpty()){
           logger.info ("Lista jest pusta");
        }
        for (Command command:list
             ) {
            command.execute();
        }
    }

    public void undoLastCommand(){
        list.get(list.size()-1).undo();
        list.remove(list.size()-1);
    }

    public List<Command> getList() {
        return list;
    }
}