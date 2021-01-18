package CBPack.mangers;

import CBPack.enums.DriverType;
import CBPack.enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    private WebDriver driver;
    private static DriverType driverType;
    private static EnvironmentType environmentType;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";

    public WebDriverManager() {

        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();

        environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();

    }

    public WebDriver getDriver() {

        if (driver == null) driver = createDriver();

        return driver;
    }

    private WebDriver createDriver() {

        switch (environmentType) {

            case LOCAL:
                driver = createLocalDriver();

                break;

            case REMOTE:
                driver = createRemoteDriver();

                break;
        }

        return driver;
    }

    private WebDriver createRemoteDriver() {

        throw new RuntimeException("Remote Driver is not implemented yet");
    }

    private WebDriver createLocalDriver() {

        switch (driverType) {

            case CHROME:

                //System.setProperty(CHROME_DRIVER_PROPERTY,FileReaderManager.getInstance().getConfigReader().getDriverPath());

                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

                driver=new ChromeDriver();

                break;

            case FIREFOX:

              System.setProperty(FIREFOX_DRIVER_PROPERTY,"drivers//geckodriver.exe");

              driver=new FirefoxDriver();

              break;

        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

        return driver;
    }

    public void closeDriver(){

       driver.close();

        driver.quit();
    }
}