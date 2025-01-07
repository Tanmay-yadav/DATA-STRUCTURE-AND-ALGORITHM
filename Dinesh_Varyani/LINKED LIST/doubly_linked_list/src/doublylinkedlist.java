public class doublylinkedlist {
    private listnode head;
    private listnode tail;
    private int length;

    private class listnode {
        private int data;
        private listnode previous;
        private listnode next;

        public listnode(int data) {
            this.data = data;
        }
    }

    public doublylinkedlist() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isempty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertlast(int value) {
        listnode newnode = new listnode(value);
        if (isempty()) {
            head = newnode;
        } else {
            tail.next = newnode;
            newnode.previous = tail; // Corrected line
        }
        tail = newnode;
        length++;
    }

    public void displayforward() {
        listnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displaybackward() {
        listnode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertatbeginning(int value) {
        listnode temp = new listnode(value);
        if (isempty()) {
            tail = temp;
        } else {
            head.previous = temp;
        }
        temp.next = head;
        head = temp;
        length++;
    }

    public void insertatlast(int value) {
        listnode newnode = new listnode(value);
        if (isempty()) {
            head = newnode;
        } else {
            tail.next = newnode;
            newnode.previous = tail; // Corrected line
        }
        tail = newnode;
        length++;
    }

    public void deletefirst() {
        if (isempty()) {
            return;
        }
        if (length == 1) { // Handle single-node case
            head = null;
            tail = null;
        } else {
            listnode temp = head.next;
            temp.previous = null;
            head.next = null;
            head = temp;
        }
        length--;
    }

    public void deletelast() {
        if (isempty()) {
            return;
        }
        if (length == 1) { // Handle single-node case
            head = null;
            tail = null;
        } else {
            listnode temp = tail.previous;
            temp.next = null;
            tail.previous = null;
            tail = temp;
        }
        length--;
    }

    public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();
        dll.insertlast(1);
        dll.insertlast(2);
        dll.insertlast(3);
        dll.insertlast(4);
        dll.displayforward();
        dll.displaybackward();
        dll.insertatbeginning(0);
        dll.insertatlast(5);
        dll.displayforward();
        System.out.println("Length: " + dll.length());
        dll.deletefirst();
        dll.displayforward();
        System.out.println("Length after deleting first: " + dll.length());
        dll.deletelast();
        dll.displayforward();
        System.out.println("Length after deleting last: " + dll.length());
    }
}
