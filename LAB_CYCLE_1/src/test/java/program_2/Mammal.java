/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_2;

/**
 *
 * @author jeslinpjames
 */
class Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Mammal making sounds...");
    }

    @Override
    public void eat() {
        System.out.println("Mammal eating grass...");
    }
}
