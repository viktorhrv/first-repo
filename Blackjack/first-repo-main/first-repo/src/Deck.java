import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    
    public Deck(){
        cards = new ArrayList<Card>();
        
        for(Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card newCard = new Card(rank, suit);
                cards.add(newCard);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards,new Random());
    }

    // Returns a COPY of the top card
    public Card takeCard(){
        Card cardToTake = new Card(cards.get(0));
        cards.remove(0);
        return cardToTake;
    }
}
