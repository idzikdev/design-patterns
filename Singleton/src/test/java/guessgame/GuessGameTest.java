package guessgame;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class GuessGameTest extends BaseTest {
    @Test
    public void singleton_test() {
        Logger logger = LogManager.getLogger();
        GuessGame gameOne = GuessGame.getInstance();
        gameOne.setScore(10);
        GuessGame gameTwo = GuessGame.getInstance();
        assertEquals(gameOne.getScore(), gameTwo.getScore());
    }
}