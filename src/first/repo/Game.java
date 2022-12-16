package first.repo;

public class Game {


    //Constructor starting the game and making objects
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
