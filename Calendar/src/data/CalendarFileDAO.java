package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class CalendarFileDAO implements CalendarDAO
{
	private static final String FILE_NAME = "WEB-INF/calendar.csv";
	private List<Calendar> calendars = new ArrayList<>();
	
	@Autowired
	private ApplicationContext ac;
	
	@PostConstruct
	public void init()
	{
		try (InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is)))
		{
			String line;
			while ((line = buf.readLine()) != null)
			{
				String[] cal = line.split(",");
				String monthNum = cal[0];
				String month = cal[1];
				String mon = cal[2];
				String tues = cal[3];
				String wed = cal[4];
				String thurs = cal[5];
				String fri = cal[6];
				String sat = cal[7];
				String sun = cal[8];
				String dayNum = cal[9];
				String dayName = cal[1];
				calendars.add(new Calendar(monthNum, month, mon, tues, wed, thurs, fri, sat, sun, dayNum, dayName));
			}
			buf.close();
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	public Calendar getByMonthName(String month)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonth().equalsIgnoreCase(month))
			{
				cal = calendar;
				break;
			}
		}
		return cal;
	}
	public Calendar getByMonthNum(String month)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				break;
			}
		}
		return cal;
	}
	public Calendar getMon(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Monday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getTues(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Tuesday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getWed(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Wednesday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getThurs(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Thursday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getFri(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Friday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getSat(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Saturday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
	public Calendar getSun(String month, String day)
	{
		Calendar cal = null;
		for (Calendar calendar : calendars)
		{
			if (calendar.getMonthNum().equalsIgnoreCase(month))
			{
				cal = calendar;
				cal.setDayName("Sunday");
				cal.setDayNum(day);
				break;
			}
		}
		return cal;
	}
}
