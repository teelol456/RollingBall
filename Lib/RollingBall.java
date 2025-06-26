package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RollingBall extends JPanel implements ActionListener{
    int x = 100, y = 90,start_angle = 0;
    
    public RollingBall(){
            Timer timer1 = new Timer(10,this);
            timer1.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y, 80, 80);
        g.fillArc(x, y, 80, 80,start_angle,180);

    }
    
    public void actionPerformed(ActionEvent e) {
        x = x - 2;
        start_angle = start_angle + 2;
        if(x == -80) x = getWidth();
        if(start_angle == 360) start_angle = 0;
        repaint();
    }
}
