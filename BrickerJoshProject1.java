import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BrickerJoshProject1 {
    public static void main(String[] args) {
        // This Creates a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // This Prompts the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // This Gets the current time
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        // This Prints the greeting message
        System.out.println("Hello " + name + ". Congrats on completing your first application at " + formattedTime + ".");
        
        // This Closes the scanner
        scanner.close();
    }
}