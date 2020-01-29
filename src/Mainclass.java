/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
import java.util.Scanner;
/**
 *
 * @author Patricia Casenas
 */
public class Mainclass extends ViewMenus  {

    public static void main(String[] args) {
       NewInterface c = new Concrete();
       NewInterface s = new Steel();
       NewInterface l = new Lumber();
       Scanner scan = new Scanner(System.in);
       ViewMenus m = new ViewMenus();
       
       
       editInventory e = new editInventory();
        

       boolean x=true;
       char choicemainmenu=m.Mainmenu();
       
       do{ 
        switch(choicemainmenu){
            
//===============================================             
        case '1'://MAINMENU
        //Edit Inventory
            e.editInventory();

//===============================================        
        case '2'://MAIN MENU
        //Current Order Status
            
            
//===============================================              
        case '3'://MAIN MENU
        //History
            
//===============================================              
        case '4'://MAIN MENU
            System.out.println( "\n===================\n"
                               +"  END OF PROGRAM  \n"
                               +"===================\n");
            System.exit(0);
        }
        

       }while(x=true);
       
        
}
}