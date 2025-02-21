import java.util.ArrayList;
import java.util.List;

/**
 * The Student class represents a student with an ID, first name, last name,
 * and a list of decks they currently have.
 */
public class Student {
    private int id;  // Unique identifier for the student
    private String Fname;  // First name of the student
    private String Lname;  // Last name of the student
    public List<Deck> currentDecks;  // List of decks the student is currently using

    /**
     * Constructor to initialize a Student object.
     *
     * @param id    The unique ID of the student
     * @param Fname The first name of the student
     * @param Lname The last name of the student
     */
    public Student(int id, String Fname, String Lname) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.currentDecks = new ArrayList<>(); // Initialize the list to prevent null reference
    }

    /**
     * Gets the student's unique ID.
     *
     * @return The student's ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * Sets the student's unique ID.
     *
     * @param value The new ID value
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the student's first name.
     *
     * @return The student's first name
     */
    public String getFname() {
        return this.Fname;
    }

    /**
     * Sets the student's first name.
     *
     * @param value The new first name
     */
    public void setFname(String value) {
        this.Fname = value;
    }

    /**
     * Gets the student's last name.
     *
     * @return The student's last name
     */
    public String getLname() {
        return this.Lname;
    }

    /**
     * Sets the student's last name.
     *
     * @param value The new last name
     */
    public void setLname(String value) {
        this.Lname = value;
    }
}
