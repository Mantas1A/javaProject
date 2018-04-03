
public class Eventduom {

	private int age;
	private String tipe;
	private String event;
	private String date;
	private int place;
	private int price;
	private int registered;
	private int howmanyalowd;

	public Eventduom(){
	
	}
	public Eventduom (int age, String tipe, String event, String date, int place, int price, int registered, int howmanyalowd) {
		super();
		this.age = age;
		this.tipe = tipe;
		this.event = event;
		this.date = date;
		this.place = place;
		this.price = price;
		this.registered = registered;
		this.howmanyalowd = howmanyalowd;
                
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRegistered() {
		return registered;
	}

	public void setRegistered(int registered) {
		this.registered = registered;
	}

	public int getHowmanyalowd() {
		return howmanyalowd;
	}

	public void setHowmanyalowd(int howmanyalowd) {
		this.howmanyalowd = howmanyalowd;
	}


        @Override
	public String toString() {
		String rez = "Age " + age + " Tipe" + tipe +  " Event " + event + " Date " + date + "Place " + place + " Price "+ price + " Registered" + registered + " howmanyalowd" + howmanyalowd ;
		return rez;
	}
}
