package Graphic.Container;

/*
 *
 * @author Dandelion
 * 
 */

import javax.swing.JLayeredPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Dashboard<T extends JPanel> extends JFrame{

	private T Panel;
	private JLayeredPane contentPane;
	
	public Dashboard(T Panel){
		
		int z = 0;
		
		this.Panel = Panel;
		
		this.setResizable(false);
		this.setTitle("Dashboard");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, this.Panel.getWidth(), this.Panel.getHeight());
		this.setLocationRelativeTo(null);
		
		this.contentPane = new JLayeredPane();
        this.contentPane.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		
		this.contentPane.add(this.Panel, Integer.valueOf(z));z++;
		
		this.Panel.setVisible(true);
		
		this.setContentPane(contentPane);
		
	}
	
	public T getContent(){
		
		return this.Panel;
		
	}

}