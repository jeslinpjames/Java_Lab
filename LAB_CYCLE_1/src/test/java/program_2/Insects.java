/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_2;

/**
 *
 * @author jeslinjames
 */
class Insects implements Animal {
    @Override
    public void sound() {
        System.out.println("Insect buzzing...");
    }

    @Override
    public void eat() {
        System.out.println("Insect eating nectar...");
    }
}
