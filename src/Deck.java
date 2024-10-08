import java.util.LinkedList;
import java.util.Queue;
public class Deck{
    public int size;
    public String deckname;
    public int ownerID;
    public Deck(int size, int ownerID){
        this.size = size;
        this.ownerID = ownerID;
    }
    private Queue<Flashcard> cards = new LinkedList<Flashcard>();
    public int length(){
        return cards.size();
    }
    public Flashcard GetQuestion(){
        return cards.front();
    }
}
