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
}//end of no primitive datatype Employee

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


public class three {
}
