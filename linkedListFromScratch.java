// Linked List
public  class LinkedListFromScratch {
    Node head;
    
    //methods
    public void add(int data){
        //LL is empty
        if (this.head == null) {
            this.head  = new Node(data);
        } else {
            //LL not empty
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }
    
    public static void main(String[] args) {
        LinkedListFromScratch myList = new LinkedListFromScratch();
        myList.add(10);
        myList.add(18);
        System.out.println(myList.head.data);
        System.out.println(myList.head.next.data);
    }
}


//node 
class Node {
    int data;
    Node next;
    
    Node(int d) {this.data = d;}
}