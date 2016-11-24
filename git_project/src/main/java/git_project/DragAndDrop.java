package git_project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

class Objects {
	
	public static WebElement first(WebDriver driver) {
		WebElement element = driver.findElement(By.id("draggable"));		
		return element;
	}
	
	public static WebElement second(WebDriver driver) {
		WebElement element = driver.findElement(By.id("droppable"));		
		return element;
	}
}

public class DragAndDrop {
	
  WebDriver driver = new FirefoxDriver();
  String baseUrl = "http://jqueryui.com/resources/demos/droppable/default.html";
  

  @Test
  public void drag_the_square() {
	  driver.get(baseUrl);
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  Actions builder = new Actions(driver);
	  Action dragAndDrop = builder.dragAndDrop(Objects.first(driver),  Objects.second(driver)).build();
	  dragAndDrop.perform();
	  
  }
}
