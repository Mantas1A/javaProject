import java.util.ArrayList;

public class Main {

	
	public static void main (String[] args) {
	
	EventRead eventread = new EventRead();
	Print prinduom = new Print();
	
	
	
	 ArrayList<Eventduom> EventJson = eventread.readallevents("src/duom.txt");
	prinduom.printduom(EventJson); 

	}
}