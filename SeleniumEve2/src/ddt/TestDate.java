package ddt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;


public class TestDate {
	
	@Test
	public void getDate() {
		Date d1=new Date();
		System.out.println("Defualt date: "+d1);
		SimpleDateFormat s1=new SimpleDateFormat("MMM/dd/yyyy");
		System.out.println("Formated date: "+s1.format(d1));
	}
	
	@Test
	public void testDate(){
		
	    System.out.println("Date in required format : "+getDateWithFormat("dd-MMM-yyyy"));
	    System.out.println("Date in required format : "+getDateWithFormat("MM/dd/yyyy"));
	    System.out.println("Date in required format : "+getDateWithFormat("dd MM yyyy"));
	    System.out.println("Past date : "+getPastOrFutureDate(-5));
	    System.out.println("Past date : "+getPastOrFutureDate(5));
		compareDates(getDateWithFormat("dd MM yyyy"),getPastOrFutureDate(0));
	}
	String getPastOrFutureDate(int daysNumber){
		Calendar cal  = Calendar.getInstance();
	    //subtracting or addition a day
	    cal.add(Calendar.DATE, daysNumber);

	    SimpleDateFormat s = new SimpleDateFormat("dd MM yyyy");
	    return s.format(new Date(cal.getTimeInMillis()));
	    
	}
	void compareDates(String date1,String date2){
		 String currentDate=date1;
		 String dateToBeCompared=date2;
		 System.out.println("1st Current Date is :"+currentDate);
		 System.out.println("2nd past or future date: "+dateToBeCompared);
		 if(currentDate.compareTo(dateToBeCompared)>0){
			 System.out.println("currentDate occurs after dateToBeCompared");
		 }else if (currentDate.compareTo(dateToBeCompared)<0) {
			 System.out.println("currentDate occurs before dateToBeCompared");
		}else if(currentDate.compareTo(dateToBeCompared)<0) {
			 System.out.println("currentDate occurs and dateToBeCompared both are same date");
		}else{
			System.out.println("Either both the date are not in same format or you have given invalid date");
		}
	}
	String getDateWithFormat(String requiredFormat){
		
		 Date objDate = new Date( ); 
	     System.out.println("Defualt date format is :"+objDate);//
	     String strDateFormat = requiredFormat;//Date format is Specified
	     SimpleDateFormat simpleDateFormat = new SimpleDateFormat (strDateFormat);//Date format string is passed as an argument to the Date format object
	     return simpleDateFormat.format(objDate);//Date formatting is applied to the current date
	}

}
