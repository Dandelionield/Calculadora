public class Archivo{
	
	private String Operacion;
	private double Resultado;
	
	public Archivo(String Op, double R){
		
		Operacion=Op;
		Resultado=R;
		
	}

	public String getOperacion(){
		
		return Operacion;
		
	}

	public void setOperacion(String Op){
		
		Operacion = Op;
		
	}

	public double getResultado(){
		
		return Resultado;
		
	}

	public void setResultado(double R){
		
		Resultado = R;
		
	}
	
}