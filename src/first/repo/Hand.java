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

    public int calculatedValue(){
        int value = 0;
        int aceCount = 0;

        for(Card card: hand){
            value += card.getValue();
            if (card.getValue() == 11){
                aceCount ++;
            }
        }
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }
        return value;


    }

}
