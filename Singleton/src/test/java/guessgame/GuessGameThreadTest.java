package guessgame;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GuessGameThreadTest extends BaseTest {
    @Test
    public void singleton_thread_test() throws InterruptedException {
        int threadsAmount = 10;
        Set<GuessGame> singletonSet = Collections.newSetFromMap(new ConcurrentHashMap<>());

        ExecutorService executorService = Executors.newFixedThreadPool(threadsAmount);

        for (int i = 0; i < threadsAmount; i++) {
            executorService.execute(() -> {
                GuessGame guessGame = GuessGame.getInstance();
                singletonSet.add(guessGame);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assertThat(singletonSet.size()).isEqualTo(1);
    }
}