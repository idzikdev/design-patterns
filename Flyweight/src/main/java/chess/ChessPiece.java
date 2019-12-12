package chess;

import lombok.Getter;

public class ChessPiece {
    private String name;
    private String numberPosition;
    private String letterPosition;
    @Getter
    private Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        if ("black".equals(color.toLowerCase())) {
            this.color = ColorRepository.getBlack();
        } else {
            this.color = ColorRepository.getWhite();
        }
    }
}