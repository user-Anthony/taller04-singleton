@delete
Feature: Eliminar
  Background:
    Given agregamos una tarea
    And ingresamos titulo de tarea "Tarea 1"
    And ingresamos una descripcion de tarea "Decripcion tarea 1"
    And guardamos la tarea
    And verificamos que la tarea se creo correctamente como "Tarea 1"
    When Ingreso a la tarea "Tarea 1"


  Scenario: Eliminar tarea correctamente
    And doy click en eliminar
    And confirmo la eliminacion
    Then tengo que visualizar el texto "No tasks added"
