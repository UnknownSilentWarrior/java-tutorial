package innovotics.jake;

import java.io.IOException;
import java.util.Scanner;


public class Blackjack {


public static void main(String[] args) throws IOException
{
        Scanner s = new Scanner(System.in);
        //String str = s.nextLine();
        int hand[] = new int[11];        // Variable Setup
        int count = 0;
        print("Welcome to Blackjack\n");
        while(count < 11)
        {
            hand[count] = 0;
            count++;
        }
        hand[0] = (int)(Math.random() * 10) + 2;
        hand[1] = (int)(Math.random() * 10) + 2;
        print("Your two cards are " + hand[0] + " and " + hand[1] + "\n");    // Showing Hand
        
        
        int count2 = 0, HandTotal = hand[0] + hand[1];        // Beginning of player hit or stay
        String answer;
        while(true)
        {
            print("Do you want to hit or stay(\"h\" for hit and \"s\" for stay)\n");
            answer = s.nextLine();
            print("you entered " + answer + "\n");
            count = 2;
            if(answer.equals("h"))
            {
                hand[count] = (int)(Math.random() * 10) + 2;
                count++;
                print("You got a " + hand[count-1] + "\n");
                HandTotal = HandTotal + hand[count - 1];
            }
            print("Your total is " + HandTotal + "\n");
            if(HandTotal > 21){ print("You went over 21, you loose\n"); return;}    // Win Conditions
            if(HandTotal == 21){ print("You got 21, you win!\n"); return;}
            if(!answer.equals("h")){ break;}
        }
        // End of player hit or stay
        count = 2;                        // Reseting Variables
        count2 = 0;
        
        
        int DealerHand[] = new int[11];            // Dealer Hand Setup
        DealerHand[0] = (int)(Math.random() * 10) + 2;
        DealerHand[1] = (int)(Math.random() * 10) + 2;
        print("Dealer gets two cards, one of the is a " + DealerHand[0] + "\n");
        int DealerTotal = DealerHand[0] + DealerHand[1];        
        
        while(DealerTotal <= 16)            // Dealer Hit Logic
        {
            print("Dealer hits\n");
            DealerHand[count] = (int)(Math.random() * 10) + 2;
            count++;
            DealerTotal = DealerTotal + DealerHand[count - 1];
        }
        
                                    /* Win Conditions */
        if(DealerTotal > 21){ print("Dealer went over! He had a total of " + DealerTotal); return;}
        if(DealerTotal > HandTotal){ print("Dealer Won! He had " + DealerTotal + "You had " + HandTotal); return;}
        if(DealerTotal < HandTotal){ print("You Won! Dealer had " + DealerTotal + "You had " + HandTotal); return;}
        if(DealerTotal == HandTotal){ print("Dealer Won! Dealer wins draws, you and him had " + HandTotal); return;}
    
    }



    /*
     * 
     * A little reminder of how to setup a function *
     * 
     * 
     * public static [type] [name]([variable type] [variable name], [variable
     * type] [variable name]) { [Content] return([a variable to the function
     * type]); }
     * 
     */

    private static void print(String i)
    {
        System.out.print(i);
    }
}