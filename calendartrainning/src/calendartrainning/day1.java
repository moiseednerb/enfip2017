	package calendartrainning;


import java.util.*;


public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      // create a new calendar
	      GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

	      // print the current date and time
	      System.out.println("Current date: " + cal.getTime().toString());
	      Date objectDate = cal.getTime();
	      
	      //objectDate.

	      // set gregorian change at another date
	      cal.setGregorianChange(new Date(1984,10 , 25));
	      System.out.println("Gregorian Change Date " + cal.getGregorianChange());
	   
		 

	}

}
