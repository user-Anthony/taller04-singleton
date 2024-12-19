package runner.appiumSteps;

import activities.whenDo.TaskDetailScreen;
import activities.whenDo.TaskListScreen;
import activities.whenDo.WindowsDialog;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WhenDoDeleteSteps {

    TaskListScreen taskListScreen = new TaskListScreen();
    TaskDetailScreen taskDetailScreen = new TaskDetailScreen();
    WindowsDialog windowsDialog = new WindowsDialog();

    @Given("agregamos una tarea")
    public void agregamosUnaTarea() {
    }

    @And("ingresamos titulo de tarea {string}")
    public void ingresamosTituloDeTarea(String title) {
        taskListScreen.addTaskButton.click();
        taskDetailScreen.titleTextBox.setText(title);
    }

    @And("ingresamos una descripcion de tarea {string}")
    public void ingresamosUnaDescripcionDeTarea(String descripcion) {
        taskDetailScreen.noteTextBox.setText(descripcion);
    }

    @And("guardamos la tarea")
    public void guardamosLaTarea() {
        taskDetailScreen.saveButton.click();
    }

    @And("verificamos que la tarea se creo correctamente como {string}")
    public void verificamosQueLaTareaSeCreoCorrectamenteComo(String expectedResult) {
        Assertions.assertEquals(expectedResult,taskListScreen.getTitle.getText(),"ERROR");
    }
    @When("Ingreso a la tarea {string}")
    public void ingresoALaTarea(String title) {
        taskListScreen.getTaskName(title).click();
    }

    @And("doy click en eliminar")
    public void doyClickEnEliminar() {
        taskDetailScreen.deleteItem.click();
    }

    @And("confirmo la eliminacion")
    public void confirmoLaEliminacion() {
        windowsDialog.confirmDelete.click();
    }

    @Then("tengo que visualizar el texto {string}")
    public void tengoQueVisualizarElTexto(String detalle) {
        Assertions.assertEquals(detalle,taskListScreen.getNote.getText(),"ERROR");
    }
}
