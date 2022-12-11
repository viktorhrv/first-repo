package first.repo;

public class Player {
    private String name;
    private Card[] hand = new Card[2];
    
    public Player(String name){
        this.name = name;
    }
    
    public void receiveHand(Card[] hand){
        this.hand[0] = hand[0];
        this.hand[1] = hand[1];
    }
    
    public int valueOfHand() {
        return hand[0].getValue() + hand[1].getValue();
    }
}
