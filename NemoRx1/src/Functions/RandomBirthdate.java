package Functions;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class RandomBirthdate {

	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	
	    public static  String main1() {

	        GregorianCalendar gc = new GregorianCalendar();

	        int year = randBetween(2001, 2010);

	        gc.set(gc.YEAR, year);

	        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

	        gc.set(gc.DAY_OF_YEAR, dayOfYear);

	        String date = (gc.get(gc.MONTH) + 1)+"/"+gc.get(Calendar.DAY_OF_MONTH)+"/"+gc.get(gc.YEAR);
	        //System.out.println((gc.get(gc.MONTH) + 1)+"/"+gc.get(gc.DAY_OF_MONTH)+"/"+gc.get(gc.YEAR));
	        return date;

	    }
public static void main(String args[]){
	
	System.out.println(RandomBirthdate.main1());
	
}
	   
	}


