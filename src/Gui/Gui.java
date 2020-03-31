
package Gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

//Keyboard class
public class Gui extends JFrame implements KeyListener {
    

JLabel teclado = new JLabel();
JLabel botao = new JLabel();


//Key Pressed Method
@Override
public void keyPressed (KeyEvent e){
   //definir o que vai acontecer quando uma tecla for apertada
   int keyCode = e.getKeyCode();
   if(keyCode == KeyEvent.VK_1)
    //mudar cor da label    
}  

//object
public Gui() throws IOException{
    add(teclado);
    teclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Keyboard4.png")));
    this.getContentPane().setLayout(new FlowLayout());
    botao.setBorder(BorderFactory.createLineBorder(Color.black));
    
    setSize(420,160);    
    setVisible(true);
    setResizable(false);
    setLocation(1400, 130);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
}

//main method    
public static void main(String[] args) throws IOException {
        Gui teclado = new Gui();
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  



}
