import java.util.LinkedList;
import java.util.Queue;

/**
 * The Deck class represents a collection of flashcards stored in a queue.
 * It includes properties like size, deck name, and owner ID.
 */
public class Deck {
    public int size;  // The total number of flashcards in the deck
    public String deckname;  // Name of the deck (not initialized in the constructor)
    public int ownerID;  // Unique identifier for the deck owner

    /**
     * Constructor to initialize a deck with a given size and owner ID.
     *
     * @param size    The number of flashcards in the deck
     * @param ownerID The unique identifier of the deck owner
     */
    public Deck(int size, int ownerID) {
        this.size = size;
        this.ownerID = ownerID;
    }

    // Queue to store flashcards in the deck
    private Queue<Flashcard> cards = new LinkedList<>();

    /**
     * Returns the number of flashcards currently in the deck.
     *
     * @return The number of flashcards in the queue
     */
    public int length() {
        return cards.size();
    }

    /**
     * Retrieves the next flashcard in the deck without removing it.
     *
     * @return The front flashcard in the queue
     */
    public Flashcard GetQuestion() {
        return cards.peek(); // Changed from front() to peek() as front() is incorrect in Java's Queue
    }
}

