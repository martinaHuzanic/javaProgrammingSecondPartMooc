
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checker check = new Checker();
        while (true) {
            if (check.timeOfDay(takeInput(scan))) {
                System.out.println("The form is correct.");
            } else {
                System.out.println("The form is incorrect.");
            }
            System.out.println("Press quit to break.");
            if (takeInput(scan).equals("quit")) {
                break;
            }
        }

    }

    public static String takeInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        String in = scanner.nextLine();
        return in;
    }
}
