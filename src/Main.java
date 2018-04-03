import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main (String[] args) {
	
	EventRead eventread = new EventRead();
	Print prinduom = new Print();
	Eventduom eduom = new Eventduom();
	
	 ArrayList<Eventduom> EventJson = eventread.readallevents("src/duom.txt");
	prinduom.printduom(EventJson); 
        
        // pradine diena 
    
        
        Gui gui = new Gui();
        gui.age();
        Time time = new Time();
        time.addDay();
	}
}