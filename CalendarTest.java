import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @version 1.4 2007-04-07
 * @author dell
 *
 */
public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.ENGLISH);
		
		GregorianCalendar d =new GregorianCalendar();
		
		int today=d.get(Calendar.DAY_OF_MONTH);
		int month=d.get(Calendar.MONTH);
		
		d.set(Calendar.DAY_OF_MONTH,1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		int indent =0;
		while (weekday != firstDayOfWeek)
		{
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);		
		}
	
		//打印星期几
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do
		{
			System.out.printf("%4s",weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH,1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		while (weekday != firstDayOfWeek);
		System.out.println();
		for (int i=1;i<=indent;i++)
			System.out.print("    ");
		
		d.set(Calendar.DAY_OF_MONTH,1);
		do
		{
			//打印日期
			int day =d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			//标记当前的日期
			if (day==today) System.out.print("*");
			else System.out.print(" ");
			
			//让d指向下一天
			d.add(Calendar.DAY_OF_MONTH,1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			//新的一周换行
			 if(weekday == firstDayOfWeek) System.out.println();
		}
		while (d.get(Calendar.MONTH) == month);
		
		//如果今天不是这周的第一天打印最后一行
		if(weekday != firstDayOfWeek) System.out.println();
		
	}

}
