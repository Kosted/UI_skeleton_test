package helperClasses;

import pageObjects.ExamplePage;


public class PageObjects {
    protected static ExamplePage examplePage;

    private WebActions web_a;

    public PageObjects(WebActions web_a) {
        this.web_a=web_a;
        examplePage = new ExamplePage(web_a);

    }


}
