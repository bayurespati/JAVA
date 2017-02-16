package Chapter_10;

import Chapter_9.libaray_class_chapter_9.Account;

import java.util.Scanner;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_7_ch_10_game_atm_machine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = createAccount();

        while (true) {
            System.out.print("Enter ID : ");
            int id = input.nextInt();

            while (true) {
                System.out.print("Main menu \n1.Check Balance \n2.Withdraw \n3.Deposit \n4.Exit \nEnter Choice : ");
                int choiceMenu = input.nextInt();

                if(choiceMenu == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choiceMenu == 2) {
                    System.out.print("Enter an amount to withdraw : ");
                    accounts[id].withdraw(input.nextInt());
                } else if (choiceMenu == 3) {
                    System.out.print("Enter an amount to deposit : ");
                    accounts[id].deposit(input.nextInt());
                } else
                    break;

                System.out.println();
            }
        }
    }

    public static Account[] createAccount(){
        Account[] accounts = new Account[10];
        for(int id = 0; id < accounts.length; id++){
            accounts[id] = new Account(id,100,4.5);
        }
        return accounts;
    }
}
