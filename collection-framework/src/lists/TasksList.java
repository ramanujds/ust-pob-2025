package lists;

import model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TasksList {

    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();

        Task t1 = new Task(1, "Complete Assignment",
                LocalDate.parse("2025-06-10"), 3);
        Task t2 = new Task(2, "Grocery Shopping",
                LocalDate.parse("2025-06-11"), 4);
        Task t3 = new Task(3, "Workout",
                LocalDate.parse("2025-06-12"), 5);
        Task t4 = new Task(4, "Read a Book",
                LocalDate.parse("2025-06-13"), 1);
        Task t5 = new Task(5, "Plan Weekend Trip",
                LocalDate.parse("2025-06-14"), 2);

        taskList.add(t1);
        taskList.add(t2);
        taskList.add(t3);
        taskList.add(t4);
        taskList.add(t5);

        Collections.sort(taskList);

        for (Task task : taskList) {
            System.out.println(task);
        }


    }

}
