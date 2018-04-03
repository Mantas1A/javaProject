
import java.text.SimpleDateFormat;
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
public class Time {
      
        public int addDay(){
            
              try {
                  
        String strDate = "2018/03/12";
        SimpleDateFormat sdfdate = new SimpleDateFormat("yyyy/MM/dd");
        Date thisdate = sdfdate.parse(strDate);
        SimpleDateFormat sdfdate1 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdfdate1.format(thisdate));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        }
}
