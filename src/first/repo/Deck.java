package first.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deck;
    
    public Deck(){
        deck = new ArrayList<Card>();
        
        for(Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card newCard = new Card(rank, suit);
                deck.add(newCard);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck,new Random());
    }

    public Card takeCard(){
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }
}
