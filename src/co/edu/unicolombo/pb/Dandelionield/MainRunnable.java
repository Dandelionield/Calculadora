import java.awt.EventQueue;

public class MainRunnable{
	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					
					Mecanics.getFile(true);
					
					int pantalla = Mecanics.getScreen(true);
					
					if (pantalla==1){

						new CalculadoraEstandar("0","");
						
					}else if (pantalla==2){
						
						new CalculadoraCientifica("0","");
						
					}
					
				}catch (Exception e) {

					e.printStackTrace();
					
				}
				
			}
			
		});
		
	}
	
}