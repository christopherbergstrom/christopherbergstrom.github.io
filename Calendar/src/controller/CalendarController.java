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
	@RequestMapping(path = "addEvent.do", params = "monday")
	public ModelAndView addEventMon(@RequestParam("monday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsMon.jsp");
		mv.addObject("calendar", calendarDAO.getMon(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "tuesday")
	public ModelAndView addEventTues(@RequestParam("tuesday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsTues.jsp");
		mv.addObject("calendar", calendarDAO.getTues(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "wednesday")
	public ModelAndView addEventWed(@RequestParam("wednesday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsWed.jsp");
		mv.addObject("calendar", calendarDAO.getWed(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "thursday")
	public ModelAndView addEventThurs(@RequestParam("thursday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsThurs.jsp");
		mv.addObject("calendar", calendarDAO.getThurs(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "friday")
	public ModelAndView addEventFri(@RequestParam("friday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsFri.jsp");
		mv.addObject("calendar", calendarDAO.getFri(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "saturday")
	public ModelAndView addEventSat(@RequestParam("saturday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSat.jsp");
		mv.addObject("calendar", calendarDAO.getSat(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "sunday")
	public ModelAndView addEventSun(@RequestParam("sunday") String dayNumber)
	{
		dayNumberF = dayNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSun.jsp");
		mv.addObject("calendar", calendarDAO.getSun(monthNumberF, dayNumberF, "", ""));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "monday"})
	public ModelAndView createEventMon(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("monday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsMon.jsp");
		mv.addObject("calendar", calendarDAO.getMon(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "tuesday"})
	public ModelAndView createEventTues(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("tuesday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsTues.jsp");
		mv.addObject("calendar", calendarDAO.getTues(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "wednesday"})
	public ModelAndView createEventWed(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("wednesday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsWed.jsp");
		mv.addObject("calendar", calendarDAO.getWed(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "thursday"})
	public ModelAndView createEventThurs(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("thursday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsThurs.jsp");
		mv.addObject("calendar", calendarDAO.getThurs(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "friday"})
	public ModelAndView createEventFri(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("friday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsFri.jsp");
		mv.addObject("calendar", calendarDAO.getFri(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "saturday"})
	public ModelAndView createEventSat(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("saturday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSat.jsp");
		mv.addObject("calendar", calendarDAO.getSat(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "createEvent.do", params = {"event", "time", "sunday"})
	public ModelAndView createEventSun(@RequestParam("event") String eventName, @RequestParam("time") String eventTime, @RequestParam("sunday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventsSun.jsp");
		mv.addObject("calendar", calendarDAO.getSun(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
	@RequestMapping(path = "deleteEvent.do", params = {"event", "time", "sunday"})
	public ModelAndView deleteEvent(@RequestParam("name") String eventName, @RequestParam("time") String eventTime, @RequestParam("sunday") String dayName)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("event", calendarDAO.getSun(monthNumberF, dayNumberF, eventName, eventTime));
		return mv;
	}
}