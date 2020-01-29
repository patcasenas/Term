/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert Zedrick Dela
 */
public class Item extends Mainclass implements NewInterface{

    int quantity;
    int addQty;
    int subQty;

    public int getAddQty() {
        return addQty;
    }

    public int getSubQty() {
        return subQty;
    }
    
    
    @Override
    public void addInventory(int a){
        
        quantity=quantity+a;
        addQty=a;
        a=0;
    }
    
    @Override
    public void subtractInventory(int a){
        
        quantity=quantity-a;
        subQty=a;
        a=0;
    }
    
    @Override
    public void viewInventory(){
    System.out.print(quantity);
    }    
}
