package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uibank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d =new EdgeDriver();
		d.get("https://uibank.uipath.com/register-account");
		d.manage().window().maximize();
		d.findElement(By.id("firstName")).sendKeys("Jeeva");
		WebElement title = d.findElement(By.id("title"));
        Select selectTitle = new Select(title);
        selectTitle.selectByValue("mr");

        
        d.findElement(By.id("middleName")).sendKeys("Marval");
        
        d.findElement(By.id("lastName")).sendKeys("M");

        
        WebElement gender = d.findElement(By.name("gender"));
        Select selectGender = new Select(gender);
        selectGender.selectByValue("male");

        
        WebElement employmentStatus = d.findElement(By.name("employmentStatus"));
        Select selectEmploymentStatus = new Select(employmentStatus);
        selectEmploymentStatus.selectByVisibleText("Unemployed");

        //Username
        d.findElement(By.name("username")).sendKeys("JEEVA46");
        //Email
        d.findElement(By.name("email")).sendKeys("jeeva1234@gmail.com");
        //Password
        d.findElement(By.id("password")).sendKeys("934419518");
		
	
		

	}

}
