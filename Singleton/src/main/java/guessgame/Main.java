package guessgame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger=LogManager.getLogger();
        GuessGame game = GuessGame.getInstance();
        game.play();
        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstance();
        if(game == anotherGameReference) {
            logger.info("Singleton!");
            logger.info("You score "+game.getScore());
            if(score == anotherGameReference.getScore()) {
                logger.info("The score are equal");
            }
        }
    }
}