 
package zombiewar;

/**
 *
 * @author Jnesler 
 */
public class Axe extends Weapon{
    
      private static final float ACCURACY = (float).85;
      private static final int ATTACK =  15 ;
      
    public Axe(){
        super(Weapon.AXE, ATTACK, ACCURACY);
    }
    
}
