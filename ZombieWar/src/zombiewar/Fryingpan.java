 
package zombiewar;

/**
 *
 * @author Jnesler 
 */
public class Fryingpan extends Weapon{
    
      private static final float ACCURACY = (float).09;
      private static final int ATTACK =  8 ;
      
    public Fryingpan(){
        super(Weapon.FRYINGPAN, ATTACK, ACCURACY);
    }
    
}
