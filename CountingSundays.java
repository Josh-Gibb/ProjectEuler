/**
 * @author Josh Gibb
 * CountingSundays.java
 */
public class CountingSundays {
    // A method to return the number of days for each month
    private static int getDaysOfMonth(int month, int year){
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if(year%4 == 0){
                    if(!(year%100 == 0 && year%400 != 0))   
                        return 29;
                }
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                break;
        }
        return 0;
    }

    // A method to find the Sundays that fall on the 1st of the month
    // Days start at 1, to represent 1 Jan 1900 is a Monday
    public static int countSundays(){
        int sundays = 0;
        int days = 1;
        for(int year = 1900; year <= 2000; year++){
            for(int month = 1; month <= 12; month++){
                if(days%7==0 && year > 1900){
                    sundays++;
                }
                days += getDaysOfMonth(month, year);
            }
        }
        return sundays;
    }
    
    public static void main(String[] args){
        System.out.println(countSundays());
    }
}
