package data;

public interface CalendarDAO
{
	public Calendar getByMonthName(String month);
	public Calendar getByMonthNum(String month);
	public Calendar getMon(String month, String day, String eventName, String eventTime);	
	public Calendar getTues(String month, String day, String eventName, String eventTime);	
	public Calendar getWed(String month, String day, String eventName, String eventTime);
	public Calendar getThurs(String month, String day, String eventName, String eventTime);
	public Calendar getFri(String month, String day, String eventName, String eventTime);
	public Calendar getSat(String month, String day, String eventName, String eventTime);
	public Calendar getSun(String month, String day, String eventName, String eventTime);
}
