package data;

import java.util.List;

public class Calendar
{
	private String monthNum;
	private String month;
	private String mon;
	private String tues;
	private String wed;
	private String thurs;
	private String fri;
	private String sat;
	private String sun;
	private String dayNum;
	private String dayName;
	private List<String> eventName;
	private List<String> eventTime;
	
	Calendar(String monthNum, String month, String mon, String tues, String wed, String thurs, String fri, String sat, String sun, String dayNum, String dayName, List<String> eventName, List<String> eventTime)
	{
		this.monthNum = monthNum;
		this.month = month;
		this.mon = mon;
		this.tues = tues;
		this.wed = wed;
		this.thurs = thurs;
		this.fri = fri;
		this.sat = sat;
		this.sun = sun;
		this.dayNum = dayNum;
		this.dayName = dayName;
		this.eventName = eventName;
		this.eventTime = eventTime;
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
	public String getMon()
	{
		return mon;
	}
	public void setMon(String mon)
	{
		this.mon = mon;
	}
	public String getTues()
	{
		return tues;
	}
	public void setTues(String tues)
	{
		this.tues = tues;
	}
	public String getWed()
	{
		return wed;
	}
	public void setWed(String wed)
	{
		this.wed = wed;
	}
	public String getThurs()
	{
		return thurs;
	}
	public void setThurs(String thurs)
	{
		this.thurs = thurs;
	}
	public String getFri()
	{
		return fri;
	}
	public void setFri(String fri)
	{
		this.fri = fri;
	}
	public String getSat()
	{
		return sat;
	}
	public void setSat(String sat)
	{
		this.sat = sat;
	}
	public String getSun()
	{
		return sun;
	}
	public void setSun(String sun)
	{
		this.sun = sun;
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
	public List<String> getEventName()
	{
		return eventName;
	}
	public void setEventName(String eventName)
	{
		this.eventName.add(eventName);
	}
	public List<String> getEventTime()
	{
		return eventTime;
	}
	public void setEventTime(String eventTime)
	{
		this.eventTime.add(eventTime);
	}
	public String toString()
	{
		return monthNum + month + mon + tues + wed + thurs + fri + sat + sun + dayNum + dayName + eventName + eventTime;
	}
}
