package exercise1;
import java.util.*;
import static java.lang.Math.random;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Jaspreet Kaur Jan 27,2023
 * 
 */
public class CardTrick {
    
    public static Card[] hand = new Card[7];
    
    public static void main(String[] args) {

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
            int value = (int) (Math.random() * 13) + 1;
            int suit = (int) (Math.random() * 4);
            hand[i] = new Card(value, Card.SUITS[suit]);
           // System.out.println(hand[i]);
           
        }
              pickCard();
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    private static void pickCard(){
                boolean found = false;
                

                Scanner input = new Scanner(System.in);

            System.out.println("\n\nSome points to Know before playing");
        
            System.out.println("\n\n\nRemember! \n You can choose any number from 1-13 where \n 11 is for Jack \n 12 is for Queen \n 13 is for King.");
            System.out.println(" \n To Choose from suit Select: \n 1 for Heart \n 2 for Diamond \n 3 for Spades \n 4 for Clubs");
           
            System.out.println("\n Lets Start the Game!\n\n");
           
            System.out.print("Enter the card Number (1-13):  ");
            int number = input.nextInt();
            
            System.out.print(" Enter the suit: ");
            int suit_Number = input.nextInt();

            
           
            
           Card card1 = new Card(number,Card.SUITS[suit_Number - 1]);

           System.out.println("You picked " + card1 );
           for (int i = 0; i < hand.length; i++) {
                if(hand[i].equals(card1)){
                    found=true;
                    printInfo();
                    break;

                }
           }
           
        if(!found){
              System.out.println("Soory, The card cannot found in hand");
            }}
       

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * 
     * I am Done
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul Bonenfant");
        
         System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");
        System.out.println();
        
    
    }

}
