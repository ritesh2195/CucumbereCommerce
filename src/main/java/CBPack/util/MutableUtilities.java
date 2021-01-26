package CBPack.util;

import org.openqa.selenium.MutableCapabilities;

public class MutableUtilities {

    public static MutableCapabilities mutableUtility(){

        MutableCapabilities mc = new MutableCapabilities();

        mc.setCapability("name","CucumberEcommerceTest");

        mc.setCapability("build","Java-W3C-Examples");

        mc.setCapability("seleniumVersion","3.141.59");

        mc.setCapability("username","rrm21995");

        mc.setCapability("accessKey","bc904297891e4100b26e9210e35bba31");

        mc.setCapability("tags", "w3c-chrome-tests");

        return mc;
    }
}
