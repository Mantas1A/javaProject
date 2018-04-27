import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main (String[] args) {
            
	//klasiu objektai
        // ====================================
	EventRead eventread = new EventRead();
	Print prinduom = new Print();
	Eventduom eduom = new Eventduom();
        Dateconverter dcon = new Dateconverter();
        Gui gui = new Gui();   
        Time time = new Time(); 
         Comparator comp = new Comparator();
        //=====================================
	
	 ArrayList<Eventduom> EventJson = eventread.readallevents("src/duom.txt");
	//prinduom.printduom(EventJson); 
        
   
       int theage=gui.age(); 
        //time.dates(); // 
       // String thedate = time.addDay(); //iskvieciam 
       // System.out.println(thedate); // 
        int index=time.dates();
        Date theday=time.addDay(index);
        //dcon.converter1();
        comp.tipes(EventJson, theage , theday);
        
	}
}