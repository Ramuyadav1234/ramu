import java.util.Calendar;
import java.util.Date;
public class Calender
{
     public static void main(String args[])
    {                 
	    Calendar calendar=Calendar.getInstance();
        calendar.set(2024,10,17);
        Date first Date=Calendar.getTime();
		calendar.set(2012,8,1);
        Date second Date=Calendar.gettime();
        System.out.println("Is firstdate before seconddate?"+firstdate.before(seconddate));
        System.out.println("Is firstdate after seconddate?"+firstdate.after(seconddate));
	}   
}