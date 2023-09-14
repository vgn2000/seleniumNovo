package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.WebDriverInstance;

public class BasePage {
	

	private String url;
	private Properties prop;

	
	
	public BasePage() throws IOException {
		
		
		
		
		 prop = new Properties();
		 FileInputStream data = new FileInputStream("/Users/Vagner/eclipse/CursoProfissionalAutomSeleniumUDemy/workspace/ChallangeNovo/src/main/java/resources/config3.properties");
		 prop.load(data);
	     prop.load(data);

	}
	
   public WebDriver getDriver() throws IOException {
		
     return WebDriverInstance.getDriver();
   }
	
	public String getUrl() throws IOException {
		
		url = prop.getProperty("url");
		
		return url;
	}
	
    public void takeSnapShot(String name) throws IOException {
		
		File srcFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
	
		File destFile = new File(System.getProperty("user.dir") + "/target/screenshots" + timestamp() + ".png");
		
		
		FileUtils.copyFile(srcFile, destFile);
		
	}
	
	
	public String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss").format(new Date());
		
		
		
	}
	
public static void waitForElementInvisible(WebElement element, int timer) throws IOException {
		
//		WebDriverWait wait = new WebDriverWait(getDriver(), timer);
	//	wait.until(ExpectedConditions.invisibilityOf(element));
		
	}
	
	/** Open page with given URL 
	 * @throws IOException */
	protected void openPageUrl(String page) throws IOException {
		getDriver().get(page);
	}

	/** Open page with given URL */
	protected void openUrl(String url) throws IOException {
		getDriver().get(url);
	}
	

	/** Get title of current page 
	 * @throws IOException */
	public String getCurrentPageTitle() throws IOException {
		return getDriver().getTitle();
	}
	
	/** Find element using given locator 
	 * @throws IOException */
	protected WebElement find(By locator) throws IOException {
		return getDriver().findElement(locator);
	}

	/** Find all elements using given locator 
	 * @throws IOException */
	protected List<WebElement> findAll(By locator) throws IOException {
		return getDriver().findElements(locator);
	}

	/** Click on element with given locator when its visible 
	 * @throws IOException */
	protected void click(By locator) throws IOException {
		waitForVisibilityOf(locator);
		find(locator).click();
	}
	
	/** Click on element with given locator when its Enable 
	 * @throws IOException */
	protected void clickEnable(By locator) throws IOException {
		if (find(locator).isEnabled()) {
			find(locator).click();
		}
	}
	
		/** Click on element with given locator when its Enable 
		 * @throws IOException */
		protected void findAndClick(By locator) throws IOException {
		
				find(locator).click();
		
	}
	
		
		/** Click on element with given locator when its Enable 
		 * @throws IOException */
		protected void clickAble(By locator) throws IOException {
			
			WebElement element = getDriver().findElement(locator);
			
			JavascriptExecutor jse = (JavascriptExecutor)getDriver();

			jse.executeScript("arguments[0].click()", element); 
		
			
			}

	
	
	/** Type given text into element with given locator 
	 * @throws IOException */
	protected void type(String text, By locator) throws IOException {
		waitForVisibilityOf(locator, 5);
		find(locator).sendKeys(text);
	}

	/** Get URL of current page from browser 
	 * @throws IOException */
	  public String getCurrentUrl() throws IOException {
		return getDriver().getCurrentUrl();
	}
	
	/**
	 * Wait for specific ExpectedCondition for the given amount of time in seconds
	 * @throws IOException 
	 */
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) throws IOException {
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(getDriver(), timeOutInSeconds);
		
		wait.until(condition);
	}

	/**
	 * Wait for given number of seconds for element with given locator to be visible
	 * on the page
	 * @throws IOException 
	 */
	protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) throws IOException {
		int attempts = 0;
		while (attempts < 5) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
						(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		
	}
	
	protected void waitToBeClickAble(By locator, Integer... timeOutInSeconds) throws IOException {
		int attempts = 0;
		while (attempts < 7) {
			try {
				waitFor(ExpectedConditions.elementToBeClickable(locator),
						(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		
	}
	
	
		
		/** Switch to alert and press OK 
		 * @throws IOException */
		public void acceptAlert() throws IOException {
		
			getDriver().switchTo().alert().accept(); 
		}

		/** Wait for alert present and then switch to it 
		 * @throws IOException */
		protected Alert switchToAlert() throws IOException {
			WebDriverWait wait = new WebDriverWait(getDriver(), 5);
			wait.until(ExpectedConditions.alertIsPresent());
			return 	getDriver().switchTo().alert();
		}
		public void switchToWindowWithTitle(String expectedTitle) throws IOException {
			// Switching to new window
			String firstWindow = getDriver().getWindowHandle();

			Set<String> allWindows = getDriver().getWindowHandles();
			Iterator<String> windowsIterator = allWindows.iterator();

			while (windowsIterator.hasNext()) {
				String windowHandle = windowsIterator.next().toString();
				if (!windowHandle.equals(firstWindow)) {
					getDriver().switchTo().window(windowHandle);
					if (getCurrentPageTitle().equals(expectedTitle)) {
						break;
					}
				}
			}
		}
	
		/** Switch to iFrame using it's locator 
		 * @throws IOException */
		protected void switchToFrame(By frameLocator) throws IOException {
			getDriver().switchTo().frame(find(frameLocator));
		}

	

}
