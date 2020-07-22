/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Hideout<T> {
    private T element;
    
    public void putIntoHideout(T toHide){
        this.element = toHide;
    }
    
    public T takeFromHideout(){
        T previous = this.element;
        this.element = null;
        return previous;
    }
    
    public boolean isInHideout(){
        if (this.element == null){
            return false;
        }
        return true;
    }
}
