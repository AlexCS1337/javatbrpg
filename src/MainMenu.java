import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("(N)ew Game\n(C)ontinue\n(Q)uit");

        String playerChoice = myObj.nextLine();
        while(playerChoice != "Q") {
            if (playerChoice == "N") {
                System.out.println("Player choice is:" + playerChoice);
                //newGame();
            }
            else if(playerChoice == "C") {
                System.out.println("Player choice ise:" + playerChoice);
                //continueGame();
            }
        }
        System.out.println("Thanks for playing!");
        System.exit(1);
    }
}
