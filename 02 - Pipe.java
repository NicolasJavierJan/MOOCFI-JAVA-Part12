/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> values = new ArrayList<>();
    
    public void putIntoPipe(T value){
        this.values.add(value);
    }
    
    public T takeFromPipe(){
        if (this.values.size() > 0){
            T value = this.values.get(0);
            this.values.remove(0);
            return value;
        }
        return null;
    }
    
    public boolean isInPipe(){
        if (this.values.size() > 0){
            return true;
        }
        return false;
    }
}
