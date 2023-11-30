package io.resttestgen.boot;

import io.resttestgen.core.Environment;
import io.resttestgen.core.openapi.CannotParseOpenApiException;
import io.resttestgen.core.testing.Strategy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Class used to launch RestTestGen with a given configuration, against a given API, with a given testing strategy.
 * Also, it can provide a testing environment without launching the testing strategy. This is particularly useful when
 * a testing environment is required in unit tests.
 */
public class Starter {

    private static final Logger logger = LogManager.getLogger(Starter.class);

    private static final String strategyPackageName = "io.resttestgen.implementation.strategy";

    /**
     * Starts RestTestGen with the provided configuration. The API under test and the strategy are chosen according to
     * the configuration
     *
     * @param configuration the configuration.
     */
    public static void start(Configuration configuration) throws CannotParseOpenApiException, IOException {
        initEnvironment(configuration);
        launchStrategyByClassName(configuration.getStrategyClassName());
    }


    public static void startForPartitionQueryTest(Configuration configuration) throws CannotParseOpenApiException, IOException {
        initEnvironmentForPartitionQueryTest(configuration);
        launchStrategyByClassName(configuration.getStrategyClassName());
    }


    public static void start(Configuration configuration, ApiUnderTest apiUnderTest, Strategy strategy) throws CannotParseOpenApiException {
        initEnvironment(configuration, apiUnderTest);
        launchStrategyByClass(strategy);
    }

    public static void start(Configuration configuration, String apiWildcard, Strategy strategy) throws CannotParseOpenApiException, IOException {
        initEnvironment(configuration, apiWildcard);
        launchStrategyByClass(strategy);
    }

    public static void start(Configuration configuration, ApiUnderTest apiUnderTest, String strategyClassName) throws CannotParseOpenApiException {
        initEnvironment(configuration, apiUnderTest);
        launchStrategyByClassName(strategyClassName);
    }

    public static void start(Configuration configuration, String apiWildcard, String strategyClassName) throws CannotParseOpenApiException, IOException {
        initEnvironment(configuration, apiWildcard);
        launchStrategyByClassName(strategyClassName);
    }


    public static void start(ApiUnderTest apiUnderTest, Strategy strategy) throws CannotParseOpenApiException {
        initEnvironment(apiUnderTest);
        launchStrategyByClass(strategy);
    }

    public static void start(String apiWildcard, Strategy strategy) throws CannotParseOpenApiException, IOException {
        initEnvironment(apiWildcard);
        launchStrategyByClass(strategy);
    }

    public static void start(ApiUnderTest apiUnderTest, String strategyClassName) throws CannotParseOpenApiException {
        initEnvironment(apiUnderTest);
        launchStrategyByClassName(strategyClassName);
    }

    public static void start(String apiWildcard, String strategyClassName) throws CannotParseOpenApiException, IOException {
        initEnvironment(apiWildcard);
        launchStrategyByClassName(strategyClassName);
    }


    public static Environment initEnvironment(Configuration configuration) throws IOException, CannotParseOpenApiException {
        ApiUnderTest apiUnderTest = ApiUnderTest.loadApiFromFile(configuration.getApiUnderTest());
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUp(configuration, apiUnderTest);
    }

    private static Environment initEnvironmentForPartitionQueryTest(Configuration configuration) throws IOException, CannotParseOpenApiException {
        ApiUnderTest apiUnderTest = ApiUnderTest.loadApiFromFile(configuration.getApiUnderTest());
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUpForPartitionQueryTest(configuration, apiUnderTest);
    }

    public static Environment initEnvironment(Configuration configuration, ApiUnderTest apiUnderTest) throws CannotParseOpenApiException {
        updateConfigurationWithApiWildcard(configuration, apiUnderTest.getWildcard());
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUp(configuration, apiUnderTest);
    }

    public static Environment initEnvironment(Configuration configuration, String apiWildcard) throws IOException, CannotParseOpenApiException {
        updateConfigurationWithApiWildcard(configuration, apiWildcard);
        ApiUnderTest apiUnderTest = ApiUnderTest.loadApiFromFile(apiWildcard);
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUp(configuration, apiUnderTest);
    }

    public static Environment initEnvironment(ApiUnderTest apiUnderTest) throws CannotParseOpenApiException {
        Configuration configuration = Configuration.defaultConfiguration();
        updateConfigurationWithApiWildcard(configuration, apiUnderTest.getWildcard());
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUp(configuration, apiUnderTest);
    }

    public static Environment initEnvironment(String apiWildcard) throws IOException, CannotParseOpenApiException {
        ApiUnderTest apiUnderTest = ApiUnderTest.loadApiFromFile(apiWildcard);
        Configuration configuration = Configuration.defaultConfiguration();
        updateConfigurationWithApiWildcard(configuration, apiWildcard);
        logApiName(apiUnderTest);
        resetBeforeTestingIfSpecifiedInApiConfig(apiUnderTest);
        return Environment.getInstance().reset().setUp(configuration, ApiUnderTest.loadApiFromFile(apiWildcard));
    }


    /**
     * Searches for the Strategy class by its name using reflection, and launches it.
     *
     * @param strategyClassName the name of the strategy class.
     */
    private static void launchStrategyByClassName(String strategyClassName) {
        logger.info("Launching strategy with class name '" + strategyClassName + "'");
        final String strategyClassFullName = strategyPackageName + "." + strategyClassName;
        try {
            Class<?> strategyClass = Class.forName(strategyClassFullName);
            Strategy strategy = (Strategy) strategyClass.getDeclaredConstructor().newInstance();
            launchStrategyByClass(strategy);
        } catch (ClassNotFoundException e) {
            logger.error("Strategy class with name '" + strategyClassFullName + "' not found.");
        } catch (NoSuchMethodException e) {
            logger.error("Constructor not found in class '" + strategyClassFullName + "'.");
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Launches a strategy by calling its method start().
     *
     * @param strategy the strategy to launch.
     */
    private static void launchStrategyByClass(Strategy strategy) {
        strategy.start();
    }

    /**
     * Resets the API before testing, if specified so in the API configuration.
     *
     * @param apiUnderTest the API under test.
     */
    private static void resetBeforeTestingIfSpecifiedInApiConfig(ApiUnderTest apiUnderTest) {
        if (apiUnderTest.isResetBeforeTesting()) {
            apiUnderTest.reset();
        }
    }

    private static void updateConfigurationWithApiWildcard(Configuration configuration, String apiWildcard) {
        configuration.setApiUnderTest(apiWildcard);
    }

    private static void logApiName(ApiUnderTest apiUnderTest) {
        logger.info("API under test: " + apiUnderTest.getName() + " [" + apiUnderTest.getWildcard() + "]");
    }
}
