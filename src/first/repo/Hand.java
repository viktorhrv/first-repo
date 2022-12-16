package first.repo;

import java.util.ArrayList;
import java.util.Collections;
public class Hand {

    private ArrayList<Card> hand;
    public Hand(){
        hand = new ArrayList<Card>();
    }
    //adds the top card of the deck to the hand and removes it from the deck
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.takeCard());
    }


}
