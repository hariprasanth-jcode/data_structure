public class LinkedList {

    Node head;

    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }




    public void print(){
        Node current=head;
        while (current!=null){
            System.out.println(current.getData());
           current=current.next;
        }
    }

}
