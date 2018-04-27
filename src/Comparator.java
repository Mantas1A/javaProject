
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
    Eventduom enduo = new Eventduom();
    Dateconverter dacon = new Dateconverter();
    Time data = new Time(); 
    
    public ArrayList<Eventduom> neededEvents = new ArrayList<Eventduom>();
    String error=("There is no this tipe events for your selected day");
    
    public String [] tipes( ArrayList <Eventduom> sarasas, int age, Date theday){
        ArrayList <Eventduom> neededEvents=new ArrayList();
        //neededEvents[0] = error;
        int index = gui.Eventstipes();
        Date eData = new Date();
             
        for ( int i =0 ; i < sarasas.size(); i++ )         //  atsirenkam renginius pagal tipus
            {
                System.out.println(index);
                if(index==sarasas.get(i).getTipe()){
                 eData = dacon.converter2(sarasas.get(i).getDate()); 
                // System.out.println("priskirta renginio data");
                // System.out.println(eData);
                 System.out.println("Lyginancios datos :\n");
                 System.out.println("norima diena:");
                 System.out.println(theday);
                 System.out.println("evento diena:");
                 System.out.println("\n"+ eData);
                 System.out.println("\n");
                if(theday.before(eData)){           // palyginam data ar ideti ar ne
                           if (age>enduo.getAge()) {
                                 neededEvents.add(sarasas.get(i));
                                 
                       //System.out.println(neededEvents);
                           }
                    }
                }
                
            }  // Issirenkam pavadinimus renginiu 
        if (neededEvents.size()==0){
            System.out.println(error);
           // tipes(sarasas,age,theday);
            
        }
          String [] names = new String [neededEvents.size()];     
             System.out.println(neededEvents);
          for(int i = 0; i < neededEvents.size(); i++){
              names[i] = neededEvents.get(i).getEvent();
               
             // System.out.println(names[i]);
          }
          int name_index=gui.Eventnamesprint(names);
          int regist_index =  gui.Eventinfo(neededEvents.get(name_index));  // isprintina visa info apie rengini
          
          if (regist_index==0)                                        //  tikrinam vita ir ar galima uzsiregistruoti
          {
              int place = neededEvents.get(name_index).getPlace();
              if (place==0)
              {
                  place++;
                  gui.Entername();
                  
              }
              else {
                 int howmanyregistered = neededEvents.get(name_index).getHowmanyalowd();
                 int registered = neededEvents.get(name_index).getRegistered();
                    if (registered<howmanyregistered){
                        gui.Entername();
                    }
                    else gui.Eventnamesprint(names);
              }
          }
          else { 
              tipes(sarasas,age,theday);
          }
         
          return names;
    }
    
     
}

