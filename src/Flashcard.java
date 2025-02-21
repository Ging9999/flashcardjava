/**
 * The Flashcard class represents an individual flashcard with an ID, difficulty level,
 * title (question), answer, and an associated topic.
 */
public class Flashcard {
    public int ID;  // Unique identifier for the flashcard
    public double Difficulty;  // Difficulty rating of the flashcard
    public String Title;  // The question or prompt on the flashcard
    public String Answer;  // The answer to the flashcard question
    public Topic topic;  // The topic/category of the flashcard

    /**
     * Constructor to initialize a Flashcard object.
     *
     * @param Id         The unique ID of the flashcard
     * @param question   The question or prompt on the flashcard
     * @param answer     The correct answer to the question
     * @param topic      The topic/category the flashcard belongs to
     * @param difficulty The difficulty level of the flashcard
     */
    public Flashcard(int Id, String question, String answer, Topic topic, double difficulty) {
        this.ID = Id;
        this.Difficulty = difficulty;  // Fixed typo (was "Difficullty")
        this.Title = question;
        this.Answer = answer;
        this.topic = topic;
    }
}
