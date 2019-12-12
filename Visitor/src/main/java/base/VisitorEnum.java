package base;

public enum VisitorEnum {
    SOLDIER_VISITED_BY("The soldier is visited by "),
    TANK_VISITED_BY("The tank is visited by "),
    SECTOID_VISITED_BY("The Sectoid is visited by "),
    SOLDIER_THINK_POWER("I think the power of soldier is "),
    TANK_THINK_POWER("I think the power of tank is "),
    SECTOID_THINK_POWER("I think the power of soldier is "),
    SOLDIER_POWER("The power of soldier is "),
    TANK_POWER("The power of tank is "),
    SECTOID_POWER("The power of sectoid is ");
    private String info;

    VisitorEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}