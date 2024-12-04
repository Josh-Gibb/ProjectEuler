/**
 * @author Josh Gibb
 * LongestCollatzSequence.java
 */
public class LongestCollatzSequence {
    // Changes n to 3*n+1 if odd
    private static long odd(long n){
        return 3*n+1;
    }
    
    // Changes n to n/2 if even
    private static long even(long n){
        return n/2;
    }
    
    
    // Finds the length of a Calltz Sequence
    private static int length(long n){
        if(n==1){
            return 0;
        }
        if(n%2 == 0)
            return 1 + length(even(n));
        return 1 + length(odd(n));
    }
    
    // A method to find the longest chain for limit
    public static int longestChain(int limit){
        int number = 0;
        int maxLength = 0;
        for(int i = 1; i <= limit; i++){
            int length = length(i);
            if(length > maxLength)
            {
                maxLength = length;
                number = i;
            }
        }
        return number;
    }
    
    public static void main(String[] args){
        System.out.println(longestChain(1000000));
    }
}
