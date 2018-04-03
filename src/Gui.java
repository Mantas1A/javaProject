
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

    
    
    
    }
