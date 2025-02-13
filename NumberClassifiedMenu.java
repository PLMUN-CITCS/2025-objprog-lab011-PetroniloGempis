//Import Scanner and Create Class Structure
import java.util.Scanner;

public class NumberClassifiedMenu {
    public static void main(String[] args) {

        //Create Scanner Object and Choice Variable
        Scanner input = new Scanner(System.in);
        char userChoice;

        //Do-While Loop for Menu
        do {
            //Display Menu Options
            System.out.println("=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            //Read User Choice
            int choice = input.nextInt();

            //Switch Statement for Menu Handling
            switch (choice) {

                //Case 1: Classify Number
                case 1:
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();

                    if (number > 0) {
                        System.out.println("The number " + number + " is positive. ");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number " + number + " is zero.");
                    }

                    if (number % 2 == 0) {
                        System.out.println("It is an even number");
                    } else {
                        System.out.println("It is an odd number");
                    }
                break;
                
                //Case 2: Multiplication Table
                case 2:
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();

                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;
                
                //Case 3: Exit
                case 3:
                    System.out.print("Exiting the program. Goodbye!");
                break;

                //Default Case
                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
                break;
            }

            //Ask to Continue
            if (choice != 3) {
                System.out.print("Do you want to return to the menu? (Y/N): ");
                input.nextLine();
                userChoice = input.nextLine().toUpperCase().charAt(0);
            } else {
                userChoice = 'N';
            }
            
        }while (userChoice == 'Y');
        
        //Close Scanner
        input.close();
        
    }
}