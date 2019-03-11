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
}//end of nodee


public class two {
}
