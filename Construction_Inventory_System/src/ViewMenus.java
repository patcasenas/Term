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
public class ViewMenus {
    
    public char Mainmenu(){
   
     System.out.println
            ( "\n\n"
            + "=============================\n"
            + "Construction Supply Inventory\n"
            + "=============================\n"
            + "[1] Edit Inventory\n"
            + "[2] Current Order Status\n"
            + "[3] History\n"
            + "=============================\n"
            + "[4] Exit system\n\n"
            );
    
    System.out.print("Choice: ");
     Scanner scan = new Scanner(System.in);
     char choice = scan.next().charAt(0);

     switch(choice){
        
        case '1': 
        return '1';
        case '2':
        return '2';
        case '3':
        return '3';
        case '4':
        return '4';
      
    
   
    }
     
    return 'X';
    }
    
    public char editInventoryMenu(){
      System.out.println
            ( "\n\n"
            + "=============================\n"
            + "       Edit Inventory\n"
            + "=============================\n"
            + "[1] View Inventory\n"
            + "[2] Add to Inventory\n"
            + "[3] Reduce from Inventory\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
    
    System.out.print("Choice: ");
     Scanner scan = new Scanner(System.in);
     char choice = scan.next().charAt(0);
     
    switch(choice){
        
        case '1': 
        return '1';
        case '2':
        return '2';
        case '3':
        return '3';
        case '4':
        return '4';
      
    
   
    }
    return 'X';  
    }
    
        public char addInventoryMenu(){
      System.out.println
            ( "\n\n"
            + "=============================\n"
            + "        Add Inventory        \n"
            + "=============================\n"
            + "[1] Concrete\n"
            + "[2] Steel\n"
            + "[3] Lumber\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
    
    System.out.print("Choice: ");
     Scanner scan = new Scanner(System.in);
     char choice = scan.next().charAt(0);
     
    switch(choice){
        
        case '1': 
        return '1';
        case '2':
        return '2';
        case '3':
        return '3';
        case '4':
        return '4';
      
    
   
    }
    return 'X';  
    }
        
            public char subInventoryMenu(){
      System.out.println
            ( "\n\n"
            + "=============================\n"
            + "     Reduce from Inventory   \n"
            + "=============================\n"
            + "[1] Concrete\n"
            + "[2] Steel\n"
            + "[3] Lumber\n"
            + "=============================\n"
            + "[4] Return to menu\n\n"
            );
    
    System.out.print("Choice: ");
     Scanner scan = new Scanner(System.in);
     char choice = scan.next().charAt(0);
     
    switch(choice){
        
        case '1': 
        return '1';
        case '2':
        return '2';
        case '3':
        return '3';
        case '4':
        return '4';
      
    
   
    }
    return 'X';  
    }
}
