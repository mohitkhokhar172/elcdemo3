package seleniumJenkins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElcDemoClass {
	
	public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/home/edureka/Downloads/chromedriver-linux64/chromedriver");

        // Initialize ChromeDriver
        
        
        // Open Facebook
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration (necessary for headless mode)
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");

        // Wait for a few seconds
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("successfull");
        // Close the browser
        driver.quit();
    }
}
