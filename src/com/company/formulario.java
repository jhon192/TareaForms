package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario implements ActionListener{
    JFrame ventana;
    JPanel panel;
    JLabel titulo1, titulo2;
    JRadioButton rboton1, rboton2, rboton3, rboton1imi, rboton2imi, rboton3imi;
    JCheckBox cboton1, cboton2, cboton3, cboton1imi, cboton2imi, cboton3imi;
    JTextField espacio, espacioimi;
    JSpinner espinel, espinelimi;
    JComboBox<String> despegable, despegableimi;
    JSeparator separador;

    @Override
    public void actionPerformed(ActionEvent e) {}

    void despegables(){
        espacio = new JTextField();
        espacioimi = new JTextField();
        espinel = new JSpinner();
        espinelimi = new JSpinner();
        despegable = new JComboBox<>();
        despegableimi = new JComboBox<>();
        espacio.setBounds(200, 43, 100, 20);
        espacioimi.setBounds(200, 225, 100, 20);
        espinel.setBounds(200, 110, 100, 20);
        espinelimi.setBounds(200, 285, 100, 20);
        despegable.setBounds(200, 80, 100, 20);
        despegableimi.setBounds(200, 255, 100, 20);
        despegable.addItem("Item 1");
        despegable.addItem("Item 2");
        despegable.addItem("Item 3");
        despegableimi.addItem("Item 1");
        despegableimi.addItem("Item 2");
        despegableimi.addItem("Item 3");
    }


    void botones(){
        rboton1 = new JRadioButton("Opcion 1");
        rboton2 = new JRadioButton("Opcion 2");
        rboton3 = new JRadioButton("Opcion 3");
        cboton1 = new JCheckBox("Opcion 4");
        cboton2 = new JCheckBox("Opcion 5");
        cboton3 = new JCheckBox("Opcion 6");
        rboton1imi = new JRadioButton("Opcion 1");
        rboton2imi = new JRadioButton("Opcion 2");
        rboton3imi = new JRadioButton("Opcion 3");
        cboton1imi = new JCheckBox("Opcion 4");
        cboton2imi = new JCheckBox("Opcion 5");
        cboton3imi = new JCheckBox("Opcion 6");
        rboton1.setBounds(15, 40, 80, 20);
        rboton2.setBounds(15, 70, 80, 20);
        rboton3.setBounds(15, 100, 80, 20);
        cboton1.setBounds(110, 40, 80, 20);
        cboton2.setBounds(110, 70, 80, 20);
        cboton3.setBounds(110, 100, 80, 20);
        rboton1imi.setBounds(15, 220, 80, 20);
        rboton2imi.setBounds(15, 250, 80, 20);
        rboton3imi.setBounds(15, 280, 80, 20);
        cboton1imi.setBounds(110, 220, 80, 20);
        cboton2imi.setBounds(110, 250, 80, 20);
        cboton3imi.setBounds(110, 280, 80, 20);

    }

    void desactivar(){
        espinelimi.setEnabled(false);
        espacioimi.setEnabled(false);
        despegableimi.setEnabled(false);
        rboton1imi.setEnabled(false);
        rboton2imi.setEnabled(false);
        rboton3imi.setEnabled(false);
        cboton1imi.setEnabled(false);
        cboton2imi.setEnabled(false);
        cboton3imi.setEnabled(false);
    }

    void metodosimi(){
        cboton1.addActionListener(e -> cboton1imi.setSelected(true));
        cboton2.addActionListener(e -> cboton2imi.setSelected(true));
        cboton3.addActionListener(e -> cboton3imi.setSelected(true));
        rboton1.addActionListener(e -> rboton1imi.setSelected(true));
        rboton2.addActionListener(e -> rboton2imi.setSelected(true));
        rboton3.addActionListener(e -> rboton3imi.setSelected(true));
        /*espinelimi.setValue(espinel);
        espinelimi.getValue();*/
        despegable.addActionListener(e -> despegableimi.add(despegable));
    }


    void titulos(){
        titulo1 = new JLabel("Original");
        titulo2 = new JLabel("Imitador");
        separador = new JSeparator();
        titulo1.setBounds(10,0, 100, 30);
        titulo1.setFont(new Font("arial", Font.BOLD, 12));
        titulo2.setBounds(5,180, 100, 40);
        titulo2.setFont(new Font("arial", Font.BOLD, 12));
        separador.setBounds(0, 170, 450, 40);

    }

    void paneles(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(titulo1);
        panel.add(titulo2);
        panel.add(separador);
        panel.add(rboton1);
        panel.add(rboton2);
        panel.add(rboton3);
        panel.add(cboton1);
        panel.add(cboton2);
        panel.add(cboton3);
        panel.add(rboton1imi);
        panel.add(rboton2imi);
        panel.add(rboton3imi);
        panel.add(cboton1imi);
        panel.add(cboton2imi);
        panel.add(cboton3imi);
        panel.add(espacio);
        panel.add(espacioimi);
        panel.add(espinel);
        panel.add(despegable);
        panel.add(espinelimi);
        panel.add(despegableimi);
    }

    void metodoventana(){
        ventana = new JFrame();
        ventana.setSize(350, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Imitador");
        ventana.add(panel);
    }


    public formulario() {
        despegables();
        botones();
        desactivar();
        metodosimi();
        titulos();
        paneles();
        metodoventana();
    }

}
