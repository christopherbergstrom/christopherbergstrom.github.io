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
	@RequestMapping(path = "date.do", params = "name")
	public ModelAndView getMonthName(@RequestParam("name") String monthName)
	{
		monthNameF = monthName;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("calendar", calendarDAO.getByMonthName(monthName));
		return mv;
	}
	@RequestMapping(path = "date.do", params = "number")
	public ModelAndView getMonthNum(@RequestParam("number") String monthNumber)
	{
		monthNumberF = monthNumber;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("calendar", calendarDAO.getByMonthNum(monthNumberF));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "monday")
	public ModelAndView addEventMon(@RequestParam("monday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getMon(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "tuesday")
	public ModelAndView addEventTues(@RequestParam("tuesday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getTues(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "wednesday")
	public ModelAndView addEventWed(@RequestParam("wednesday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getWed(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "thursday")
	public ModelAndView addEventThurs(@RequestParam("thursday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getThurs(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "friday")
	public ModelAndView addEventFri(@RequestParam("friday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getFri(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "saturday")
	public ModelAndView addEventSat(@RequestParam("saturday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getSat(monthNumberF, dayNumber));
		return mv;
	}
	@RequestMapping(path = "addEvent.do", params = "sunday")
	public ModelAndView addEventSun(@RequestParam("sunday") String dayNumber)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("events.jsp");
		mv.addObject("calendar", calendarDAO.getSun(monthNumberF, dayNumber));
		return mv;
	}
}