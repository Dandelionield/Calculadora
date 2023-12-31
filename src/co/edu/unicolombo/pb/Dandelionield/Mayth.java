import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mayth{
	
	public  static double Raiz(double x, double n){
		
		double producto=0;
		int signo=1;
		
		if (x>=0){
		
			if (n!=1 && x!=0){
			
				if (n<0){
					
					signo*=-1;
					n*=-1;
					
				}
				
				if (signo>0){
				
					producto= TaylorEuler(TaylorLn(x)/n);
					
				}else{
					
					if (n==1){
						
						producto=1/x;
						
					}else{
						
						producto= 1/TaylorEuler(TaylorLn(x)/n);
						
					}
				}
				
			}else{producto=x;}
			
		}else{producto = Double.NaN;}
		
		return producto;
		
	}
	
	public static double Potencia(double base, float exponente){
		
		
		double producto=1;
		int signo=1;
		int[] parts;
		int[] bup;

		if (base<0){
			
			signo=-1;
			base*=signo;
			
		}
		
		parts = Partir(exponente+"");
		
		if (parts[1]!=0){
			
			bup = Fraccion(exponente);
		
			if (bup[0]%2!=0 && base*signo<0 && bup[1]!=1){
				
				producto = Double.NaN;
				
			}else if (signo==1){

				producto = TaylorEuler( exponente * Redondear(TaylorLn(base),6));
				
			}else if (signo==-1){
				
				if (bup[0]%2!=0){
					
					producto = TaylorEuler(exponente * Redondear(TaylorLn(base),6))*-1;
					
				}else{
					
					producto = TaylorEuler(exponente * Redondear(TaylorLn(base),6));
					
				}
				
			}
			
		}else{
			
			base*=signo;
			signo=1;
			
			if (parts[0]<0){
			
				signo = -1;
				parts[0] *= signo;
				
			}
			
			if (parts[0]!=0 && base!=1){
			
				if (base!=-1){
			
					for (int i=1; i<=parts[0]; i++){
						
						producto = producto * base;
						
					}
					
				}else{
					
					if (parts[0]%2==0){producto = 1;}else{producto = -1;}
					
				}
				
			}else{
				
				producto = 1;
				
			}
			
			if (signo<0){
				
				producto = 1 / producto;
				
			}
			
		}
		
		return producto;
		
	}
	
	public  static double TaylorEuler(double x){//Se usa la serie Taylor para e^x
		
		double Tylore=0;
		int signo=1;
		
		if (x<0){
			
			signo*=-1;
			x*=-1;
			
		}
		
		if (x<=65){
		
			for (int n=0; n<=170; n++){
				
				Tylore+= Potencia(x,n) / Factorial(n);
				
			}
			
			if (signo==-1){
				
				Tylore=1/Tylore;
				
			}
			
		}else{
			
			Tylore = Double.POSITIVE_INFINITY;
			
		}
		
		return Tylore;
		
	}
	
	public  static double TaylorPi(double x){//Se usa la serie Taylor para Pi^x
		
		double Tylore=0,lnpi=1.14472988584940017;
		int signo=1;
		
		if (x<0){
			
			signo*=-1;
			x*=-1;
			
		}

		for (int n=0; n<=170; n++){
			
			Tylore+= (Potencia(lnpi,n) / Factorial(n)) * Potencia(x,n);
			
		}
		
		if (signo==-1){
			
			Tylore=1/Tylore;
			
		}
		
		return Tylore;
		
	}
	
	public static double TaylorEulerMascheroni(double x){//Se usa la serie Taylor para Gamma^x
		
		double Tylore=0,lngamma=-0.54953931298165;	
		int signo=1;
		
		if (x<0){
			
			signo*=-1;
			x*=-1;
			
		}

		for (int n=0; n<=170; n++){
			
			Tylore+= (Potencia(lngamma,n) / Factorial(n)) * Potencia(x,n);
			
		}
		
		if (signo==-1){
			
			Tylore=1/Tylore;
			
		}
		
		return Tylore;
		
	}

	public static double TaylorLn(double x){//Se usa la serie Taylor para el ln(x)
		
		double ln=0;
		boolean b = false;

		if (x>0 && x<1){x=1/x;b=true;}

		if (x>1){
		
			for (int n=1; n<=50000; n++){//50k
				
				ln+= Potencia(-1f,(n+1))*Potencia(1/x - 1,n)/n;
				
			}
			
		}else if (x==1){
			
			ln=0;
			
		}else if (x<=0){ln = Double.NaN;}

		if (b==true){ln *= -1;}

		return ln*-1;
		
	}
	
	public static double TaylorLg(double x){//Se usa la serie Taylor para el logaritmo en base Pi 
		
		double lg=0,lnpi=1.14472988585;
		boolean b = false;

		if (x>0 && x<1){x=1/x;b=true;}

		if (x>1){
			
			for (int n=1; n<=50000; n++){//50k
				
				lg += Potencia(-1f,n-1) * Potencia(1/x - 1,n)/(n*lnpi);
				
			}
			
		}else if (x==1){
			
			lg=0;
			
		}else if (x<=0){lg = Double.NaN;}

		if (b==true){lg *= -1;}

		return lg*-1;
		
	}
	
	public static double TaylorLog(double x){//Se usa la serie Taylor para el logaritmo en base 10 
		
		double log=0,ln=2.30258509299;
		boolean b = false;

		if (x>0 && x<1){x=1/x;b=true;}

		if (x>1){
			
			for (int n=1; n<=50000; n++){//50k
				
				log += Potencia(-1f,n-1) * Potencia(1/x - 1,n)/(n*ln);
				
			}
			
		}else if (x==1){
			
			log=0;
			
		}else if (x<=0){log = Double.NaN;}

		if (b==true){log *= -1;}

		return log*-1;
		
	}
	
	public static double TaylorLog(double x, double base){//Se usa la serie Taylor para el logaritmo en base b 
		
		double log=0,ln=0;
		boolean b = false;

		if (x>0 && x<1){x=1/x;b=true;}

		if (x>1 && base>0){
			
			ln = TaylorLn(base);
			
			for (int n=1; n<=50000; n++){//50k
				
				log += Potencia(-1f,n-1) * Potencia(1/x - 1,n)/(n*ln);
				
			}
			
		}else if (x==1 && base>0){
			
			log=0;
			
		}else if (x<=0 && base<=0){log = Double.NaN;}

		if (b==true){log *= -1;}

		return log*-1;
		
	}
	
	public static double TaylorSen(double x){
		
		double seno = 0;
		
		x = (x*Pi())/180;
		
		for (int n=0; n<=84; n++){

			seno += Potencia(-1,n) * Potencia(x,2*n+1)/Factorial(2*n+1);
			
		}
		
		return seno;
		
	}
	
	public static double TaylorArcsen(double x){
		
		double arcoseno = 0;
		
		for (int n=0; n<=85; n++){

			arcoseno += (Factorial(2*n)/Potencia(Potencia(2,n)*Factorial(n),2))*(Potencia(x,2*n+1)/(2*n+1));
			
		}
		
		if (x==1){arcoseno=1.57079632679;}
		
		return (arcoseno*180)/Pi();
		
	}
	
	public static double TaylorCos(double x){
		
		double coseno = 0;
		
		x = (x*Pi())/180;
		
		if ((x*180)/Pi()==90 || (x*180)/Pi()==270){
			
			return 0;
			
		}else {
			
			for (int n=0; n<=85; n++){

				coseno += Potencia(-1,n) * Potencia(x,2*n)/Factorial(2*n);
				
			}
			
		}
		
		return coseno;
		
	}
	
	public static double TaylorArccos(double x){
		
		return ( ((Pi()/2) - (TaylorArcsen(x)*Pi()/180 )) *180)/Pi();
		
	}
	
	public static double TaylorTan(double x){
		
		if (x!=90 && x!=270){
			
			return TaylorSen(x)/TaylorCos(x);
			
		}else{
			
			return Double.NaN;
			
		}
		
	}
	
	public static double TaylorArctan(double x){
		
		double arcotangente = 0;
		
		for (int n=0; n<=100; n++){

			arcotangente += Potencia(-1,n) * (Potencia(x,2*n+1)/(2*n+1));
			
		}
		
		return (arcotangente*180)/Pi();
		
	}
	
	public static double TaylorCsc(double x){
		
		if (x!=0 && x!=180 && x!=360){
			
			return 1d/TaylorSen(x);
			
		}else{
			
			return Double.NaN;
			
		}
		
	}
	
	public static double TaylorArccsc(double x){
		
		return TaylorArcsen(1/x);
		
	}
	
	public static double TaylorSec(double x){
		
		if (x!=90 && x!=270){
			
			return 1d/TaylorCos(x);
			
		}else{
			
			return Double.NaN;
			
		}
		
	}
	
	public static double TaylorArcsec(double x){
		
		return TaylorArccos(1/x);
		
	}
	
	public static double TaylorCot(double x){
		
		if (x!=0 && x!=180 && x!=360){
			
			return TaylorCos(x)/TaylorSen(x);
			
		}else{
			
			return Double.NaN;
			
		}
		
	}
	
	public static double TaylorArccot(double x){
		
		return TaylorArctan(1/x);
		
	}
	
	//------------------------------------------------------------------------------------
	
	public static double TaylorSenh(double x){
		
		double seno = 0;
		
		for (int n=0; n<=84; n++){

			seno += Potencia(x,2*n+1)/Factorial(2*n+1);
			
		}
		
		return seno;
		
	}
	
	public static double TaylorArcsenh(double x){
		
		double arcosenoh = 0;
		
		for (int n=0; n<=85; n++){

			arcosenoh += Potencia(-1,n) * (Factorial(2*n) * Potencia(x,2*n+1))/(Potencia(4,n)*Potencia(Factorial(n),2)*(2*n+1));
			
		}
		
		return (arcosenoh*180)/Pi();
		
	}
	
	public static double TaylorCosh(double x){
		
		double coseno = 0;
		
		for (int n=0; n<=85; n++){

			coseno += Potencia(x,2*n)/Factorial(2*n);
			
		}
		
		return coseno;
		
	}
	
	public static double TaylorArccosh(double x){
		
		return TaylorArcsenh(Raiz(Potencia(x,2)-1,2));
		
	}
	
	public static double TaylorTanh(double x){
		
		return TaylorSenh(x)/TaylorCosh(x);
		
	}
	
	public static double TaylorArctanh(double x){
		
		double arcotangente = 0;
		
		for (int n=0; n<=100; n++){

			arcotangente += Potencia(x,2*n+1)/(2*n+1);
			
		}
		
		return (arcotangente*180)/Pi();
		
	}
	
	public static double TaylorCsch(double x){
		
		return 1d/TaylorSenh(x);
		
	}
	
	public static double TaylorArccsch(double x){
		
		return TaylorArcsen(1/x);
		
	}
	
	public static double TaylorSech(double x){
		
		if (x!=90 && x!=270){
			
			return 1d/TaylorCosh(x);
			
		}else{
			
			return Double.NaN;
			
		}
		
	}
	
	public static double TaylorArcsech(double x){
		
		return TaylorArccosh(1/x);
		
	}
	
	public static double TaylorCoth(double x){
		
		return TaylorCosh(x)/TaylorSenh(x);
		
	}
	
	public static double TaylorArccoth(double x){
		
		return TaylorArctanh(1/x);
		
	}
	
	public static double Euler(){
		
		return TaylorEuler(1);
		
	}
	
	public static double Pi(){
		
		return TaylorPi(1);
		
	}
	
	public static double Gamma(){
	
		return TaylorEulerMascheroni(1);
		
	}
	
	public static double Aureo(){
	
		return (1+Raiz(5,2))/2;
		
	}
	
	public static double Uno(){
		
		double uno = 0;
		
		for (int n=1; n<=1000; n++){
			
			uno +=  Euler() / (Euler() * Potencia(2,n));
			
		}
		
		return uno;
		
	}
	
/*----------------------------------------------------------------------------------------------------------------*/	
	
	public static double Factorial(float n){
		
		double producto=1;

		if (n>0 && n%1==0){

			for (int i=1; i<=n; i++){

				producto = producto*i;
				
			}
			
		}else if (n%1!=0 && n!=0){
			
			producto = GammaEuler(n);
			
		}else if (n==0){

			producto = 1;
			
		}else{
			
			producto = Double.NaN;
			
		}
		
		return producto;
		
	}
	
	public static double GammaEuler(float z){
		
		double p = 0.99999999999980993;
		double t = z + 7.5;
		
		p += 676.5203681218851 / (z + 1);
		p -= 1259.1392167224028 / (z + 2);
		p += 771.32342877765313 / (z + 3);
		p -= 176.61502916214059 / (z + 4);
		p += 12.507343278686905 / (z + 5);
		p -= 0.13857109526572012 / (z + 6);
		p += 9.9843695780195716e-6 / (z + 7);
		p += 1.5056327351493116e-7 / (z + 8);
		
		return Raiz(2 * Pi(), 2) * Potencia(t, z + 0.5f) * TaylorEuler(-t) * p;
		
	}
	
	public static double Combinacion(float n, float k){
		
		return Factorial(n) / (Factorial(k)*Factorial(n-k));
		
	}
	
	public static double[] Bhaskara(float a, float b, float c){//46ta
		
		double[] bh = new double[2];
		
		bh[0]=(-1*b+Raiz(Potencia(b,2)-4*a*c,2))/(2*a);
		
		bh[1]=(-1*b-Raiz(Potencia(b,2)-4*a*c,2))/(2*a);
		
		return bh;
		
	}
	
	public static double AbsoluteValue(double n){
		
		if (n<0){n*=-1;}
		
		return n;
		
	}
	
	public static double[] Matrizz(double[][] m) {//Recibe una matriz y devuelve el resultado en x,y o la matriz inversa en forma de Matriz
	    
		double[] v = new double[m.length];
		double n=0;
		int z=0;
		
		if (m[0][0]==0){
			
			do{
			
				for (int c=0; c<m[0].length; c++){
					
					n=m[0][c];
					m[0][c]=m[z][c];
					m[z][c]=n;
					
				}
				
				z++;
				
			}while(m[0][0]==0);
			
		}
			
		for (int i=0; i<m.length; i++){
			
			n = m[i][i];
			
			for (int c=0; c<m[i].length; c++){
				
				m[i][c]/=n;
				
			}
			
			for (int f=0; f<m.length; f++){
				
				if (f==i){continue;}
				
				for (int c=0; c<m[f].length; c++){
					
					if (c==0){n=-1*m[f][i];}
					
					m[f][c]=n*m[i][c]+m[f][c];
					
				}
				
			}
			
		}
		
		for (int f=0; f<m.length; f++){
			
			v[f]=Redondear(m[f][m[f].length-1],4);
			
		}
		
		return v;
		
	}	
	
	public static double[][] MatrizzInversa(double[][] m) {//Recibe una matriz y devuelve el resultado en x,y o la matriz inversa en forma de Matriz
	   	
		double[][] v = new double[m.length][m.length];
		double n=0;
		int z=0;
		
		for (int f=0; f<m.length; f++){
			
			for (int c=0; c<m.length; c++){
				
				if (f==c){
					
					m[f][c+m.length]=1;
					
				}else{
					
					m[f][c+m.length]=0;
					
				}
				
			}
			
		}
		
		if (m[0][0]==0){
			
			do{
			
				for (int c=0; c<m[0].length; c++){
					
					n=m[0][c];
					m[0][c]=m[z][c];
					m[z][c]=n;
					
				}
				
				z++;
				
			}while(m[0][0]==0);
			
		}
		
		for (int i=0; i<m.length; i++){
			
			n = m[i][i];
			
			for (int c=0; c<m[i].length; c++){
				
				m[i][c]/=n;
				
			}
				
			for (int f=0; f<m.length; f++){
				
				if (f==i){continue;}
				
				for (int c=0; c<m[f].length; c++){
					
					if (c==0){n=-1*m[f][i];}
					
					m[f][c]=n*m[i][c]+m[f][c];
					
				}
				
			}
			
		}
		
		for (int f=0; f<m.length; f++){
			
			for (int c=0; c<(m[f].length/2); c++){
			
				v[f][c]=Redondear(m[f][c+(m[f].length/2) ],4);
				
			}
			
		}
		
		return v;
		
	}
	
	public static double[][] SumaRestaMatrizz(double[][] s, double[][] d, int Tipo){
		
		double[][] v = new double[s.length][s[0].length];
		int n=0;
		
		
		if (Tipo==1){n=1;}else{n=-1;}
		
		for (int f=0; f<s.length; f++){
			
			for (int c=0; c<s[f].length; c++){
				
				v[f][c] = s[f][c]+(d[f][c]*n);
				
			}
			
		}
		
		return v;
		
	}

	public static double Determine(double[][] d){//Recibe una matriz, la opera y revisa que el determinante sea !=0
		
		double r=0;

		if (d.length>2){
			
			for (int c=0; c<d.length; c++){
				
				r+= Potencia(-1,c) * d[0][c] * Determine(Cofactores(d,0,c));
				
			}
			
		}else{
			
			return (d[0][0]*d[1][1])-(d[1][0]*d[0][1]);
			
		}
		
		return r;
		
	}
	
	public static double[][] Cofactores(double[][] d, int Fskip, int Cskip){
		
		double[][] v = new double[d.length-1][d.length-1];
		int columna=0,fila=0;
			
		for (int f=0; f<d.length; f++){
			
			if (f==Fskip){continue;}
			
			for (int c=0; c<d.length; c++){
				
				if (c==Cskip){continue;}
				
				v[fila][columna]=d[f][c];
				
				columna++;
				
			}
			
			fila++;
			columna=0;
		}
		
		return v;
		
	}
	
	public static int[] Partir(String cadena){
		
		String[] parts= Separar(cadena,'.');
		int[] resultante= new int[2];
		
		if (parts.length==2){
		
			resultante[0]= Integer.parseInt(parts[0]);
	    	resultante[1]= Integer.parseInt(parts[1]);
			
		}else{
			
			resultante[0]= Integer.parseInt(parts[0]);
	    	resultante[1]= 0;
			
		}
		
		return resultante;
		
	}
	
	public static double Promedio(double[] datos){//4ta
		
		double p=0;
		
		for (int i=0; i<datos.length; i++){
			
			p+=datos[i]/datos.length;
			
		}
		
		return p;
		
	}
	
	public static double[] Ordenar(double[] numeros){
		
		double bup=0;
		
		for(int f=0; f<numeros.length; f++) {
		    
    	    for(int c=0; c<numeros.length-1; c++) {
    	        
        		if(numeros[c]<numeros[c+1]) {
        		    
        			bup=numeros[c];
        			numeros[c]=numeros[c+1];
        			numeros[c+1]=bup;
        		}
    	        
    	    }
			
		}
		
		return numeros;
		
	}
	
	public static int[] Fraccion(float real){//48va
		
		int[] fract = new int[2];
		int diez=1,entera=0,signo=1;
		
		if (real<0){signo*=-1;real*=-1;}
		
		do{
			
			if (real*diez%1!=0){diez*=10;}
			
			
		}while(real*diez%1!=0);
		
		int[] parts = Partir((real*diez)+"");
		entera = parts[0];
		
		if (real>0){
		
			for (int i=entera; i>=2; i--){
				
				if (entera%i==0 && diez%i==0){
					
					entera=entera/i;
					diez=diez/i;
					
				}
				
			}
			
		}
		
		fract[0]=entera*signo;
		fract[1]=diez;
		
		return fract;
		
	}
	
	
	public static float ParseFrom(double dou){
		
		String[] parts = Separar(""+dou,'.');
		String a;
		String na="";
		int ex=0;
		int diez=1;
		float n=0;
		
		if (parts.length==2){
		
			a=parts[1];
			
			for (int i=0; i<a.length(); i++){
				
				ex=i;
				if (i==7){break;}
				
				na+=a.charAt(i);
				
			}
			
			if (ex<7){diez*=10;}else{diez=1;}
			
			for (int i=0; i<ex; i++){
				
				diez*=10;
				
			}
			
			n=Float.parseFloat(parts[0])+(Float.parseFloat(na)/diez);
			
			if (parts[0].equals("-0")){n*=-1;}
			
		}else{
			
			n=Float.parseFloat(parts[0]);
			
		}
		
		return n;
		
	}
	
	public static long nPrimo(int indice){//48va
		
		int in=0,co=0;
		long primo=1;
		boolean b=false;
		
		do{
			
			in+=1;
			
			do{
				
				co=0;
				primo+=1;
				
				for (int i=1; i<=primo; i++){
					
					if (primo%i==0){co+=1;}
					
				}
				
				if (co==2){b=true;}else{b=false;}
				
				
			}while(b==false);
			
		}while(in!=indice);
		
		return primo;
		
	}
	
	public static double nFibonacci(int indice){
		
		double[] phi= new double [indice];
		
		for (int i=0; i<indice; i++){
			
			if (i==0 || i==1){
				
				phi[i]=1;
				
			}else{
				
				phi[i]=phi[i-1]+phi[i-2];
				
			}
			
		}
		
		return phi[indice-1];
		
	}
	
	public static double nBernoulli(float indice){
		
		double Bn=0;
		
		if (indice!=0 && indice>0){
			
			//Bn = ((Potencia(-1,indice+1) * 2 * Factorial(2*indice))/Potencia(2*Pi(),2*indice)) * ZetaReimann(2*indice);
			
			for (int n=0; n<=indice; n++){
				
				Bn += Potencia(-1,n) * nWorpitzky(indice,n)/(n+1);
				
			}
			
		}else if (indice==0){Bn=1;}else {Bn = Double.NaN;}
		
		return Bn;
		
	}
	
	public static double nWorpitzky(float n, int k){
		
		double W=0;
		
		for (int v=0; v<=k; v++){
			
			W += Potencia(-1,v+k) * Potencia(v+1,n) * Combinacion(k,v);
			
		}
		
		return W;
		
	}
	
	public static double ZetaReimann(float s){
		
		double zeta=0;
		int iteracion=1000;
		
		if (s%1!=0){iteracion=10;}
		
		if (s>1){
		
			for (int n=1; n<=iteracion; n++){
				
				zeta += 1d/Potencia(n,s);
				
			}
			
		}else{
			
			zeta = -1*(nBernoulli(s+1)/(s+1));
			
		}
		
		return zeta;
		
	}
	
	public static double Redondear(double n, int limite){
		
		if (Double.isNaN(n)==false && Double.isInfinite(n)==false){
			
			BigDecimal b = new BigDecimal(n).setScale(limite, RoundingMode.HALF_UP);
			n = b.doubleValue();
			
		}
		
		return n;
		
	}
	
/*---------------------------------------------------------------------------------------------------*/

	public static String[] Separar(String wd, char indice){
		
		int e=1;
		int p=0;
		
		for (int i=0; i<wd.length(); i++){
			
			if (wd.charAt(i)==indice){
				
				e++;
				
			}
			
		}
		
		String[] partes= new String[e];
		
		for (int f=0; f<partes.length; f++){
			
			partes[f]="";
			
			for (int c=p; c<wd.length(); c++){
				
				p=c+1;
				
				if (wd.charAt(c)==indice){break;}
				
				partes[f]+=wd.charAt(c)+"";
				
			}
			
		}
		
		return partes;
		
	}
	
	public static String DeleteChar(String cadena, int indice){
		
		String nc="";
		
		for (int i=0; i<cadena.length(); i++){
			
			if (i==indice){continue;}
			
			nc+=cadena.charAt(i)+"";
			
		}
		
		return nc;
		
	}
	
	public static String ReplaceChar(String cadena, int indice, String remplazo){
		
		String nc="";
		
		for (int i=0; i<cadena.length(); i++){
			
			if (i==indice){nc+=remplazo;continue;}
			
			nc+=cadena.charAt(i)+"";
			
		}
		
		return nc;
		
	}
	
	public static String TurnAround(String ac){
		
		String nw="";
		
		for (int i=ac.length()-1; i>=0; i--){
			
			nw+=ac.charAt(i)+"";
			
		}
		
		return nw;
		
	}
	
	public static String Romano(int numero){
		
		String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] milecimas = {"","M"};

		return milecimas[numero/1000]+centenas[(numero%1000)/100]+decenas[((numero%1000)%100)/10]+unidades[((numero%1000)%100)%10];
		
	}
	
	public static String IgnoreTilde(String ac){
		
		String[][] cases = {{"a","e","i","o","u"},{"á","é","í","ó","ú"},{"ü"}};
		String nw="";
		boolean b=false;
		
		for (int i=0; i<ac.length(); i++){
			
			for (int f=1; f<cases.length-1; f++){
				
				for (int c=0; c<cases[0].length; c++){
					
					if (cases[f][c].equalsIgnoreCase(ac.charAt(i)+"")==true){
						
						nw+=cases[0][c];
						
						b=true;
						
						break;
						
					}else{b=false;}
					
					if (cases[2][0].equalsIgnoreCase(ac.charAt(i)+"")==true){
						
						nw+=cases[0][4];
						
						b=true;
						
						break;
						
					}else{b=false;}
					
				}
				
				if (b==true){break;}
				
			}
			
			if (b==false){nw+=ac.charAt(i)+"";}
			
		}
		
		return nw;
		
	}
	
	public static boolean Allowed(String ca){//Recibe un String y verifica que sea un número, si no lo es ==false, sino ==true
		
		String bank[] = {"-","0","1","2","3","4","5","6","7","8","9","."};
		boolean b=false;
		int p=0,v=0,m=0;
		
		for (int c=0; c<ca.length(); c++){
			
			for (int f=0; f<bank.length; f++){
			
				if (bank[f].equalsIgnoreCase(ca.charAt(c)+"")==true){
					
					v+=1;
					
				}
				
			}
			
		}
		
		if (v==ca.length()){
		
			for (int c=0; c<ca.length(); c++){
				
				for (int f=0; f<bank.length; f++){
				
					if (bank[bank.length-1].equalsIgnoreCase(ca.charAt(c)+"")==true  && c==ca.length()-1){
						
						b=false;
						break;
						
					}else{
						
						b=true;
						
					}
					
				}
				
				if (b==false){break;}
				
			}
			
			for (int c=0; c<ca.length(); c++){
				
				for (int f=0; f<bank.length; f++){
				
					if (bank[0].equalsIgnoreCase(ca.charAt(c)+"")==true  && c!=0){
						
						b=false;
						break;
						
					}else{
						
						b=true;
						
					}
					
				}
				
				if (b==false){break;}
				
			}
			
			for (int c=0; c<ca.length(); c++){
				
				if (bank[0].equalsIgnoreCase(ca.charAt(c)+"")==true){m+=1;}
				
			}
			
			for (int c=0; c<ca.length(); c++){
				
				if (bank[bank.length-1].equalsIgnoreCase(ca.charAt(c)+"")==true){p+=1;}
				
			}
			
			if (p>1){b=false;}
			if (m>1){b=false;}
			if (ca.length()==1 && bank[bank.length-1].equalsIgnoreCase(ca.charAt(0)+"")==true){b=false;}
			if (ca.length()==1 && bank[0].equalsIgnoreCase(ca.charAt(0)+"")==true){b=false;}
			
		}else{b=false;}
		
		return b;
		
	}
	
}