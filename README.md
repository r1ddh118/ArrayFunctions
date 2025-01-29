# Java Array Processing Program

## Overview
This project is a simple Java program that processes an array of numbers provided by the user. It classifies the numbers into even and odd categories, displays them, and finds the pair with the smallest absolute difference.

## Files and Their Purpose
1. **Main.java**: Entry point of the program. It initializes `ArrayFunctions` and calls its methods.
2. **ArrayFunctions.java**: Contains methods to:
   - Separate even and odd numbers.
   - Display arrays.
   - Compute and display the smallest absolute difference between numbers.
3. **UserInput.java**: Handles user input by accepting an array of 5 integers.

## Methods and Functions
### `UserInput.java`
- **`arrayInput()`**:
  - Prompts the user to enter 5 numbers.
  - Stores and returns them as an integer array.

### `ArrayFunctions.java`
- **`display(ArrayList<Integer> array)`**:
  - Prints the given list of numbers.
- **`evenOdd()`**:
  - Calls `arrayInput()` to take user input.
  - Separates numbers into even and odd lists.
  - Calls `display()` to print both lists.
  - Calls `difference()` to compute the smallest absolute difference.
- **`difference(int[] array)`**:
  - Finds the smallest absolute difference between any two numbers.
  - Displays the first number with this minimum difference and its index.

## How to Run
1. Compile all Java files:
   ```sh
   javac Main.java ArrayFunctions.java UserInput.java
   ```
2. Run the program:
   ```sh
   java Main
   ```
3. Enter 5 numbers when prompted.
4. The program will display even and odd numbers separately and compute the smallest absolute difference.

## Example Usage
```
Enter 5 Numbers:
3 8 15 7 12
Array is: [8, 12]
Array is: [3, 15, 7]
The first number with minimum difference is: 7
The index is = 3
The minimum difference is: 1
```

## Dependencies
- Java Development Kit (JDK)
- Java Runtime Environment (JRE)
