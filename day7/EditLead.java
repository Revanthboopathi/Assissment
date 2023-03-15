package assin.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead{
	
	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		  
	        driver.findElement(By.name("USERNAME")).sendKeys("DemosalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Lead")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("revanth");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("n");
	        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("revanth");
	        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("mechanical");
	        driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
	        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revanthkishanth@gmail.com");

	        WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        Select selectStateDropDown = new Select(stateDropDown);
	        selectStateDropDown.selectByVisibleText("New Mexico");
	        
	        
	     
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Study");
        driver.findElement(By.className("smallSubmit")).click();

        String expectedResult = "View Lead | opentaps CRM";
        String actualResult = driver.getTitle();
        if (actualResult.equals(expectedResult)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}