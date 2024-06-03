package Graphic.Container;

/*
 *
 * @author Dandelion
 * 
 */

import javax.swing.JLayeredPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.geom.RoundRectangle2D;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Dashboard<T extends JPanel> extends JFrame{

	private T Panel;
	private JLayeredPane contentPane;
	
	private int X = 0;
	private int Y = 0;
	
	public Dashboard(T Panel){
		
		int z = 0;
		
		this.Panel = Panel;
		
		this.setResizable(false);
		this.setTitle("Dashboard");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, this.Panel.getWidth(), this.Panel.getHeight());
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
		
		this.contentPane = new JLayeredPane();
        this.contentPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		
		this.contentPane.add(this.Panel, Integer.valueOf(z));z++;
		
		this.Panel.setVisible(true);
		
		Actions();
		
		this.setContentPane(contentPane);
		
		this.setVisible(true);
		
	}
	
	public T getContent(){
		
		return this.Panel;
		
	}
	
	private void Actions(){
		
		Panel.addMouseListener(new MouseAdapter(){
			
            public void mousePressed(MouseEvent e){
				
                X = e.getX();
                Y = e.getY();
				
            }
			
        });
		
		Panel.addMouseMotionListener(new MouseAdapter(){
			
            public void mouseDragged(MouseEvent e){
                
                int x = e.getXOnScreen() - X;
                int y = e.getYOnScreen() - Y;

                setLocation(x, y);
				
            }
			
        });
		
	}

}