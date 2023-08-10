

//TC: O(n^2).
//SC: O(n). n is no of CALLSTACK.

// this code i copy from the CHAT GPT but i am also practice this code using ONE COMPILER
//so this code is to learn the new concept.
public static void printAsteriskPattern(int n, int row) {
    // Base case: If the row exceeds n, return.
    if (row > n) {
        return;
    }

    // Print the asterisks for the current row.
    printAsterisks(row, 1);
    System.out.println();

    // Recur for the next row.
    printAsteriskPattern(n, row + 1);
}

public static void printAsterisks(int count, int current) {
    // Base case: If count reaches 0, return.
    if (count == 0) {
        return;
    }

    // Print an asterisk and recur for the rest.
    System.out.print("* ");
    printAsterisks(count - 1, current + 1);
}

public static void main(String[] args) {
    int n = 4; // Change this to the desired value of n
    printAsteriskPattern(n, 1);
}
