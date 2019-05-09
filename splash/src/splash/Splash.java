/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash;

import javax.swing.JOptionPane;

/**
 *
 * @author GIHAN
 */
public class Splash {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        splashwin Splash = new splashwin();
        Splash.setVisible(true);
        login Login = new login();
                try {
                    for  (int a = 0; a <= 100; a++) {
                    
                       Thread.sleep(40);
                       Splash.jLabel2.setText(Integer.toString(a));
                       Splash.jProgressBar1.setValue(a);
                       if(a ==100){
                           Splash.setVisible(false);
                           Login.setVisible(true);
                       }
                            
                 } 
              }catch(Exception e){
                    
              }
          }
    
}
    


