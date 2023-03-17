package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver d =new EdgeDriver();
		d.get("https://www.tamilmatrimony.in/");
		d.manage().window().maximize();
		WebElement registered_by = d.findElement(By.name("REGISTERED_BY"));
        Select selectRegisteredBy = new Select(registered_by);
        selectRegisteredBy.selectByValue("1");
		d.findElement(By.id("NAME")).sendKeys("MJ");
		d.findElement(By.xpath("(//input[@class = 'hp-gender'])[1]")).click();
		WebElement religionDropDown = d.findElement(By.id("RELIGION"));
        Select selectReligion = new Select(religionDropDown);
        selectReligion.selectByValue("1");
        WebElement dayDropDown = d.findElement(By.name("DOBDAY"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByValue("7");
        WebElement monthDropDown = d.findElement(By.name("DOBMONTH"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByValue("2");
        WebElement yearDropDown = d.findElement(By.name("DOBYEAR"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("1999");
        WebElement motherTongueDropDown = d.findElement(By.id("MOTHERTONGUE"));
        Select selectMotherTongue = new Select(motherTongueDropDown);
        selectMotherTongue.selectByValue("47");
        WebElement CountryCodeDropDown = d.findElement(By.id("M_COUNTRYCODE"));
        Select selectCountryCode = new Select(CountryCodeDropDown);
        selectCountryCode.selectByValue("98");
        WebElement countryDropDown = d.findElement(By.id("COUNTRY"));
        Select selectCountry = new Select(countryDropDown);
        selectCountry.selectByValue("98");
        d.findElement(By.id("MOBILENO")).sendKeys("987456123");
        d.findElement(By.id("EMAIL")).sendKeys("marval123@gmail.com");
        d.findElement(By.name("PASSWD1")).sendKeys("46468468");
        
        

	}

}
