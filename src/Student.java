import java.util.ArrayList;
import java.util.List;

public class Student{
    private int id;
    private String Fname;
    private String Lname;
    public List<Deck> currentDecks;

    public Student(int id, String Fname, String Lname){
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int value){
        this.id = value;
    }
    public String getFname(){
        return this.Fname;
    }
    public void setFname(String value){
        this.Fname = value;
    }
    public void setLname(String value){
        this.Lname = value;
    }
    public String getLname(){
        return this.Lname;
    }

}
