package PageFunctions;

import org.openqa.selenium.WebDriver;

import objectrepository.InboxOR;

public class InboxFunctions extends InboxOR {
	WebDriver driver=null;

	public InboxFunctions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		/*if(!driver.getCurrentUrl().equalsIgnoreCase("https://mail.google.com/mail/u/0/#inbox")) {
			throw new SkipException("this is not dashboard page");
		}*/
	}
 public String validateInboxTitle() throws InterruptedException {
		 
	     Thread.sleep(2000);
	     String urltraced= driver.getCurrentUrl();
	     System.out.println("Url seen -- > "+urltraced);
	     return urltraced;
		 
	 }


}
