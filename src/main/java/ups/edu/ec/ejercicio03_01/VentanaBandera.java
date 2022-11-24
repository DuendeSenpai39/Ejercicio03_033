/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author 
 */
public class VentanaBandera extends JFrame {

    private final List<JPanel> jPanelList = new ArrayList<>();
    JLabel lbl1, lbl2, lbl4, lbl5;

    public VentanaBandera(String titulo) {
        this.setTitle(titulo);
        this.setSize(new Dimension(500, 280));
        this.setLocation(new Point(500, 450));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }

    public void iniciarComponentes() {

        lbl1 = new JLabel("Button 1");
        lbl2 = new JLabel("Button 3");
        lbl4 = new JLabel("Button 5");
        lbl5 = new JLabel("Long-Named Button 4");

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(1).add(lbl1);
        this.jPanelList.get(1).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(2).add(lbl2);
        this.jPanelList.get(2).setBorder(new EtchedBorder());

        this.jPanelList.add(crearBandera());

        //this.jPanelList.get(3).setBorder(new EtchedBorder());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(4).add(lbl4);
        this.jPanelList.get(4).setBorder(new EtchedBorder());

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(5).add(lbl5);
        this.jPanelList.get(5).setBorder(new EtchedBorder());

        this.jPanelList.get(0).add(this.jPanelList.get(1), BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(2), BorderLayout.WEST);
        this.jPanelList.get(0).add(this.jPanelList.get(3), BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(4), BorderLayout.EAST);
        this.jPanelList.get(0).add(this.jPanelList.get(5), BorderLayout.SOUTH);
    }

    public JPanel crearBandera() {

        JPanel pnlNoruega = new JPanel();
        //pnlNoruega.setSize(300,100);
        pnlNoruega.setLayout(new GridLayout(3, 1));

        //Bandera Parte NORTE    
        JPanel pnlNorte = new JPanel();
        pnlNorte.setLayout(new GridLayout(1, 4));
        JPanel pnlNorte2 = new JPanel();
        pnlNorte2.setLayout(new GridLayout(1, 3));

        JPanel pnlNorteBlanco = new JPanel();
        pnlNorteBlanco.setBackground(Color.white);
        JPanel pnlNorteBlanco2 = new JPanel();
        pnlNorteBlanco2.setBackground(Color.white);

        JPanel pnlNorteAzul = new JPanel();
        pnlNorteAzul.setBackground(Color.blue);

        JPanel pnlNorteRojo = new JPanel();
        pnlNorteRojo.setBackground(Color.red);
        JPanel pnlNorteRojo2 = new JPanel();
        pnlNorteRojo2.setBackground(Color.red);
        JPanel pnlNorteRojo3 = new JPanel();
        pnlNorteRojo3.setBackground(Color.red);
        
        pnlNorte2.add(pnlNorteBlanco);
        pnlNorte2.add(pnlNorteAzul);
        pnlNorte2.add(pnlNorteBlanco2);

        pnlNorte.add(pnlNorteRojo);
        pnlNorte.add(pnlNorte2);
        pnlNorte.add(pnlNorteRojo2);
        pnlNorte.add(pnlNorteRojo3);
        pnlNoruega.add(pnlNorte);

        //Bandera Parte CENTRAL
        JPanel pnlCentro = new JPanel();
        pnlCentro.setLayout(new GridLayout(1, 4));
        JPanel pnlCentro2 = new JPanel();
        pnlCentro2.setLayout(new GridLayout(3, 1));
        JPanel pnlCentro3 = new JPanel();
        pnlCentro3.setLayout(new GridLayout(3, 3));
        JPanel pnlCentro4 = new JPanel();
        pnlCentro4.setLayout(new GridLayout(3, 1));
        JPanel pnlCentro5 = new JPanel();
        pnlCentro5.setLayout(new GridLayout(3, 1));
        
        JPanel pnlCentroBlanco = new JPanel();
        pnlCentroBlanco.setBackground(Color.white);
        JPanel pnlCentroBlanco2 = new JPanel();
        pnlCentroBlanco2.setBackground(Color.white);
        JPanel pnlCentroBlanco3 = new JPanel();
        pnlCentroBlanco3.setBackground(Color.white);
        JPanel pnlCentroBlanco4 = new JPanel();
        pnlCentroBlanco4.setBackground(Color.white);
        JPanel pnlCentroBlanco5 = new JPanel();
        pnlCentroBlanco5.setBackground(Color.white);
        JPanel pnlCentroBlanco6 = new JPanel();
        pnlCentroBlanco6.setBackground(Color.white);
        JPanel pnlCentroBlanco7 = new JPanel();
        pnlCentroBlanco7.setBackground(Color.white);
        JPanel pnlCentroBlanco8 = new JPanel();
        pnlCentroBlanco8.setBackground(Color.white);
        JPanel pnlCentroBlanco9 = new JPanel();
        pnlCentroBlanco9.setBackground(Color.white);
        JPanel pnlCentroBlanco10 = new JPanel();
        pnlCentroBlanco10.setBackground(Color.white);

        JPanel pnlCentroAzul = new JPanel();
        pnlCentroAzul.setBackground(Color.blue);
        JPanel pnlCentroAzul2 = new JPanel();
        pnlCentroAzul2.setBackground(Color.blue);
        JPanel pnlCentroAzul3 = new JPanel();
        pnlCentroAzul3.setBackground(Color.blue);
        JPanel pnlCentroAzul4 = new JPanel();
        pnlCentroAzul4.setBackground(Color.blue);
        JPanel pnlCentroAzul5 = new JPanel();
        pnlCentroAzul5.setBackground(Color.blue);
        JPanel pnlCentroAzul6 = new JPanel();
        pnlCentroAzul6.setBackground(Color.blue);
        JPanel pnlCentroAzul7 = new JPanel();
        pnlCentroAzul7.setBackground(Color.blue);
        JPanel pnlCentroAzul8 = new JPanel();
        pnlCentroAzul8.setBackground(Color.blue);
        
        pnlCentro2.add(pnlCentroBlanco);
        pnlCentro2.add(pnlCentroAzul);
        pnlCentro2.add(pnlCentroBlanco2);
        
        pnlCentro3.add(pnlCentroBlanco3);
        pnlCentro3.add(pnlCentroAzul2);
        pnlCentro3.add(pnlCentroBlanco4);
        pnlCentro3.add(pnlCentroAzul3);
        pnlCentro3.add(pnlCentroAzul4);
        pnlCentro3.add(pnlCentroAzul5);
        pnlCentro3.add(pnlCentroBlanco5);
        pnlCentro3.add(pnlCentroAzul6);
        pnlCentro3.add(pnlCentroBlanco6);
        
        pnlCentro4.add(pnlCentroBlanco7);
        pnlCentro4.add(pnlCentroAzul7);
        pnlCentro4.add(pnlCentroBlanco8);
        
        pnlCentro5.add(pnlCentroBlanco9);
        pnlCentro5.add(pnlCentroAzul8);
        pnlCentro5.add(pnlCentroBlanco10);
        
        pnlCentro.add(pnlCentro2);
        pnlCentro.add(pnlCentro3);
        pnlCentro.add(pnlCentro4);
        pnlCentro.add(pnlCentro5);
        
        pnlNoruega.add(pnlCentro);
        
        //Bandera Parte SUR
        JPanel pnlSur = new JPanel();
        pnlSur.setLayout(new GridLayout(1, 4));
        JPanel pnlSur2 = new JPanel();
        pnlSur2.setLayout(new GridLayout(1, 3));

        JPanel pnlSurBlanco = new JPanel();
        pnlSurBlanco.setBackground(Color.white);
        JPanel pnlSurBlanco2 = new JPanel();
        pnlSurBlanco2.setBackground(Color.white);

        JPanel pnlSurAzul = new JPanel();
        pnlSurAzul.setBackground(Color.blue);

        JPanel pnlSurRojo = new JPanel();
        pnlSurRojo.setBackground(Color.red);
        JPanel pnlSurRojo2 = new JPanel();
        pnlSurRojo2.setBackground(Color.red);
        JPanel pnlSurRojo3 = new JPanel();
        pnlSurRojo3.setBackground(Color.red);
        
        pnlSur2.add(pnlSurBlanco);
        pnlSur2.add(pnlSurAzul);
        pnlSur2.add(pnlSurBlanco2);

        pnlSur.add(pnlSurRojo);
        pnlSur.add(pnlSur2);
        pnlSur.add(pnlSurRojo2);
        pnlSur.add(pnlSurRojo3);
        
        pnlNoruega.add(pnlSur);

        
        return pnlNoruega;
        
    }

}
