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

class CircularList{
    Node Start;
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

}//end of class CircularList


public class one {
}
