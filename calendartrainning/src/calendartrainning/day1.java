	package calendartrainning;


import java.text.SimpleDateFormat;
import java.util.*;


public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal2 = new GregorianCalendar(1984,10 ,25);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMMM dd, ''yyyy");
		
		String mDate = sdf.format(cal2.getTime());
		
		System.out.println("Here : "+ mDate.toString()+ " " + day1.format(new GregorianCalendar())); 
		
		
		 // create a calendar
	      Calendar cal = Calendar.getInstance();

	      // print current date
	      System.out.println("The current date is : " + cal.getTime());
	      
//	      Date objDate = cal2.getTime();
//	      long diff = objDate - cal.getTime();

	      // add 20 days to the calendar
	      cal.add(Calendar.DATE, 20);
	      System.out.println("20 days later: " + cal.getTime());

	      // subtract 2 months from the calendar
	      cal.add(Calendar.MONTH, -2);
	      System.out.println("2 months ago: " + cal.getTime());

	      // subtract 5 year from the calendar
	      cal.add(Calendar.YEAR, -5);
	      System.out.println("5 years ago: " + cal.getTime());
	      
	      
	      
		
	      // create a new calendar
//	      GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
//
//	      // print the current date and time
//	      System.out.println("Current date: " + cal.getTime().toString());
//	      Date objectDate = cal.getTime();
//	      
//	      //objectDate.
//
//	      // set gregorian change at another date
//	      cal.setGregorianChange(new Date(1984,10 , 25));
//	      System.out.println("Gregorian Change Date " + cal.getGregorianChange());
//	   
		 

	}
	
	/**
	 * 
	 * 
	 * 
	 */
	public static String format(GregorianCalendar calendar){
	    SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
	    fmt.setCalendar(calendar);
	    String dateFormatted = fmt.format(calendar.getTime());
	    return dateFormatted;
	}
	
	public static String format(Calendar calendar){
	    SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
	    fmt.setCalendar(calendar);
	    String dateFormatted = fmt.format(calendar.getTime());
	    return dateFormatted;
	}
	

}
