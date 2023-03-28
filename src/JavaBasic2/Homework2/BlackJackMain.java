package JavaBasic2.Homework2;

import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlackJackMethodes playerHand = new BlackJackMethodes();
        System.out.println("Please take a card from deck: ");
        String firstCard = scanner.nextLine();
        System.out.println("Dealer: Please take a card from deck: ");
        String firstCardDealer = scanner.nextLine();
        System.out.println("Please take a card from deck: ");
        String secondCard = scanner.nextLine();

//        System.out.println(playerHand.parseCard(firstCard));
//        System.out.println(playerHand.isBlackjack(firstCard,secondCard));
//        System.out.println(playerHand.largeHand(true, firstCardDealer));
        System.out.println(playerHand.firstTurn(firstCard,secondCard,firstCardDealer));

    }
}
