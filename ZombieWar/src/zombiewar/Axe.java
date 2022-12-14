/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Axe extends Weapon{
    
      private static final float ACCURACY = (float).85;
      private static final int ATTACK =  15 ;
      
    public Axe(){
        super(Weapon.AXE, ATTACK, ACCURACY);
    }
    
}
