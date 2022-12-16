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

    //method to remove drawn cards
    public Card takeCard(){
        //copies the first card from the deck
        Card cardToTake = new Card(deck.get(0));
        //removes the card
        deck.remove(0);
        // returns the card
        return cardToTake;

    }
}
