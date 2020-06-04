package Master;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSikuli2 {
        public static void main(String[] args) throws   InterruptedException, IOException    {

          //  WebDriverManager.chromedriver().setup();
            WebDriverManager.firefoxdriver().setup();
			
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.download.dir", "C:\\Temp");  // folder
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "video/.docs");  // MIME type
            profile.setPreference("pdfjs.disabled", true);  // disable the built-in viewer
            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.panel.shown", false);

            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
            capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);

            WebDriver driver = new FirefoxDriver(capabilities);
		 	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 	//WebDriver driver= new FirefoxDriver(capabilities);
		 	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    
			driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/bootstrap/index.html#");
			
			Thread.sleep(15000);
			driver.findElement(By.xpath("//button[contains(@id, 'downloadProjectDataButton')]")).click();
			Thread.sleep(15000);

			Alert alert = driver.switchTo().alert();
			alert.accept();
    				    				
        }

}