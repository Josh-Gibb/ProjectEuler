
import java.util.Scanner;

/**
 * @author Josh Gibb
 * MultiplesOf3Or5.java
 * A project to find the sum of all multiples of 3 or 5 to user input
 */
public class MultiplesOf3Or5 {
    
    // Finds all numbers that are a multiple of 3 or 5 and adds the number to sum
    public static int getSum(int limit){
        int sum = 0;
        // For loop to run through 3 to limit
        for(int i = 0; i < limit; i++)
        {
            // Checks if the number is a multiple of 3 or 5
            if(i%3 == 0 || i % 5 ==0)
                sum += i;
        }
        return sum;
    }
    
    // A method to get the user input and verify the number is greater than 0
    public static int getNumber(){
        Scanner input;
        int number = 0;
        do{
            System.out.println("Enter a number ");
            input = new Scanner(System.in);
            number = input.nextInt();
            System.out.println();
            
        } while(number < 0);
        return  number;
    }
    public static void main(String[] args){
        System.out.println(getSum(getNumber()));
    }
}
