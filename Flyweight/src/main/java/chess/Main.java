package chess;

public class Main {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        //exactly same color object is used
        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }
}