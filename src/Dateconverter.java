import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dateconverter {
    Time day = new Time();
    Eventduom eduom = new Eventduom();
    private int years1; 
    private int months1;
    private int days1;
    private int years2;
    private int months2;
    private int days2;
    
    public Date converter2(String data){ 
          
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date days = new Date();
    
    try{
        days = sdf.parse(data); 
    }
    catch(Exception ex){
    }
    SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd"); 
    
    return days;
    }   
}