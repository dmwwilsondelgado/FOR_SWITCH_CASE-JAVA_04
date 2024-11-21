package VISTA;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Manejo de Sintaxix del For
        //  inicializacion condicion incremeneto
        float promedio =0;
        int cont;
        for (int cont=1;cont<=20;cont++){
            float nota=Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota"));
            promedio=promedio+nota;// variable acomulativo requiere de un elemento inicial
          System.out.println("la sumatoria de notas"+promedio);
        }
        promedio =promedio/cont;
        JOptionPane.showInputDialog(null,"Nota Promedio:"+ promedio);
    }
}