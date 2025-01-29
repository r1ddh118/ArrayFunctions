// ArrayFunctions.java

import java.util.*;
import java.lang.Math;

class ArrayFunctions {
    
    // Method to display an array
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }
    
    // Method to classify numbers as even or odd and find minimum difference
    void evenOdd() {
        // Creating an instance of UserInput to take array input
        UserInput in = new UserInput();
        int[] array = in.arrayInput();
        
        // Lists to store even and odd numbers
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        // Loop through the array to separate even and odd numbers
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]); // Add even numbers to even list
            } else {
                odd.add(array[i]); // Add odd numbers to odd list
            }
        }
        
        // Display the even and odd numbers
        display(even);
        display(odd);
        
        // Find and print the minimum difference
        difference(array);
    }
    
    // Method to find the smallest absolute difference between numbers in the array
    void difference(int[] array) {
        ArrayList<Integer> diff = new ArrayList<Integer>();

        // Compute the difference between each pair of numbers
        for (int i = 0; i < array.length; i++) {
            int smallestDifference = 99999; // Large initial value

            for (int j = i + 1; j < array.length; j++) {
                int dif = array[i] - array[j];
                if (Math.abs(dif) < Math.abs(smallestDifference)) {
                    smallestDifference = Math.abs(dif); // Store the smallest difference
                }
            }

            if (smallestDifference != 99999) {
                diff.add(smallestDifference);
            }
        }
        
        // Finding the minimum difference and corresponding index
        int smallestDiff = 99999;
        int index = -1;

        for (int i = 0; i < diff.size(); i++) {
            if (Math.abs(diff.get(i)) < Math.abs(smallestDiff)) {
                smallestDiff = diff.get(i);
                index = i;
            }
        }
        
        // Print the first number with the minimum difference and its index
        System.out.println("The first number with minimum difference is: " + array[index]);
        System.out.println("The index is = " + index);
        System.out.println("The minimum difference is: " + smallestDiff);
    }
}
    }
       
                
}
