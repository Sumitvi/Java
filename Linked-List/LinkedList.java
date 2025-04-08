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
    public static int size;


    public void addFirst(int data){

        // When we have one or more node
         // create new node
         Node NewNode = new Node(data);
         size++;


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
        size++;


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


    public void add(int idx , int data){
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is Empty");
        }else if(size== 1){
            int val = head.data;
            head = Tail = null;
            return val;
        }


        int val = head.data;
        head = head.next;
        return val;
    }


    public int iterativeSearch(int key){

        Node temp = head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }


    public int helper(Node head , int key){

        if(head==null){
            return -1;

        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx==-1){
            return -1;
        }

        return idx+1;
    }


    public int recSearch(int key){
       return  helper(head, key);

    }


    public void reverce(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
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

        ll.add(2 , 5);
        ll.print();

        // System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        System.out.println(ll.iterativeSearch(2));
        System.out.println(ll.iterativeSearch(3));


        ll.recSearch(3);
        ll.print();
        
        ll.reverce();
        ll.print();


    }
}