
public class Flashcard {
    public int ID;
    public double Difficullty;
    public String Title;
    public String Answer;
    public Topic topic;
    public FLashcard(int Id, String question, String answer,Topic topic, double difficulty){
        this.ID = Id;
        this.Difficullty = difficulty;
        this.Title = question;
        this.Answer = answer;
        this.topic = topic;
    }

}

