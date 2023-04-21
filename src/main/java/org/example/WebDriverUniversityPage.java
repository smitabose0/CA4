/*package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class WebDriverUniversityPage
{
    WebDriver driver;

    @FindBy(xpath = "//select[@id='dropdowm-menu-1']")
    WebElement dropdown;
    @FindBy(xpath = "//select[@id='dropdowm-menu-2']")
    WebElement dropdown1;
    @FindBy(xpath = "//select[@id='dropdowm-menu-3']")
    WebElement dropdown2;


    @FindBy(xpath = "//input[@value='option-1']")
    WebElement checkbox1;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/label[3]/input")
    WebElement checkbox3;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/label[4]/input")
    WebElement checkbox4;

    @FindBy(xpath = "//input[@value='purple']")
    WebElement radioPurple;

    @FindBy(xpath = "//input[@value='pumpkin']")
    WebElement selectedAndDisabled;

    public WebDriverUniversityPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDropdownOptions()
    {
        Select select = new Select(dropdown);
        select.selectByVisibleText("SQL");

        Select select1 = new Select(dropdown1);
        select1.selectByVisibleText("JUnit");

        Select select2 = new Select(dropdown2);
        select2.selectByVisibleText("JQuery");
    }

    public void selectCheckboxes()
    {
        checkbox1.click();
        checkbox3.click();
        checkbox4.click();
    }

    public void selectRadioPurple()
    {
        radioPurple.click();
    }
    public void selectedAndDisabledButton()
    {
        selectedAndDisabled.click();
    }
}
*/