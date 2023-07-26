/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager.services;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import taskmanager.entities.Task;

/**
 *
 * @author faQ
 */
public class TaskServicesTest {

    public TaskServicesTest() {
    }
    int cont = 0;
    static TaskServices ts;
    static Task task, task1;
    static ArrayList<Task> taskList;

    @BeforeClass
    public static void setUpClass() {
        ts = new TaskServices();
        task = new Task("quechua", 36);
        task1 = new Task("hacer ejercicio", 4);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        cont++;
        System.out.println("Test finalizado " + cont);
    }

    @Test
    public void testCrearTask() {
        taskList.add(task);
        System.out.print("crearTask = ");
        Task expResult = taskList.get(1);
        Task result = task;
        assertEquals(expResult, result);
    }

    @Test
    public void testShowList() {
        taskList.add(task1);
        System.out.print("showList = ");
        System.out.println(taskList.get(1));
        ts.showList(taskList);
    }

    @Test
    public void testDoneTask() {
        System.out.println("doneTask = ");
        int tam1 = taskList.size();
        ts.doneTask(taskList);
        int tam2 = taskList.size();
    }

}
