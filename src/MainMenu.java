import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String playerChoice;

        Scanner selection = new Scanner(System.in); 
  
        lp : while(true) {
            System.out.println("(N)ew Game\n(C)ontinue\n(Q)uit");
            playerChoice = selection.nextLine();
            switch(playerChoice) {
                case "N":
                    //Game newgame = new Game();
                    System.out.println("player's choice = " + playerChoice);
                    break;
                case "C":
                    System.out.println("player's choice = " + playerChoice);
                    break;
                case "Q":
                    System.out.println("Thanks for playing!");
                    break lp;
                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }
        }     
    }
}
