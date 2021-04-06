package pageObjects;



import org.openqa.selenium.By;
public class Homepage {

	
	
	
	public By LocationListBox =By.name("location");
	public By numofroomsListbox =By.name("room_nos");
	public By CheckInDateTextBox =By.xpath("//*[@id=\"datepick_in\"]");
	
	public By CheckOutDateTextBox =By.xpath("//*[@id=\"datepick_out\"]");
	public By AdultsperroomListBox =By.name("adult_room");
	public By searchbutton =By.name("Submit");
	public By logoutbutton =By.linkText("logout");
}
