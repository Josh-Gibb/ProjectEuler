/**
 * @author Josh Gibb
 * EvenFibonacciNumbers.java
 * A program that finds the sum of the even terms of the 
 * Fibonacci sequence up to 4 million
 */
public class EvenFibonacciNumbers {
    // A method adding all even numbers until current is above the limit
    public static int getSumEvenFibonacci(int limit){
        int current = 1;
        int prev = 0;
        int sum = 0;
        // Checks if the current number is greater than the limit
        while(current < limit){
            int temp = current;
            current += prev;
            prev = temp;
            if(prev%2==0)
                // Adds previous as we know previous is below the limit
                sum += prev;
        }
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println(getSumEvenFibonacci(4000000)); 
    }
}
