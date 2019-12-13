package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Base test for all tests
 */
public abstract class BaseTest {
    private static Logger logger = LogManager.getLogger(BaseTest.class);

    /***
     * method is calling before all tests
     */
    @BeforeClass
    public static void beforeAllTests() {
        logger.info("Before all tests");
    }

    /***
     * method is calling before each test
     */
    @Before
    public void beforeEachTests() {
        logger.info("Before each test");
    }

    /***
     * method is calling after each test
     */
    @After
    public void afterEachTest() {
        logger.info("After each test");
    }

    /***
     * method is calling after all tests
     */

    @AfterClass
    public static void afterAllTests() {
        logger.info("After all tests");
    }
}