/**
 * @author Josh Gibb
 * SummationOfPrimes.java
 * A class to find the sum of all prime numbers up to a limit
 */
public class SummationOfPrimes {
    // Finds the sum of all prime numbers up to number
    public static long sumOfPrimes(int number){
       long sum = 2;
       if(number == 2)
           return sum;
       for(int i = 3; i < number; i+=2){
           if(isPrime(i)){
               sum += i;
           }
       }
       return sum;
    }
    
    // A method to ensure a number is prime
    private static boolean isPrime(int number){
        for(int i = 3; i <= Math.sqrt(number); i+=2){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        System.out.println(sumOfPrimes(2000000));
    }
}
