package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/'");
		d.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		d.findElement(By.name("firstname")).sendKeys("Revanth");
		d.findElement(By.name("lastname")).sendKeys("B");
		d.findElement(By.name("reg_email__")).sendKeys("651498148");
		d.findElement(By.name("reg_passwd__")).sendKeys("jeeva046");
		WebElement dropDown = d.findElement(By.id("day"));
		Select selectDropDown = new  Select(dropDown);
		selectDropDown.selectByValue("7");
		WebElement dropDown1 = d.findElement(By.id("month"));
		Select selectDropDown1 = new  Select(dropDown1);
		selectDropDown1.selectByValue("2");
		WebElement dropDown2 = d.findElement(By.id("year"));
		Select selectDropDown2 =new Select(dropDown2);
		selectDropDown2.selectByVisibleText("1999");
        WebElement radio = d.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]"));radio.click();
		
		//d.close();
		
		
		
		
		

	}

}
