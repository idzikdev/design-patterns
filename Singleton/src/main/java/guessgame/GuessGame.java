package guessgame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame extends BaseLogger{
    private int score = 0;
    private static volatile GuessGame instance;

    private GuessGame() {
    }

    protected Object readResolve() {
        return getInstance();
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class){
                if (instance==null){
                    instance=new GuessGame();
                }
            }
        }
        return instance;
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = GuessGame.class.getClassLoader();
        }
        return (classLoader.loadClass(classname));
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number");
            int userNumber = scanner.nextInt();
            int randomNumber = random.nextInt(3);
            logger.info("Random "+randomNumber);
            logger.info("Entered "+userNumber);
            if (userNumber == randomNumber) {
                logger.info("You score 1 point");
                score++;
            }
        }
    }

    public int getScore() {
        return score;
    }
}