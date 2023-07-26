package taskmanager;

import java.util.ArrayList;
import taskmanager.entities.Task;
import taskmanager.services.TaskServices;

public class TaskManager {

    public static void main(String[] args) {
        TaskServices ts = new TaskServices();

        //ANOTAREMOS 4 TAREAS Y REALIZAREMOS UNA
        ArrayList<Task> taskList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Task task = ts.crearTask();
            taskList.add(task);
        }

        ts.showList(taskList);

        ts.doneTask(taskList);

        ts.showList(taskList);

    }

}
