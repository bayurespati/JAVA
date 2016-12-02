package Chapter_7;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_29_ch_7_game_pick_four_card {
    public static void main(String[] args) {
        int[] deck = initialCard();
        getCard(deck);
    }

    public static int[] initialCard(){
        int[] deck = new int[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        return deck;
    }

    public static void getCard(int[] deck){
        shuffleCard(deck);
        int index = 0;

        int[] pickCard = new int[4];

        while(checkCard(pickCard) != 24){
            for(int i = 0; i < deck.length; i++){
                pickCard[index] = (deck[i]);
                index++;
                if(checkCard(pickCard) == 24 && index ==  4){
                    break;
                }
                if(index == 4){
                    index = 0;
                }
            }
           shuffleCard(deck);
        }
        printCard(pickCard);
    }

    public static void shuffleCard(int[] deck){

        for(int i = 0; i < deck.length; i++){
            int index = (int) (Math.random()*deck.length);
            int temp = deck[i];

            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static int checkCard(int[] pickCard){
        int totalCard = 0;
        for(int i = 0; i < pickCard.length; i++){
            totalCard += pickCard[i] % 13 + 1;
        }
        return (totalCard);

    }

    public static void printCard(int[] cardPick){
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(int i = 0; i < cardPick.length; i++) {
            String suit = suits[cardPick[i] / 13];
            String rank = ranks[cardPick[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }
}
