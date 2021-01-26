package CBPack.util;

import org.openqa.selenium.MutableCapabilities;

public class MutableUtilities {

    public static MutableCapabilities mutableUtility(){

        MutableCapabilities mc = new MutableCapabilities();

        mc.setCapability("name","CucumberEcommerceTest");

        mc.setCapability("build","Java-W3C-Examples");

        mc.setCapability("seleniumVersion","3.141.59");

        mc.setCapability("username","your userName");

        mc.setCapability("accessKey","access key");

        mc.setCapability("tags", "w3c-chrome-tests");

        return mc;
    }
}
