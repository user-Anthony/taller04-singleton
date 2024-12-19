package testSuite;

import activities.whenDo.TaskDetailScreen;
import activities.whenDo.TaskListScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhenDoCreateTask {

    TaskListScreen taskListScreen = new TaskListScreen();
    TaskDetailScreen taskDetailScreen = new TaskDetailScreen();

    @Test
    public void createTask(){
        taskListScreen.addTaskButton.click();
        taskDetailScreen.titleTextBox.setText("Prueba1");
        taskDetailScreen.noteTextBox.setText("Nota1");
        taskDetailScreen.saveButton.click();
        Assertions.assertEquals("Prueba1", taskListScreen.getTitle.getText(),"ERROR");
    }

}
