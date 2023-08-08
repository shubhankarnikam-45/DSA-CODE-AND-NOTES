// Starting with the original string
String original = "Hello, World!";

// Creating a StringBuilder object and initializing it with the original string
// This allows us to work with the characters and manipulate them efficiently
StringBuilder reversed = new StringBuilder(original);

// Using the reverse() method of StringBuilder to reverse the characters in the object
reversed.reverse();

// Converting the reversed StringBuilder object back to a regular string using toString()
String reversedString = reversed.toString();

// Printing the reversed string
System.out.println(reversedString); // Output: "!dlroW ,olleH"


//time and space complexity.

// Sure, let's break down the time and space complexity of the given program in simple terms:

// **Time Complexity**:
// The main part of this program that affects time complexity is the `reversed.reverse();` line, where the reversal of characters happens. In the `StringBuilder` class, reversing the characters takes O(n) time, where "n" is the length of the string.

// So, the time complexity of this program is O(n), where "n" is the length of the original string. This means the time it takes to reverse the string increases linearly as the length of the string grows.

// **Space Complexity**:
// The space complexity of the program is determined by the additional memory used to store the `reversed` `StringBuilder` object and the `reversedString` variable.

// - The `StringBuilder` object (`reversed`) stores the characters of the string temporarily for the purpose of reversing. Its space complexity is O(n), where "n" is the length of the original string.
// - The `reversedString` variable stores the final reversed string. Its space complexity is also O(n), because it holds a string with the same length as the original string.

// In summary, the program takes linear time (O(n)) to reverse the characters in the string, and it uses additional memory proportional to the length of the string for the `StringBuilder` and the final reversed string (O(n) space complexity).