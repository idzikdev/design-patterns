package units;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class UnitStats {
    @Getter
    private String name;
    @Getter
    private int hp;
    @Getter
    private int armour;
    @Getter
    private int damage;
    @Getter
    private int speed;
    @Getter
    private int resourceCost;
}