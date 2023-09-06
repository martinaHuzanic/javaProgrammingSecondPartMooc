/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 */
public class Cat extends Animal implements NoiseCapable {

    private String name;

    public Cat(String name) {
        super(name);
    }

    public Cat() {

        super("Cat");

        // i used this.name fist for a long time
    }

    public void purr() {

        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();

    }
}
