/**
 * @author Josh Gibb
 * NumberLetterCounts.java
 */
public class NumberLetterCounts {
    private static String getDigit(int pos){
        String[] numbers = {"", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten"};
        return numbers[pos];
    }
    
    private static String getSingleOrTeens(int pos){
        String[] numbers = {"", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        return numbers[pos];
    }
    
    private static String getTens(int pos){
        String[] numbers = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};
        return numbers[pos];
    }
    
    private final static String HUNDRED = "hundred";
    
    private final static String THOUSAND = "thousand";
    
    private final static String AND = "and";
    
    public static String getLetters(int number){
        String letters = "";
        for(int i = 1; i <= number; i++){
            System.out.println(getWord(i));
            letters += getWord(i);
        }
        return letters;
    }

  // A method that returns the number as a word
    private static String getWord(int number){
        if(number < 20){
            return getSingleOrTeens(number);
        }
        if(number < 100){
            return getTens(number/10) + getSingleOrTeens(number%10);
        }
        if(number < 1000){
            if(number % 100 == 0)
                return getSingleOrTeens(number/100) + HUNDRED;
            String temp = getSingleOrTeens(number/100) + HUNDRED + AND;
            number = number%100;
            if(number < 20){
                return temp + getSingleOrTeens(number);
            }
            if(number < 100){
                return temp + getTens(number/10) + getSingleOrTeens(number%10);
            }
            return temp;
        }
        return getSingleOrTeens(1) + THOUSAND;
    }
    
    public static void main(String[] args){
        System.out.println(getLetters(1000).length());
    }
}
