//user_input.java
import java.util.*;

class UserInput {
    // Method to take an array of 5 numbers as input
    int[] arrayInput() {
        int[] array = new int[5]; // Array to store user input
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 5 Numbers:");
        
        // Loop to take input from the user
        for(int i = 0; i < array.length; i ++) {
            array[i] = scan.nextInt(); // Store each input number in the array
        }
        
        return array; // Return the user-inputted array
    }
}
