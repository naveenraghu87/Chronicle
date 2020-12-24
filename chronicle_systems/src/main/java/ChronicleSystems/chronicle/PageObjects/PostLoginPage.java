package ChronicleSystems.chronicle.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostLoginPage extends PageObject {
	
	public PostLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	private WebElement Username;
	
	public WebElement getUsername() {
		return Username;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='Login']")
	private WebElement Login;
	
	public WebElement getLogin() {
		return Login ;
	}
	
	
}
