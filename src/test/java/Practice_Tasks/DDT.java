package Practice_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
    @Test(dataProvider="testData")
    public void TestChrome(String uname,String email)
    {
        String URl = "https://demoqa.com/text-box/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URl);
        final By username = By.id("userName");
        final By Email = By.id("userEmail");
        final  By submit = By.id("submit");


        WebElement user= driver.findElement(username);
        user.clear();
        user.sendKeys(uname);
        WebElement userPassword = driver.findElement(Email);
        userPassword.clear();
        userPassword.sendKeys(email);
        WebElement SubmitButton = driver.findElement(submit);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", SubmitButton);
        SubmitButton.click();


        driver.quit();
    }

    @DataProvider(name="testData")
    public Object[][] TestDataFeed(){

        // Create object array with 2 rows and 2 column- first parameter is row and second is //column
        Object [][] data=new Object[2][2];

        // Enter data to row 0 column 0
        data[0][0]="user1";
        // Enter data to row 0 column 1
        data[0][1]="User1@gmail.com";
        // Enter data to row 1 column 0
        data[1][0]="User2";
        // Enter data to row 1 column 0
        data[1][1]="User2@gmail.com";

        // return arrayobject to testScript
        return data;
    }
}
