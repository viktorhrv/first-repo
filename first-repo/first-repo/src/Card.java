public class Card {
    private Rank rank;
    private Suit suit;
    
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public Card(Card other){
        rank = other.rank;
        suit = other.suit;
    }
    
    public int getValue(){
        return rank.rankValue;
    }
    
    public String toString(){
        return rank.toString() + " of " + suit.toString() + " /";
    }
}
