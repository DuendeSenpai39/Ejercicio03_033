/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.ejercicio03_01;

/**
 *
 * @author guama
 */

public class Ejercicio03_01 {

    public static void main(String[] args) {
        VentanaBorder v1 = new VentanaBorder("BorderLayout");
        v1.setVisible(true);
        VentanaGrid v2 = new VentanaGrid("GridLayout");
        v2.setVisible(true);
        VentanaFlow v3 = new VentanaFlow("FlowLayout");
        v3.setVisible(true);
        
        VentanaBandera v4 = new VentanaBandera("BorderLayout");
        v4.setVisible(true);
    }
}
