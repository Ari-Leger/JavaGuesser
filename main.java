import java.util.Scanner;

public class main {

    private Scanner keyboard;

    public main () {
        keyboard = new Scanner(System.in);

        int choice;

        do {
            System.out.println("0) Exit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");
            System.out.println();
            System.out.print("Please enter 0-2: ");

            choice = Integer.parseInt(keyboard.nextLine());

            if (choice == 1) {
                humanGuesser();
            } else if (choice == 2) {
                computerGuesser();
            }

            System.out.println();

        } while (choice != 0);
    }

    public void humanGuesser() {
        System.out.println("human guesser");

        int answer = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int count = 1;

        // Uncomment for testing:
        // System.out.println(answer);

        while (guess != answer) {
            System.out.print(count + ") Please enter a number: ");
            guess = Integer.parseInt(keyboard.nextLine());

            if (guess < answer) {
                System.out.println("too low...");
            } else if (guess > answer) {
                System.out.println("too high...");
            } else {
                System.out.println("got it!");
            }

            count++;
        }

        System.out.println();
        System.out.println("Very good!");
    }

    public void computerGuesser() {
        System.out.println("computer guesser");

        int low = 1;
        int high = 100;
        int count = 1;

        while (true) {

            int guess = (low + high) / 2;

            System.out.println(count + ") I guess " + guess);
            System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");

            String response = keyboard.nextLine().toLowerCase();

            if (response.equals("c")) {
                break;
            } else if (response.equals("h")) {
                high = guess;
            } else if (response.equals("l")) {
                low = guess;
            }

            count++;
        }
    }

    public static void main(String[] args) {
        new main();
    }
}
