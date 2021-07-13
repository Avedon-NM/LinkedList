public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("List Elements: " + list);

        list.prepend(3);
        System.out.println("Prepend '3': " + list);

        System.out.println("List Size: " + list.size());

        list.remove(3);
        System.out.println("Remove '3': " + list);
    }
}
