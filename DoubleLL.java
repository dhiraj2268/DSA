public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static  int size;

    //add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
       Node newNode=new Node(data);
       if(head == null){
           head=tail=newNode;
           return;
       }
       Node temp=head;
       while(temp.next != null){
           temp=temp.next;
       }
       temp.next=newNode;
       newNode=temp;
    }
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.printf(temp.data +"<->");
            temp=temp.next;
    }
        System.out.printf("null");
        System.out.println();
}
    public int removeFirst(){
        if(head == null){
            System.out.printf("empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val= head.data;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;
    }
    public void revers(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        dll.revers();
        dll.print();

    }
}
