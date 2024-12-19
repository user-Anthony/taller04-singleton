package singletonSession;

import control.AppiumControl;
import factoryDevice.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.eo.Se;
import util.GetProperties;

public class Session {

    private static Session session  = null;
    private AppiumDriver device;

    public static Session getInstance(){
        if (session == null)
            session = new Session();
        return session;
    }

    public void closeSession(){
        device.quit();
        session=null;
    }

    public AppiumDriver getDevice(){
        return device;
    }

    private Session(){
        device = FactoryDevice.make(GetProperties.getInstance().getDevice()).create();
    }
}
