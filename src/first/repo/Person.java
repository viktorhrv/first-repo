package first.repo;

//parent class of player and dealer
public abstract class Person {
    //holds active playing cards in hand
    private Hand hand;
    //creates a hand;
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