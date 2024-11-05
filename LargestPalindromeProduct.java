/**
 * @author Josh Gibb
 * LargestPalindromeProduct.java
 * A method to find the largest palindrome created for the product of two 3 digit numbers
 */
public class LargestPalindromeProduct {
    // A method that checks if the result is a Palindrome
    private static boolean isPalindrome(String number, int start, int end){
        if(start >= end)
            return true;
        if(number.charAt(start) != number.charAt(end))
            return false;
        return isPalindrome(number, start+1, end-1);
    }
    
    // This is a method that goes through all possibilities to get the largest Palindrome
    public static int largest(){
        int largest = 0;
        for(int i = 999; i >= 100; i--){
            for(int j = 999; j >= 100; j--)
            {
                if(largest < i*j){
                    String temp = "" + i*j;
                    if(isPalindrome(temp, 0, temp.length()-1))
                        largest = i*j;
                }
            }
        }
        return largest;
    }
    
    public static void main(String[] args){
        System.out.println(largest());
    }
}
