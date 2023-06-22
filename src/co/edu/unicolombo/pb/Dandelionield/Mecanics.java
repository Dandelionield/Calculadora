import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;

public class Mecanics{
	
	public static ArrayList <Archivo>  Archive=new ArrayList<>();
	
	public static void getFile(boolean b){
		
		String[] parts;
		
		if (b==true){
		
			try(BufferedReader nbr = new BufferedReader(new FileReader("Historialtxt.txt"));){
				
				String nlinea= nbr.readLine();
				
				while(nlinea!=null){
					
					parts = nlinea.split("=");
					
					Mecanics.Archive.add(new Archivo(parts[0],Double.parseDouble(parts[1])));

					nlinea= nbr.readLine();
					
				}
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
	public static void setFile(boolean b){
		
		if (b==true){
		
			try(BufferedWriter nbw = new BufferedWriter(new FileWriter("Historialtxt.txt",false));){ 
				
				nbw.write("");
				
	            for (Archivo p : Mecanics.Archive) {
					
					nbw.write(p.getOperacion()+"="+p.getResultado());
					nbw.newLine();
	                
	            }
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
	public static int getScreen(boolean b){
		
		int linea=0;
		
		if (b==true){
		
			try(BufferedReader nbr = new BufferedReader(new FileReader("Aspectos.txt"));){
				
				String nlinea= nbr.readLine();
				
				while(nlinea!=null){
					
					linea++;
					
					if (linea==3){
						
						linea = Integer.parseInt(nlinea);
						break;
						
					}
					
					nlinea= nbr.readLine();
					
				}
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
		return linea;
		
	}
	
	public static void setScreen(boolean b, int s){
		
		int bup = getMode(true);
		int bup2 = getLanguage(true);
		
		if (b==true){
			
			try(BufferedWriter dbw = new BufferedWriter(new FileWriter("Aspectos.txt",false));){ 
				
				dbw.write("");
				dbw.write(""+bup);
				dbw.newLine();
				dbw.write(""+bup2);
				dbw.newLine();
				dbw.write(""+s);
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
	public static int getLanguage(boolean b){
		
		int linea=0;
		
		if (b==true){
		
			try(BufferedReader nbr = new BufferedReader(new FileReader("Aspectos.txt"));){
				
				String nlinea= nbr.readLine();
				
				while(nlinea!=null){
					
					linea++;
					
					if (linea==2){
						
						linea = Integer.parseInt(nlinea);
						break;
						
					}
					
					nlinea= nbr.readLine();
					
				}
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
		return linea;
		
	}
	
	public static void setLanguage(boolean b, int l){
		
		int bup = getMode(true);
		int bup2 = getScreen(true);
		
		if (b==true){
			
			try(BufferedWriter dbw = new BufferedWriter(new FileWriter("Aspectos.txt",false));){ 
				
				dbw.write("");
				dbw.write(""+bup);
				dbw.newLine();
				dbw.write(""+l);
				dbw.newLine();
				dbw.write(""+bup2);
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
	public static int getMode(boolean b){
		
		int linea=0;
		
		if (b==true){
		
			try(BufferedReader nbr = new BufferedReader(new FileReader("Aspectos.txt"));){
				
				String nlinea= nbr.readLine();
				
				while(nlinea!=null){
					
					linea++;
					
					if (linea==1){
						
						linea = Integer.parseInt(nlinea);
						break;
						
					}
					
					nlinea= nbr.readLine();
					
				}
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
		return linea;
		
	}
	
	public static void setMode(boolean b, int m){
		
		int bup = getLanguage(true);
		int bup2 = getScreen(true);
		
		if (b==true){
			
			try(BufferedWriter dbw = new BufferedWriter(new FileWriter("Aspectos.txt",false));){ 
				
				dbw.write("");
				dbw.write(""+m);
				dbw.newLine();
				dbw.write(""+bup);
				dbw.newLine();
				dbw.write(""+bup2);
				
			}catch(IOException e){
				
				JOptionPane.showMessageDialog(null,"Error: "+e,"Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		
	}
	
}