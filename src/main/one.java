//circular linked list

package main;

class Node{
   private int data;
   private Node next;
   public Node() {
        data = 0;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    //getter and setter mathod
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}//end of node

class MyCircularList1{
    Node Start;
    public MyCircularList1() {
       Start = null;
    }

    public boolean isempty(){
        if(Start==null)
            return true;
        else
            return false;
    }//end of method isempty

    public void display(){
        if(isempty()) {
            System.out.println("list empty");
            return;
        }//end of if
        else{
            Node temp=Start;
            while(temp.getNext()!=Start){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }//end of while
            System.out.println(temp.getData());
        }//end of else
    }//end of method display

    public void insertend(int val){
        Node n=new Node();
        n.setData(val);
        if(isempty()){
            Start=n;
            n.setNext(n);  //n.setNext(Start);
        }//end of if
        else{
            Node temp=Start;
            while(temp.getNext()!=Start){
                temp=temp.getNext();
            }
            temp.setNext(n);
            n.setNext(Start);
        }//end of else
    }//end of method insertend

    public void insertfirst(int val){
        Node n=new Node();
        n.setData(val);
        if(isempty()){
            insertend(val);
        }//end of if
        else{
            Node temp=Start;
            n.setNext(Start);
            while(temp.getNext()!=Start){
                temp=temp.getNext();
            }//end of while
            temp.setNext(n);
            Start=n;
        }//end of else
    }//end of method insertfirst

    public void deletefirst(){
        if(isempty()){
            System.out.println("list empty");
            return;
        }//end of if
        else{
            Node temp=Start;
            while(temp.getNext()!=Start){
                temp=temp.getNext();
            }
            Start=Start.getNext();
            temp.setNext(Start);
        }//end of else
    }//end of method deletefirst

    public void deletelast(){
        if(isempty()){
            System.out.println("list empty");
            return;
        }//end of if
        else{
            Node temp=Start;
           Node pre=temp;
           // while(temp.getNext().getNext()!=Start){
            while(temp.getNext()!=Start){
            pre=temp;
                temp=temp.getNext();
            }//end of while
            pre.setNext(Start);
        }//end of else
    }//end of method deletelast

   public int count(){
        Node temp=Start;
        int c=1;
        while(temp.getNext()!=Start){
            c++;
            temp=temp.getNext();
        }
        return c;
    }//end of count method

    public boolean comparelist(MyCircularList1 list1, MyCircularList1 list2){
        if(list1.count()!=list2.count()){
            return false;
        }
        else{
           Node temp1=list1.Start;
           Node temp2=list2.Start;
           while(temp1.getNext()!=Start){
               if(temp1.getData()!=temp2.getData()){
                   return false;
               }//end if
               temp1=temp1.getNext();
               temp2=temp2.getNext();
           }//while end
        }//else end
        return true;
    }//end of method comparelist

}//end of class CircularList


public class one {
    public static void main(String[] args) {
        MyCircularList1 obj =new MyCircularList1();
        obj.insertfirst(12);
        obj.insertfirst(13);
        obj.insertend(11);
        //obj.display();
        //System.out.println("count="+obj.count(obj));
        //System.out.println("after delete");
        //obj.deletelast();
        //obj.insertfirst(123);
        //obj.deletefirst();
        //obj.display();
        MyCircularList1 obj2 =new MyCircularList1();
        obj2.insertfirst(12);
        obj2.insertfirst(13);
        obj2.insertend(11);
        //obj2.insertend(12);

        System.out.println("result="+obj.comparelist(obj,obj2));
    }//end of main
}//end of class one
