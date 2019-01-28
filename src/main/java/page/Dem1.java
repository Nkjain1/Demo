package page;

import org.testng.annotations.Test;

public class Dem1{
	//@BeforeTest
//	public void launchChrome() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Nk02\\driver\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://www.google.com");
//	}

		@Test
		public void sams()
		{
			System.out.println("Executing new12345");
			//test

		}
		
		public static void main(String[] args) {
			Dem1 d=new Dem1();
			d.sams();
		
	}
//	
	
//	public class MessageUtil {
//
//		   private String message;
//
//		   //Constructor
//		   //@param message to be printed
//		   public MessageUtil(String message) {
//		      this.message = message;
//		   }
//		      
//		   // prints the message
//		   public String printMessage() {
//		      System.out.println(message);
//		      return message;
//		   }   
//		} 
//	
//	public class SampleTest {
//		
//		   String message = "Hello World";
//		   MessageUtil messageUtil = new MessageUtil(message);
//
//		   @Test
//		   public void testPrintMessage() {
//		      Assert.assertEquals(message, messageUtil.printMessage());
//		   }
//		}
}
