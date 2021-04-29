package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class resultadoFrame extends JPanel {


        JLabel Texto1, Texto2,Texto3;
        int r,po;
        String nombre,apellido;



        public resultadoFrame(int por,int radio,String nom,String ape){
            setLayout(null);
            setBackground(new java.awt.Color(200, 200, 200));
            r=radio;
            po=por;
            nombre=nom;
            apellido=ape;
            iniciarComponentes();
        }

        private void iniciarComponentes(){

            Texto1 = new JLabel("Resultados Generales ");
            Texto1.setBounds(100, 35, 600, 30);
            Texto1.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 22));
            Texto1.setForeground(Color.WHITE);

            Texto2 = new JLabel("El porcentaje de sus resultados es: "+po+"%");
            Texto2.setBounds(40, 150, 750, 30);
            Texto2.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 18));
            Texto2.setForeground(Color.WHITE);

            Texto3 = new JLabel("Nombre del Usuario: "+nombre+" "+apellido);
            Texto3.setBounds(40, 85, 750, 100);
            Texto3.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 14));
            Texto3.setForeground(Color.WHITE);

            add(Texto1);
            add(Texto2);
            add(Texto3);
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g;
            GradientPaint gp = new GradientPaint(400,80,Color.BLUE,800,100,Color.GREEN);
            g2d.setPaint(gp);

            g2d.fillArc(400,40,300,300,90,r);

        }


    }
