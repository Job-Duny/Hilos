/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

import javax.swing.JFrame;
/**
 *
 * @author Job_M
 */
public class Hilos extends JFrame {
    public Hilos(){
    setTitle("Hilos concierto");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(1300,800);
       setLocationRelativeTo(null);
       setResizable(false);
       add(new uwu());
       setVisible(true);
}
    public static void main(String args[]){
       new Hilos();
    }
    
}
