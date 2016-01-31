package data;

import java.util.List;

public class Calendar
{
	private String monthNum;
	private String month;
	private String dayNum;
	private String dayName;
	private List<String> event;
	
	Calendar(String monthNum, String month, String dayNum, String dayName, List<String> event)
	{
		this.monthNum = monthNum;
		this.month = month;
		this.dayNum = dayNum;
		this.dayName = dayName;
		this.event = event;
	}
	
	public String getMonthNum()
	{
		return monthNum;
	}
	public void setMonthNum(String monthNum)
	{
		this.monthNum = monthNum;
	}
	public String getMonth()
	{
		return month;
	}
	public void setMonth(String month)
	{
		this.month = month;
	}
	public String getDayNum()
	{
		return dayNum;
	}
	public void setDayNum(String dayNum)
	{
		this.dayNum = dayNum;
	}
	public String getDayName()
	{
		return dayName;
	}
	public void setDayName(String dayName)
	{
		this.dayName = dayName;
	}
	public List<String> getEvent()
	{
		return event;
	}
	public void setEvent(String eventTime, String eventName)
	{
		this.event.add(eventTime + " - " + eventName);
	}
	public void deleteEvent(String event)
	{
		for (int i = 0; i < this.event.size(); i++)
		{
			if (this.event.get(i).equals(event))
			{
				this.event.remove(i);
			}
		}
	}
	public String toString()
	{
		return monthNum + month + dayNum + dayName + event;
	}
}
