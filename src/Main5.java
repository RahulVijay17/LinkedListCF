public class Main5 {

    public static void main(String[] args) {
        DoublyLinkedList myDLL=new DoublyLinkedList(2);

        myDLL.append(1);

        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst().value);
        System.out.println(myDLL.removeFirst());
    }
}
