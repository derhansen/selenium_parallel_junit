package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        this.driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }

    @Test
    public void checkGoogleTitle1() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle2() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle3() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle4() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle5() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle6() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle7() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle8() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle9() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

    @Test
    public void checkGoogleTitle10() {
        this.driver.get("http://www.google.com");
        String title = this.driver.getTitle();
        Assert.assertEquals("Google", title);
    }

}
