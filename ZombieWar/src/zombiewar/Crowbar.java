 
package zombiewar;

/**
 *
 * @author Jnesler 
 */
public class Crowbar extends Weapon{
    
      private static final float ACCURACY = (float).85;
      private static final int ATTACK =  10 ;
      
    public Crowbar(){
        super(Weapon.CROWBAR, ATTACK, ACCURACY);
    }
    
}
