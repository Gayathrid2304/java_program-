class Ll{
    //intial linked list nodes and size
    Node head;
    Node tail;
    int size;

    //class for nodes
    class Node{
        int data;
        Node next;

        //constructor for node
        Node(int d){
            data = d;
        }
    }

    public void insertBeginning(int d){
        Node node = new Node(d);
        if(head==null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void display(){
        Node temp =  head;

        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Ll l = new Ll();
        //function calling
        l.insertBeginning(10);
        l.insertBeginning(20);
        l.insertBeginning(30);
        l.display();
    }
}
