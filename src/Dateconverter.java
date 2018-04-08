
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruceg
 */
public class Dateconverter {
    Time day = new Time();
    Eventduom eduom = new Eventduom();
    private int years1;  // naudotojo ivesti
    private int months1;
    private int days1;
    private int years2; // nuskaityti is duomenu failu
    private int months2;
    private int days2;
    
    public void converter1(){    // reikiamos dienos;
       try {
           day.dates();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date dayys =  sdf.parse(day.addDay().toString()); 
    SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd"); 
    System.out.println(sdfdate1.format(dayys));
    Calendar cal = Calendar.getInstance();
    cal.setTime(dayys);
     years1 = cal.get(Calendar.YEAR);
     months1 = cal.get(Calendar.MONTH);
     days1 = cal.get(Calendar.DAY_OF_MONTH);
     } catch (Exception e){
            System.out.println(e.getMessage());
        }      
}
    public int getyears1()
    {
        return years1;
    }
    public int getmoths1()
    {
        return months1;
    }
    public int getdays1()
    {
        return days1;
    }
    
    public Date converter2(String data){   // is duomenu failu nuskaitytos dienos
          
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date days = new Date();
    try{
    days = sdf.parse(data); 
    }catch(Exception ex){
        
    }
    SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd"); 
    System.out.println(sdfdate1.format(days));
    
    return days;
    
   
    }
 
    
    
}
