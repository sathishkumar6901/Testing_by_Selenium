import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class testing{
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sathish\\Downloads\\chromedriver_win32\\chromedriver.exe");
                ChromeDriver driver=new ChromeDriver();
		String url="https://www.thesparksfoundationsingapore.org/";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("GRIP (Internship)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Name")).sendKeys("sathishkumar");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("sathishkris002@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Brand Ambassador")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Expert Mentor")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Events Volunteer")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Management Volunteer")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
		System.out.println("The test script has checked 5 pages and 10 elements in total.");
                
	}
}