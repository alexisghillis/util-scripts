package hydra_reservations;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CancelReservations {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:/APPS/geckodriver.exe");
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://reservation.horeca.digital:8443/reservations");

    driver.findElement(By.id("username")).sendKeys("hansguenther.tester+performance1@gmail.com");
    driver.findElement(By.id("password")).sendKeys("horeca17");
    driver.findElement(By.cssSelector("button[type='submit']")).click();

    List<WebElement> cancelButtons = driver.findElements(
        By.cssSelector("button.btn.btn-default.cancel"));
    try {
      while (0 == 0) {

        cancelButtons.get(0).click();
        driver.findElement(By.cssSelector("button[class='btn btn-default cancel'][tabindex='113']")).click();
        cancelButtons = driver.findElements(
            By.cssSelector("button.btn.btn-default.cancel"));
      }
    } catch (Exception ex) {
      System.out.println("Elements were deleted");
    }


  }
}
