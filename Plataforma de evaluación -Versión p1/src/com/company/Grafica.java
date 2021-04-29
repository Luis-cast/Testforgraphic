package com.company;
import java.awt.*;
import javax.swing.*;

public class Grafica extends JPanel {

    int r,po;

    public void Gravalue(int por, int radio)
    {
         r= radio;
         po= por;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gp = new GradientPaint(0,0,Color.BLUE,500,0,Color.GREEN);
        g2d.setPaint(gp);
        g2d.drawString("El porcentaje de sus resultados es:"+po,250,150);

        g2d.fillArc(250,250,300,300,90,r);

    }
}
