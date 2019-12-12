package chess;

public class ColorRepository {
    private static Color black = new Color(255, 255, 255);
    private static Color white = new Color(0, 0, 0);

    private ColorRepository() {
    }

    public static Color getBlack() {
        return black;
    }

    public static Color getWhite() {
        return white;
    }
}