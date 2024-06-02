package Arithmetic.Machine;

/*
 *
 * @author Dandelion
 * 
 */

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Taylor.Arithmetic.Parser;

public abstract class Calculator{
	
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