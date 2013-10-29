import java.util.Scanner;

/**
 * Created by Tenku on 10/21/13.
 */
public class DeckBuilder {
    final static String WELCOME_TEXT = "Welcome to DeckBuilder!";
    final static String DECICION_TEXT_DECK =
            "Please choose from one of the following:\n" +
            "\t1: Select a current deck\n" +
            "\t2: Create a new deck\n" +
            "\t3: Delete a deck\n" +
            "\n" +
            "\t0: Quit ";
    final static String ADD_CARD_NAME = "Please enter the new cards name: ";
    final static String ADD_CARD_TEXT = "Please enter the new cards text (can leave blank): "
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_TEXT);
        System.out.println(DECICION_TEXT_DECK);

        input = scanner.nextInt();

        parseDeckDecision(input);




    }

    private static void parseDeckDecision(int input) {
        boolean valid_input = true;
        do {
            switch (input) {
                case 1: selectDeck();
                    break;
                case 2: createDeck();
                    break;
                case 3: deleteDeck();
                    break;
                case 0:
                    break; // Quit program
                default:  System.out.println("Invalid input!");
                          valid_input = false;
                    break;
            }

            System.out.println(DECICION_TEXT_DECK);
        } while (!valid_input);
    }

    private static void selectDeck() {
        System.out.println("Not implemented yet!");
    }

    private static Deck<Card> createDeck() {
        System.out.println("Not implemented yet!");
        return null;
    }

    private static void deleteDeck() {
        System.out.println("Not implemented yet!");
    }



}
