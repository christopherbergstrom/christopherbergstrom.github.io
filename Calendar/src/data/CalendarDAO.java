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
	public Calendar seeMon(String month, String day);	
	public Calendar seeTues(String month, String day);	
	public Calendar seeWed(String month, String day);
	public Calendar seeThurs(String month, String day);
	public Calendar seeFri(String month, String day);
	public Calendar seeSat(String month, String day);
	public Calendar seeSun(String month, String day);
	public Calendar deleteMon(String month, String day, String event);	
	public Calendar deleteTues(String month, String day, String event);	
	public Calendar deleteWed(String month, String day, String event);
	public Calendar deleteThurs(String month, String day, String event);
	public Calendar deleteFri(String month, String day, String event);
	public Calendar deleteSat(String month, String day, String event);
	public Calendar deleteSun(String month, String day, String event);
}
