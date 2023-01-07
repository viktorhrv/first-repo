import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;
    
    public Game(){
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();

        deck.shuffle();

        playGame();
    }
  
    private void playGame(){
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);
        
        player.getHand().takeCardFromDeck(deck);
        
        System.out.println("Dealer's card: " + dealer.getHand().getCard(0));
        System.out.println("Player's card: " + player.getHand().getCard(0));
         
        boolean playing = true;
        
        while(playing) {
            System.out.println("Now, what do you want to do?");
            System.out.println("T - Take another card");
            System.out.println("S - Stop taking cards");
            System.out.println("P - pass");
            
            Scanner sc = new Scanner(System.in);
            char symbol = sc.next().charAt(0);
            
            if(symbol == 'T') {
                 player.getHand().takeCardFromDeck(deck);
                 System.out.println("New card: " + player.getHand().getCard(0));
            }
            else if(symbol == 'S') {
                 playing = false;
            }
            else {
                 System.out.println("Dealer wins!");
                 return;
            }
        }
        
        if(player.getHand().calculateValue() > 21) {
            System.out.println("Dealer wins!");
            return;
        }
        
        while(dealer.getHand().calculateValue() < 17) {
            dealer.getHand().takeCardFromDeck(deck);
        }
        
        if(dealer.getHand().calculateValue() > 21) {
            System.out.println("Player wins!");
            return;
        }
        
        int playerHandValue = player.getHand().calculateValue();
        int dealerHandValue = dealer.getHand().calculateValue();
        
        if(playerHandValue > dealerHandValue){
            System.out.println("Player wins!");
        }
        else if(playerHandValue < dealerHandValue){
            System.out.println("Dealer wins!");
        }
        else {
            System.out.println("Tie!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, player!");
    }        
}
