//non primitivecircular(lasnabtikna) doubly linked list

package main;

class Employee{
    private String Name;
    private int Esal;
    private String Post;

    public Employee(String name, int esal, String post) {
        Name = name;
        Esal = esal;
        Post = post;
    }//ennd of paramiterized constructor

    public Employee() {
        Name = null;
        Esal = 0;
        Post = null;
    }//end of defalut constructor

    //getter and setter  mathods
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEsal() {
        return Esal;
    }

    public void setEsal(int esal) {
        Esal = esal;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }
}//end of no primitive datatype Employee(lasnabtikna)

class Nodeee{
    private Employee data;
    private Nodeee next;
    private Nodeee previous;

    public Nodeee() {
        data=null;
        next=null;
        previous=null;
    }

    // gettere and setter methods
    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public Nodeee getNext() {
        return next;
    }

    public void setNext(Nodeee next) {
        this.next = next;
    }

    public Nodeee getPrevious() {
        return previous;
    }

    public void setPrevious(Nodeee previous) {
        this.previous = previous;
    }

}//end of class Nodeee

class Mycirculardoublylist{
    Nodeee Head;
    Nodeee Tail;

    public Mycirculardoublylist() {
        Head = null;
        Tail = null;
    }

    public boolean isEmpty(){
        if(Head==null)
            return true;
        return false;
    }//end of isEmpty method(lasnabtikna)

    public void display(){
        if(isEmpty()) {
            System.out.println("list empty");
            return;
        }//end of if
        else{
            Nodeee temp=Head;
            //System.out.println(temp.getData().getName()+" "+temp.getData().getRollno());
            Employee tobj=temp.getData();
            while(temp.getNext()!=Head){
                tobj=temp.getData();
                System.out.println(tobj.getName()+ " "+tobj.getEsal()+" "+tobj.getPost());
                temp=temp.getNext();
            }//end of while
            System.out.println(temp.getData().getName()+ " "+temp.getData().getEsal()+" "+temp.getData().getPost());
        }//end of else
    }//end of method display

    public void insertend(Employee val){
        Nodeee n =new Nodeee();
        n.setData(val);
        if(isEmpty()){
            Head=n;
            Tail=n;
            n.setNext(n);
            n.setPrevious(n);
        }//end of if
        else{
            Nodeee temp=Tail;
            temp.setNext(n);
            n.setPrevious(Tail);
            n.setNext(Head);
            Head.setPrevious(n);
            Tail=n;
        }//end of else
    }//end of insertend method(lasnabtikna)

    public void insertfirst(Employee val){
        Nodeee n=new Nodeee();
        n.setData(val);
        if(isEmpty()){
            insertend(val);
        }//end of if
        else{
            n.setNext(Head);
            n.setPrevious(Tail);
            Tail.setNext(n);
            Head.setPrevious(n);
            Head=n;
        }//end of
    }//insert of insertfirst

    public void deletefirst(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }//end of if
        else{
            Nodeee temp=Head;
            temp=temp.getNext();
            Head=temp;
            temp.setPrevious(Tail);
            Tail.setNext(temp);
        }//end of else
    }//end of deletefirst method(lasnabtikna)

    public void deletelast(){
        if(isEmpty()){
            System.out.println("Empty List");
            return;
        }//end of iff
        else{
            Nodeee temp=Tail;
            temp=temp.getPrevious();
            temp.setNext(Head);
            Head.setPrevious(temp);
            Tail=temp;
        }//end of else

    }//end of delete first

}//end of Mycirculardoublylist(lasnabtikna)

public class three {
    public static void main(String[] args) {
        Mycirculardoublylist obj=new Mycirculardoublylist();
        Employee obj1=new Employee("ankit",10000,"manager1");
        Employee obj2=new Employee("ashwani",5000,"manager2");
        Employee obj3=new Employee("anurag",4000,"manager3");
        Employee obj4=new Employee("akash",3000,"manager4");
        obj.insertfirst(obj1);
        obj.insertend(obj2);
        obj.insertend(obj3);
        obj.insertfirst(obj4);
        obj.deletelast();
        obj.display();
    }//end of main
}//end of class three
