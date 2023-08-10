
//tc: O(n)
//sc: O(n)

//this problem encounter when i solved the fibonacci series in acciojob assignment.
//so see the notes for idea/concept behind it.
//it used simple mathematics 

//happy coding:)

public class EvenFibonacci {
    public static int nthEvenFibonacci(int n) {
        //base case.
        if (n <= 0) {
            return 0;
        }
        //base case
         else if (n == 1) {
            return 2; // The first even Fibonacci number is 2.
        }
        //recursive case. 
        else {
            return 4 * nthEvenFibonacci(n - 1) + nthEvenFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 18; // Change this to the desired Nth even Fibonacci number.
        int result = nthEvenFibonacci(n);
        System.out.println("The " + n + "th even Fibonacci number is: " + result);
    }
}
