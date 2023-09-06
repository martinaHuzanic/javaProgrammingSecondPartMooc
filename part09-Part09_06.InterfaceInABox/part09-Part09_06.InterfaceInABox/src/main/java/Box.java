/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 */
import java.util.ArrayList;

public class Box implements Packable {
    
    private double capasity;
    private ArrayList<Packable> items;
    
    public Box(double capasity) {
        this.capasity=capasity;
        items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.capasity >= item.weight()) {
            items.add(item);
            this.capasity -= item.weight();
        }
    }
    
    public double weight() {
        double weight = 0;
        for (Packable item: items) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
 