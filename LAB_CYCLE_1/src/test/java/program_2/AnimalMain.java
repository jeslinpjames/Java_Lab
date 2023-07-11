/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_2;

/**
 *
 * @author jeslinpjames
 */
public class AnimalMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sound();
        bird.eat();

        Insects insect = new Insects();
        insect.sound();
        insect.eat();

        Mammal mammal = new Mammal();
        mammal.sound();
        mammal.eat();
    }
}