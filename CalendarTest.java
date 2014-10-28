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
	
		//��ӡ���ڼ�
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
			//��ӡ����
			int day =d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			//��ǵ�ǰ������
			if (day==today) System.out.print("*");
			else System.out.print(" ");
			
			//��dָ����һ��
			d.add(Calendar.DAY_OF_MONTH,1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			//�µ�һ�ܻ���
			 if(weekday == firstDayOfWeek) System.out.println();
		}
		while (d.get(Calendar.MONTH) == month);
		
		//������첻�����ܵĵ�һ���ӡ���һ��
		if(weekday != firstDayOfWeek) System.out.println();
		
	}

}
