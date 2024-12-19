package activities.whenDo;

import control.Button;
import control.Label;
import io.cucumber.java.en.But;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class TaskListScreen {

    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label getTaskName (String name){
        Label control = new Label(By.xpath("//android.widget.TextView[@text='" + name + "']"));
        return control;
    }

    public  Label getTitle = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    public Label getNote = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));
}