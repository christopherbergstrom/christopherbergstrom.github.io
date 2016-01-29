package data;

public interface CalendarDAO
{
	public Calendar getByMonthName(String month);
	public Calendar getByMonthNum(String month);
	public Calendar getMon(String month, String day);	
	public Calendar getTues(String month, String day);	
	public Calendar getWed(String month, String day);	
	public Calendar getThurs(String month, String day);	
	public Calendar getFri(String month, String day);	
	public Calendar getSat(String month, String day);	
	public Calendar getSun(String month, String day);	
//	public void addEvent(Calendar new);
}
