/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zombiewar;

/**
 *
 * @author Mobile Gaming
 */
public class Teacher extends Survivor{
    
    private static final int HEALTH = 50; 
    private static final int ATTACK = 5;
    
    public Teacher(){
        super(Survivor.TEACHER, HEALTH, ATTACK);
    }
}