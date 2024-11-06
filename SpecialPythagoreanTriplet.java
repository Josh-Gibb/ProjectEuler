/**
 * @author Josh Gibb
 * SpecialPythagoreanTriplet.java
 * A class to find Pythagorean triplets
 */
public class SpecialPythagoreanTriplet {
    // A class that finds a Pythagorean triplet equal to the total
    public static int product(int total){
        for(int i = 3; i < total; i++){
            for(int j = i; j < 1000-i; j++){
                int c = 1000-i-j;
                if(i*i+j*j == c*c){
                    System.out.println(i + " + " + j + " + " + c + " = 1000");
                    return i*j*(int)c;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        System.out.println(product(1000));
    }
}
