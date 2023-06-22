import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Configuraciones extends JFrame{
	
	private int m = Mecanics.getMode(true);
	private int l = Mecanics.getLanguage(true);
	private int pantalla;
	
	private JPanel contentPane;
	private JLabel Wallpaper;
	private JLabel AspectosTitulo;
	private JLabel CalculadoraTitulo;
	private JLabel CIgmaen;
	
	private JButton Mode;
	private JButton Language;
	private JButton BackReturn;
	private JComboBox<String> Calculator;
	DefaultComboBoxModel<String> Calculadorita;
	
	private String[] ConfiguracionesTitulo = {"Ajustes","Settings"};
	private String[] AspectosTexto = {"Aspectos Visuales","Visual Aspects"};
	private String[] CalculadoraTexto = {"Calculadora","Calculater"};
	private String[][] SwitchTexto = {{"Calculadora Estandar","Calculadora Científica"},{"Standard Calculator","Scientific Calculator"}};
	private String[][] ModoTexto = {{"Modo Oscuro","Modo Claro"},{"Dark Mode","Light Mode"}};
	private String[] IdiomaTexto = {"English","Español"};
	private String[] AtrasTexto = {"Atrás","Back"};
	
	private String[] ConfiguracionesFondo = {"C:\\BotonesCalculadora\\TelefonoLight.png","C:\\BotonesCalculadora\\TelefonoDark.png"};
	private String[] ConfiguracionesModo = {"C:\\ResourcePack\\Dark.png","C:\\ResourcePack\\Light.png"};
	private String[] ConfiguracionesIdioma = {"C:\\ResourcePack\\idiomaLight.png","C:\\ResourcePack\\idiomaDark.png"};
	private String[] ConfiguracionesAtras = {"C:\\ResourcePack\\BackLight.png","C:\\ResourcePack\\BackDark.png"};
	private String[] ConfiguracionesCImagen = {"C:\\ResourcePack\\CalculadoraSwitchLight.png","C:\\ResourcePack\\CalculadoraSwitchDark.png"};
	
	public Configuraciones(int p){
		
		pantalla = p;
		
		setResizable(false);
		setTitle(ConfiguracionesTitulo[l]);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\BotonesCalculadora\\Icono.png"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,420,830);//x,y,w,h
		setLocationRelativeTo(null);

		contentPane = FondoPantalla();
		Mode = Modo();
		Language = Idioma();
		BackReturn = Atras();
		Calculator = Calculadora();
		
		contentPane.add(Mode);
		contentPane.add(Language);
		contentPane.add(BackReturn);
		contentPane.add(Calculator);
		
		contentPane.setLayout(null);
		contentPane.setComponentZOrder(Mode, 0);
		contentPane.setComponentZOrder(Language, 1);
		contentPane.setComponentZOrder(BackReturn, 2);
		contentPane.setComponentZOrder(Calculator, 3);

		Mode.setVisible(true);
		Language.setVisible(true);
		BackReturn.setVisible(true);
		Calculator.setVisible(true);
		
		Actions();
		
		this.setContentPane(contentPane);
		
		setVisible(true);
		
	}
	
	private JPanel FondoPantalla(){
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		
		Wallpaper = new JLabel();
		
		Wallpaper.setBounds(0, 0, 410, 800);
		ImageIcon fondo = new ImageIcon(new ImageIcon(ConfiguracionesFondo[m]).getImage().getScaledInstance(Wallpaper.getWidth(), Wallpaper.getHeight(), Image.SCALE_SMOOTH));
		Wallpaper.setIcon(fondo);
		
		AspectosTitulo = new JLabel(AspectosTexto[l]);
		
		if (m==0){
			
			AspectosTitulo.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			AspectosTitulo.setForeground(Color.WHITE);
			
		}
		
		AspectosTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		AspectosTitulo.setBackground(new Color(0, 0, 0, 0));
		AspectosTitulo.setOpaque(true);
		AspectosTitulo.setFont(new Font("Clarendon Blk BT", Font.BOLD, 16));
		AspectosTitulo.setBounds(56, 150, 280, 34);
		
		CalculadoraTitulo = new JLabel(CalculadoraTexto[l]);
		
		if (m==0){
			
			CalculadoraTitulo.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			CalculadoraTitulo.setForeground(Color.WHITE);
			
		}
		
		CalculadoraTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		CalculadoraTitulo.setBackground(new Color(0, 0, 0, 0));
		CalculadoraTitulo.setOpaque(true);
		CalculadoraTitulo.setFont(new Font("Clarendon Blk BT", Font.BOLD, 16));
		CalculadoraTitulo.setBounds(56, 250, 280, 34);
		
		CIgmaen = new JLabel("");
		
		CIgmaen.setBounds(110, 300, 30, 30);
		ImageIcon icono = new ImageIcon(new ImageIcon(ConfiguracionesCImagen[m]).getImage().getScaledInstance(CIgmaen.getWidth(), CIgmaen.getHeight(), Image.SCALE_SMOOTH));
		CIgmaen.setIcon(icono);
		CIgmaen.setBackground(new Color(0, 0, 0, 0));
		
		contentPane.add(CIgmaen);
		contentPane.add(CalculadoraTitulo);
		contentPane.add(AspectosTitulo);
		contentPane.add(Wallpaper);
		
		return contentPane;
		
	}
	
	private JButton Modo(){
		
		JButton Mode = new JButton(ModoTexto[l][m]);
		
		if (m==0){
			
			Mode.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Mode.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(ConfiguracionesModo[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		
        Mode.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(ConfiguracionesModo[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		
		Mode.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Mode.setVerticalTextPosition(JButton.CENTER);
        Mode.setHorizontalTextPosition(JButton.RIGHT);
		Mode.setHorizontalAlignment(JButton.LEFT);
        Mode.setBounds(50, 200, 115, 32);
		Mode.setBackground(new Color(0, 0, 0, 0));
		Mode.setFocusable(false);
		
		Mode.setOpaque(true);
        Mode.setContentAreaFilled(false);
		Mode.setBorder(null);
        Mode.setBorderPainted(false);
		
		return Mode;
		
	}
	
	private JButton Idioma(){
		
		JButton Language = new JButton(IdiomaTexto[l]);
		
		if (m==0){
			
			Language.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Language.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(ConfiguracionesIdioma[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        Language.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(ConfiguracionesIdioma[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		
		Language.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Language.setVerticalTextPosition(JButton.CENTER);
        Language.setHorizontalTextPosition(JButton.RIGHT);
		Language.setHorizontalAlignment(JButton.LEFT);
        Language.setBounds(250, 200, 115, 32);
		Language.setBackground(new Color(0, 0, 0, 0));
		Language.setFocusable(false);
		
		Language.setOpaque(true);
        Language.setContentAreaFilled(false);
		Language.setBorder(null);
        Language.setBorderPainted(false);
		
		return Language;
		
	}
	
	private JButton Atras(){
		
		JButton BackReturn = new JButton("");
		
		if (m==0){
			
			BackReturn.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			BackReturn.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(ConfiguracionesAtras[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        BackReturn.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(ConfiguracionesAtras[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(22, 22, Image.SCALE_SMOOTH);
		
		BackReturn.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        BackReturn.setVerticalTextPosition(JButton.CENTER);
        BackReturn.setHorizontalTextPosition(JButton.RIGHT);
		BackReturn.setHorizontalAlignment(JButton.LEFT);
        BackReturn.setBounds(40, 42, 71, 22);
		BackReturn.setBackground(new Color(0, 0, 0, 0));
		BackReturn.setFocusable(false);
		
		BackReturn.setOpaque(true);
        BackReturn.setContentAreaFilled(false);
		BackReturn.setBorder(null);
        BackReturn.setBorderPainted(false);

		return BackReturn;
		
	}
	
	private JComboBox<String> Calculadora(){
		
		String[] Opcion = {SwitchTexto[l][0],SwitchTexto[l][1]};
		
		Calculadorita = new DefaultComboBoxModel<>(Opcion);
		JComboBox<String> Calculator = new JComboBox<>(Calculadorita);
		
		if (m==0){
			
			Calculator.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Calculator.setForeground(Color.WHITE);
			
		}
		
		Calculator.setSelectedIndex(pantalla-1);
        Calculator.setBounds(150, 300, 150, 30);
		Calculator.setBackground(new Color(0, 0, 0, 0));
		Calculator.setFocusable(false);
		Calculator.setBorder(null);

		return Calculator;
		
	}
	
	private void Actions(){
		
		Mode.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (m==0){
					
					Mecanics.setMode(true,1);
					
					m=1;
					
					Mode.setForeground(Color.WHITE);
					Language.setForeground(Color.WHITE);
					BackReturn.setForeground(Color.WHITE);
					AspectosTitulo.setForeground(Color.WHITE);
					CalculadoraTitulo.setForeground(Color.WHITE);
					Calculator.setForeground(Color.WHITE);
					
				}else if (m==1){
					
					Mecanics.setMode(true,0);
					
					m=0;
					
					Mode.setForeground(Color.BLACK);
					Language.setForeground(Color.BLACK);
					BackReturn.setForeground(Color.BLACK);
					AspectosTitulo.setForeground(Color.BLACK);
					CalculadoraTitulo.setForeground(Color.BLACK);
					Calculator.setForeground(Color.BLACK);
					
				}
				
				ImageIcon icono = new ImageIcon(ConfiguracionesModo[m]);
				Image imagen = icono.getImage();
				Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
				
				Mode.setIcon(new ImageIcon(imagenRedimensionada));
				Mode.setText(ModoTexto[l][m]);
				
				icono = new ImageIcon(ConfiguracionesModo[m]);
				imagen = icono.getImage();
				imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
				
				Mode.setPressedIcon(new ImageIcon(imagenRedimensionada));
				
				icono = new ImageIcon(ConfiguracionesIdioma[m]);
				imagen = icono.getImage();
				imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
				
				Language.setIcon(new ImageIcon(imagenRedimensionada));
				Language.setEnabled(true);
				
				icono = new ImageIcon(ConfiguracionesIdioma[m]);
				imagen = icono.getImage();
				imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
				
				Language.setPressedIcon(new ImageIcon(imagenRedimensionada));
				
				icono = new ImageIcon(ConfiguracionesAtras[m]);
				imagen = icono.getImage();
				imagenRedimensionada = imagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				
				BackReturn.setIcon(new ImageIcon(imagenRedimensionada));
				BackReturn.setEnabled(true);
				
				icono = new ImageIcon(ConfiguracionesAtras[m]);
				imagen = icono.getImage();
				imagenRedimensionada = imagen.getScaledInstance(22, 22, Image.SCALE_SMOOTH);
				
				BackReturn.setPressedIcon(new ImageIcon(imagenRedimensionada));
				
				icono = new ImageIcon(new ImageIcon(ConfiguracionesFondo[m]).getImage().getScaledInstance(Wallpaper.getWidth(), Wallpaper.getHeight(), Image.SCALE_SMOOTH));
				Wallpaper.setIcon(icono);
				
				contentPane.add(Wallpaper);
				
				icono = new ImageIcon(new ImageIcon(ConfiguracionesCImagen[m]).getImage().getScaledInstance(CIgmaen.getWidth(), CIgmaen.getHeight(), Image.SCALE_SMOOTH));
				CIgmaen.setIcon(icono);
				
				/*dispose();
				validate();
				setVisible(true);*/
				
				repaint();
				
			}
			
		});
		
		Language.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (l==0){
					
					Mecanics.setLanguage(true,1);
					l=1;
					
				}else if (l==1){
					
					Mecanics.setLanguage(true,0);
					l=0;
					
				}
				
				setTitle(ConfiguracionesTitulo[l]);
				Mode.setText(ModoTexto[l][m]);
				Language.setText(IdiomaTexto[l]);
				BackReturn.setText(AtrasTexto[l]);
				AspectosTitulo.setText(AspectosTexto[l]);
				
				Calculadorita.removeElementAt(0);
				Calculadorita.insertElementAt(SwitchTexto[l][0], 0);
				Calculadorita.removeElementAt(1);
				Calculadorita.insertElementAt(SwitchTexto[l][1], 1);
				
				/*dispose();
				validate();
				setVisible(true);*/
				
				repaint();
				Calculator.setSelectedIndex(pantalla-1);
				
			}
			
		});
		
		BackReturn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (pantalla==1){
				
					CalculadoraEstandar v2=new CalculadoraEstandar("0","");

					v2.setVisible(true);

					v2.setLocationRelativeTo(null);

					dispose();
					
				}else if (pantalla==2){
					
					CalculadoraCientifica v3=new CalculadoraCientifica("0","");

					v3.setVisible(true);

					v3.setLocationRelativeTo(null);

					dispose();
					
				}
				
				repaint();
				
			}
			
		});
		
		Calculator.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
                pantalla = Calculator.getSelectedIndex()+1;
				
				Mecanics.setScreen(true,pantalla);
				
				repaint();
				
			}
			
		});
		
		Mode.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Mode.setSize(125, 42);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Mode.setSize(115, 32);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Language.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Language.setSize(125, 42);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Language.setSize(115, 32);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		BackReturn.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				BackReturn.setText(AtrasTexto[l]);
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				BackReturn.setSize(81, 32);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				BackReturn.setSize(71, 22);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				BackReturn.setText("");
				
				repaint();
				
			}
			
		});
		
		Calculator.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
	}
	
}