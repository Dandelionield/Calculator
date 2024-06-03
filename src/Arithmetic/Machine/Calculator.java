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

abstract class Calculator extends JPanel{
	
	protected StringBuilder equation = new StringBuilder();
	protected int caretPosition = 0;
	
	protected ActionListener WriteZero = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "0");

		}
		
	};
	
	protected ActionListener WriteOne = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "1");

		}
		
	};
	
	protected ActionListener WriteTwo = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "2");

		}
		
	};
	
	protected ActionListener WriteThree = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "3");

		}
		
	};
	
	protected ActionListener WriteFour = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "4");

		}
		
	};
	
	protected ActionListener WriteFive = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "5");

		}
		
	};
	
	protected ActionListener WriteSix = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "6");

		}
		
	};
	
	protected ActionListener WriteSeven = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "7");

		}
		
	};
	
	protected ActionListener WriteEight = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "8");

		}
		
	};
	
	protected ActionListener WriteNine = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "9");

		}
		
	};
	
	protected ActionListener WriteDot = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, ".");

		}
		
	};
	
	protected ActionListener WriteEuler = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "e");

		}
		
	};
	
	protected ActionListener WritePi = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "P");

		}
		
	};
	
	protected ActionListener WriteGamma = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "G");

		}
		
	};
	
	protected ActionListener WriteAureo = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "A");

		}
		
	};
	
	protected ActionListener WriteAddition = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, " + ");

		}
		
	};
	
	protected ActionListener WriteSubtraction = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, " - ");

		}
		
	};
	
	protected ActionListener WriteProduct = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, " * ");

		}
		
	};
	
	protected ActionListener WriteDivision = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, " / ");

		}
		
	};
	
	protected ActionListener WriteRemainer = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, " % ");

		}
		
	};
	
	protected ActionListener WriteLeftParentheses = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "(");

		}
		
	};
	
	protected ActionListener WriteRightParentheses = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, ")");

		}
		
	};
	
	protected ActionListener WriteLn = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "ln(");

		}
		
	};
	
	protected ActionListener WriteRootSquared = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "2√");

		}
		
	};
	
	protected ActionListener Write2ndPower = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "^2");

		}
		
	};
	
	protected ActionListener WritePower = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "^");

		}
		
	};
	
	protected ActionListener WriteFactorial = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "!");

		}
		
	};
	
	protected ActionListener WriteSen = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Sen(");

		}
		
	};
	
	protected ActionListener WriteCos = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Cos(");

		}
		
	};
	
	protected ActionListener WriteTan = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Tan(");

		}
		
	};
	
	protected ActionListener WriteCsc = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Csc(");

		}
		
	};
	
	protected ActionListener WriteSec = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Sec(");

		}
		
	};
	
	protected ActionListener WriteCot = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Cot(");

		}
		
	};
	
	protected ActionListener WriteArcsen = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arcsen(");

		}
		
	};
	
	protected ActionListener WriteArccos = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccos(");

		}
		
	};
	
	protected ActionListener WriteArctan = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arctan(");

		}
		
	};
	
	protected ActionListener WriteArccsc = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccsc(");

		}
		
	};
	
	protected ActionListener WriteArcsec = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arcsec(");

		}
		
	};
	
	protected ActionListener WriteArccot = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccot(");

		}
		
	};
	
	protected ActionListener WriteSenh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Senh(");

		}
		
	};
	
	protected ActionListener WriteCosh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Cosh(");

		}
		
	};
	
	protected ActionListener WriteTanh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Tanh(");

		}
		
	};
	
	protected ActionListener WriteCsch = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Csch(");

		}
		
	};
	
	protected ActionListener WriteSech = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Sech(");

		}
		
	};
	
	protected ActionListener WriteCoth = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Coth(");

		}
		
	};
	
	protected ActionListener WriteArcsenh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arcsenh(");
			
		}
		
	};
	
	protected ActionListener WriteArccosh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccosh(");

		}
		
	};
	
	protected ActionListener WriteArctanh = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arctanh(");

		}
		
	};
	
	protected ActionListener WriteArccsch = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccsch(");

		}
		
	};
	
	protected ActionListener WriteArcsech = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arcsech(");

		}
		
	};
	
	protected ActionListener WriteArccoth = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			equation.insert(equation.length() - caretPosition, "Arccoth(");

		}
		
	};
	
	protected ActionListener goLeft = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			int indice = equation.length() - 1 - caretPosition;
			
			if (equation.charAt(indice)==' '){
				
				caretPosition+= 3;
				
			}else{
				
				caretPosition++;
				
			}
			
			fixCaretPosition();

		}
		
	};
	
	protected ActionListener goRight = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			int indice = equation.length() - 1 - caretPosition;
			
			if (equation.charAt(indice)==' '){
				
				caretPosition-= 3;
				
			}else{
				
				caretPosition--;
				
			}
			
			fixCaretPosition();

		}
		
	};
	
	protected ActionListener Remove = new ActionListener(){

		public void actionPerformed(ActionEvent e){
			
			if (equation.length()!=0){
				
				int indice = equation.length() - 1 - caretPosition;
				
				if (equation.charAt(indice)==' '){
					
					equation.delete(indice - 2, indice + 1);
					
				}else if (Parser.isAllowed(equation.charAt(indice)+"") || equation.charAt(indice)=='.' || equation.charAt(indice)==')' || equation.charAt(indice)=='!'  || equation.charAt(indice)=='^' || equation.charAt(indice)=='√'){
					
					equation.deleteCharAt(indice);
					
				}else{
					
					StringBuilder wd = new StringBuilder();
					
					for (int i=indice; i>=0; i--){
						
						wd.insert(0, equation.charAt(i)+"");
						
						if (compareStrings(wd, "Sen") || compareStrings(wd, "Cos") || compareStrings(wd, "Tan") || compareStrings(wd, "Csc") || compareStrings(wd, "Sec") || compareStrings(wd, "Cot")){
							
							equation.delete(i, indice + 1);
							
							break;
							
						}else if (compareStrings(wd, "Senh") || compareStrings(wd, "Cosh") || compareStrings(wd, "Tanh") || compareStrings(wd, "Csch") || compareStrings(wd, "Sech") || compareStrings(wd, "Coth")){
							
							equation.delete(i, indice + 1);
							
							break;
							
						}else if (compareStrings(wd, "Arcsen") || compareStrings(wd, "Arccos") || compareStrings(wd, "Arctan") || compareStrings(wd, "Arccsc") || compareStrings(wd, "Arcsec") || compareStrings(wd, "Arccot")){
							
							equation.delete(i, indice + 1);
							
							break;
							
						}else if (compareStrings(wd, "Arcsenh") || compareStrings(wd, "Arccosh") || compareStrings(wd, "Arctanh") || compareStrings(wd, "Arccsch") || compareStrings(wd, "Arcsech") || compareStrings(wd, "Arccoth")){
							
							equation.delete(i, indice + 1);
							
							break;
							
						}
						
					}
					
				}
				
				fixCaretPosition();
				
			}

		}
		
	};
	
	protected JButton Boton(String Text, int[] bounds, Font Format, Color Background, Color Foreground){
		
		JButton button = new JButton(Text){
			
			protected void paintComponent(Graphics g){
				
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Dibujar sombra
                g2d.setColor(Color.GRAY);
                g2d.fillRoundRect(SHADOW_SIZE, SHADOW_SIZE, getWidth() - SHADOW_SIZE, getHeight() - SHADOW_SIZE, 10, 10);

                // Dibujar fondo del botón
                g2d.setColor(getBackground());
                g2d.fillRoundRect(0, 0, getWidth() - SHADOW_SIZE, getHeight() - SHADOW_SIZE, 10, 10);

                // Dibujar contorno del botón
                g2d.setColor(Color.BLACK);
                //g2d.drawRoundRect(0, 0, getWidth() - SHADOW_SIZE - 1, getHeight() - SHADOW_SIZE - 1, 10, 10);

                g2d.dispose();

                // Pintar el contenido del botón (incluido el texto)
                super.paintComponent(g);
				
            }

            @Override
            public Insets getInsets(){
				
				//return new Insets(2, 2, SHADOW_SIZE, SHADOW_SIZE);
				
				return new Insets(SHADOW_SIZE - 10, SHADOW_SIZE - 10, 2, 2);
				
            }

            @Override
            public Insets getInsets(Insets insets){
				
                insets.left = 2;
                insets.right = SHADOW_SIZE;
                insets.top = 2;
                insets.bottom = SHADOW_SIZE;
				
                return insets;
				
            }

            private static final int SHADOW_SIZE = 5;
			
		};
		
		button.setBounds(bounds[0], bounds[1], bounds[2], bounds[3]);
		button.setFont(Format);
		/*button.setVerticalTextPosition(JButton.CENTER);
        button.setHorizontalTextPosition(JButton.CENTER);//*/
		button.setBorderPainted(true);
		button.setBackground(Background);
		button.setForeground(Foreground);
		button.setFocusable(false);
		button.setOpaque(true);
        button.setContentAreaFilled(false);
		button.setBorder(null);
		
		return button;
		
	}
	
	protected AbstractBorder getAbstractBorder(){
		
		return new AbstractBorder(){
            
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
				
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setColor(Color.BLACK);
				g2d.setStroke(new BasicStroke(3));
                g2d.drawRoundRect(x+1, y, (width-3), (height-2), 30, 30);

                g2d.dispose();
				
            }
			
        };
		
	}
	
	public abstract void Save(Parser p);
	
	private void fixCaretPosition(){
		
		if (this.caretPosition<0){
			
			this.caretPosition = 0;
			
		}else if (this.caretPosition>this.equation.length()){
			
			this.caretPosition = this.equation.length();
			
		}
		
	}
	
	private boolean compareStrings(StringBuilder a, String b){
		
		if (a.length()!=b.length()){
			
			return false;
			
		}
		
		for (int i=0; i<a.length(); i++){
			
			if (a.charAt(i)!=b.charAt(i)){
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
}