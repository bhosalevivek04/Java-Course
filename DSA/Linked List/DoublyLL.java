package com.vivek.linkedlist;

public class DoublyLL {
    private Node head;
    private int size;

    public void insertFirst(int val){
        Node node=new Node(val);
         node.next=head;
         node.prev=null;
         if (head!=null) {
             head.prev = node;
         }
         head=node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }

        Node node= new Node(val,temp.next,temp);
        if (temp.next!=null){
            temp.next.prev=node;
        }
        temp.next=node;
        size++;
    }

    public Integer deleteFirst(){
        if (head==null){
            return null;
        }
        int val= head.val;
        head=head.next;
        head.prev= null;
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public Integer deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val= secondLast.next.val;
        secondLast.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;

        Node nodeToDelete=prev.next;
        Node nextNode=nodeToDelete.next;

        prev.next=nextNode;
        if (nextNode!=null){
            nextNode.prev=prev;
        }

        size--;
        return val;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while (node !=null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void insertLast1(int val){
        Node node=new Node(val);
        Node last=head;

        node.next=null;
        if (head==null){
            head=node;
            node.prev=null;
            return;
        }
        while (last.next != null){
            last = last.next;
        }

        last.next=node;
        node.prev=last;
    }

    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert1(int after,int val){
        Node p=find(after);
        if (p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }

    }

    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }

    }
}
