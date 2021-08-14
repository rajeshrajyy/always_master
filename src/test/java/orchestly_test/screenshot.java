package orchestly_test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orchestly.wrapper_class;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshot extends wrapper_class {
	
	
	@BeforeTest
	
	public void open()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/test-cases/");
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void take_sc()
	{
		
		Screenshot sc=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		
		try {
			ImageIO.write(sc.getImage(), "PNG", new File(System.getProperty("user.dir")+"//test-output//screenshot//newshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
	}

}
