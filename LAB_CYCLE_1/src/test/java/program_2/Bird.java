/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_2;

/**
 *
 * @author jeslinpjames
 */
class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirping...");
    }

    public void eat() {
        System.out.println("Bird eating seeds...");
    }
}
