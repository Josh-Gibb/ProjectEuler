/**
 * @author Josh Gibb
 * SmallestMultiple.java
 * A class to find the smallest multiple for a series of numbers
 */
public class SmallestMultiple {
    // A method to find the smallest multiple
    public static int findSmallest(int start, int end){
        boolean found = false;
        int number = 0;
        long barrier = 1;
        for(int i = 2; i <= 20; i++){
            barrier *= i;
        }
        // Method to find the smallest multiple
        while(number <= barrier && found == false){
            found = true;
            number += 2;
            for(int i = 3; i <= end; i++){
                if(number%i!=0){
                    found = false;
                    break;
                }
            }
        }
        return number;
    }
    
    public static void main(String[] args){
        System.out.println(findSmallest(1, 20));
    }
}
