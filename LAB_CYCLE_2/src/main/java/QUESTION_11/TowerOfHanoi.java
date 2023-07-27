/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_11;

/**
 *
 * @author jeslinpjames
 */
public class TowerOfHanoi {
    private int numDisks;
    public TowerOfHanoi(){
        numDisks=0;
    }
    public TowerOfHanoi(int numDisks){
        this.numDisks =numDisks;
    }
    public void solve(){
        moveDisks(numDisks,'A','B','C');
    }
     private void moveDisks(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        moveDisks(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveDisks(n - 1, auxiliary, destination, source);
    }
}
