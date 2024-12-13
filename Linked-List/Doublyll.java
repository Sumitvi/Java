// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Doublyll {
    
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    
    // Add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
       Doublyll Dll = new Doublyll();
       Dll.addFirst(2);
       Dll.addFirst(3);
       Dll.addFirst(4);
       Dll.print();
    }
}