package src;

import src.Eventduom;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui {
    
    public int age (){
        String fn = "";
        fn = JOptionPane.showInputDialog("Enter your age: ");
        while(fn.equals("")){
            fn = JOptionPane.showInputDialog("Enter your age: ");
        }
        try {
            int age = Integer.parseInt(fn);
        }catch(Exception e){

            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel,"Enter a number!");
            System.exit(0);
        }
        int age = Integer.parseInt(fn);
        // JOptionPane.showMessageDialog(null, "your age" + age, "the title ", JOptionPane.PLAIN_MESSAGE);
        return age;
    }
    
    public String date(){
        String strDate = JOptionPane.showInputDialog("Enter the date:   Format:yyyy/MM/dd");
    
        return strDate;
    }
    
    public int Eventstipes(){
        String[] events = {"Sports", "Conferences", "Concerts", "Seminars", "Educational"};
        int event_index = JOptionPane.showOptionDialog(null,"To which type of the event would You like to go?", "Tipes of the Events", 0, JOptionPane.QUESTION_MESSAGE,null,events,0 );
       
        // System.out.println(date_index);
       
        return event_index;
    
    }
    
    public int Eventnamesprint(String[] names){
        int name_index = JOptionPane.showOptionDialog(null,"To which event would You like to go?", "Names of the Events", 0, JOptionPane.QUESTION_MESSAGE,null,names,0 );
        return name_index;
    }
      
    public int Eventinfo(Eventduom sarasas ){
        String [] info = new String [] {"Register", "Back to Events"}; 
        int info_index = JOptionPane.showOptionDialog(null, sarasas, "Event", 0, JOptionPane.QUESTION_MESSAGE,null,info,0 );
        return info_index;
    }
    
    public void Entername(){
        String name;
        String surname;
        do {
            name = JOptionPane.showInputDialog("Enter your name: ");

        } while (name.equals(""));
        do {
            surname = JOptionPane.showInputDialog("Enter your surname: ");
        }while (surname.equals(""));
        JOptionPane.showMessageDialog(null, "You have been registed: "+name+ " "+surname, "The title", JOptionPane.PLAIN_MESSAGE);
    }
}
