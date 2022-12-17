package first.repo;

//Parent class of Player and Dealer
public abstract class Person {
    private Hand hand;
    
    public Person() {
        this.hand = new Hand();
    }

    public Hand getHand(){
        return this.hand;
    }
    
    public void setHand(Hand hand){
        this.hand = hand;
    }
}