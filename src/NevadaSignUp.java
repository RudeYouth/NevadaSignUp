import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevadaSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver", "/Users/RudeYouth 1/Desktop/Drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	
			driver.get("https://sspr.dwss.nv.gov/sspr/public/newuser?forwardURL=https%3A%2F%2Fcportal.dwss.nv.gov%2Fcportal");
			driver.findElement(By.xpath("/html//input[@id='cn']")).sendKeys("Test1");
			driver.findElement(By.xpath("/html//input[@id='givenName']")).sendKeys("Tester");
			driver.findElement(By.xpath("/html//input[@id='sn']")).sendKeys("Jones");
			driver.findElement(By.xpath("/html//input[@id='mail']")).sendKeys("testjones@gmail.com");
			driver.findElement(By.xpath("/html//select[@id='preferredLanguage']")).click();
			driver.findElement(By.xpath("//select[@id='preferredLanguage']/option[@value='en']")).click(); 
			driver.findElement(By.xpath("/html//input[@id='DOBText']")).sendKeys("05/05/1990");
			driver.findElement(By.xpath("/html//input[@id='postalCode']")).sendKeys("77001");
			driver.findElement(By.xpath("/html//form[@id='newUserForm']/table[@class='noborder nomargin nopadding']//input[@name='password1']")).sendKeys("Testertest1@");
			driver.findElement(By.xpath("/html//form[@id='newUserForm']/table[@class='noborder nomargin nopadding']//input[@name='password2']")).sendKeys("Testertest1@");
			
			
			
			
			driver.findElement(By.id("submitBtn")).click();
			
			Thread.sleep(5000);
			
			driver.quit();
			
			
	}
	

}
