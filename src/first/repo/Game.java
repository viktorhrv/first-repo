package first.repo;

public class Game {
    public Game(){
        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        deck.shuffle();

        startGame();
    }

    private void startGame(){

    }
}
