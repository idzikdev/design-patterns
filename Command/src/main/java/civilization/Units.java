package civilization;

import java.util.ArrayList;
import java.util.List;

public class Units {
    private List<Command> list = new ArrayList<>();

    public void addToList(Command command) {
        list.add(command);
    }

    public void run(){
        if(list.isEmpty()){
            System.out.println("Lista jest pusta");
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
}