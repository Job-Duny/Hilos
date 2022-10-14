/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Job_M
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class uwu extends JPanel implements Runnable{
    private final Image background;
    private  Image persona;
    private  Image personas;
    private Thread hilo;
    
    private  int x,y,z,w,t,c;
    
    
    public uwu(){
        
        setBackground(Color.WHITE);
        setDoubleBuffered(true);
//        etiq = new Label("Etiqueta")
        background = new ImageIcon(this.getClass().getResource("/img/Fodnis.png")).getImage();
        x=200;
        y=200;
        z=1450;
        w=200;
        t=0;
        c=-10;
        personas();
        personas2();
        hilo = new Thread(this);
        hilo.start();
        
        
   }
    
    void personas(){
        persona = new ImageIcon(this.getClass().getResource("/img/personas2.png")).getImage();
        
        
    }
    
    void personas2(){
        personas=new ImageIcon(this.getClass().getResource("/img/personas2.png")).getImage();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        //fuente
        Font myFont = new Font ("System", 5, 30);
        g2.setFont(myFont);
        //Color de fuente
        Color white=new Color(255, 255, 255);
        g2.setColor(white);
        
        
        g2.drawImage(background, 0,0, null);
        g2.drawString(("Espacios ocupados: " + c), 450, 150);
        g2.drawImage(persona,x,y, null);
        g2.drawImage(personas,z,w, null);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
//        g2.drawString(iterator, TOP_ALIGNMENT, TOP_ALIGNMENT);
    }
    
    public void ciclo(){

        x += 10;
        
        if ( x > 200 ){
            x = -600;
            t += 10;
            c += 10;
        }
        
    }
    
    public void ciclo2(){
        z-=10;
        
        if(z<700){
            z=1500;
            t+=10;
            c+=10;
        }
    }
    
    @Override
    public void run() {
       
       
        while(t <= 1000){

            ciclo();
            ciclo2();
            repaint();


            try{
                Thread.sleep(10);

            }catch(Exception e){
                System.out.println(e);
            }

        }
        JOptionPane.showMessageDialog(null, "EL CONCIERTO ESTÁ LLENO, YA NO PUEDES ENTRAR");
       
        
    }

}