public class Main3 {

    public static void main(String[] args) {
        DoublyLinkedList myDLL=new DoublyLinkedList(5);

        myDLL.append(2);
        myDLL.append(3);

        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast().value);
        System.out.println(myDLL.removeLast());

        myDLL.printList();
    }
}
