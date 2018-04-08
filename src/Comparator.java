
import java.util.ArrayList;
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
public class Comparator {
    Gui gui = new Gui();
    
    public ArrayList<Eventduom> neededEvents = new ArrayList<Eventduom>();
    String error=("There is no this tipe events");
    
    public String [] tipes( ArrayList <Eventduom> sarasas, int age){
        
        //neededEvents[0] = error;
        Eventduom enduo = new Eventduom();
        int index = gui.Eventstipes();
        Dateconverter dacon = new Dateconverter();
        Time data = new Time();      
        for ( int i =0 ; i < sarasas.size(); i++ )         //  atsirenkam renginius pagal tipus
            {
                System.out.println(index);
                if(index==sarasas.get(i).getTipe()){
                 Date eData = new Date();
                 eData = dacon.converter2(sarasas.get(i).getDate()); 
                if(data.addDay().before(eData)){           // palyginam data ar ideti ar ne
                           if (age>enduo.getAge()) {
                               
                                 neededEvents.add(sarasas.get(i));
                                 
                        System.out.println(neededEvents);
                           }
                    }
                }
                
            }  // Issirenkam pavadinimus renginiu 
          String [] names = new String [neededEvents.size()];     
             System.out.println(neededEvents);
          for(int i = 0; i < neededEvents.size(); i++){
              names[i] = neededEvents.get(i).getEvent();
             // System.out.println(names[i]);
          }
          
          return names;
    }
    
     
}

