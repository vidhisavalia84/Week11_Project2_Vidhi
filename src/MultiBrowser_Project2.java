import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_Project2 {

    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.crome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }else {
            System.out.println("Invalid browser");
        }
        driver.get(baseUrl);

        //maximise window
        driver.manage().window().maximize();
        //use pageload timeout
        driver.manage().timeouts().getPageLoadTimeout();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get url
        System.out.println("The Url of current webpage is : "+driver.getCurrentUrl());
        //Print title of the page
        System.out.println("Title of the page is : "+driver.getTitle());
        //print pagesource
        System.out.println("Page source is : "+driver.getPageSource());
        //Enter username
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("Admin@gmail.com");
        //Enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

driver.close();

    }
}
