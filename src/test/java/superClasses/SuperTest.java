package superClasses;

//import AssertMCS;

import helperClasses.AssertMCS;
import helperClasses.PageObjects;
import helperClasses.WebActions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
//import ExamplePage;
//import MatchesPage;

public abstract class SuperTest extends PageObjects {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    protected static WebDriver driver;
    protected static WebActions web_a;



    protected static AssertMCS assertMCS;

    public SuperTest(WebActions web_a) {
        super(web_a);
    }

    @BeforeClass
    public static void init() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/home/k.malev/librarys/chromedriver");
        web_a = new WebActions("WEB");
        driver = web_a.getDriver();

    }

    @Before
    public void setup() {
        assertMCS = new AssertMCS(errorCollector);

    }

//    private static void unitPageObjects() {
//
//    }

    @AfterClass
    public static void tearDown() {

        driver.quit();
//         assertMCS.
    }
}
