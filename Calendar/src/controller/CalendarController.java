package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import data.CalendarDAO;

@Controller
public class CalendarController
{
	@Autowired CalendarDAO calendarDAO;
	String monthNameF = "January";
	String monthNumberF = "1";
	String dayNumberF = "1";
	
	// Get month calendar
	@RequestMapping(path = "date.do", params = "name")
	public ModelAndView getMonthName(@RequestParam("name") String monthName)
	{
		monthNameF = monthName;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calendar.jsp");
		mv.addObject("calendar", calendarDAO.getByMonthName(monthName));
		return mv;
	}
	@RequestMapping(path = "date.do", params = "number")
	public ModelAndView getMonthNum(@RequestParam("number") String monthNumber)
	{
		monthNumberF = monthNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calendar.jsp");
		mv.addObject("calendar", calendarDAO.getByMonthNum(monthNumberF));
		return mv;
	}
	
	// Look at individual days
	@RequestMapping(path = "seeDay.do", params = "monday")
	public ModelAndView seeDayMon(@RequestParam("monday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsMon.jsp");
		mv.addObject("calendar", calendarDAO.seeMon(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "tuesday")
	public ModelAndView seeDayTues(@RequestParam("tuesday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsTues.jsp");
		mv.addObject("calendar", calendarDAO.seeTues(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "wednesday")
	public ModelAndView seeDayWed(@RequestParam("wednesday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsWed.jsp");
		mv.addObject("calendar", calendarDAO.seeWed(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "thursday")
	public ModelAndView seeDayThurs(@RequestParam("thursday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsThurs.jsp");
		mv.addObject("calendar", calendarDAO.seeThurs(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "friday")
	public ModelAndView seeDayFri(@RequestParam("friday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsFri.jsp");
		mv.addObject("calendar", calendarDAO.seeFri(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "saturday")
	public ModelAndView seeDaySat(@RequestParam("saturday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSat.jsp");
		mv.addObject("calendar", calendarDAO.seeSat(monthNumberF, dayNumberF));
		return mv;
	}
	@RequestMapping(path = "seeDay.do", params = "sunday")
	public ModelAndView seeDaySun(@RequestParam("sunday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSun.jsp");
		mv.addObject("calendar", calendarDAO.seeSun(monthNumberF, dayNumberF));
		return mv;
	}
	
	// Create individual events
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "monday"})
	public ModelAndView createEventMon(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("monday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsMon.jsp");
		mv.addObject("calendar", calendarDAO.getMon(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "tuesday"})
	public ModelAndView createEventTues(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("tuesday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsTues.jsp");
		mv.addObject("calendar", calendarDAO.getTues(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "wednesday"})
	public ModelAndView createEventWed(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("wednesday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsWed.jsp");
		mv.addObject("calendar", calendarDAO.getWed(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "thursday"})
	public ModelAndView createEventThurs(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("thursday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsThurs.jsp");
		mv.addObject("calendar", calendarDAO.getThurs(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "friday"})
	public ModelAndView createEventFri(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("friday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsFri.jsp");
		mv.addObject("calendar", calendarDAO.getFri(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "saturday"})
	public ModelAndView createEventSat(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("saturday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSat.jsp");
		mv.addObject("calendar", calendarDAO.getSat(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "sunday"})
	public ModelAndView createEventSun(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("sunday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSun.jsp");
		mv.addObject("calendar", calendarDAO.getSun(monthNumberF, dayNumberF, eventTime, eventName));
		return mv;
	}
	
	// Delete individual events
	@RequestMapping(path = "deleteEvent.do", params = {"monday"})
	public ModelAndView deleteEventMon(@RequestParam("monday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsMon.jsp");
		mv.addObject("calendar", calendarDAO.deleteMon(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"tuesday"})
	public ModelAndView deleteEventTues(@RequestParam("tuesday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsTues.jsp");
		mv.addObject("calendar", calendarDAO.deleteTues(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"wednesday"})
	public ModelAndView deleteEventWed(@RequestParam("wednesday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsWed.jsp");
		mv.addObject("calendar", calendarDAO.deleteWed(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"thursday"})
	public ModelAndView deleteEventThurs(@RequestParam("thursday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsThurs.jsp");
		mv.addObject("calendar", calendarDAO.deleteThurs(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"friday"})
	public ModelAndView deleteEventFri(@RequestParam("friday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsFri.jsp");
		mv.addObject("calendar", calendarDAO.deleteFri(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"saturday"})
	public ModelAndView deleteEventSat(@RequestParam("saturday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSat.jsp");
		mv.addObject("calendar", calendarDAO.deleteSat(monthNumberF, dayNumberF, event));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"sunday"})
	public ModelAndView deleteEventSun(@RequestParam("sunday") String event)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSun.jsp");
		mv.addObject("calendar", calendarDAO.deleteSun(monthNumberF, dayNumberF, event));
		return mv;
	}
}