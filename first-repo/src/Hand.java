import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void takeCardFromDeck(Deck deck){
        cards.add(deck.takeCard());
    }

    public int calculateValue(){
        int value = 0;
        int aceCount = 0;

        for(Card card: cards){
            value += card.getValue();
            if (card.getValue() == 11){
                aceCount++;
            }
        }
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount--;
                value -= 10;
            }
        }
        return value;
    }
    
    public Card getCard(int i){
        return cards.get(i);
    }
    
    public Card getLastCard(){
        return cards.get(cards.size() - 1);
    }
}
