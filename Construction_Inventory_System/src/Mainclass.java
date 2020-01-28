/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
import java.util.Scanner;
/**
 *
 * @author Pryce
 */
public class Mainclass extends ViewMenus  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewInterface c = new Concrete();
        NewInterface s = new Steel();
        NewInterface l = new Lumber();
        Scanner scan = new Scanner(System.in);
        ViewMenus m = new ViewMenus();
        
        
       int add;
       int sub;
       
       
    
        char choicemainmenu=m.Mainmenu();
        
        switch(choicemainmenu){
        
        case '1'://MAINMENU 
            
        char choiceeditmenu=m.editInventoryMenu();
            
            switch(choiceeditmenu){
        
             case '1': //EDITMENU VIEW
             //VIEW    
                  System.out.println("Concrete quantity:");
                  c.viewInventory();
                  System.out.println("\nSteel quantity:");
                  s.viewInventory();
                  System.out.println("\nLumber quantity:");
                  l.viewInventory();
                  System.out.println("\nview");
                  break;
             case '2': //EDITMENU ADD
              //ADD   
                                      
                                                 char choiceaddmenu=m.addInventoryMenu();
                                                 switch(choiceaddmenu){

                                              case '1': 
                                         //addconcrete
                                                  System.out.println("How much is added to concrete:");
                                                   add=scan.nextInt();
                                                   c.addInventory(add);
                                                   break;
                                              case '2':
                                         //addsteel  
                                                  System.out.println("How much is added to steel:");
                                                    add=scan.nextInt();
                                                   s.addInventory(add);

                                                  break;
                                              case '3':
                                         //addlumber
                                                  System.out.println("How much is added to lumber:");
                                                    add=scan.nextInt();
                                                   l.addInventory(add);

                                                   break;
                                              case '4':
                                         //back
                                             }                                    

                                  break;
                 ////////////////////////////////////////////////////////
               
             case '3': //EDITMENU REDUCE
             //REDUCE
                                                 char choicesubmenu=m.addInventoryMenu();
                                                 switch(choicesubmenu){

                                              case '1': 
                                         //addconcrete
                                                  System.out.println("How much is subtracted to concrete:");
                                                   sub=scan.nextInt();
                                                   c.subtractInventory(sub);
                                                   break;
                                              case '2':
                                         //addsteel  
                                                  System.out.println("How much is subtracted to steel:");
                                                    sub=scan.nextInt();
                                                    s.subtractInventory(sub);

                                                  break;
                                              case '3':
                                         //addlumber
                                                  System.out.println("How much is subtracted to lumber:");
                                                   sub=scan.nextInt();
                                                   l.subtractInventory(sub);

                                                   break;
                                              case '4':
                                         //back
                                             }                                    

                                  break;
                 ///////////////////////////////////////////////////////
             case '4': //BACK
                 //back
            }
        
        case '2'://MAIN MENU
        //Current Order Status
        case '3'://MAIN MENU
        //History
        case '4'://MAIN MENU
        //exit
        }
        
       
        
     
       
        
}
}