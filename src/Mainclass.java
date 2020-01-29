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
       boolean loop=true;
       
       do{
       
       Scanner scan = new Scanner(System.in);
       ViewMenus m = new ViewMenus();
       
       
       editInventory e = new editInventory();
        

       
       char choicemainmenu=m.Mainmenu();
       
       
           if(choicemainmenu == '1'){
               e.editInventory();
           }
           else if(choicemainmenu == '2'){
               System.out.println("\nwala pa\n");
           }
           else if(choicemainmenu == '3'){
               System.out.println("\nwala pa\n");
           }
           else if(choicemainmenu == '4'){
               loop = false;
           }
           else{
               loop = true;
           }
//            switch(choicemainmenu){
//
//        //===============================================             
//                case '1'://MAINMENU
//                //Edit Inventory
//                    e.editInventory();
//
//        //===============================================        
//                case '2'://MAIN MENU
//                //Current Order Status
//
//
//        //===============================================              
//                case '3'://MAIN MENU
//                //History
//
//        //===============================================              
//                case '4'://MAIN MENU
//                    
//                    System.exit(0);
//                    loop = false;
//                default:
//                    loop = true;
//                    break;
//            }
       }while(loop=true);       
       System.out.println
            ( "\n\n"
            + "===================\n"
            + "  END OF PROGRAM  \n"
            + "===================\n");
    }   
}