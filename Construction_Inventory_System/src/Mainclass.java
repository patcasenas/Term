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
        
        
       int add;
       int sub;
       boolean x=true;
       char choicemainmenu=m.Mainmenu();
       
       do{ 
        switch(choicemainmenu){
        
        case '1'://MAINMENU 
            
        char choiceeditmenu=m.editInventoryMenu();
            
            switch(choiceeditmenu){
        
             case '1': //EDITMENU VIEW
             //VIEW    
                 
                  System.out.print("Concrete quantity: ");
                  c.viewInventory();
                  System.out.print("\nSteel quantity: ");
                  s.viewInventory();
                  System.out.print("\nLumber quantity: ");
                  l.viewInventory();
                  System.out.println("\n");
                  break;
             case '2': //EDITMENU ADD
              //ADD                    
                    char choiceaddmenu=m.addInventoryMenu();
                    
                    switch(choiceaddmenu){
                      case '1': 
                        //addconcrete
                        System.out.print("Enter added Concrete value: ");
                            add=scan.nextInt();
                            c.addInventory(add);
                        break;
                      
                      case '2':
                        //addsteel  
                        System.out.print("Enter added Steel value: ");
                            add=scan.nextInt();
                            s.addInventory(add);

                        break;
                        
                      case '3':
                        //addlumber
                        System.out.print("Enter added Lumber value: ");
                            add=scan.nextInt();
                            l.addInventory(add);

                        break;
                      
                      case '4':
                        //back
                      
                    }                                    

             break;
                 ////////////////////////////////////////////////////////               
             case '3': //EDITMENU REMOVE
             //REMOVE
                    char choicesubmenu=m.addInventoryMenu();
                    
                    switch(choicesubmenu){
                        case '1': 
                          //addconcrete
                          System.out.print("Enter removed Concrete quantity: ");
                              sub=scan.nextInt();
                              c.subtractInventory(sub);
                         
                          break;
                        
                        case '2':
                          //addsteel  
                          System.out.print("Enter removed Steel quantity: ");
                              sub=scan.nextInt();
                              s.subtractInventory(sub);

                          break;
                          
                        case '3':
                           //addlumber
                           System.out.print("Enter removed Lumber quantity: ");
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
            System.out.println( "\n===================\n"
                               +"  END OF PROGRAM  \n"
                               +"===================\n");
            System.exit(0);
        }
        

       }while(x=true);
       
        
}
}