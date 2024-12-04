import java.math.BigInteger;

/**
 * @author Josh Gibb
 * PowerDigitSum.java
 */
public class PowerDigitSum {
    // A method to add the individual digits of the 2 to the power to 1000
    public static int addDigits(BigInteger number){
        String num = new String(number.toString());
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt("" + num.charAt(i));
        }
        return sum;
    }

    // A method to calculate 2 to the power of 1000
    public static BigInteger powerOfTwo(int power){
        BigInteger number = BigInteger.ONE;
        for(int i = 0; i < power; i++){
            number = number.multiply(BigInteger.TWO);
        }
        return number;
    }
    
    public static void main(String[] args){
        BigInteger num = powerOfTwo(1000);
        System.out.println(addDigits(num));
    }
}
