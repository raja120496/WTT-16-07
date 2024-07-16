package base;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;



import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import org.openqa.selenium.OutputType;

import java.awt.*;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

import util.SpecializedScreenRecorder;

public class Commonmethods {
	public WebDriver driver;
	public WebDriverWait wait;


	public ScreenRecorder screenRecorder;
	public static ResourceBundle resource;

	public static String properties_file="null";


	public static String setpropertiesname(String properties_file1) {
		return properties_file=properties_file1;
	}

	public static String getvaluefrompropertiesfile(String value) {
		resource=ResourceBundle.getBundle(properties_file);
		return resource.getObject(value).toString();
	}


	// Constructor
	public Commonmethods(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// Click Method
	public void click(By elementLocation) {
		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		driver.findElement(elementLocation).click();
	}

	public void doubleClick(By elementLocation) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(elementLocation);
		action.doubleClick(element).perform();

	}

	public void doubleClick(WebElement Webelement) {

		wait.until(ExpectedConditions.elementToBeClickable(Webelement));
		Actions action = new Actions(driver);
		//WebElement element = driver.findElement(elementLocation);
		action.doubleClick(Webelement).perform();

	}
	public void click(WebElement webElement) {

		//		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();

	}

	public void clickWithoutSpinner(WebElement webElement) {

		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();
	}

	public void clickAlertAccept() {
		driver.switchTo().alert().accept();
	}

	public void clickAlertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// Write Text
	public void writeText(By elementLocation, String text) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		driver.findElement(elementLocation).sendKeys(text);
	}

	public void writeText(WebElement webElement, String text) {

		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.sendKeys(text);
	}

	public void sendKeys(By elementLocation, String text) {

		driver.findElement(elementLocation).sendKeys(text);
	}

	public void sendKeys(By elementLocation, Keys text) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		driver.findElement(elementLocation).sendKeys(text);
	}

	public void sendEnter(By elementLocation) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		driver.findElement(elementLocation).sendKeys(Keys.ENTER);
	}

	public List<WebElement> findElements(By elementLocation) {

		return driver.findElements(elementLocation);
	}

	// Clear Text
	public void clearText(By elementLocation) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		driver.findElement(elementLocation).clear();
		driver.findElement(elementLocation).sendKeys(Keys.BACK_SPACE);
	}

	public void clearText(WebElement webElement) {

		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.clear();
	}

	public void selectFromDropdown(By elementLocation, int index) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		Select dropDown = getDropdown(elementLocation);
		dropDown.selectByIndex(index);

	}

	public void selectFromDropdown(By elementLocation, String text) {

		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
		Select dropDown = getDropdown(elementLocation);
		dropDown.selectByVisibleText(text);

	}

	// better selectize, uses values instead of text, needed for currencies
	public void singleSelectize(String inputId, String inputText) throws InterruptedException {
		WebElement inputElement = (WebElement) ((JavascriptExecutor) driver).executeScript("return $(\"#" + inputId
				+ "\").next(\".selectize-control\")" + ".find(\".selectize-input > input[type=\\\"text\\\"]\")[0];");

		click(inputElement); // this click has the wait and click built into it

		inputElement.sendKeys(Keys.BACK_SPACE);
		writeText(inputElement, inputText);
		Thread.sleep(3000);

		// update this to use text inputs and then clicking on the right thing
		// it's best to test the page a user actually would interact with the page
		WebElement element = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return $(\"#" + inputId + "\").next(\".selectize-control\")."
						+ "find(\".selectize-dropdown > .selectize-dropdown-content > div\")[0];");
		// this clicks the first one in the list that matches whatever text is entered
		click(element);
	}

	public WebElement hoverOver(By elementLocation) {

		Actions action = new Actions(driver);
		WebElement elementToHover = driver.findElement(elementLocation);
		action.moveToElement(elementToHover).perform();

		return elementToHover;
	}

	public WebElement hoverOver(WebElement elm) {

		Actions action = new Actions(driver);
		WebElement elementToHover = elm;
		action.moveToElement(elementToHover).perform();

		return elementToHover;
	}

	public void dragAndDrop(By elementLocationFrom, By elementLocationTo) {
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(elementLocationFrom), driver.findElement(elementLocationTo)).build()
		.perform();
	}

	public void dragAndDrop(WebElement from, WebElement to) {
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	}

	public void dragAndDropByPixel(WebElement from, WebElement to, int speed) {
		Actions act = new Actions(driver);
		int xFromCenter = from.getLocation().x + from.getSize().width / 2;
		int yFromCenter = from.getLocation().y + from.getSize().height / 2;
		int xToCenter = to.getLocation().x + to.getSize().width / 2;
		int yToCenter = to.getLocation().y + to.getSize().height / 2;
		int xOffset = xToCenter - xFromCenter;
		int yOffset = yToCenter - yFromCenter;
		int xSign = 1;
		int ySign = 1;
		if (xOffset < 0) {
			xSign = -1;
		}
		if (yOffset < 0) {
			ySign = -1;
		}
		act.clickAndHold(from);
		for (int i = 0; i < Math.abs(xOffset) / speed; i++) {
			act.moveByOffset(speed * xSign, 0);
		}
		for (int i = 0; i < Math.abs(yOffset) / speed; i++) {
			act.moveByOffset(0, speed * ySign);
		}
		act.release();
		act.build().perform();
	}

	public void dragAndDropByPixel(By fromLocation, By toLocation) {
		dragAndDropByPixel(driver.findElement(fromLocation), driver.findElement(toLocation), 10);
	}

	public void dragAndDropByPixel(By fromLocation, By toLocation, int speed) {
		dragAndDropByPixel(driver.findElement(fromLocation), driver.findElement(toLocation), speed);
	}

	public void dragAndDropByPixel(WebElement from, WebElement to) {
		dragAndDropByPixel(from, to, 10);
	}

	public void selectFromDropdown(WebElement webElement, String text) {

		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		Select dropDown = getDropdown(webElement);
		dropDown.selectByVisibleText(text);
	}

	public void selectFromDropdown(WebElement webElement, int index) {
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		Select dropDown = getDropdown(webElement);
		dropDown.selectByIndex(index);
	}

	public void searchDropdownTextBox(String id, String searchTerm) {
		click(By.id(id));
		writeText(By.id(id), searchTerm);

		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("mat-option-text"), 0));
		wait.until(ExpectedConditions.attributeContains(findElements(By.className("mat-option-text")).get(0),
				"textContent", searchTerm));
		click(findElements(By.className("mat-option-text")).get(0));

	}

	public void searchDropdown(By elementLocation, String elementName, By dropdownElementClass) {
		click(elementLocation);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(dropdownElementClass, 0));
		boolean searchSuccess = false;
		for (WebElement elm : findElements(dropdownElementClass)) {
			if (smartReadText(elm).equals(elementName)) {
				click(elm);
				searchSuccess = true;
				break;
			}
		}
		Assert.assertTrue(searchSuccess);
	}

	public void searchDropdownByFilter(By elementLocation, String elementName, By dropdownElementClass,
			By filterLocation) {
		click(elementLocation);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(dropdownElementClass, 0));
		writeText(filterLocation, elementName);
		sendKeys(filterLocation, Keys.ENTER);
		String readText = readText(elementLocation);
		Assert.assertTrue(elementName.equals(readText));
	}

	public void searchDropdown(WebElement element, String elementName, By dropdownElementClass) {
		click(element);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(dropdownElementClass, 0));
		boolean searchSuccess = false;
		for (WebElement elm : findElements(dropdownElementClass)) {
			if (smartReadText(elm).equals(elementName)) {
				click(elm);
				searchSuccess = true;
				break;
			}
		}
		Assert.assertTrue(searchSuccess);
	}

	public int getDropdownSize(By elementLocation) {
		return getDropdownValues(elementLocation).size();
	}

	public ArrayList<WebElement> getDropdownValues(By elementLocation) {
		Select dropdown = new Select(driver.findElement(elementLocation));
		return (ArrayList<WebElement>) dropdown.getOptions();
	}

	// Read Text
	public String readText(By elementLocation) {
		WebElement element = driver.findElement(elementLocation);
		String elmText = null;
		elmText = element.getText();
		if (elmText.length() == 0) {
			elmText = getElementValue(element);
			if (elmText == null) {
				elmText = getElementAttribute(element, "textContent");
			}
		}
		return elmText;
	}

	public String smartReadText(By elementLocation) {
		return readText(elementLocation);
	}

	public String readText(WebElement element) {
		String elmText = element.getText();
		if (elmText.length() == 0) {
			elmText = getElementValue(element);
			if (elmText == null) {
				elmText = getElementAttribute(element, "textContent");
			}
		}
		return elmText;
	}

	public String smartReadText(WebElement element) {
		return readText(element);
	}

	public boolean elementExists(By elementLocation) {
		return !driver.findElements(elementLocation).isEmpty();
	}

	public boolean elementExists(WebElement elm) {
		try {
			elm.getLocation();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean elementDisplayed(By elementLocation) {
		WebElement displayed = driver.findElement(elementLocation);
		return displayed.isDisplayed();
	}

	public boolean elementEnabled(By elementLocation) {
		WebElement enabled = driver.findElement(elementLocation);
		return enabled.isEnabled();
	}

	public boolean elementClickable(By elementLocation) {
		// Is element on page?
		if (findElements(elementLocation).isEmpty())
			return false;

		// Is Element Visible and enabled
		boolean clickable = false;
		for (WebElement elem : findElements(elementLocation)) {
			if (elem.isDisplayed() && elem.isEnabled() && !ariaDisabled(elem)) {
				clickable = true;
			}
		}
		return clickable;
	}

	public boolean elementChecked(By elementLocation) {
		// Is element on page?
		if (findElements(elementLocation).isEmpty())
			return false;

		// Is Element Visible and checked
		boolean checked = false;
		for (WebElement elem : findElements(elementLocation)) {
			if (elem.isDisplayed() && ariaChecked(elem)) {
				checked = true;
			}
		}
		return checked;
	}

	public void waitForElementToBeClickable(By elementLocation) {
		wait.until(ExpectedConditions.elementToBeClickable(elementLocation));
	}

	public boolean ariaDisabled(WebElement elem) {
		if (elem.getAttribute("aria-disabled") == null) {
			return false;
		}
		if (elem.getAttribute("aria-disabled").equals("true")) {
			return true;
		}
		return true;
	}

	public boolean ariaChecked(WebElement elem) {

		if (elem.getAttribute("aria-checked").equals("false")) {
			return false;
		}
		if (elem.getAttribute("aria-checked").equals("true")) {
			return true;
		}
		return true;
	}

	public boolean ariaSelected(WebElement elem) {
		if (elem.getAttribute("aria-selected").equals("true")) {
			return true;
		}
		return false;
	}

	public String getElementValue(By elementLocation) {
		return driver.findElement(elementLocation).getAttribute("value");
	}

	public String getElementValue(WebElement element) {
		return element.getAttribute("value");
	}

	public String getElementAttribute(By elementLocation, String attribute) {
		return driver.findElement(elementLocation).getAttribute(attribute);
	}

	public String getElementAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	// Wait for attribute to not be empty
	public void waitForAttribute(By elementLocation, String attribute) {
		wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(elementLocation), attribute));
	}

	// Wait for attribute to be a given value
	public void waitForAttribute(By elementLocation, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(elementLocation, attribute, value));
	}

	public WebElement lookForElementWithClassByProperty(String className, String attribute, String expected) {
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className(className), 0));
		for (WebElement elm : findElements(By.className(className))) {
			if (elm.getAttribute(attribute).equalsIgnoreCase(expected)) {
				return elm;
			} else {
			}
		}
		Assert.assertTrue(expected + " not found", false);
		return null;
	}

	public String textInDisabledTextbox(String id) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		return jse.executeScript("return document.getElementById('" + id + "').value").toString();
	}

	public Select getDropdown(By elementLocation) {
		return new Select(driver.findElement(elementLocation));
	}

	public Select getDropdown(WebElement webElement) {
		return new Select(webElement);
	}

	public String getDropdownText(By elementLocation) {
		return getDropdown(elementLocation).getFirstSelectedOption().getText();
	}

	public String getDropdownText(WebElement webElement) {
		return getDropdown(webElement).getFirstSelectedOption().getText();
	}

	// downloads file based on inputed url and saves it to the the inputed location
	// targetFileLocation should be in the form "C:/path/to/file.ext"
	public void downloadFileFromURL(String downloadURL, String targetFileLocation) throws IOException {

		// Create folder for download if doesn't already exist
		String pattern = "(.*)[\\\\\\/]";// returns everything up to the last slash (forward or backward)
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(targetFileLocation);
		String targetFileRepository;
		if (m.find()) {
			targetFileRepository = m.group(1);
		} else { // If targetFileLocation is not in form C:/path/to/file.ext, defaulting to C:/QA
			// Scripts/PROJECTDIRECTORY/downloads
			targetFileRepository = System.getProperty("user.dir") + "\\downloads";
			System.out.println("File path " + targetFileLocation + " could not be parsed. Default of "
					+ targetFileRepository + " will be used");
		}
		createFolderStructure(targetFileRepository);

		// download to created folder
		URL fullReportURL = new URL(downloadURL);
		File fileToDownload = new File(targetFileLocation);
		FileUtils.copyURLToFile(fullReportURL, fileToDownload);
		waitForDownloadToComplete(targetFileRepository);
	}

	// This method creates a folder if it doesn't already exist
	public void createFolderStructure(String folderName) {
		String folderPath = folderName;
		File theDir = new File(folderPath);
		String newDirectoryName;
		if (theDir.exists()) {
			newDirectoryName = theDir.getName();
			System.out.println("Directory already exists: " + newDirectoryName);
			;
		} else {
			theDir.mkdirs();
			newDirectoryName = theDir.getName();
			System.out.println("New Directory: " + newDirectoryName);
		}
	}

	// Waits for a download to complete by polling a file location once a second
	// Wait ends when the size of the file location does not change during that time
	public void waitForDownloadToComplete(String targetFileRepository) {
		File downloadsFolder = new File(targetFileRepository);
		long fileSize = folderSize(downloadsFolder);
		long tempSize = -1;
		while (fileSize != tempSize) {
			tempSize = fileSize;
			sleep(1000);// wait a second between download checks
			fileSize = folderSize(downloadsFolder);
		}
	}

	// Recursively calculates file size of a directory in bytes
	private long folderSize(File directory) {
		long length = 0;
		if (directory.listFiles() != null) {
			for (File file : directory.listFiles()) {
				if (file.isFile())
					length += file.length();
				else
					length += folderSize(file);
			}
		}
		return length;
	}

	public void browserNavigateBack() {
		driver.navigate().back();
	}

	public void browserNavigateForward() {
		driver.navigate().forward();
	}

	public void browserNavigateRefresh() {
		driver.navigate().refresh();
	}

	public String getBrowser() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		return cap.getBrowserName();
	}

	// Returns the url as an array split on the slash
	public String[] splitUrl(String url) {
		return url.split("/");
	}

	// default split URL to splitting the current URL
	public String[] splitUrl() {
		return splitUrl(driver.getCurrentUrl());
	}

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterDataByType(String id, String type, String text) throws InterruptedException {

		if (type.contains("button")) {
			click(By.id(text));
		} else {
			writeText(By.id(id), text);
			if (type.contains("drop")) {
				sendEnter(By.id(id));
			}
		}
	}

	public void scrollToView(By elementLocation) {
		WebElement element = driver.findElement(elementLocation);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollToView(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void clickElement(By element) {
		// accepts By type element to perform the click action. Use when a div is
		// obscuring a standard click.
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		WebElement id = driver.findElement(element);
		Actions act = new Actions(driver);
		act.moveToElement(id).click().perform();
	}

	public void clickElement(WebElement element) {
		// accepts WebElement type element to perform the click action. Use when a div
		// is obscuring a standard click.
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

	public void closeAllTabsExceptCurrent() {
		// Close all the other tabs except the Current Tab in Browser
		String originalHandle = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				driver.close();
			}
		}
		driver.switchTo().window(originalHandle);
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void navigateToURL(String url) {
		driver.navigate().to(url);
	}

	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}

	public void deleteExistingFile(String downloadPath, String fileName) {
		// This method will delete the file (if found) at the given path
		// Note: fileName contains file type also, example: abc.csv
		// : downloadPath is the absolute path along with '/' at the end
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				// Delete file, if found
				dirContents[i].delete();
			}
		}
	}

	public void deleteExistingDirectory(String dirPath) throws IOException {
		FileUtils.deleteDirectory(new File(dirPath));
	}

	public void checkFileExists(String downloadPath, String fileName) {
		// This method will validate that file exists at the given path
		// Note: fileName contains file type also, example: abc.csv
		// : downloadPath is the absolute path along with '/' at the end
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		boolean flag = false;
		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				System.out.println("File found: " + fileName);
				flag = true;
				break;
			}
		}
		Assert.assertTrue("File Not Found", flag);
	}

	public void checkNewDashboard(Boolean wantChecked) {
		// use when logging into Access Point to check or uncheck the New Dashboard
		// checkbox.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newDash")));
		WebElement newDash = driver.findElement(By.id("newDash"));
		if (newDash.isSelected()) {
			if (!wantChecked) {
				newDash.click();
			}
		} else if (wantChecked) {
			newDash.click();
		}
	}

	public void waitForPageToLoad() {
		ExpectedCondition<Boolean> pageLoad = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};

		try {
			wait.until(pageLoad);
		} catch (Throwable pageLoadWaitError) {

		}
	}

	public void switchToFrame(String frameName) {
		switchToDefaut();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}

	public void switchToDefaut() {
		driver.switchTo().defaultContent();
	}

	public void clickOnTabElement(String xpathLocaton) {
		// Switch to tab
		String originalHandle = driver.getWindowHandle();
		System.out.println(originalHandle+"originalHandle");
		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(originalHandle)) {
				driver.switchTo().window(handle);
				click(By.xpath(xpathLocaton));
			}
		}
		driver.switchTo().window(originalHandle);
	}

	public String exeScript(String script) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;		
		String psudoCssValue =jse.executeScript(script).toString();
		return psudoCssValue;
	}	

	public void takescreenshoot() throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy"); 
		LocalDateTime now = LocalDateTime.now();  
		File f1 = new File(CommonPaths.Screenshot_path+dtf.format(now).toString()); 
		if (!f1.exists()){
			f1.mkdirs();
		}

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		LocalDateTime now1 = LocalDateTime.now();  
		File DestFile=new File(CommonPaths.Screenshot_path+dtf.format(now).toString()+"/"+dtf1.format(now1).toString()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void takescreenshoot(String screenshotname) throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy"); 
		LocalDateTime now = LocalDateTime.now();  
		File f1 = new File(CommonPaths.Screenshot_path+dtf.format(now).toString()); 
		if (!f1.exists()){
			f1.mkdirs();
		}

		// DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		// LocalDateTime now1 = LocalDateTime.now();  
		File DestFile=new File(CommonPaths.Screenshot_path+dtf.format(now).toString()+"/"+screenshotname.toString()+".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}


	public void Sendkey(WebElement  objName,String key) throws Exception {

		wait.until(ExpectedConditions.visibilityOf(objName));

		objName.sendKeys(key);

	}

	/*
	public void wait_timeunit(int waittime,String TU) throws InterruptedException {
		TimeUnit time = null;
		switch(TU) {
		case "SECONDS":
			time=time.SECONDS;
			time.sleep(waittime);
			break;
		case "MINUTES":
			time=time.MINUTES;
			time.sleep(waittime);
			break;

		case "MILLISECONDS":
			time=time.MILLISECONDS;
			time.sleep(waittime);
			break;
		case "NANOSECONDS":
			time=time.NANOSECONDS;
			time.sleep(waittime);
			break;	
		default:
			time=time.SECONDS;
			time.sleep(waittime);
			break;

		}
	}
	 */
	public void wait(int waittime) throws InterruptedException {
		TimeUnit time=TimeUnit.SECONDS;
		time.sleep(waittime);

	}


	public  void startRecording() throws Exception
	{
		File srcfile = new File(CommonPaths.Video_recording_path);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;

		Rectangle captureSize = new Rectangle(0,0, width, height);

		GraphicsConfiguration gc = GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice()
				.getDefaultConfiguration();

		this.screenRecorder = new SpecializedScreenRecorder(gc, captureSize,
				new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
						DepthKey, 24, FrameRateKey, Rational.valueOf(15),
						QualityKey, 1.0f,
						KeyFrameIntervalKey, 15 * 60),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
						FrameRateKey, Rational.valueOf(30)),
				null, srcfile, "MyVideo");
		this.screenRecorder.start();

		//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy"); 
		//	   LocalDateTime now = LocalDateTime.now();  
		//	      File f1 = new File(CommonPaths.Screenshot_path+dtf.format(now).toString()); 
		//	      if (!f1.exists()){
		//	    	  f1.mkdirs();
		//	    	}
		//	      
		//	      DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");  
		//	      LocalDateTime now1 = LocalDateTime.now();  
		//	File DestFile=new File(CommonPaths.Screenshot_path+dtf.format(now).toString()+"/"+dtf1.format(now1).toString()+".png");
		//	FileUtils.copyFile(srcfile, DestFile);

	}

	public void scrolldown(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void stopRecording() throws Exception
	{
		this.screenRecorder.stop();
	}

	public void jclick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}


	public void checkelementvisibility(WebElement element) {
		try
		{
			if(element.isDisplayed()==true) {

			}
			else {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			}
		}
		catch(NoSuchElementException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		}
		catch(Exception e) {

			System.out.println(e.getMessage());
		}
	}

	//	public static void main(String[] args) {
	//		ResourceBundle resource = ResourceBundle.getBundle("config");
	//		
	//		//resource.getStringArray("url");
	//		System.out.println(resource.getObject("username"));
	//	}
}
