package Arithmetic.Machine;

/*
 *
 * @author Dandelion
 * 
 */

import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.border.AbstractBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import Taylor.Arithmetic.Parser;
import Graphic.Component.ComponentBuilder;

public class Standard extends Calculator{
	
	private ComponentBuilder cp = new ComponentBuilder();
	
	private JButton Equal;
	private JButton Ans;
	private JButton Dot;
	private JButton Zero;
	private JButton One;
	
	private Font Format = new Font("Clarendon Blk BT", Font.BOLD, 20);
	
	public Standard(){
		
		int z = 0;
		final int wrap = 10;
		
		this.setBounds(0, 0, 350, 600);
		this.setOpaque(false);
		
		this.Ans = super.Boton("Ans", new int[] {30, 510, 65, 65}, this.Format, null, Color.BLACK);
		this.Zero = super.Boton("0", new int[] {this.Ans.getBounds().x + this.Ans.getWidth() + wrap, this.Ans.getBounds().y, this.Ans.getWidth(), this.Ans.getHeight()}, this.Format, null, Color.BLACK);
		this.Dot = super.Boton(".", new int[] {this.Zero.getBounds().x + this.Zero.getWidth() + wrap, this.Zero.getBounds().y, this.Zero.getWidth(), this.Zero.getHeight()}, this.Format, null, Color.BLACK);
		this.Equal = super.Boton("=", new int[] {this.Dot.getBounds().x + this.Dot.getWidth() + wrap, this.Dot.getBounds().y, this.Dot.getWidth(), this.Dot.getHeight()}, this.Format, null, Color.RED);
	
		this.setBorder(super.getAbstractBorder());
		
		this.setLayout(null);
		this.setComponentZOrder(this.Ans, z);z++;
		this.setComponentZOrder(this.Zero, z);z++;
		this.setComponentZOrder(this.Dot, z);z++;
		this.setComponentZOrder(this.Equal, z);z++;
		
		this.Ans.setVisible(true);
		this.Zero.setVisible(true);
		this.Dot.setVisible(true);
		this.Equal.setVisible(true);
		
		this.setVisible(true);
		
	}
	
	protected void paintComponent(Graphics g){
		
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(0, 0, 500, 1000, 30, 30);
		g2d.shear(0.0,0.0);
		g2d.setColor(Color.WHITE);
        g2d.fill(roundedRectangle);

        g2d.dispose();
		
    }

	public void Save(Parser p){
		
		
		
	}

}