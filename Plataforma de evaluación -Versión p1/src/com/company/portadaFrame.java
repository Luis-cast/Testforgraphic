package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class portadaFrame extends JPanel {

    JLabel titulo, intrucciones, nombre, apellido;
    JTextField nombreT, apellidT;



    public portadaFrame(){
        setLayout(null);
        setBackground(new java.awt.Color(200, 200, 200));
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        titulo = new JLabel("Bienvenidos al Sistema de evaluacion");
        titulo.setBounds(200, 65, 450, 30);
        titulo.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);

        intrucciones = new JLabel("Por favor introduzca los datos solicitados");
        intrucciones.setBounds(195, 100, 450, 30);
        intrucciones.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 20));
        intrucciones.setForeground(Color.white);

        nombre = new JLabel("Nombre");
        nombre.setBounds(200, 200, 70, 30);
        nombre.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 14));
        nombre.setForeground(Color.white);

        nombreT = new JTextField();
        nombreT.setBounds(200, 230, 100, 30);
        nombreT.setBackground(new java.awt.Color(255, 255, 255));
        nombreT.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        apellido = new JLabel("Apellido");
        apellido.setBounds(500, 200, 70, 30);
        apellido.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 14));
        apellido.setForeground(Color.white);

        apellidT = new JTextField();
        apellidT.setBounds(500, 230, 100, 30);
        apellidT.setBackground(new java.awt.Color(255, 255, 255));
        apellidT.setBorder(BorderFactory.createLineBorder(Color.black, 1));





        add(titulo);
        add(intrucciones);
        add(nombre);
        add(apellido);
        add(nombreT);
        add(apellidT);
    }



}
