import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenStackOverflow {
	public static void main(String[] args) {
		// Set the path to the WebDriver executable
		System.setProperty("webdriver.chrome.driver", "/Users/therimuthuselvam/Desktop/devl/softwares/chromedriver-mac-arm64/chromedriver"); // Update with the correct path

		// Set up Chrome options for headless mode
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless"); // Runs Chrome in headless mode
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*");

		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver(options);

		try {
			// Navigate to StackOverflow
			driver.get("https://stackoverflow.com");
			System.out.println("Opened StackOverflow");
		} finally {
			// Close the browser
			driver.quit();
			System.out.println("StackOverflow Exit");
		}
	}
}
