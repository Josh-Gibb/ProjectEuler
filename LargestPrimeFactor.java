/**
 * @author Josh Gibb
 * LargestPrimeFactor.java
 * A method to find the largest prime factor for a number
 */

public class LargestPrimeFactor {
    // A method to call the recursive method
    public static long findLargestPrimeFactor(long number){
        return findLargestPrimeFactor(number, 0);
    }
    
    // A recurive method to find the largest prime factor by continually diving the number by the next prime factor
    private static long findLargestPrimeFactor(long number, long largest){
        if(number == 1){
            return largest;
        }
        long nextPrime = findNextPrimeFactor(number);
        if(nextPrime > largest){
            largest = nextPrime;
        }
        return(findLargestPrimeFactor(number/nextPrime, largest));
        
    }
    // A method to find the next prime factor
    private static long findNextPrimeFactor(long number){
        if(number%2==0){
            return 2;
        }
        for(long i = 3; i < number; i += 2){
            if(isPrime(i)){
                if(number%i == 0)
                    return i;
            }
        }
        return number;
    }
    // A method to check that a number is a prime
    private static boolean isPrime(long factor){
        for(long i = 3L; i < factor; i+=2){
            if(factor%i==0){
                return false;
            }
        }
        return true;
    }
    
    // Main Method
    public static void main(String[] args){
        long number = 600851475143L;
        System.out.println(findLargestPrimeFactor(number));
    }
}
