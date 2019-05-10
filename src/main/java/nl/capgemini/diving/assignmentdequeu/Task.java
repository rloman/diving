package nl.capgemini.diving.assignmentdequeu;

public class Task {

    private String personName;

    public Task(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void execute() {

        System.out.println("This is a Task which is invoked for name: "+getPersonName());

    }
}
