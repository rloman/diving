package nl.capgemini.diving.assignmentdequeu;

import java.util.ArrayDeque;
import java.util.Collection;

public class Scheduler {

    private ArrayDeque<Task> tasks = new ArrayDeque<>();


    public void add(Task task) {
      if("Willem-Alexander".equals(task.getPersonName())) {
          tasks.addFirst(task);
      }
      else {
          tasks.addLast(task);
      }
    }

    public void add(Collection<Task> tasks) {
        tasks.forEach(task -> add(task));
    }

    public void execute() {
        this.tasks.forEach(task -> {
            task.execute();
        });
    }
}
