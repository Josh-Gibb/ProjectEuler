/**
 * @author Josh Gibb
 * Prime.java
 * Finds a prime number in the nth position
 */
public class Prime {
    
    // A method to call the main recursive method
    public static long getPrime(int position){
        if(position == 1)
            return 2;
        return getPrime(position, 3);
    }
    
    // A recursive method to find the next prime number
    private static long getPrime(int position, long current){
        if(position==2)
            return current;
        boolean found = false;
        while(!found){
            found = true;
            current+=2;
            // Ensures if a number is prime or not
            for(int i = 3; i <= Math.round(Math.sqrt(current)); i+=2){
                if(current%i == 0)
                    found = false;
            }
        }
        return getPrime(position-1, current);
    }
    
    public static void main (String[] args){
        System.out.println(getPrime(10001));
    }
}
