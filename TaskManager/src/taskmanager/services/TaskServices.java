package taskmanager.services;

import java.util.ArrayList;
import java.util.Scanner;
import taskmanager.entities.Task;

public class TaskServices {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Task crearTask() {
        String nombre;
        System.out.print("Tarea a realizar: ");
        do {
            nombre = leer.next();
        } while (nombre.length() > 30);
        int duracion;
        System.out.print("Duracion: ");
        do {
            duracion = leer.nextInt();
        } while (duracion > 60);
        return new Task(nombre, duracion);
    }

    public void showList(ArrayList<Task> taskList) {
        System.out.println("Lista de tareas: ");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i));
        }
    }

    public void doneTask(ArrayList<Task> taskList) {
        System.out.print("¿Que tarea realizo? ");
        String nombre = leer.next();

        for (Task task : taskList) {
            if (task.getNombre().equals(nombre)) {
                task.setEstado(true);
                
                System.out.println(nombre + " realizado.");
                System.out.println("");
                break;
            }
        }
    }
}
