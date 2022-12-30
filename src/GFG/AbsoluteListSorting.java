package GFG;


import java.util.Collection;
import java.util.LinkedList;

 class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class AbsoluteListSorting {
    static Node head = null;
    public static void main(String[] args) {

    addNum(head,-1);
        addNum(head,5);
        addNum(head,-3);
        addNum(head,7);
        showList(head);
        showList(sortList(head));


    }
    static void addNum(Node h,int n){
        Node temp,t;
        if (h==null){
            temp=new Node(n);
            head=temp;
        }else{
            t=h;
            while(t.next!=null){
                t=t.next;
            }
            temp=new Node(n);
            t.next=temp;
        }
    }
    static void showList(Node h){
        Node t=h;
        System.out.println();
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
   static Node sortList(Node head) {
        // Your code here
       if(head.next==null)
           return head;
       Node t=head,t1,newhead,temp,newtail;
       newhead=newtail=new Node(head.data);

        while(t.next!=null){
            t=t.next;
            temp=new Node(t.data);
            System.out.println(temp);
            if(t.data<=newhead.data){
                temp.next=newhead;
                newhead=temp;
            }else if(t.data>= newtail.data){
                newtail.next=temp;
                newtail=temp;
            }else{
                t1=newhead.next;
                while(t1!=null){
                    if(t1.data<=temp.data){
                        temp.next=t1.next;
                        t1.next=temp;
                    }
                    t1=t1.next;
                }
            }

        }

        return newhead;
    }


}
