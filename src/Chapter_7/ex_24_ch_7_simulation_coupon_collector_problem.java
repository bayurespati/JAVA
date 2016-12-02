package Chapter_7;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_24_ch_7_simulation_coupon_collector_problem {
    public static void main(String[] args) {
        int[] deck = initialCard();
        pickCard(deck);
        shuffleCard(deck);
    }

    public static int[] initialCard(){
        int[] deck = new int[52];
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        return deck;
    }


    public static void pickCard(int[] deck){

        shuffleCard(deck);

        int[] cardPick = new int[4];
        int indexForPick = 0;

        for(int i = 0; i < deck.length; i++){
            cardPick[indexForPick] = deck[i];
            indexForPick++;

            if(checkCard(cardPick)){
                printCard(cardPick,i);
                break;
            }
            if(indexForPick == 4){
                indexForPick = 0;
            }
        }

    }

    public static void shuffleCard(int[] deck){

        for(int i = 0; i < deck.length; i++){
            int index = (int) (Math.random()*deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static boolean checkCard(int[] cardPick){
        int count = 0;
        int[] cekCard = {0 ,1 ,2, 3};

        for(int i = 0; i < cardPick.length; i++) {

            for(int k = 0; k < cardPick.length; k++){

                if(cekCard[i] == (cardPick[k]/13)){
                    count++;
                }

                if(count == 2){
                    return false;
                }
            }
            count = 0;
        }

        return true;
    }

    public static void printCard(int[] cardPick, int numberOfPick){
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for(int i = 0; i < cardPick.length; i++) {
            String suit = suits[cardPick[i] / 13];
            String rank = ranks[cardPick[i] % 13];
            System.out.println(rank + " of " + suit);
        }

        System.out.println("Number of pick : "+(numberOfPick+1));
    }
}
