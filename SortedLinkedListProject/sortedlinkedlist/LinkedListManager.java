package sortedlinkedlist;

import java.util.LinkedList;
import java.util.Collections;

/**
 * Manage the operations on the linked list of integers
 */
public class LinkedListManager {
    // Code reuse - using LinkedList collection
    private final LinkedList<Integer> intsList = new LinkedList<>();

    /**
     * Process user input to add integers to the linked list.
     *
     * @param userInput string from the user containing their input
     */
    public void processInput(String userInput) {
        String regex = "[,\\.\\s]+";
        try {
            String[] stringArray = userInput.split(regex);
            for (String str : stringArray) {
                if (!str.trim().isEmpty()) {
                    int parsedInput = Integer.parseInt(str.trim());
                    intsList.add(parsedInput); // Add to list
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter only integers.");
        }
    }

    /**
     * Return the size of the linked list.
     *
     * @return The number of elements within the linked list.
     */
    public int getSize() {
        return intsList.size();
    }

    /**
     * Sort the elements within the linked list in ascending order.
     * Code reuse - use already existing .sort() method from Collections library
     */
    public void sortList() {
        Collections.sort(intsList);
    }

    /**
     * Return the linked list integers.
     *
     * @return The linked list of integers.
     */
    public LinkedList<Integer> getList() {
        return intsList;
    }
}
