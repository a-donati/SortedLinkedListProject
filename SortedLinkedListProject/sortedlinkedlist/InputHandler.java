package sortedlinkedlist;

import java.util.Scanner;

/**
 * Handle user input for adding user input to the linked list.
 */

public class InputHandler {

    private final LinkedListManager listManager = new LinkedListManager();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Start the input loop to add items to the linked list. Users are able to
     * enter integers seperated by spaces, commas, or periods. Type 'exit' in
     * order to exit the program.
     */
    public void start() {
        // While loop to continue tr prompt the user for input
        while (true) {
            System.out.println("Add items to a linked list. Enter integers separated by a space, comma, or period. (Type 'exit' to quit):");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            listManager.processInput(userInput);
            listManager.sortList();

            if (listManager.getSize() == 0) {
                System.out.println("The linked list is empty.");
            } else {
                System.out.println("Linked List: " + listManager.getList());

            }
        }
        scanner.close(); // Close the scanner when done
    }
}
