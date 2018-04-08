
import java.util.ArrayList;
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
public class Gui {
    
    public int age (){
    
    String fn = JOptionPane.showInputDialog("Enter your age");
    int age = Integer.parseInt(fn);
    // JOptionPane.showMessageDialog(null, "your age" + age, "the title ", JOptionPane.PLAIN_MESSAGE);
    return age;
                      }
    
    public String date(){
    String strDate = JOptionPane.showInputDialog("Enter the date   Format:yyyy/MM/dd");
    
    return strDate;
    }
    
    public int Eventstipes(){
       
        
        String[] events = {"Sports", "Conferences", "Trade Shows", "Seminars", "Team Building Events"};
      int event_index = JOptionPane.showOptionDialog(null,"In what event you would like to go?", "Events Tipe", 0, JOptionPane.QUESTION_MESSAGE,null,events,0 );
       
       // System.out.println(date_index);
       
       return event_index;
    
    }
      public int Eventnamesprint(String[] names){
            int name_index = JOptionPane.showOptionDialog(null,"In what event you would like to go?", "Events Names", 0, JOptionPane.QUESTION_MESSAGE,null,names,0 );
         return name_index;
      }
    }
