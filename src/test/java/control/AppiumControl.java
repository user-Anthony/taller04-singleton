package control;

import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class AppiumControl {
    protected By locator;
    protected WebElement control;

    public AppiumControl (By locator){
        this.locator = locator;
    }

    public void findControl (){
        control = Session.getInstance().getDevice().findElement(locator);
    }

    public void click(){
        findControl();
        control.click();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public boolean isControlDisplayed() {
        try {
            findControl();
            return control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
