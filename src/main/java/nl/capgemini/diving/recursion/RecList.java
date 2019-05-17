package nl.capgemini.diving.recursion;

public class RecList {

    private String head;
    private RecList tail;

    public void add(String name) {
        if (head == null) {
            this.head = name;
            this.tail = new RecList();
        } else {
            this.tail.add(name);
        }
    }

    public void printMe() {
        if (head != null) {
            System.out.print(head + ", ");
            this.tail.printMe();
        }
    }

    private void print() {
        printMe();
        System.out.println();

    }

    public int size() {
        if (head == null) {
            return 0;
        } else {
            return 1 + this.tail.size();
        }
    }
}