package nl.capgemini.diving.recursion;

public class Tree {

    private Integer value;

    private Tree left;
    private Tree right;

    public void add(int number) {
        if (this.value == null) {
            this.value = number;
            this.left = new Tree();
            this.right = new Tree();
        } else {
            if (number <= this.value) { // rloman to do refactor to have nu duplicates
                this.left.add(number);
            } else {
                this.right.add(number);
            }
        }
    }

    public void print() {

        if (this.left != null) {
            this.left.print();
        }
        if (this.value != null) {
            System.out.print(this.value + ", ");
        }
        if (this.right != null) {
            this.right.print();
        }
    }

    public int size() {
        if (this.value != null) {
            return 1 + (this.left != null ? this.left.size() : 0)
                    + (this.right != null ? this.right.size() : 0);
        } else {
            return 0;
        }
    }
}
