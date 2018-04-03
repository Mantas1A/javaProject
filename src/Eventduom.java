
public class Eventduom {

	private int Age;
	private String Tipe;
	private String Event;
	private String Date;
	private int Place;
	private int Price;
	private int Registered;
	private int Howmanyalowd;
	private double Rating;

	public Eventduom(){
	
	}
	public Eventduom(int age, String tipe, String event, String date, int place, int price, int registered,
			int howmanyalowd, double rating) {
		super();
		Age = age;
		Tipe = tipe;
		Event = event;
		Date = date;
		Place = place;
		Price = price;
		Registered = registered;
		Howmanyalowd = howmanyalowd;
		Rating = rating;
	}
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getTipe() {
		return Tipe;
	}

	public void setTipe(String tipe) {
		Tipe = tipe;
	}

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getPlace() {
		return Place;
	}

	public void setPlace(int place) {
		Place = place;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getRegistered() {
		return Registered;
	}

	public void setRegistered(int registered) {
		Registered = registered;
	}

	public int getHowmanyalowd() {
		return Howmanyalowd;
	}

	public void setHowmanyalowd(int howmanyalowd) {
		Howmanyalowd = howmanyalowd;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}
	public String toString() {
		String rez = "Age " + Age + " Tipe" + Tipe +  " Event " + Event + " Date " + Date + "Place " + Place + " Price "+ Price + "Registered" +Registered+ "howmanyalowd" + Howmanyalowd +" rating" + Rating;
		return rez;
	}
	
	
	
}
