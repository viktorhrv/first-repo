package first.repo;
//raboti li
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
        return rank.getValue();
    }
    
    public String toString(){
        String rankAsString = rank.toString();
        if(rankAsString.startsWith("N")) {
            rankAsString = rankAsString.substring(1);
        }
        return rankAsString + " " + suit.toString();
    }
}
