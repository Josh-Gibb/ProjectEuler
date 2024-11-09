/**
 * @author Josh Gibb
 * HighlyDivisibleTriangularNumber.java
 * A class to find a Triangular Number with x number of factors
 */
public class HighlyDivisibleTriangularNumber {
    // A method to get the next number
    private static long getNextNumber(long number, int next){
        return number+next;
    }
    
    // A number to verify there the number has x amount of divisors, if not increase size of number
    private static boolean isEnoughOfDivisors(long number, int factors){
        if(number < factors*factors){
            return false;
        }
        int root = (int) Math.sqrt(number);
        int count = 0;
        for(long i = 1; i < root; i++){
            if(number%i == 0){
                count+=2;
            }
        }
        if(root*root == number){
            count++;
        }   
        if(count > factors)
            return true;
        return false;
    }
    
    // A public method the user can call
    public static long getFirst(int factors){
        return getFirst(1, factors, 2);
    }
    
    // A method that runs until a number is that meets the requirements is found
    private static long getFirst(long number, int factors, int next){
        while(!isEnoughOfDivisors(number, factors)){
            number = getNextNumber(number, next++);
        }
        return number;
    }
    
    public static void main(String[] args){
        System.out.println(getFirst(500));
    }
}
