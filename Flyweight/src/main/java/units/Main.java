package units;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Tank(1, 1));
            list.add(new Rifleman(2, 2));
            list.add(new Destroyer(10, 20));
        }
    }
}