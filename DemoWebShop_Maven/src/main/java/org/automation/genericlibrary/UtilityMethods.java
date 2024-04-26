package org.automation.genericlibrary;

import java.io.File;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class UtilityMethods implements FrameWorkConstant {
	
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(4000);
	}
	
	public void getscreenShot(WebDriver driver,String name) 
	{
		String path=screenShot_Path+name+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(path);
		try {
			FileHandler.copy(src1,trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public void acceptAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }
	 
	 
	 //dismiss //getText---.string
	public void selectOptionByIndex(WebElement dropDown,int indexnum)
	{
		Select s=new Select(dropDown);
		s.selectByIndex(0);
	}
	
	//value //visible text
	public void actionsScrollForCertainPixels(WebDriver driver,int x,int y)
	{
		Actions act=new Actions(driver);
		act.scrollByAmount(x, y).perform();
	}
	
	
	public void jsScrollTillElement(WebDriver driver,boolean value,WebElement target)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView("+value+")", target);
				
	}
}
