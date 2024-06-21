/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package io.game.tictactoe;
/**
 *
 * @author Andy
 */
public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Splash sp =new Splash();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sp.setVisible(true);
            }
        });
        try {
            Thread.sleep(3000); // Display splash screen for 3 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sp.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
        
    }
}
