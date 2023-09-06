/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 */
public class Hideout<T> {
    private T hidden;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        hidden = toHide;
    }
    
    public T takeFromHideout() {
        if (this.hidden == null) {
            return null;
        }
        
        T taken = this.hidden;
        this.hidden = null;
        return taken;
    }
    
    public boolean isInHideout() {
        return this.hidden == null;
        
    }
}
