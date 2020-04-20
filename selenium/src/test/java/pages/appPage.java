package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appPage {

	WebDriver driver;
	public appPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private String searchElementPath = "//div[contains(@class, 'buscar-btn')]";
	
	private String searchInputPath= "//input[contains(@type, 'search')]";

	private String secondProduct = "//li[contains(@class, 'product')][2]";
	
	private String openSizesPath = "//button[contains(@class, 'tallas')]";

	private String secondSize = "//li[contains(@data-talla-accion, '1')][2]/span";
	
	private String addToCartPath = "//div[contains(@class, 'cont-botones')]//button[contains(@class, 'add-cart')]";
	
	private String setOrderPath = "//a[contains(@class, 'pagar')]";
	
	private String shopListPath = "//div[contains(@class, 'cesta-btn')]";
	
	private String basketItem = "//div[contains(@class, 'carrito')]//span[contains(@class, 'titulo')]";
	
	private String basketSize = "//div[contains(@class, 'carrito')]//div[contains(@class, 'talla')]";
	
	
	public void search(String dataToSearch) {
		clickElement(searchElementPath);
		clickElement(searchInputPath);

		WebElement searchInput = driver.findElement(By.xpath(searchInputPath));
		
		searchInput.sendKeys(dataToSearch);
		searchInput.sendKeys(Keys.ENTER);		
	}
	
	public String selectProduct() {
		clickElement(secondProduct);
		return driver.findElement(By.xpath("//h1")).getText();
	}
	
	public String selectSize() {
		WebElement sizesBtn = driver.findElement(By.xpath(openSizesPath));
		sizesBtn.click();
		WebElement sizeToSelect = driver.findElement(By.xpath(secondSize));
		sizeToSelect.click();
		return "Talla " + sizeToSelect.getText();
	}
	
	public void addToCart() {
		clickElement(addToCartPath);
	}
	
	public void makeOrder() {
		clickElement(setOrderPath);
	}
	
	public void openCart() {
		clickElement(shopListPath);
	}

	public boolean checkItem(String name, String size) {
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		String text = driver.findElement(By.xpath(basketItem)).getText().trim();
		
		boolean result = text.equals(name.trim());

		if(result) {
			result = driver.findElement(By.xpath(basketSize)).getText().trim().contains(size.trim());
		}
		return result;
	}
	
	private void clickElement(String path) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
	}	
}
