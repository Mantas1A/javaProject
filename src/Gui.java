import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui {
    
    public int age (){
        String fn = "";
        do{ 
            fn = JOptionPane.showInputDialog("Enter your age: ");
        }
        while(fn.equals(""));
        try {
            int age = Integer.parseInt(fn);
        }
        catch(Exception e){
            JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel,"Enter a number!");
            System.exit(0);
        }
        int age = Integer.parseInt(fn);
    
        return age;
    }
       
    public String date(){
        String strDate;
        do{
            strDate = JOptionPane.showInputDialog("Enter the date:   Format:yyyy/MM/dd");
        }
        while(!strDate.matches("([0-9]{4})/([0-9]{2})/[0-9]{2}"));
        return strDate;
    }
    
    public int Eventstipes(){
        String[] events = {"Sports", "Conferences", "Concerts", "Seminars", "Educational"};
        int event_index = JOptionPane.showOptionDialog(null,"To which type of the event would You like to go?", "Tipes of the Events", 0, JOptionPane.QUESTION_MESSAGE,null,events,0 );
       
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
    
    public void Entername(String rate){
        String name;
        String surname;
        do{
            name = JOptionPane.showInputDialog("Enter your name: ");

        } while (name.equals(""));
        do{
            surname = JOptionPane.showInputDialog("Enter your surname: ");
        } while (surname.equals(""));
        JOptionPane.showMessageDialog(null, "You have been registered: "+name+ " "+surname+ "\n" + " Rating: "+  rate, "The title", JOptionPane.PLAIN_MESSAGE);
    }
    
    public int ErrosMessage(){
        String [] info = new String [] {"Select the other day", "Back to events", "Exit the program"}; 
        int info_index = JOptionPane.showOptionDialog(null,"There are no events for selected day", "Erorr", 0, JOptionPane.QUESTION_MESSAGE,null,info,0 );
        return info_index;
    }

    private void parcentInteger(String fn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}