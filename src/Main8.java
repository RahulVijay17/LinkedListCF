public class Main8 {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);
        myDLL.append(4);

        myDLL.insert(2,5);
        myDLL.printList();
    }
}
