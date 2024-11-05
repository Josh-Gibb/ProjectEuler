/**
 * @author Josh Gibb
 * SumSquareDifference.java
 * A project to find the difference between n numbers squared and the sum of the n numbers squared
 */
public class SumSquareDifference {
    // A method to find the difference
    public static long sumSquareDiff(int n){
        // For the sum and then squaring it
        long sum = 0;
        // For the sum of n numbers squared
        long squareSum = 0;
        for(int i = 1; i <= n; i++){
            squareSum += i*i;
            sum += i;
        }
        return sum*sum - squareSum;
    }
    
    public static void main(String[] args){
        System.out.println(sumSquareDiff(100));
    }
}
