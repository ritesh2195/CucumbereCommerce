package CBPack.mangers;

import CBPack.enums.DriverType;
import CBPack.enums.EnvironmentType;
import CBPack.util.MutableUtilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
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

        MutableCapabilities mc = MutableUtilities.mutableUtility();

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("sauce:options",mc);

        //cap.setCapability("browserVersion", versionName);

        cap.setCapability("platformName", "windows 10");

        if (driverType.toString().equalsIgnoreCase("chrome")){

            io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

            cap.setCapability("browserName","chrome");
        }

        else if (driverType.toString().equalsIgnoreCase("firefox")){

            io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();

            cap.setCapability("browserName","firefox");
        }

        try {

            driver = new RemoteWebDriver(new URL(FileReaderManager.getInstance().getConfigReader().getRemoteUrl()),cap);


        } catch (MalformedURLException e) {

            e.printStackTrace();

        }

        return driver;
    }

    private WebDriver createLocalDriver() {

        switch (driverType) {

            case CHROME:

                io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

                driver=new ChromeDriver();

                break;

            case FIREFOX:

              io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();

              driver=new FirefoxDriver();

              break;

        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

        return driver;
    }

    public void closeDriver(){

       driver.close();

        //driver.quit();
    }
}