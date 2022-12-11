package first.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public List<Card> cards;
    
    public Deck(){
        cards = new ArrayList<Card>();
        
        for(CardRank rank : CardRank.values()) {
            for(Suit suit : Suit.values()){
                Card newCard = new Card(rank, suit);
                cards.add(newCard);
            }
        }
        
        Collections.shuffle(cards);
    }
}
