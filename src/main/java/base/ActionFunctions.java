package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionFunctions extends Commonmethods {

	public ActionFunctions(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	/*************** Global level variable/Object declaration ***************/

	// Variable declarations.
	public String path = Path(null);
	public XSSFWorkbook wb;
	public String sheetname;
	public Sheet wbs;
	public Cell C;
	public Row R;

	// Object declarations.
	JavascriptExecutor JS = (JavascriptExecutor) driver;

	/*************** Test data Operations ***************/


	public String Path(String filename) {
		if (filename == null) {
			return this.path = getFilepath(System.getProperty("user.dir") + "/src/main/java/testdata/TestData.xlsx");
		} else {
			return this.path = getFilepath(CommonPaths.Test_data+filename);
		}
	}

	public void getSheet(String SN) throws IOException {
		FileInputStream fi = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fi);
		wbs = wb.getSheet(SN);
		this.sheetname = SN;
		fi.close();
	}

	public String getcelldata(int RNO, int CNO) {
		R = wbs.getRow(RNO);
		C = wbs.getRow(RNO).getCell(CNO);
		DataFormatter DF = new DataFormatter();
		return DF.formatCellValue(C).toString();
	}

	public void setcelldata1(String Sheet_name, int C_NO, String Data) throws Exception {
		int i, RNO;
		FileInputStream fs = new FileInputStream(this.path);
		wb = new XSSFWorkbook(fs);
		wbs = wb.getSheet(Sheet_name);
		RNO = wbs.getLastRowNum();
		for (i = 0; i <= RNO; i++) {
			if (i == RNO) {
				Row row = wbs.getRow(i);
				Cell cell = row.getCell(C_NO);
				cell.setCellValue(Data);
			} else {
				continue;
			}
		}
		FileOutputStream fos = new FileOutputStream(this.path);
		wb.write(fos);
		fos.close();
	}

	//		public void setcelldata2(String data, int CNO, int RNO) {
	//			TestDataReader TDR = new TestDataReader(this.path);
	//			TDR.writeToCell(data, "Test_Data", RNO, CNO);
	//		}

	// To determine column index based on header.
	public int getColumn(String ref_data) throws IOException {
		getSheet(this.sheetname);
		String data = "empty";
		int i = 0;
		do {
			try {
				data = getcelldata(0, i);
			} catch (Exception e) {
				data = "empty";
			}
			if (data != "empty" && data.matches(ref_data)) {
				break;
			} else {
				i++;
				continue;
			}
		} while (data != "empty");
		return i;
	}

	/*************** Browaser UI/event operations ***************/

	@Given("^jclick on element '(.*)'$")
	public void javascriptClick(By locator) {
		WebElement ele = driver.findElement(locator);
		JS.executeScript("arguments[0].click();", ele);
	}

	public void javascriptWrite(String text, By locator) {
		WebElement ele = driver.findElement(locator);
		JS.executeScript("arguments[0].value='" + text + "';", ele);
	}

	public void openNewtab(String text, int i) {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> TAB = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(TAB.get(i));
		driver.get(text);
	}

	public void switchToWindow(int i) {
		ArrayList<String> TAB = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(TAB.get(i));
	}

	public void normalWritetext(By locator, String text) {
		for (int i = 0; i < 2; i++) {
			try {
				String A = driver.findElement(locator).getAttribute("value");
				if (!A.matches(text)) {
					clearText(locator);
					writeText(locator, text);
					sleep(500);
				} else {
					break;
				}
			} catch (Exception e) {
				continue;
			}
		}
	}

	public void normalClick(By locator) {
		try {
			click(locator);
		} catch (Exception e) {
			try {
				sleep(1500);
				click(locator);
			} catch (Exception e2) {
				sleep(2000);
				click(locator);
			}
		}
	}

	public void hoverhandler(By locator, By target) {
		Actions actions = new Actions(driver);
		WebElement A = driver.findElement(locator);
		WebElement B = driver.findElement(target);
		actions.moveToElement(A);
		actions.moveToElement(B);
		actions.click().build().perform();
	}

	public void popuphandler() {
		String popup = driver.getWindowHandle();
		driver.switchTo().window(popup);
	}

	/*************** Calender operations ***************/

	public String getCurrentdate(String Formatt) {
		Date date = new Date();
		DateFormat dateFormat = null;
		String DD;
		if (Formatt.matches("temp_1")) {
			dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		} else if (Formatt.matches("temp_2")) {
			dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		} else if (Formatt.matches("temp_3")) {
			dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		}
		DD = dateFormat.format(date);
		return DD;
	}

	/*************** String operations ***************/

	public StringBuilder Builder(List<String> datas) {
		StringBuilder text = new StringBuilder();
		for (String data : datas) {
			if (data.matches(datas.get(datas.size() - 1))) {
				text.append("'" + data.trim() + "'");
			} else {
				text.append("'" + data.trim() + "',");
			}
		}
		return text;
	}

	public List<String> calculationdates(String yeartype, String date) {
		List<String> lis = new ArrayList<String>();
		int month = Integer.parseInt(date.split("/")[0].trim()), year = Integer.parseInt(date.split("/")[2].trim());
		for (int i = 1; i <= month; i++) {
			String exp1 = null, exp2;
			if (yeartype.matches("prior")) {
				exp1 = String.valueOf(year - 1);
			} else if (yeartype.matches("current")) {
				exp1 = String.valueOf(year);
			}
			exp2 = String.valueOf(i);
			if (exp2.length() == 1) {
				exp2 = "0" + exp2;
			}
			lis.add(exp1 + exp2);

		}
		return lis;
	}

	/*************** Project/System Directory operations ***************/

	public String getFilepath(String Filename) {
		File file = new File(Filename);
		String path = file.getAbsolutePath();
		return path;
	}

	public String getProjectDirectory() {
		return System.getProperty("user.dir");
	}

	public boolean findElementsSize(By element) {
		boolean Result = false;
		int A1 = driver.findElements(element).size();
		System.out.println(A1);
		if (A1 >= 1) {
			Result = true;
		} else {
			Result = false;
		}
		return Result;
	}
}
