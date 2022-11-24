/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ups.edu.ec.ejercicio03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author guama
 */
public class VentanaBorder extends JFrame{

    private final List<JPanel> jPanelList = new ArrayList<>();
    JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
            
    public VentanaBorder(String titulo){
        this.setTitle(titulo);
        this.setSize(new Dimension(400,150));
        this.setLocation(new Point(200,200));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
    }
    
    public void iniciarComponentes(){
        
        lbl1= new JLabel("Button 1");
        lbl2= new JLabel("Button 3");
        lbl3= new JLabel("2");
        lbl4= new JLabel("Button 5");
        lbl5= new JLabel("Long-Named Button 4");
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(new BorderLayout());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(1).add(lbl1);
        this.jPanelList.get(1).setBorder(new EtchedBorder());
         
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(2).add(lbl2);
        this.jPanelList.get(2).setBorder(new EtchedBorder());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(3).add(lbl3);
        this.jPanelList.get(3).setBorder(new EtchedBorder());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(4).add(lbl4);
        this.jPanelList.get(4).setBorder(new EtchedBorder());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(5).add(lbl5);
        this.jPanelList.get(5).setBorder(new EtchedBorder());
        
        this.jPanelList.get(0).add(this.jPanelList.get(1),BorderLayout.NORTH);
        this.jPanelList.get(0).add(this.jPanelList.get(2),BorderLayout.WEST);
        this.jPanelList.get(0).add(this.jPanelList.get(3),BorderLayout.CENTER);
        this.jPanelList.get(0).add(this.jPanelList.get(4),BorderLayout.EAST);
            this.jPanelList.get(0).add(this.jPanelList.get(5),BorderLayout.SOUTH);     
    }
    
    
}
