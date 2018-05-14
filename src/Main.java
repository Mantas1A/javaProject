import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main (String[] args) {
            
    EventRead eventread = new EventRead();
    Print prinduom = new Print();
    Eventduom eduom = new Eventduom();
    Dateconverter dcon = new Dateconverter();
    Gui gui = new Gui();   
    Time time = new Time(); 
    Comparator comp = new Comparator();
	
    ArrayList<Eventduom> EventJson = eventread.readallevents("src/duom.txt");
    int theage=gui.age();
    int index=time.dates();
    Date theday=time.addDay(index);
    int eventindex =gui.Eventstipes();
    comp.tipes(EventJson, theage , theday, eventindex);  
    }
}