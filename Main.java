package Card;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> cards = new ArrayList<>();
        for(int i = 1 ; i != 0 ; i++) {
            System.out.println(".....................................................................................");
            System.out.println("1- Add a new card");
            System.out.println("2- Show inserted cards");
            System.out.println("3- Quit");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();
            if (Objects.equals(choice, "3"))
            {
                break;
            }
            else if (Objects.equals(choice, "1"))
            {
                Card newCard = new Card();
                System.out.print("Name of the cardholder: ");
                newCard.Name_of_the_cardholder = input.nextLine();
                System.out.print("Card number: ");
                newCard.Card_number = input.nextLine();
                System.out.print("Expiration date: ");
                newCard.Expiration_date = input.nextLine();
                System.out.print("cvv2: ");
                newCard.cvv2 = Short.parseShort(input.nextLine());
                String[] cardInfo = {newCard.Name_of_the_cardholder, newCard.Card_number,
                        newCard.Expiration_date, Short.toString(newCard.cvv2)};
                cards.add(cardInfo);
            }
            else if (Objects.equals(choice, "2")) {
                for (var card : cards) {
                    String str = String.format("%s  %s  %s  %s", card[0], card[1], card[2], card[3]);
                    System.out.println(str);
                }
            }
            else
            {
                System.out.println("Enter the correct option");
            }
        }
    }
}