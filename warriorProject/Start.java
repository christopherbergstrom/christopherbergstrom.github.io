package warriorProject;

public class Start
{
	static City city = new City();
	public static void main(String[]args)
	 {
		Welcome intro = new Welcome();
		intro.welcomeMessage();
		city.city();		
	 }
}