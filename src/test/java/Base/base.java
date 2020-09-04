  package Base;

  import java.io.File;
  import java.io.FileInputStream;
  import java.util.Properties;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.firefox.FirefoxDriver;

	public class base {
	
	public Properties prop;
	public WebDriver driver;
	
	public void intilize() {
		
	if(prop==null) {
		
	
	prop=new Properties();
	
	File file=new File("project.properties");
	
	try {
	
	FileInputStream fis=new FileInputStream(file);
	
	prop.load(fis);

	}catch(Exception e) {

		e.printStackTrace();
		

	}

	}
	}
	
	public void openingBrowser() {
		
	if(prop.getProperty("browserType").equalsIgnoreCase("chrome")) {
		
       // System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	    
       // driver=new ChromeDriver();
		
	} else if(prop.getProperty("broswerType").equalsIgnoreCase("firefox")){
	
	System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
	
	driver=new FirefoxDriver();
		
	}
		
	driver.manage().window().maximize();

	}
	
	
	}
	
