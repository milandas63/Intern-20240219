
public class LeapYear {

	public static void main(String[] args) {
	        printNext20LeapYears();
	    }

	    public static void printNext20LeapYears() {
	        int year = getCurrentYear(); // Get the current year
	        int count = 0;
	        
	        System.out.println("Next 20 leap years:");

	        while (count < 20) {
	            if (isLeapYear(year)) {
	                System.out.println(year);
	                count++;
	            }
	            year++;
	        }
	    }

	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static int getCurrentYear() {
	        
	        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
	    }

}
