import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser_Project2 {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //set the url
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //Print the title
        System.out.println("The title of the web page is : " + driver.getTitle());
        //print current url
        System.out.println("The current url is : "+driver.getCurrentUrl());
        //print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //Enter email into email field
        WebElement userName= driver.findElement(By.name("username"));
                userName.sendKeys("Admin@gmail.com");
        //Enter password into password field
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        driver.close();

    }
}
