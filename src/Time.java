import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Time {
    
    public int date_index;
    Gui day = new Gui();
    
    public int dates(){
        
        String[] date = {"Today", "Some other day"};
        date_index = JOptionPane.showOptionDialog(null,"For which day would You like to look for events?", "Date", 0, JOptionPane.QUESTION_MESSAGE,null,date,0 );
       
        return date_index;
    }
    
    public Date addDay(int index){   
        Date currentDate = new Date();
        int dateindex=index;
        if (dateindex==0){ 
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String thedate0 = sdf.format(currentDate);
            return currentDate;
        }
        else  if (dateindex == 1){
            try {
                SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
                Date thisdate = sdfdate.parse(day.date());  // priskiriam kas pareitu is gui date
                SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd"); // nustatom formata
                String thedate1 = sdfdate1.format(thisdate);
                return thisdate;
            } 
            catch (Exception e){
            }
        }
        else {
            System.exit(0);
        }
        return null;        
    }     
}