class Student{
    int Rollno;
    String Name;
    //getter & Setter Methods
    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}//end of non-primitive datatype Student

class Nodee{
    private Student data;
    private Nodee next;

    public Nodee() {
        data.setRollno(0);
        data.setName(null);
        next=null;
    }
    public Nodee(int Rollno,String Name) {
        data.setRollno(Rollno);
        data.setName(Name);
        next=null;
    }

    public Nodee getNext() {
        return next;
    }

    public void setNext(Nodee next) {
        this.next = next;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }
}//end of nodee

class MyCircularListNonPrimitive{
    Nodee Start;

    public MyCircularListNonPrimitive() {
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
            Nodee temp=Start;
            while(temp.getNext()!=Start){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }//end of while
            System.out.println(temp.getData());
        }//end of else
    }//end of method display

    public void insertend(Student val){
        Nodee n=new Nodee();
        n.setData(val);
        if(isempty()){
            Start=n;
            n.setNext(n);  //n.setNext(Start);
        }//end of if
        else{
            Nodee temp=Start;
            while(temp.getNext()!=Start){
                temp=temp.getNext();
            }
            temp.setNext(n);
            n.setNext(Start);
        }//end of else
    }//end of method insertend

    public void insertfirst(Student val){
        Nodee n=new Nodee();
        n.setData(val);
        if(isempty()){
            insertend(val);
        }//end of if
        else{
            Nodee temp=Start;
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
            Nodee temp=Start;
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
            Nodee temp=Start;
            // Node pre;
            while(temp.getNext().getNext()!=Start){
                // pre=temp;
                temp=temp.getNext();
            }//end of while
            temp.setNext(Start);
        }//end of else
    }//end of method deletelast

}//end of class MyCircularListNonPrimitive


public class two {
}
