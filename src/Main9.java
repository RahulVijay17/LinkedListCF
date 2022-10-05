public class Main9 {

    public static void main(String[] args) {
        DoublyLinkedList myDLL=new DoublyLinkedList(0);

        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        myDLL.remove(2);

        myDLL.printList();
    }
}
