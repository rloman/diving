package nl.capgemini.diving.assignmentdequeu;

public class Application {


    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        s.add(new Task("Anne"));
        s.add(new Task("Willem-Alexander"));
        s.add(new Task("Raymond"));
        s.add(new MyTask("Moataz"));

        s.execute();
    }
}

class MyTask extends Task {


    public MyTask(String personName) {
        super(personName);
    }

    @Override
    public void execute() {
        System.out.println("Invoking the my task execute so I can do everything here ..."+getPersonName());
    }
}