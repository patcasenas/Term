/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pryce
 */
public class Steel extends Mainclass implements NewInterface {
    
     
    int quantity;
    int addQty;
    int subQty;
    
    @Override
    public void addInventory(int a){
    quantity=quantity+a;
    }
    
    @Override
    public void subtractInventory(int a){
    quantity=quantity-a;
    }
    
    @Override
    public void viewInventory(){
    System.out.print(quantity);
    }
    
    
}
