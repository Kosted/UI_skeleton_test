package pageObjects;

import helperClasses.WebActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import superClasses.SuperPage;

public class ExamplePage extends SuperPage {

//    @FindBy(name = "phone")
//    private WebElement phoneField;
//
//    @FindBy(name = "password")
//    private WebElement passwordField;
//
//    @FindBy(xpath = "//button[text()='Войти']")
//    private WebElement logInButton;
//
//    @FindBy(xpath = "//li[text()='Невозможно авторизоваться с предоставленными учетными данными']")
//    private WebElement errorMessage;

    public ExamplePage(WebActions webActions) {
        super(webActions);

        currentPageLink =standartPageLink+ "/auth/sign-in";

    }


}


