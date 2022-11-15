import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser_Project2 {

    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        //set url
        driver.get(baseUrl);

        //maximise window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       //driver.manage().timeouts().getPageLoadTimeout();
        //get title
        System.out.println("The title of the page is : "+driver.getTitle());
        //ger current url
        System.out.println("The current url is: "+driver.getCurrentUrl());
        //get page source
        System.out.println("The page source is : "+driver.getPageSource());



        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("Admin@gmail.com");
        //Enter password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
       // driver.close();


    }
}
