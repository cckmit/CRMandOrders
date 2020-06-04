package Master;

import java.io.IOException;
import java.util.Set;
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

public class TestSikuli3 {
        @SuppressWarnings("deprecation")
		public static void main(String[] args) throws   InterruptedException, IOException    {

          //  WebDriverManager.chromedriver().setup();
            WebDriverManager.firefoxdriver().setup();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("browser.download.panel.shown", "False");
			profile.setPreference("browser.helperApps.neverAsk.openFile","text/csv,application/vnd.ms-excel");
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv,application/vnd.ms-excel");
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", "c:\\firefox_downloads\\");

			WebDriver driver = new FirefoxDriver(profile);
			driver.get("https://rawgit.com/sdl/Testy/master/src/test/functional/app-demo/bootstrap/index.html#");
			
			Thread.sleep(15000);
			driver.findElement(By.xpath("//button[contains(@id, 'downloadProjectDataButton')]")).click();
			Thread.sleep(15000);
			
			
			
			

			
			
			
    				    				
        }

}