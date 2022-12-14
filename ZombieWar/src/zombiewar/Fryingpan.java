/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Fryingpan extends Weapon{
    
      private static final float ACCURACY = (float).09;
      private static final int ATTACK =  8 ;
      
    public Fryingpan(){
        super(Weapon.FRYINGPAN, ATTACK, ACCURACY);
    }
    
}
