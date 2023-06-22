import javax.swing.JOptionPane;

public class Parser{
	
	public static void main (String[] abc){
		
		boolean b=false;

		do{
			
			/*String a = JOptionPane.showInputDialog(null,"Digite una ecuación");
			double n = Calculadora(a);
			
			JOptionPane.showMessageDialog(null,a+" = "+n,"Output",JOptionPane.INFORMATION_MESSAGE);*/

			try {
				
				String a = JOptionPane.showInputDialog(null,"Digite una ecuación");
				double n = Calculadora(a);
				
				/*double n = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite x para Arctan(x)"));
				JOptionPane.showMessageDialog(null,"Arctan("+n+") = "+Mayth.TaylorArctan(n),"Output",JOptionPane.INFORMATION_MESSAGE);*/
				
				JOptionPane.showMessageDialog(null,a+" = "+n,"Output",JOptionPane.INFORMATION_MESSAGE);
				b=true;
				
			}catch(Exception e){
				
				JOptionPane.showMessageDialog(null,"Datos Erroneos","Output",JOptionPane.ERROR_MESSAGE);
				b=false;
				
			}
			
		}while(b==false);
		
	}
	
	public static double Calculadora(String a){
		
		String n = "",bupleft = "", bupright = "";
		int left = -1, right = -1, bup = 0;
		
		a = Overwrite(a);

		if (a.contains("Z(") || a.contains("S(") || a.contains("P(")){
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='Z' && a.charAt(i+1)=='('){
					
					for (int f=i+1; f<a.length(); f++){
						
						n+= a.charAt(f)+"";
						
						if (a.charAt(f)=='('){bup++;}else if (a.charAt(f)==')'){bup--;}
						
						if (a.charAt(f)==')' && bup==0){break;}
						
					}
					
					do{
						
						if (a.charAt(i+1)=='('){bup++;}else if (a.charAt(i+1)==')'){bup--;}
						
						a = Mayth.DeleteChar(a,i+1);
						
					}while(a.charAt(i+1)!=')' || bup!=1);
					
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.ZetaReimann(Mayth.ParseFrom(Calculadora(n))))+"";
					a = Mayth.ReplaceChar(a,i,n);
					n = "";
					bup = 0;
					
				}
				
				if (a.charAt(i)=='S' && a.charAt(i+1)=='('){
					
					
					
				}
				
				if (a.charAt(i)=='P' && a.charAt(i+1)=='('){
					
					
					
				}
				
			}
			
			a = Calculadora(a)+"";
			
		}else if (a.contains("(")){
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='('){
					
					left = i;
					
				}
				
			}
			
			for (int i=left+1; i<a.length(); i++){
				
				if (a.charAt(i)==')'){
					
					right = i;
					break;
					
				}else{
					
					n+=a.charAt(i)+"";
					
				}
				
			}
			
			if (left!=0){
			
				for (int i=0; i<left; i++){
					
					bupleft+=a.charAt(i)+"";
					
				}
				
			}
			
			if (right!=a.length()-1){
			
				for (int i=right+1; i<a.length(); i++){
					
					bupright+=a.charAt(i)+"";
					
				}
				
			}
			
			a = Calculadora(bupleft+Calculadora(n)+bupright)+"";
			
		}else if (a.contains("Sen") || a.contains("Cos") || a.contains("Tan") || a.contains("Csc") || a.contains("Sec") || a.contains("Cot") || a.contains("Arcsen") || a.contains("Arccos") || a.contains("Arctan") || a.contains("Arccsc") || a.contains("Arcsec") || a.contains("Arccot")){	

			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='s' && a.charAt(i+4)=='e' && a.charAt(i+5)=='n' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArcsenh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='o' && a.charAt(i+5)=='s' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccosh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='t' && a.charAt(i+4)=='a' && a.charAt(i+5)=='n' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArctanh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='s' && a.charAt(i+5)=='c' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccsch(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='s' && a.charAt(i+4)=='e' && a.charAt(i+5)=='c' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArcsech(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='o' && a.charAt(i+5)=='t' && a.charAt(i+6)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccoth(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='S' && a.charAt(i+1)=='e' && a.charAt(i+2)=='n' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorSenh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='o' && a.charAt(i+2)=='s' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCosh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='T' && a.charAt(i+1)=='a' && a.charAt(i+2)=='n' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorTanh(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='s' && a.charAt(i+2)=='c' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCsch(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='S' && a.charAt(i+1)=='e' && a.charAt(i+2)=='c' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorSech(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='o' && a.charAt(i+2)=='t' && a.charAt(i+3)=='h'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCoth(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='s' && a.charAt(i+4)=='e' && a.charAt(i+5)=='n'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArcsen(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='o' && a.charAt(i+5)=='s'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccos(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='t' && a.charAt(i+4)=='a' && a.charAt(i+5)=='n'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArctan(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='s' && a.charAt(i+5)=='c'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccsc(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='s' && a.charAt(i+4)=='e' && a.charAt(i+5)=='c'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArcsec(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='A' && a.charAt(i+1)=='r' && a.charAt(i+2)=='c' && a.charAt(i+3)=='c' && a.charAt(i+4)=='o' && a.charAt(i+5)=='t'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorArccot(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='S' && a.charAt(i+1)=='e' && a.charAt(i+2)=='n'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorSen(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='o' && a.charAt(i+2)=='s'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCos(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='T' && a.charAt(i+1)=='a' && a.charAt(i+2)=='n'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorTan(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='s' && a.charAt(i+2)=='c'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCsc(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='S' && a.charAt(i+1)=='e' && a.charAt(i+2)=='c'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorSec(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
				if (a.charAt(i)=='C' && a.charAt(i+1)=='o' && a.charAt(i+2)=='t'){
					
					a = Mayth.DeleteChar(a,i+1);
					a = Mayth.DeleteChar(a,i+1);
					
					n = (Mayth.TaylorCot(Double.parseDouble(getRight(a,i))))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					
				}
				
			}
			
			a = Calculadora(a)+"";
			
		}else if (a.contains("√") || a.contains("^") || a.contains("!") || a.contains("ln") || a.contains("lg") || a.contains("log") || a.contains("|")){
			
			if (a.contains("√")){
				
				for (int i=0; i<a.length(); i++){
				
					if (a.charAt(i)=='√'){
						
						n = (Mayth.Raiz(Double.parseDouble(getRight(a,i)),Double.parseDouble(getLeft(a,i))))+"";
						a = ReplaceOperation(a,i,n);
						n="";
						
					}
					
				}
				
			}
			
			if (a.contains("^")){
				
				for (int i=0; i<a.length(); i++){
				
					if (a.charAt(i)=='^'){
						
						n = (Mayth.Potencia(Double.parseDouble(getLeft(a,i)),Float.parseFloat(getRight(a,i))))+"";
						a = ReplaceOperation(a,i,n);
						n = "";
						
					}
					
				}
				
			}
			
			if (a.contains("|")){
				
				for (int i=0; i<a.length(); i++){
				
					if (a.charAt(i)=='|'){
						
						for (int c=i+1; c<a.length(); c++){
							
							if (a.charAt(c)=='|'){
								
								right = 0;
								break;
								
							}else{
								
								bupright+= a.charAt(c)+"";
								
							}
							
							if (c==a.length()-1 && right!=0){a="Error";}
							
						}
						
						do{
							
							a = Mayth.DeleteChar(a,i+1);
							
						}while(a.charAt(i+1)!='|');
						
						a = Mayth.DeleteChar(a,i+1);
						
						n = (Mayth.AbsoluteValue(Calculadora(bupright)))+"";
						a = ReplaceOperation(a,i,n);
						n = "";
						right = -1;
						
					}
					
				}
				
			}
			
			if (a.contains("!")){
			
				for (int i=0; i<a.length(); i++){
				
					if (a.charAt(i)=='!'){
						
						n = (Mayth.Factorial( Mayth.ParseFrom(Double.parseDouble(getLeft(a,i))) ))+"";
						a = ReplaceOperation(a,i,n);
						n = "";
						
					}
					
				}
				
			}
			
			if (a.contains("ln")){
				
				for (int i=0; i<a.length(); i++){
					
					if (a.charAt(i)=='l' && a.charAt(i+1)=='n'){
						
						a = Mayth.DeleteChar(a,i+1);
						
						n = (Mayth.TaylorLn(Double.parseDouble(getRight(a,i))))+"";
						a = ReplaceOperation(a,i,n);
						n = "";
						
					}
					
				}
				
			}
			
			if (a.contains("lg")){
				
				for (int i=0; i<a.length(); i++){
					
					if (a.charAt(i)=='l' && a.charAt(i+1)=='g'){
						
						a = Mayth.DeleteChar(a,i+1);
						
						n = (Mayth.TaylorLg(Double.parseDouble(getRight(a,i))))+"";
						a = ReplaceOperation(a,i,n);
						n = "";
						
					}
					
				}
				
			}
			
			if (a.contains("log")){
				
				for (int i=0; i<a.length(); i++){
					
					if (a.charAt(i)=='l' && a.charAt(i+1)=='o' && a.charAt(i+2)=='g'){
						
						a = Mayth.DeleteChar(a,i+1);
						a = Mayth.DeleteChar(a,i+1);
						
						bup=i;
						
						if (a.charAt(i+1)=='{'){
							
							a = Mayth.DeleteChar(a,i);

							
							for (int f=i; f<a.length(); f++){
							
								if (a.charAt(f)==','){
									
									i=f;
									break;
									
								}
								
							}
							
							n = (Mayth.TaylorLog(Double.parseDouble(getLeft(a,i)),Double.parseDouble(getRight(a,i))))+"";
							a = ReplaceOperation(a,i,n);
							
							for (int f=0; f<a.length(); f++){
					
								if (a.charAt(f)=='{'){
									
									left = f;
									break;
								}
								
								bupleft+=a.charAt(f)+"";
								
							}
							
							for (int f=left+1; f<a.length(); f++){
					
								if (a.charAt(f)=='}'){
									
									right = f;
									break;
									
								}
								
							}
							
							for (int f=right+1; f<a.length(); f++){
						
								bupright+=a.charAt(f)+"";
								
							}
							
							a=bupleft+n+bupright;
							
						}else{
							
							n = (Mayth.TaylorLog(Double.parseDouble(getRight(a,i))))+"";
							a = ReplaceOperation(a,i,n);
							n = "";
							
						}
						
					}
					
				}
				
			}
			
			a = Calculadora(a)+"";
			
		}else{
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='%'){
					
					n = (Double.parseDouble(getLeft(a,i)) % Double.parseDouble(getRight(a,i)))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					i=0;
					
				}
				
			}
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='x'){
					
					n = (Double.parseDouble(getLeft(a,i)) * Double.parseDouble(getRight(a,i)))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					i=0;
					
				}
				
			}
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='/'){
					
					n = (Double.parseDouble(getLeft(a,i)) / Double.parseDouble(getRight(a,i)))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					i=0;
					
				}
				
			}
			
			for (int i=0; i<a.length(); i++){
				
				if (a.charAt(i)=='+'){
					
					n = (Double.parseDouble(getLeft(a,i)) + Double.parseDouble(getRight(a,i)))+"";
					a = ReplaceOperation(a,i,n);
					n = "";
					i=0;
					
				}
				
			}
			
			for (int i=0; i<a.length(); i++){
				
				if (i==0 && a.charAt(i)=='-'){continue;}
				
				if (a.charAt(i)=='-'){
					
					if (Mayth.AbsoluteValue(Double.parseDouble(getLeft(a,i)) - Double.parseDouble(getRight(a,i)))<0.00000000001){
						
						n = "0";
						
					}else{
					
						n = (Double.parseDouble(getLeft(a,i)) - Double.parseDouble(getRight(a,i)))+"";
						
					}
					
					a = ReplaceOperation(a,i,n);
					n = "";
					i=0;
					
				}
				
			}
			
		}
		
		return Double.parseDouble(a);
		
	}
	
	public static String getLeft(String wd, int indice){
		
		String nw = "";
		
		for (int i=indice-1; i>=0; i--){
			
			if (Mayth.Allowed(wd.charAt(i)+"")==true || (wd.charAt(i)+"").equals(".")==true || (wd.charAt(i)+"").equals("-")==true){
				
				nw+=wd.charAt(i)+"";
				
				if ((wd.charAt(i)+"").equals("-")==true){break;}
				
			}else{break;}
			
		}
		
		return Mayth.TurnAround(nw);
		
	}
	
	public static String getRight(String wd, int indice){
		
		String nw = "";
		
		for (int i=indice+1; i<wd.length(); i++){

			if (i==indice+1 && (wd.charAt(indice+1)+"").equals("-")==true){nw+="-";continue;}
			
			if (Mayth.Allowed(wd.charAt(i)+"")==true || (wd.charAt(i)+"").equals(".")==true){
				
				nw+=wd.charAt(i)+"";

			}else{break;}
			
		}
		
		return nw;
		
	}
	
	public static String ReplaceOperation(String wd, int indice, String nw){
		
		int left = -1, right = -1;
		String neword = "";
		
		for (int i=indice-1; i>=0; i--){
			
			if ((wd.charAt(i)+"").equals("-")==true){
				
				left = i-1;
				
				break;
				
			}else if (Mayth.Allowed(wd.charAt(i)+"")==false && (wd.charAt(i)+"").equals(".")==false && (wd.charAt(i)+"").equals("-")==false){
				
				left = i;
				
				if ((wd.charAt(i)+"").equals("-")==false){i-=1;break;}
				
				break;
				
			}
			
		}
		
		for (int i=indice+1; i<wd.length(); i++){
			
			if (i==indice+1 && (wd.charAt(indice+1)+"").equals("-")==true){continue;}
		
			if (Mayth.Allowed(wd.charAt(i)+"")==false && (wd.charAt(i)+"").equals(".")==false){
				
				right = i;
				break;
				
			}
			
		}
		
		if (left!=-1){
		
			for (int i=0; i<=left; i++){
				
				neword+=wd.charAt(i)+"";
				
			}
			
		}
		
		neword+=nw;
		
		if (right!=-1){
			
			for (int i=right; i<wd.length(); i++){
				
				neword+=wd.charAt(i)+"";
				
			}
			
		}
		
		return neword;
		
	}
	
	public static String Overwrite(String wd){
		
		int Counter = 0;
		
		if (wd==""){wd="0";}
		
		for (int i=0; i<wd.length(); i++){
			
			if (wd.charAt(i)=='-' && wd.charAt(i+1)=='('){
				
				wd = Mayth.ReplaceChar(wd,i,"-1x");
				i=0;
				
			}
			
			if (wd.charAt(i)=='e'){
				
				wd+=" ";
				
				if (wd.length()==1){
					
					wd = Mayth.ReplaceChar(wd,i,Mayth.Euler()+"");
					i=0;
					
				}else if (wd.charAt(i+1)!='n' && wd.charAt(i+1)!='c'){
					
					wd = Mayth.ReplaceChar(wd,i,Mayth.Euler()+"");
					i=0;
					
				}
				
				wd = Mayth.DeleteChar(wd,wd.length()-1);
				
			}
			
			if (wd.charAt(i)=='P'){
				
				wd+=" ";
				
				if (wd.charAt(i+1)!='('){
					
					wd = Mayth.ReplaceChar(wd,i,Mayth.Pi()+"");
					i=0;
					
				}
				
				wd = Mayth.DeleteChar(wd,wd.length()-1);
				
			}
			
			if (wd.charAt(i)=='A'){
				
				wd+=" ";
				
				if (wd.length()==1){
					
					wd = Mayth.ReplaceChar(wd,i,Mayth.Aureo()+"");
					i=0;
					
				}else if (wd.charAt(i+1)!='r'){
					
					wd = Mayth.ReplaceChar(wd,i,Mayth.Aureo()+"");
					i=0;
					
				}
				
				wd = Mayth.DeleteChar(wd,wd.length()-1);
				
			}
			
			if (wd.charAt(i)=='G'){
				
				wd = Mayth.ReplaceChar(wd,i,Mayth.Gamma()+"");
				i=0;
				
			}
			
		}
		
		if (wd.contains("(") || wd.contains(")")){
			
			for (int i=0; i<wd.length(); i++){
				
				if (wd.charAt(i)=='('){Counter++;}else if (wd.charAt(i)==')'){Counter--;}
				
			}
			
		}
		
		if (Counter!=0){wd="Error";}
		
		return wd;
		
	}
	
}