package assertionsThat;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
public class ContainsString {

//	@Test
//	public void testWithOneChrome(ChromeDriver driver) {
//		driver.get("https://bonigarcia.github.io/selenium-jupiter/");
//		assertThat(driver.getTitle(), containsString("JUnit 5"));
//	}
	
	 @Test
	 void testWithTwoChromes(ChromeDriver driver1, ChromeDriver driver2) {
        driver1.get("http://www.seleniumhq.org/");
        driver2.get("http://junit.org/junit5/");
        assertThat(driver1.getTitle(), endsWith("tion"));
        assertThat(driver2.getTitle(), equalTo("JUnit 5"));
    }
}
