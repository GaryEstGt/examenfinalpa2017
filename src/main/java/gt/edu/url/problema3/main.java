/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema3;

/**
 *
 * @author garya
 */
public class main {
    public static void main (String [ ] args) {
 
               LeakyStack<Animal> animalHistory = new ImplLeakyStack<>(1);
		
		Animal bambi = new Animal("salvaje", 10, 100.00, "cafecito");
		
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("café");
		bambi = animalHistory.saveHistory(bambi); //Push
		bambi.setSkinColor("café salvaje");
		System.out.println(bambi.getSkinColor());// Prints café salvaje
		bambi = animalHistory.undo(); //Pop		
		System.out.println(bambi.getSkinColor());
		bambi = animalHistory.undo(); //Raises IllegalArgumentException
 
        }
}
