package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverUniversityPageTest
{

    WebDriver driver;
    @Test
    public void verification() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebDriverUniversityPage webDriverUniversityPage = new WebDriverUniversityPage(driver);
        Thread.sleep(2000);
        webDriverUniversityPage.selectDropdownOptions();
        Thread.sleep(2000);
        webDriverUniversityPage.selectCheckboxes();
        Thread.sleep(2000);
        webDriverUniversityPage.selectRadioPurple();
        Thread.sleep(2000);
        webDriverUniversityPage.selectedAndDisabledButton();
        Thread.sleep(2000);

        driver.quit();
    }
}
