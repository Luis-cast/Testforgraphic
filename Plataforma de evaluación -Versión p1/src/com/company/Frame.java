package com.company;
import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame {

    Grafica ga = new Grafica();


    public Frame(int por,int radio){

        ga.Gravalue(por,radio);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(ga);
        this.setVisible(true);

    }
}
