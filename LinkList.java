public class LinkList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step 1
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2
        newNode.next=head;
        //step 3
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println(" list is empty");
            return;
        }
        Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i < idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("list is empty");
        }else if(size == 1){
            int val=head.data;
            head = tail =null;
            size=0;
            return val;
        }
        Node prev=head;
        for (int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while (temp != null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }public void revers(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(n == size){
            head=head.next;
            return;
        }
        int i =1;
        int find=size-n;
        Node prev=head;
        while(i < find){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrom(){
        if(head == null || head.next==null){
            return true;
        }
        //s1 find mid
        Node mid=findMid(head);
        //s2 revers 2nd half
        Node curr=mid;
        Node prev=null;
        while (curr != null){
            Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
        }
        Node right=prev;
        Node left=head;
        //s3 check 1st half and 2nd half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
    public  static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        Node prev=null;
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    //merge sort in linklist
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while (head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1 != null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2 != null){
            temp.next=head2;
            head1=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //for finding the mid
        Node mid=getMid(head);
        //left and right MS
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //final value
        return merge(newLeft,newRight);
    }
    //zigzak linked list
    public void zigZak(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // s-2 revers 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        // s-3 zig zak
        while(left != null && right != null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            //update the value
            left=nextL;
            right=nextR;
        }

    }
    public static void main(String[] args) {

        LinkList ll =new LinkList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigZak();
        ll.print();
    }
}
