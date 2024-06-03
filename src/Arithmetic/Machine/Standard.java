package Arithmetic.Machine;

/*
 *
 * @author Dandelion
 * 
 */

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import Taylor.Arithmetic.Parser;

public class Standard extends Calculator{
	
	public Standard(){
		
		int z = 0;
		
		this.setBounds(0, 0, 400, 600);
		this.setOpaque(false);
		
		this.setLayout(null);
		//this.setComponentZOrder(, z);z++;
		
		this.setVisible(true);
		
	}
	
	protected void paintComponent(Graphics g){
		
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, 500, 1000, 60, 60);
		g2d.shear(0.0,0.0);
		g2d.setColor(null);
        g2d.fill(roundedRectangle);

        g2d.dispose();
		
    }

	public void Save(Parser p){
		
		
		
	}

}