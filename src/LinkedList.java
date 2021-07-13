public class LinkedList {

    private Node head;

    // Adding elements to a list
    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(data));
    }

    // Prepending the list
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.setNext(head);
        head = newHead;
    }

    // Remove an element from the list
    public void remove(int data){
        if (head.getData() == data){
            head = head.getNext();
        }

        Node current = head;
        while (current.getNext() != null){
            if (current.getNext().getData() == data ){
                current.setNext(current.getNext().getNext());
            }
            current = current.getNext();
        }
    }


    // Reversed iteratively
    public void reverse(){
        if(head == null) return;

        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
         head = prev;
    }

    // List being reversed recursively
    public void reverseTwo(){
        reverseRecursively(head);
    }

    private void reverseRecursively(Node current){
        if (current == null) return;

        if (current.getNext() == null){
            head = current;
            return;
        }

        reverseRecursively(current.getNext());
        current.getNext().setNext(current);
        current.setNext(null);
    }

    // Returning the size of the linked list
    public int size(){
        if (head == null) return 0;

        Node current = head;
        int counter = 1;

        while (current.getNext() != null){
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    // Custom toString method
    public String toString() {
        if (head == null) return "null";

        Node current = head;
        String data = String.valueOf(head.getData());
        while(current.getNext() != null) {
            data += ", " + current.getNext().getData();
            current = current.getNext();
        }

        return data;
    }
}
