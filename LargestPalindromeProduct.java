/**
 * @author Josh Gibb
 * LargestPalindromeProduct.java
 * A method to find the largest palindrome created for the product of two 3 digit numbers
 */
public class LargestPalindromeProduct {
    // A method that checks if the result is a Palindrome
    private static boolean isPalindrome(int number){
        int temp = number;
        int reverse = 0;
        while(temp > 0){
            reverse = 10*reverse + temp % 10;
            temp /= 10;
        }
        return (reverse == number);
    }
    
    // This is a method that goes through all possibilities to get the largest Palindrome
    public static int largest(){
        int largest = 0;
        int i = 999, j = 0;
        while(i >=100){
            j = 999;
            while(j>=i){
                if(i*j < largest)
                    break;
                if(isPalindrome(i*j))
                    largest = i*j;
                j--;
            }
            i--;
        }
        return largest;
    }
    
    public static void main(String[] args){
        System.out.println(largest());
    }
}

