package HomeWork2;

import java.util.Arrays;

public class Date {

	
	
	 /* Put your private data fields here. */
	
	private int day;
	private int month;
	private int year;

	  /** Constructs a date with the given month, day and year.   If the date is
	   *  not valid, the entire program will halt with an error message.
	   *  @param month is a month, numbered in the range 1...12.
	   *  @param day is between 1 and the number of days in the given month.
	   *  @param year is the year in question, with no digits omitted.
	   */
	  public Date(int month, int day, int year) {
		 if(isValidDate(month, day, year)){
		  this.month = month;
		  this.day = day;
		  this.year=year;}
		 else{
			 System.out.println("Not valid date");
		 } 
		  
	  }
	  
	  
	  
	  

	  /** Constructs a Date object corresponding to the given string.
	   *  @param s should be a string of the form "month/day/year" where month must
	   *  be one or two digits, day must be one or two digits, and year must be
	   *  between 1 and 4 digits.  If s does not match these requirements or is not
	   *  a valid date, the program halts with an error message.
	   */
	  public Date(String s) {
		  
		  boolean b = s.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{1,4}");
		  if(b){
			  String [] arr = s.split("/");
			  int year = Integer.parseInt(arr[2]);
			  int day = Integer.parseInt(arr[1]);
			  int month = Integer.parseInt(arr[0]);
			  if(isValidDate(month, day, year)){
				  this.month = month;
				  this.year = year;
				  this.day = day;
				  System.out.println("Everything ok");
			  }else{
				  System.out.println("Error try again");
			  }
		  }else{
			  System.out.println("Error please try again");
		  }
		

	  }

	  /** Checks whether the given year is a leap year.
	   *  @return true if and only if the input year is a leap year.
	   */
	  public static boolean isLeapYear(int year) {
	 if(((year%4==0)||(year%400==0)) && year%100!=0){
		 return true;
	 }
	 return false;
	  }

	  /** Returns the number of days in a given month.
	   *  @param month is a month, numbered in the range 1...12.
	   *  @param year is the year in question, with no digits omitted.
	   *  @return the number of days in the given month.
	   */
	  public static int daysInMonth(int month, int year) {
	int numOfDays = 0;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numOfDays = 31;
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				numOfDays = 30;
				break;
			case 2:
				if(isLeapYear(year)==true){
					numOfDays = 29;
					break;
				}
				numOfDays = 28;
				break;

			default:
				numOfDays = 0;
				break;
			}
			return numOfDays;
		  
			
	    
	  }

	  /** Checks whether the given date is valid.
	   *  @return true if and only if month/day/year constitute a valid date.
	   *
	   *  Years prior to A.D. 1 are NOT valid.
	   */
	  public static boolean isValidDate(int month, int day, int year) {
			int days =   daysInMonth(month, year);
		
			if((month>=1 && month<=12) && (year>=1) && (day>0 && day<=days))  {
				   return true;
			   }
			   return false;
	  }

	  /** Returns a string representation of this date in the form month/day/year.
	   *  The month, day, and year are expressed in full as integers; for example,
	   *  12/7/2006 or 3/21/407.
	   *  @return a String representation of this date.
	   */
	  public String toString() {
	    return this.month+"/"+this.day+"/"+this.year;                     // replace this line with your solution
	  }

	  /** Determines whether this Date is before the Date d.
	   *  @return true if and only if this Date is before d. 
	   */
	  public boolean isBefore(Date d) {
	    if(this.year < d.year){
	    	return true;
	    }else if(this.year==d.year){
	    	if(this.month<d.month){
	    		return true;
	    	}else if(this.month==d.month){
	    		if(this.day<d.day){
	    			return true;
	    		}else{
	    			return false;
	    		}
	    	}
	    	else{
	    		return false;
	    	}
	    	}
	    else{
	    	return false;
	    }
	    	
	    	
	  }

	  /** Determines whether this Date is after the Date d.
	   *  @return true if and only if this Date is after d. 
	   */
	  public boolean isAfter(Date d) {
		  if(this.year > d.year){
		    	return true;
		    }else if(this.year==d.year){
		    	if(this.month>d.month){
		    		return true;
		    	}else if(this.month==d.month){
		    		if(this.day>d.day){
		    			return true;
		    		}else{
		    			return false;
		    		}
		    	}
		    	else{
		    		return false;
		    	}
		    	}
		    else{
		    	return false;
		    }                    // replace this line with your solution
	  }

	  /** Returns the number of this Date in the year.
	   *  @return a number n in the range 1...366, inclusive, such that this Date
	   *  is the nth day of its year.  (366 is used only for December 31 in a leap
	   *  year.)
	   */
	  public int dayInYear() {
		  int sum = 0;
	    for(int i = 1;i<this.month;i++)    {
	    	sum+=daysInMonth(i, this.year);
	    	
	    }
	    return sum+this.day;
	  }

	  /** Determines the difference in days between d and this Date.  For example,
	   *  if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1.
	   *  If this Date occurs before d, the result is negative.
	   *  @return the difference in days between d and this date.
	   */
	  public int difference(Date d) {
	
		  int diffYear = differenceInyears(d);
		  int diffMonth = differenceInMOnths(d);
		  return diffYear+diffMonth+(this.day-d.day);
		  
		 
	 }
		  
	 
	 
	 
	 
	 
	 
	  public  int differenceInyears(Date d){
		 int year1Sum = 0;
		 int year2Sum = 0;
		 for(int i = 1;i<this.year;i++){
			 if(isLeapYear(i)){
				 year1Sum+=366;
			 }
			 year1Sum+=365;
		 }
     for(int i = 1;i<d.year;i++){
    	 if(isLeapYear(i)){
    		 year2Sum+=366;
    	 }
    	 year2Sum+=365;
     }
     
	 return year1Sum-year2Sum;
		
	  }
	
	
	public int differenceInMOnths(Date d){
		int month1 = 0;
		int month2 = 0;
		
		
		for(int i = 1;i<this.month;i++){
			month1+=daysInMonth(i, this.year);
		}
		
		
		for(int i = 1;i<d.month;i++){
			month2 += daysInMonth(i, d.year);
		}
		return month1-month2;
		
	}
	
	
	
	
	
	
	
}
