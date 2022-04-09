package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String excelFilePath;

	@BeforeMethod
	public void BeforeMethods() throws IOException
	{
		// This class help me to read properties file
				Properties prop = new Properties();
				// Creating a new fileinputstream to make the given file as a readable comp
				FileInputStream file = new 
						FileInputStream(new File("src/main/resources/AppConfig.properties"));
				// Load the property Inputstream file
				prop.load(file);
				// To get the data out of properties file using the key
				String url = prop.getProperty("appURL");
				System.out.println(url);
				String browserName = prop.getProperty("browser");
				System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@DataProvider (name ="TC001")
	public String[][] testdata() throws IOException {
		
		String[][] data= ReadExcel.getData(excelFilePath);
				
		return data;
	}
		
	@DataProvider (name ="TC002")
	public String[][] testdataEdit() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}
	
	@DataProvider (name ="TC003")
	public String[][] testdataDuplicate() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}
	
	@DataProvider (name ="TC004")
	public String[][] testdataMerge() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}	
	
	@DataProvider (name ="TC005")
	public String[][] testdataDelete() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}	
	
	  @AfterMethod
	  public void AfterMethods() 
	  { 
		  driver.close(); 
		  }
	 
	
	
}