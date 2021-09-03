import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner selection = new Scanner(System.in);
        System.out.println("(N)ew Game\n(C)ontinue\n(Q)uit");

        String playerChoice = selection.nextLine();
        while(!playerChoice.equals("Q")) {
            System.out.println("(N)ew Game\n(C)ontinue\n(Q)uit");
            playerChoice = selection.nextLine();
            switch(playerChoice) {
                case "N":
                    System.out.println("player's choice = " + playerChoice);
                    break;
                case "C":
                    System.out.println("player's choice = " + playerChoice);
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }
        }
        System.out.println("Thanks for playing!");
        System.exit(1);
    }
}
