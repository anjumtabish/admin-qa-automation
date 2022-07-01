package com.admin.application.AdminPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


import javax.annotation.PostConstruct;

@Configuration
public class BasePage{

    @Value("${username1}")
    private String userId;

    @Value("${password1}")
    private String pwd;

    @Autowired
    public WebDriver driver;

    @PostConstruct
    public void initLoginPage(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.NAME, using = "username")
    private WebElement username;

    @FindBy(how = How.XPATH, using = "//input[@name=\"password\"]")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[.='Login']")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//span[.='Assigned to me']")
    private WebElement assignedToMeButton;

    @FindBy(how = How.XPATH, using ="//a[.='My applications']")
    private  WebElement myApplicationPage;

    @FindBy(how = How.XPATH, using = "//div[.='Add Person']")
    private WebElement addPersonTab;

    @FindBy(how = How.XPATH, using = "(//div[.='Add person'])[1]")
    private WebElement applicationAddPerson;

    public void getUsername() {
        username.sendKeys(userId);
//        return username;
    }

    public void getPassword() {
        password.sendKeys(pwd);
//        return password;
    }

    public void clickButton(){
        loginButton.click();
//        return loginButton;
    }

    public void getAssignedToMeButton(){
        assignedToMeButton.click();
//        return assignedToMeButton;
    }
    public WebElement getMyApplicationPage(){
        myApplicationPage.click();
        return myApplicationPage;
    }

    public void getAddPersonTab(){
        addPersonTab.click();
//        return addPersonTab;
    }

    public String getApplicationAddPerson(){
        String applicationType = applicationAddPerson.getText();
        return applicationType;
    }
}