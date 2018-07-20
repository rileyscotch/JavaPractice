import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        //Output Prompt
        System.out.println("Enter a line of text dawg: ");

        //Awaiting Input
        String line = input.nextLine();

        //Response
        System.out.println("Dawg you typed: " + line);
    }
}
