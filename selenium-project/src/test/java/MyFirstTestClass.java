import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTestClass {

    public static void main(String[] args) {
        // Set the path to Chromedriver (replace with your actual path)

        System.setProperty("webdriver.chrome.driver", "/Users/hetvaghela/eclipse-workspace/chromedriver_mac_arm64/chromedriver");
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page (replace with your actual login page URL)
        driver.get("https://accounts.lambdatest.com/login");

        // Find username and password input fields and login button
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter your credentials (replace with your actual credentials)
        usernameField.sendKeys("hetvaghela11@gmail.com");
        passwordField.sendKeys("Hetvaghela11");

        // Click the login button
        loginButton.click();

        // Check if login was successful
        if (isLoginSuccessful(driver)) {
            System.out.println("Login successful! Welcome.");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

        // Close the browser
        driver.quit();
    }

    private static boolean isLoginSuccessful(WebDriver driver) {
        // Customize this method based on the success criteria on your website.
        // You might check for elements that appear after a successful login.
        // For example, checking the presence of a welcome message.
        WebElement welcomeMessage = driver.findElement(By.id("welcome-message"));
        return welcomeMessage.isDisplayed();
    }
}