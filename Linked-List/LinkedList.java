public class LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    
    public static Node head;
    public static Node Tail;


    public void addFirst(int data){

        // When we have one or more node
         // create new node
         Node NewNode = new Node(data);


        // when we have not any node

        if(head==null){
            head = Tail = NewNode;
            return;

        }

        // new node next = head
        NewNode.next = head;

        // head = newnode
        head = NewNode;

    }


    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = Tail = newNode;
        }

        Tail.next = newNode;
        Tail = newNode;
    }


    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.println("null");
    }

   


    // Methods
    public static void main(String args[]){

        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();


    }
}