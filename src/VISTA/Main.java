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


        //explicacion swicth
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion"));
        switch (opc){
            case 1;
            for (int cont=1;cont<=5;cont++){
                System.out.println(cont*10);
            }
            break //rompa la opcion del case
            case 2;
            System.out.println("ingrese una opcion valida ...");
            break;
            default://opcional
                System.out.println("opcion no valida");

        }
    }
}