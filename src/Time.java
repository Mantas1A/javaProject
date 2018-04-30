

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruceg
 */
public class Time {
    
    public int date_index;
    Gui day = new Gui();
    
    
    public int dates(){
        
        String[] date = {"Today", "Some other day"};
      date_index = JOptionPane.showOptionDialog(null,"For what day you would like to look for events?", "Date", 0, JOptionPane.QUESTION_MESSAGE,null,date,0 );
       
       // System.out.println(date_index);
       
       return date_index;
    }
    
        public Date addDay(int index){   
             Date currentDate = new Date();
           // System.out.println("date_index");
             // System.out.println(date_index);
             int dateindex=index;
            if (dateindex==0){ 
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                System.out.println(sdf.format(currentDate));
               String thedate0 = sdf.format(currentDate);
              // System.out.println("esama diena pasirinko\n");
              // System.out.println(currentDate);
               
                return currentDate;
            }
            else  if (dateindex == 1){
              try {
        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        Date thisdate = sdfdate.parse(day.date());  // priskiriam kas pareitu is gui date
        SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd"); // nustatom formata
        System.out.println(sdfdate1.format(thisdate));
                //System.out.println("pasirinko kita diena\n");
              //System.out.println(thisdate);
        String thedate1 = sdfdate1.format(thisdate);
        return thisdate;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
              
              
            }
            else {
                System.exit(0);
            }
        return null;
 
   
             
        }
      
}
