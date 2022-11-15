import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_Project2 {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
       //Set firefox driver
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //Get title of the page
        System.out.println("Ttile of the page is : "+driver.getTitle());
        //Get current url
        System.out.println("Current url is : "+"\n"+driver.getCurrentUrl());
        // Get pagesource
        System.out.println("Page source is : "+driver.getPageSource());
        //Enter the username in username field
        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys(" Admin@gmail.com");
        //Enter password into password field
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys(" admin123");
        driver.close();
    }

}
