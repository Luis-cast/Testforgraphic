package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruebaFrame extends JPanel implements ActionListener {

    JButton B1;
    Ventana objV;
    Test objT;
    ButtonGroup grpResp;
    JRadioButton opc1,opc2,opc3,opc4,opc5;
    JLabel Texto1, Texto2,Texto3;
    String[] preguntas;
    int[] respuestas;
    int cont,suma,porcentaje,radio;

    public pruebaFrame(Ventana object){
        setLayout(null);
        setBackground(new java.awt.Color(200, 200, 200));
        preguntas = new String[5];
        respuestas = new int[5];
        objV=object;
        cont=0;
        iniciarComponentes();


    }

    private void iniciarComponentes(){

        objT = new Test();

        preguntas=objT.getEvaluacion();

        Texto1 = new JLabel("A continuación se presentara unas preguntas relacionadas a su forma de actuar o pensar");
        Texto1.setBounds(100, 35, 600, 30);
        Texto1.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 13));
        Texto1.setForeground(Color.WHITE);

        Texto2 = new JLabel("Seleccione: 1:Totalmente en desacuerdo, 2:Desacuerdo, 3:Indiferente,4: Deacuerdo,5:Totalmente de acuerdo");
        Texto2.setBounds(40, 85, 750, 30);
        Texto2.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 13));
        Texto2.setForeground(Color.WHITE);

        Texto3 = new JLabel(preguntas[cont]);
        Texto3.setBounds(40, 170, 750, 30);
        Texto3.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 13));
        Texto3.setForeground(Color.WHITE);

        grpResp = new ButtonGroup();

        opc1 = new JRadioButton("1");
        opc1.setBounds(300,250,50,50);
        grpResp.add(opc1);

        opc2 = new JRadioButton("2");
        opc2.setBounds(350,250,50,50);
        grpResp.add(opc2);

        opc3 = new JRadioButton("3");
        opc3.setBounds(400,250,50,50);
        grpResp.add(opc3);

        opc4 = new JRadioButton("4");
        opc4.setBounds(450,250,50,50);
        grpResp.add(opc4);

        opc5 = new JRadioButton("5");
        opc5.setBounds(500,250,50,50);
        grpResp.add(opc5);

        add(opc1);
        add(opc2);
        add(opc3);
        add(opc4);
        add(opc5);
        add(Texto1);
        add(Texto2);
        add(Texto3);

        B1 = new JButton("Siguiente");
        B1.setBounds(500, 350, 100, 30);
        B1.setBackground(new java.awt.Color(86, 186, 237));
        B1.setForeground(Color.WHITE);
        B1.setFocusable(false);
        B1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        B1.setFont(new java.awt.Font("TimesRoman", Font.BOLD, 12));
        B1.addActionListener((ActionListener) this);

        add(B1);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == B1){

            if(cont==(preguntas.length)-1)
            {
                if(opc1.isSelected())
                {
                    respuestas[cont]=1;
                }

                if(opc2.isSelected())
                {
                    respuestas[cont]=2;
                }

                if(opc3.isSelected())
                {
                    respuestas[cont]=3;
                }

                if(opc4.isSelected())
                {
                    respuestas[cont]=4;
                }

                if(opc5.isSelected())
                {
                    respuestas[cont]=5;
                }

                B1.setEnabled(false);

                suma = objT.Sumatoria(respuestas);
                porcentaje = objT.CalcularPorcentaje(suma);
                radio = objT.CalcularRadio(suma);


                objV.A1.setEnabled(true);


            }
            else
            {
                if(opc1.isSelected())
                {
                    respuestas[cont]=1;
                }

                if(opc2.isSelected())
                {
                    respuestas[cont]=2;
                }

                if(opc3.isSelected())
                {
                    respuestas[cont]=3;
                }

                if(opc4.isSelected())
                {
                    respuestas[cont]=4;
                }

                if(opc5.isSelected())
                {
                    respuestas[cont]=5;
                }

                cont = cont + 1;
                Texto3.setText(preguntas[cont]);
                grpResp.clearSelection();
                repaint();
            }

        }
    }


}
