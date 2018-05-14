import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Comparator {
    Gui gui = new Gui();
    Eventduom enduo = new Eventduom();
    Dateconverter dacon = new Dateconverter();
    Time data = new Time(); 
   
    public ArrayList<Eventduom> neededEvents = new ArrayList<Eventduom>();
    String error=("There are no events of this type for your selected day");
    
    public String [] tipes( ArrayList <Eventduom> sarasas, int age, Date theday, int index){
        ArrayList <Eventduom> neededEvents=new ArrayList();
        Date eData = new Date();
             
        for (int i = 0 ; i < sarasas.size(); i++){     //  filters events by type
            if(index == sarasas.get(i).getTipe()){
                eData = dacon.converter2(sarasas.get(i).getDate()); 
              
                if(theday.before(eData)){      // compares date
                    if (age>sarasas.get(i).getAge()){
                        neededEvents.add(sarasas.get(i));
                    }
                }
            }
        } 
        
        if (neededEvents.size()==0){
            int erorr=gui.ErrosMessage();
            if (erorr == 0){
                Date day = data.addDay(1);
                int eventindex = gui.Eventstipes();
                tipes(sarasas,age,day, eventindex);
            }
            if (erorr == 1){
               int eventindex = gui.Eventstipes();
               tipes(sarasas,age,theday, eventindex);
            }
            if(erorr==2){
                System.exit(1);
            }
       
        } 
        // ---------------------------------
        else {
            String [] names = new String [neededEvents.size()];     
            for(int i = 0; i < neededEvents.size(); i++){
                names[i] = neededEvents.get(i).getEvent();
            }
            int name_index=gui.Eventnamesprint(names);
            int regist_index =  gui.Eventinfo(neededEvents.get(name_index));  // prints info about event
          
            if (regist_index==0)//  check place if available for register
            {
                int place = neededEvents.get(name_index).getPlace();
                if (place==0)
                {
                    int registed = neededEvents.get(name_index).getRegistered();
                    registed++;
                    int maxregisted =neededEvents.get(name_index).getHowmanyalowd();
                    String rate1 = Rating(registed, maxregisted);
                    gui.Entername(rate1);
                }
                else if(place==1) {
                    int howmanyregistered = neededEvents.get(name_index).getHowmanyalowd();
                    int registered = neededEvents.get(name_index).getRegistered();
                    if (registered<howmanyregistered){
                        int registed = neededEvents.get(name_index).getRegistered();
                        registed++;
                        int maxregisted =neededEvents.get(name_index).getHowmanyalowd();
                        String rate1 = Rating(registed, maxregisted);
                        String rate2 = Rating(registed, maxregisted);
                        gui.Entername(rate2);
                    }
                }
            }
            else if(regist_index == 1) { 
              tipes(sarasas,age,theday,index);
            }
        
            return names;
        }
        return null;      
    }
    
    public String Rating ( int min, int max){
            
        String rating = null ;  // will save the message about event rating
        double proc;
        proc = ( min/max );  // event rating = how many registered/how many max could registed  tell the rating
        if (proc > 0.75){
            rating = "The event is successful, many people have registered" ;
        }
        else if (0.5<= proc && proc < 0.75){
            rating = "The event is fine :)" ; 
        }
        else if ( proc < 0.5){
            rating = "The event is unsuccessful, we hope more people will register to event";
        }
        return rating;
    }
}