import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class CalculadoraEstandar extends JFrame{
	
	private int m = Mecanics.getMode(true);
	private int l = Mecanics.getLanguage(true);
	public static int Contador = -1;
	private int sizze = 20;
	private boolean ed = true;
	public static double ans = 0;
	private String wd="";
	private String op="";
	private String R="";
	
	private JPanel contentPane;
	private JTextArea TextPanel;
	private JTextField TextedPanel;
	private JLabel TextResult;
	private JButton Settings;
	private JButton History;
	private JButton Edit;
	private JButton Zero;
	private JButton One;
	private JButton Two;
	private JButton Three;
	private JButton Four;
	private JButton Five;
	private JButton Six;
	private JButton Seven;
	private JButton Eight;
	private JButton Nine;
	private JButton Addition;
	private JButton Sustraction;
	private JButton Multiplication;
	private JButton Division;
	private JButton Dot;
	private JButton Equals;
	private JButton Clear;
	private JButton LeftParenthesis;
	private JButton RightParenthesis;
	private JButton Delete;
	private JButton Ans;
	
	private String[] CalculadoraTitulo = {"Calculadora Estandar","Standard Calculator"};
	private String[] AjustesTexto = {"Ajustes","Settings"};
	private String[] HistorialTexto = {"Historial","History"};
	
	private String[] CalculadoraFondo = {"C:\\BotonesCalculadora\\TelefonoLight.png","C:\\BotonesCalculadora\\TelefonoDark.png"};
	private String[] CalculadoraAjustes = {"C:\\ResourcePack\\SettingsLight.png","C:\\ResourcePack\\SettingsDark.png"};
	private String[] CalculadoraHistorial = {"C:\\BotonesCalculadora\\HistorialLight.png","C:\\BotonesCalculadora\\HistorialDark.png"};
	private String[] CalculadoraEditar = {"C:\\ResourcePack\\EditarLight.png","C:\\ResourcePack\\EditarDark.png"};
	private String[] CalculadoraCero = {"C:\\BotonesCalculadora\\0CeroLight.png","C:\\BotonesCalculadora\\0CeroDark.png"};
	private String[] CalculadoraUno = {"C:\\BotonesCalculadora\\1UnoLight.png","C:\\BotonesCalculadora\\1UnoDark.png"};
	private String[] CalculadoraDos = {"C:\\BotonesCalculadora\\2DosLight.png","C:\\BotonesCalculadora\\2DosDark.png"};
	private String[] CalculadoraTres = {"C:\\BotonesCalculadora\\3TresLight.png","C:\\BotonesCalculadora\\3TresDark.png"};
	private String[] CalculadoraCuatro = {"C:\\BotonesCalculadora\\4CuatroLight.png","C:\\BotonesCalculadora\\4CuatroDark.png"};
	private String[] CalculadoraCinco = {"C:\\BotonesCalculadora\\5CincoLight.png","C:\\BotonesCalculadora\\5CincoDark.png"};
	private String[] CalculadoraSeis = {"C:\\BotonesCalculadora\\6SeisLight.png","C:\\BotonesCalculadora\\6SeisDark.png"};
	private String[] CalculadoraSiete = {"C:\\BotonesCalculadora\\7SieteLight.png","C:\\BotonesCalculadora\\7SieteDark.png"};
	private String[] CalculadoraOcho = {"C:\\BotonesCalculadora\\8OchoLight.png","C:\\BotonesCalculadora\\8OchoDark.png"};
	private String[] CalculadoraNueve = {"C:\\BotonesCalculadora\\9NueveLight.png","C:\\BotonesCalculadora\\9NueveDark.png"};
	private String[] CalculadoraSuma = {"C:\\BotonesCalculadora\\SumaLight.png","C:\\BotonesCalculadora\\SumaDark.png"};
	private String[] CalculadoraResta = {"C:\\BotonesCalculadora\\RestaLight.png","C:\\BotonesCalculadora\\RestaDark.png"};
	private String[] CalculadoraMultiplicacion = {"C:\\BotonesCalculadora\\MultiplicacionLight.png","C:\\BotonesCalculadora\\MultiplicacionDark.png"};
	private String[] CalculadoraDivision = {"C:\\BotonesCalculadora\\DivisionLight.png","C:\\BotonesCalculadora\\DivisionDark.png"};
	private String[] CalculadoraPunto = {"C:\\BotonesCalculadora\\PuntoLight.png","C:\\BotonesCalculadora\\PuntoDark.png"};
	private String[] CalculadoraIgual = {"C:\\BotonesCalculadora\\IgualLight.png","C:\\BotonesCalculadora\\IgualDark.png"};
	private String[] CalculadoraLimpiar = {"C:\\BotonesCalculadora\\ClearLight.png","C:\\BotonesCalculadora\\ClearDark.png"};
	private String[] CalculadoraParentesisIzquierdo = {"C:\\BotonesCalculadora\\ParentesisIzquierdoLight.png","C:\\BotonesCalculadora\\ParentesisIzquierdoDark.png"};
	private String[] CalculadoraParentesisDerecho = {"C:\\BotonesCalculadora\\ParentesisDerechoLight.png","C:\\BotonesCalculadora\\ParentesisDerechoDark.png"};
	private String[] CalculadoraAns = {"C:\\BotonesCalculadora\\AnsLight.png","C:\\BotonesCalculadora\\AnsDark.png"};
	private String[] CalculadoraBorrar = {"C:\\BotonesCalculadora\\BorrarLight.png","C:\\BotonesCalculadora\\BorrarDark.png"};
	//private String[] Calculadora = {"C:\\BotonesCalculadora\\a.png","C:\\BotonesCalculadora\\a.png"};
	
	public CalculadoraEstandar(String p, String r){
		
		op = p;
		R = r;
		
		setResizable(false);
		setTitle(CalculadoraTitulo[l]);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\BotonesCalculadora\\Icono.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,420,830);//x,y,w,h347
		setLocationRelativeTo(null);
		
		contentPane = FondoPantalla();
		TextPanel = PanelTexto();
		TextedPanel = PanelEditado();
		TextResult = ResultadoTexto();
		Settings = Ajustes();
		History = Historial();
		Edit = Editar();
		Zero = Cero();
		One = Uno();
		Two = Dos();
		Three = Tres();
		Four = Cuatro();
		Five = Cinco();
		Six = Seis();
		Seven = Siete();
		Eight = Ocho();
		Nine = Nueve();
		Addition = Suma();
		Sustraction = Resta();
		Multiplication = Multiplicacion();
		Division = Division();
		Dot = Punto();
		Equals = Igual();
		Clear = Limpiar();
		LeftParenthesis = ParentesisIzquierdo();
		RightParenthesis = ParentesisDerecho();
		Delete = Borrar();
		Ans = Ans();
		
		contentPane.add(Zero);
		contentPane.add(One);
		contentPane.add(Two);
		contentPane.add(Three);
		contentPane.add(Four);
		contentPane.add(Five);
		contentPane.add(Six);
		contentPane.add(Seven);
		contentPane.add(Eight);
		contentPane.add(Nine);
		contentPane.add(Addition);
		contentPane.add(Sustraction);
		contentPane.add(Multiplication);
		contentPane.add(Division);
		contentPane.add(Dot);
		contentPane.add(Equals);
		contentPane.add(Clear);
		contentPane.add(LeftParenthesis);
		contentPane.add(RightParenthesis);
		contentPane.add(Ans);
		contentPane.add(Edit);
		contentPane.add(Settings);
		contentPane.add(History);
		contentPane.add(TextPanel);
		contentPane.add(TextedPanel);
		contentPane.add(TextResult);
		contentPane.add(Delete);
		//contentPane.add();
		
        contentPane.setComponentZOrder(Zero, 0);
		contentPane.setComponentZOrder(One, 1);
		contentPane.setComponentZOrder(Two, 2);
		contentPane.setComponentZOrder(Three, 3);
		contentPane.setComponentZOrder(Four, 4);
		contentPane.setComponentZOrder(Five, 5);
		contentPane.setComponentZOrder(Six, 6);
		contentPane.setComponentZOrder(Seven, 7);
		contentPane.setComponentZOrder(Eight, 8);
		contentPane.setComponentZOrder(Nine, 9);
		contentPane.setComponentZOrder(Addition, 10);
		contentPane.setComponentZOrder(Sustraction, 11);
		contentPane.setComponentZOrder(Multiplication, 12);
		contentPane.setComponentZOrder(Division, 13);
		contentPane.setComponentZOrder(Dot, 14);
		contentPane.setComponentZOrder(Equals, 15);
		contentPane.setComponentZOrder(Clear, 16);
		contentPane.setComponentZOrder(LeftParenthesis, 17);
		contentPane.setComponentZOrder(RightParenthesis, 18);
		contentPane.setComponentZOrder(Ans, 19);
		contentPane.setComponentZOrder(Edit, 20);
		contentPane.setComponentZOrder(Settings, 21);
		contentPane.setComponentZOrder(TextPanel, 22);
		contentPane.setComponentZOrder(TextResult, 22);
		contentPane.setComponentZOrder(Delete, 23);
		contentPane.setComponentZOrder(TextedPanel, 24);
		contentPane.setComponentZOrder(History, 25);
		//contentPane.setComponentZOrder(One, 1);
		
        Settings.setVisible(true);
		Edit.setVisible(true);
		Zero.setVisible(true);
		One.setVisible(true);
		Two.setVisible(true);
		Three.setVisible(true);
		Four.setVisible(true);
		Five.setVisible(true);
		Six.setVisible(true);
		Seven.setVisible(true);
		Eight.setVisible(true);
		Nine.setVisible(true);
		Addition.setVisible(true);
		Sustraction.setVisible(true);
		Multiplication.setVisible(true);
		Division.setVisible(true);
		Dot.setVisible(true);
		Equals.setVisible(true);
		Clear.setVisible(true);
		LeftParenthesis.setVisible(true);
		RightParenthesis.setVisible(true);
		Ans.setVisible(true);
		TextPanel.setVisible(true);
		TextResult.setVisible(true);
		Delete.setVisible(true);
		TextedPanel.setVisible(false);
		History.setVisible(true);
		//One.setVisible(true);
		
		Actions();

		this.setContentPane(contentPane);

		setVisible(true);
		
	}
	
	private JPanel FondoPantalla(){
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(0, 0, 0, 0));
		
		JLabel Wallpaper = new JLabel();
		
		Wallpaper.setBounds(0, 0, 410, 800);
		ImageIcon fondo = new ImageIcon(new ImageIcon(CalculadoraFondo[m]).getImage().getScaledInstance(Wallpaper.getWidth(), Wallpaper.getHeight(), Image.SCALE_DEFAULT));
		
		Wallpaper.setIcon(fondo);
		contentPane.add(Wallpaper);
		
		return contentPane;
		
	}
	
	private JTextArea PanelTexto(){
		
		JTextArea TextPanel = new JTextArea(op);
		
		if (m==0){
			
			TextPanel.setForeground(Color.BLACK);
			
			
		}else if (m==1){
			
			TextPanel.setForeground(Color.WHITE);
			
		}
		
		TextPanel.setAlignmentX(0);
		TextPanel.setAlignmentY(0);
		TextPanel.setOpaque(true);
		TextPanel.setFont(new Font("Clarendon Blk BT", Font.BOLD, sizze));
		TextPanel.setBounds(65, 195, 300, 50);
		TextPanel.setBackground(new Color(0, 0, 0, 0));
		TextPanel.setEditable(false);
		TextPanel.setWrapStyleWord(true);
		TextPanel.setLineWrap(true);
		
		return TextPanel;
		
	}
	
	private JTextField PanelEditado(){
		
		JTextField TextedPanel = new JTextField();//(CalculadoraPanelEditado[l]);
		
		if (m==0){
			
			TextedPanel.setForeground(Color.BLACK);
			TextedPanel.setBackground(Color.WHITE);
			
		}else if (m==1){
			
			TextedPanel.setForeground(Color.WHITE);
			TextedPanel.setBackground(Color.BLACK);
			
		}
		
		TextedPanel.setHorizontalAlignment(SwingConstants.LEFT);
		TextedPanel.setOpaque(true);
		TextedPanel.setFont(new Font("Clarendon Blk BT", Font.BOLD, 20));
		TextedPanel.setBounds(65, 195, 300, 30);
		//TextedPanel.setEditable(false);
		TextedPanel.setVisible(false);
		
		return TextedPanel;
		
	}
	
	private JLabel ResultadoTexto(){
		
		JLabel TextResult = new JLabel(R);
		
		if (m==0){
			
			TextResult.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			TextResult.setForeground(Color.WHITE);
			
		}
		
		TextResult.setHorizontalAlignment(SwingConstants.LEFT);
		TextResult.setBackground(new Color(0, 0, 0, 0));
		TextResult.setOpaque(true);
		TextResult.setFont(new Font("Clarendon Blk BT", Font.BOLD, 20));
		TextResult.setBounds(65, 242, 300, 30);
		
		return TextResult;
		
	}
	
	private JButton Ajustes(){
		
		JButton Settings = new JButton("");
		
		if (m==0){
			
			Settings.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Settings.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(CalculadoraAjustes[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        Settings.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(CalculadoraAjustes[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(22, 22, Image.SCALE_SMOOTH);
		
		Settings.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Settings.setVerticalTextPosition(JButton.CENTER);
        Settings.setHorizontalTextPosition(JButton.RIGHT);
		Settings.setHorizontalAlignment(JButton.LEFT);
        Settings.setBounds(40, 42, 71, 22);
		Settings.setBackground(new Color(0, 0, 0, 0));
		Settings.setFocusable(false);
		
		Settings.setOpaque(true);
        Settings.setContentAreaFilled(false);
		Settings.setBorder(null);
        Settings.setBorderPainted(false);
		Settings.setVisible(false);
		
		return Settings;
		
	}
	
	private JButton Historial(){
		
		JButton History = new JButton("");
		
		if (m==0){
			
			History.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			History.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(CalculadoraHistorial[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        History.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(CalculadoraHistorial[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(22, 22, Image.SCALE_SMOOTH);
		
		History.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        History.setVerticalTextPosition(JButton.CENTER);
        History.setHorizontalTextPosition(JButton.RIGHT);
		History.setHorizontalAlignment(JButton.LEFT);
        History.setBounds(40, 345, 71, 22);
		History.setBackground(new Color(0, 0, 0, 0));
		History.setFocusable(false);
		
		History.setOpaque(true);
        History.setContentAreaFilled(false);
		History.setBorder(null);
        History.setBorderPainted(false);
		History.setVisible(false);
		
		return History;
		
	}
	
	private JButton Editar(){
		
		JButton Edit = new JButton("");
		
		Edit.setBounds(35, 200, 20, 20);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraEditar[m]).getImage().getScaledInstance(Edit.getWidth(), Edit.getHeight(), Image.SCALE_SMOOTH));
		Edit.setIcon(icono);

		Edit.setBackground(new Color(0, 0, 0, 0));
		Edit.setFocusable(false);		
		Edit.setOpaque(true);
        Edit.setContentAreaFilled(false);
		Edit.setBorder(null);
        Edit.setBorderPainted(false);
		Edit.setVisible(false);
		
		return Edit;
		
	}
	
	private JButton Cero(){
		
		JButton Zero = new JButton("");
		
		Zero.setBounds(120, 680, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCero[m]).getImage().getScaledInstance(Zero.getWidth(), Zero.getHeight(), Image.SCALE_SMOOTH));
		Zero.setIcon(icono);

		Zero.setBackground(new Color(0, 0, 0, 0));
		Zero.setFocusable(false);		
		Zero.setOpaque(true);
        Zero.setContentAreaFilled(false);
		Zero.setBorder(null);
        Zero.setBorderPainted(false);
		Zero.setVisible(false);
		
		return Zero;
		
	}
	
	private JButton Uno(){
		
		JButton One = new JButton("");
		
		One.setBounds(40, 600, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraUno[m]).getImage().getScaledInstance(One.getWidth(), One.getHeight(), Image.SCALE_SMOOTH));
		One.setIcon(icono);

		One.setBackground(new Color(0, 0, 0, 0));
		One.setFocusable(false);		
		One.setOpaque(true);
        One.setContentAreaFilled(false);
		One.setBorder(null);
        One.setBorderPainted(false);
		One.setVisible(false);
		
		return One;
		
	}
	
	private JButton Dos(){
		
		JButton Two = new JButton("");
		
		Two.setBounds(120, 600, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraDos[m]).getImage().getScaledInstance(Two.getWidth(), Two.getHeight(), Image.SCALE_SMOOTH));
		Two.setIcon(icono);

		Two.setBackground(new Color(0, 0, 0, 0));
		Two.setFocusable(false);		
		Two.setOpaque(true);
        Two.setContentAreaFilled(false);
		Two.setBorder(null);
        Two.setBorderPainted(false);
		Two.setVisible(false);
		
		return Two;
		
	}
	
	private JButton Tres(){
		
		JButton Three = new JButton("");
		
		Three.setBounds(200, 600, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraTres[m]).getImage().getScaledInstance(Three.getWidth(), Three.getHeight(), Image.SCALE_SMOOTH));
		Three.setIcon(icono);

		Three.setBackground(new Color(0, 0, 0, 0));
		Three.setFocusable(false);		
		Three.setOpaque(true);
        Three.setContentAreaFilled(false);
		Three.setBorder(null);
        Three.setBorderPainted(false);
		Three.setVisible(false);
		
		return Three;
		
	}
	
	private JButton Cuatro(){
		
		JButton Four = new JButton("");
		
		Four.setBounds(40, 520, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCuatro[m]).getImage().getScaledInstance(Four.getWidth(), Four.getHeight(), Image.SCALE_SMOOTH));
		Four.setIcon(icono);

		Four.setBackground(new Color(0, 0, 0, 0));
		Four.setFocusable(false);		
		Four.setOpaque(true);
        Four.setContentAreaFilled(false);
		Four.setBorder(null);
        Four.setBorderPainted(false);
		Four.setVisible(false);
		
		return Four;
		
	}
	
	private JButton Cinco(){
		
		JButton Five = new JButton("");
		
		Five.setBounds(120, 520, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCinco[m]).getImage().getScaledInstance(Five.getWidth(), Five.getHeight(), Image.SCALE_SMOOTH));
		Five.setIcon(icono);

		Five.setBackground(new Color(0, 0, 0, 0));
		Five.setFocusable(false);		
		Five.setOpaque(true);
        Five.setContentAreaFilled(false);
		Five.setBorder(null);
        Five.setBorderPainted(false);
		Five.setVisible(false);
		
		return Five;
		
	}
	
	private JButton Seis(){
		
		JButton Six = new JButton("");
		
		Six.setBounds(200, 520, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSeis[m]).getImage().getScaledInstance(Six.getWidth(), Six.getHeight(), Image.SCALE_SMOOTH));
		Six.setIcon(icono);

		Six.setBackground(new Color(0, 0, 0, 0));
		Six.setFocusable(false);		
		Six.setOpaque(true);
        Six.setContentAreaFilled(false);
		Six.setBorder(null);
        Six.setBorderPainted(false);
		Six.setVisible(false);
		
		return Six;
		
	}
	
	private JButton Siete(){
		
		JButton Seven = new JButton("");
		
		Seven.setBounds(40, 440, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSiete[m]).getImage().getScaledInstance(Seven.getWidth(), Seven.getHeight(), Image.SCALE_SMOOTH));
		Seven.setIcon(icono);

		Seven.setBackground(new Color(0, 0, 0, 0));
		Seven.setFocusable(false);		
		Seven.setOpaque(true);
        Seven.setContentAreaFilled(false);
		Seven.setBorder(null);
        Seven.setBorderPainted(false);
		Seven.setVisible(false);
		
		return Seven;
		
	}
	
	private JButton Ocho(){
		
		JButton Eight = new JButton("");
		
		Eight.setBounds(120, 440, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraOcho[m]).getImage().getScaledInstance(Eight.getWidth(), Eight.getHeight(), Image.SCALE_SMOOTH));
		Eight.setIcon(icono);

		Eight.setBackground(new Color(0, 0, 0, 0));
		Eight.setFocusable(false);		
		Eight.setOpaque(true);
        Eight.setContentAreaFilled(false);
		Eight.setBorder(null);
        Eight.setBorderPainted(false);
		Eight.setVisible(false);
		
		return Eight;
		
	}
	
	private JButton Nueve(){
		
		JButton Nine = new JButton("");
		
		Nine.setBounds(200, 440, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraNueve[m]).getImage().getScaledInstance(Nine.getWidth(), Nine.getHeight(), Image.SCALE_SMOOTH));
		Nine.setIcon(icono);

		Nine.setBackground(new Color(0, 0, 0, 0));
		Nine.setFocusable(false);		
		Nine.setOpaque(true);
        Nine.setContentAreaFilled(false);
		Nine.setBorder(null);
        Nine.setBorderPainted(false);
		Nine.setVisible(false);
		
		return Nine;
		
	}
	
	private JButton Suma(){
		
		JButton Addition = new JButton("");
		
		Addition.setBounds(280, 600, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSuma[m]).getImage().getScaledInstance(Addition.getWidth(), Addition.getHeight(), Image.SCALE_SMOOTH));
		Addition.setIcon(icono);

		Addition.setBackground(new Color(0, 0, 0, 0));
		Addition.setFocusable(false);		
		Addition.setOpaque(true);
        Addition.setContentAreaFilled(false);
		Addition.setBorder(null);
        Addition.setBorderPainted(false);
		Addition.setVisible(false);
		
		return Addition;
		
	}
	
	private JButton Resta(){
		
		JButton Sustraction = new JButton("");
		
		Sustraction.setBounds(280, 520, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraResta[m]).getImage().getScaledInstance(Sustraction.getWidth(), Sustraction.getHeight(), Image.SCALE_SMOOTH));
		Sustraction.setIcon(icono);

		Sustraction.setBackground(new Color(0, 0, 0, 0));
		Sustraction.setFocusable(false);		
		Sustraction.setOpaque(true);
        Sustraction.setContentAreaFilled(false);
		Sustraction.setBorder(null);
        Sustraction.setBorderPainted(false);
		Sustraction.setVisible(false);
		
		return Sustraction;
		
	}
	
	private JButton Multiplicacion(){
		
		JButton Multiplication = new JButton("");
		
		Multiplication.setBounds(280, 440, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraMultiplicacion[m]).getImage().getScaledInstance(Multiplication.getWidth(), Multiplication.getHeight(), Image.SCALE_SMOOTH));
		Multiplication.setIcon(icono);

		Multiplication.setBackground(new Color(0, 0, 0, 0));
		Multiplication.setFocusable(false);		
		Multiplication.setOpaque(true);
        Multiplication.setContentAreaFilled(false);
		Multiplication.setBorder(null);
        Multiplication.setBorderPainted(false);
		Multiplication.setVisible(false);
		
		return Multiplication;
		
	}
	
	private JButton Division(){
		
		JButton Division = new JButton("");
		
		Division.setBounds(280, 360, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraDivision[m]).getImage().getScaledInstance(Division.getWidth(), Division.getHeight(), Image.SCALE_SMOOTH));
		Division.setIcon(icono);

		Division.setBackground(new Color(0, 0, 0, 0));
		Division.setFocusable(false);		
		Division.setOpaque(true);
        Division.setContentAreaFilled(false);
		Division.setBorder(null);
        Division.setBorderPainted(false);
		Division.setVisible(false);
		
		return Division;
		
	}
	
	private JButton Punto(){
		
		JButton Dot = new JButton("");
		
		Dot.setBounds(200, 680, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraPunto[m]).getImage().getScaledInstance(Dot.getWidth(), Dot.getHeight(), Image.SCALE_SMOOTH));
		Dot.setIcon(icono);

		Dot.setBackground(new Color(0, 0, 0, 0));
		Dot.setFocusable(false);		
		Dot.setOpaque(true);
        Dot.setContentAreaFilled(false);
		Dot.setBorder(null);
        Dot.setBorderPainted(false);
		Dot.setVisible(false);
		
		return Dot;
		
	}
	
	private JButton Igual(){
		
		JButton Equals = new JButton("");
		
		Equals.setBounds(280, 680, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraIgual[m]).getImage().getScaledInstance(Equals.getWidth(), Equals.getHeight(), Image.SCALE_SMOOTH));
		Equals.setIcon(icono);

		Equals.setBackground(new Color(0, 0, 0, 0));
		Equals.setFocusable(false);		
		Equals.setOpaque(true);
        Equals.setContentAreaFilled(false);
		Equals.setBorder(null);
        Equals.setBorderPainted(false);
		Equals.setVisible(false);
		
		return Equals;
		
	}
	
	private JButton Limpiar(){
		
		JButton Clear = new JButton("");
		
		Clear.setBounds(40, 380, 50, 50);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraLimpiar[m]).getImage().getScaledInstance(Clear.getWidth(), Clear.getHeight(), Image.SCALE_SMOOTH));
		Clear.setIcon(icono);

		Clear.setBackground(new Color(0, 0, 0, 0));
		Clear.setFocusable(false);		
		Clear.setOpaque(true);
        Clear.setContentAreaFilled(false);
		Clear.setBorder(null);
        Clear.setBorderPainted(false);
		Clear.setVisible(false);
		
		return Clear;
		
	}
	
	private JButton ParentesisIzquierdo(){
		
		JButton LeftParenthesis = new JButton("");
		
		LeftParenthesis.setBounds(100, 380, 50, 50);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraParentesisIzquierdo[m]).getImage().getScaledInstance(LeftParenthesis.getWidth(), LeftParenthesis.getHeight(), Image.SCALE_SMOOTH));
		LeftParenthesis.setIcon(icono);

		LeftParenthesis.setBackground(new Color(0, 0, 0, 0));
		LeftParenthesis.setFocusable(false);		
		LeftParenthesis.setOpaque(true);
        LeftParenthesis.setContentAreaFilled(false);
		LeftParenthesis.setBorder(null);
        LeftParenthesis.setBorderPainted(false);
		LeftParenthesis.setVisible(false);
		
		return LeftParenthesis;
		
	}
	
	private JButton ParentesisDerecho(){
		
		JButton RightParenthesis = new JButton("");
		
		RightParenthesis.setBounds(160, 380, 50, 50);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraParentesisDerecho[m]).getImage().getScaledInstance(RightParenthesis.getWidth(), RightParenthesis.getHeight(), Image.SCALE_SMOOTH));
		RightParenthesis.setIcon(icono);

		RightParenthesis.setBackground(new Color(0, 0, 0, 0));
		RightParenthesis.setFocusable(false);		
		RightParenthesis.setOpaque(true);
        RightParenthesis.setContentAreaFilled(false);
		RightParenthesis.setBorder(null);
        RightParenthesis.setBorderPainted(false);
		RightParenthesis.setVisible(false);
		
		return RightParenthesis;
		
	}
	
	private JButton Borrar(){
		
		JButton Delete = new JButton("");
		
		Delete.setBounds(220, 380, 50, 50);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraBorrar[m]).getImage().getScaledInstance(Delete.getWidth(), Delete.getHeight(), Image.SCALE_SMOOTH));
		Delete.setIcon(icono);

		Delete.setBackground(new Color(0, 0, 0, 0));
		Delete.setFocusable(false);		
		Delete.setOpaque(true);
        Delete.setContentAreaFilled(false);
		Delete.setBorder(null);
        Delete.setBorderPainted(false);
		Delete.setVisible(false);
		
		return Delete;
		
	}
	
	private JButton Ans(){
		
		JButton Ans = new JButton("");
		
		Ans.setBounds(40, 680, 70, 70);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraAns[m]).getImage().getScaledInstance(Ans.getWidth(), Ans.getHeight(), Image.SCALE_SMOOTH));
		Ans.setIcon(icono);

		Ans.setBackground(new Color(0, 0, 0, 0));
		Ans.setFocusable(false);		
		Ans.setOpaque(true);
        Ans.setContentAreaFilled(false);
		Ans.setBorder(null);
        Ans.setBorderPainted(false);
		Ans.setVisible(false);
		
		return Ans;
		
	}
	
	private String Adaptable(String wd){
		
		String nw="",ln="";
		int limite = 26;
		
		if (wd.length()<=26){limite=-2;sizze=20;}
		if (sizze<=20 && wd.length()>26){limite=26;}
		if (sizze<=20 && wd.length()>54){limite=54;sizze=15;}
		if (sizze<=15 && wd.length()>74){limite=74;sizze=10;}
		
		if (wd.length()>limite){
			
			TextPanel.setFont(new Font("Clarendon Blk BT", Font.BOLD, sizze));
			
			for (int i=0; i<wd.length(); i++){
				
				if (i%limite+1==0 && i!=0){ln="\n";}else{ln="";}
				
				nw+=ln+wd.charAt(i)+"";
				
			}
			
		}else{
			
			nw=wd;
			
		}
		
		return nw;
		
	}
	
	private int limit = 147;
	
	private void Actions(){
		
		Edit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String bup = "";
				
				if (ed==true){
				
					TextPanel.setVisible(false);
					TextedPanel.setVisible(true);
					TextedPanel.setText(wd);
					ed=false;
					
				}else{
				
					TextPanel.setVisible(true);
					wd = TextedPanel.getText();
					
					if (wd.isEmpty()){bup="0";}
					
					if (wd.length()>=limit){wd = wd.substring(0, limit);}
					
					TextedPanel.setVisible(false);
					TextPanel.setText(Adaptable(wd+bup));
					
					ed=true;
					
				}
				
				repaint();
				
			}
			
		});
		
		Equals.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if (ed==true && wd.length()<=limit){
					
						ans = Mayth.Redondear(Parser.Calculadora(wd),11);
						TextResult.setText("= "+ans);
						
					}else{
						
						wd = TextedPanel.getText();
						ans = Mayth.Redondear(Parser.Calculadora(wd),11);
						TextResult.setText("= "+ans);
						
					}
					
					for (int i=0; i<Mecanics.Archive.size(); i++){
						
						if (Mecanics.Archive.get(i).getOperacion().equals(wd)==true){Mecanics.Archive.remove(i);break;}
						
					}
					
					Mecanics.Archive.add(new Archivo(wd,ans));
					Mecanics.setFile(true);
					wd="";
					
					
				}catch(Exception a){
					
					TextResult.setText("Error");
					
				}
				
				repaint();
				
			}
			
		});
		
		Clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e){
				
				wd="";
				
				if (ed==true){TextPanel.setText(Adaptable("0"));}else{TextedPanel.setText("");}
				TextResult.setText("");
				
				repaint();
				
			}
			
		});
		
		Delete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (wd!="" && wd.length()!=1 && ed==true){
					
					wd = Mayth.DeleteChar(wd,wd.length()-1);
					TextPanel.setText(Adaptable(wd));
					
				}else if (wd.length()==1 && ed==true){
					
					wd = "";
					TextPanel.setText(Adaptable("0"));
					
				}
				
				repaint();
				
			}
			
		});	
		
		Ans.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<=limit){
				
					String bup="";
					
					if (ans!=0){wd+=""+ans;}else{bup="0";}
					
					TextPanel.setText(Adaptable(wd+bup));
					
				}
				
				repaint();
				
			}
			
		});
		
		Dot.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<=limit){
				
					wd+=".";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Zero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<=limit){
				
					wd+="0";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		One.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="1";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Two.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="2";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Three.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<=limit){
				
					wd+="3";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Four.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="4";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Five.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<=limit){
				
					wd+="5";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Six.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="6";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Seven.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="7";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Eight.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="8";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Nine.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (ed==true && wd.length()<limit){
				
					wd+="9";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Addition.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="+";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Sustraction.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="-";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Multiplication.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="x";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Division.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="/";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		LeftParenthesis.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		RightParenthesis.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+=")";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Settings.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Configuraciones v1=new Configuraciones(1);

				v1.setVisible(true);

				v1.setLocationRelativeTo(null);
				
				repaint();

				dispose();
				
			}
			
		});
		
		History.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Historial v2=new Historial(1);

				v2.setVisible(true);

				v2.setLocationRelativeTo(null);
				
				repaint();

				dispose();
				
			}
			
		});
		
		TextedPanel.addKeyListener(new KeyAdapter(){
			
			public void keyPressed(KeyEvent e){
				
				if (ed==false){
				
					if (e.getKeyCode() == KeyEvent.VK_ENTER){
						
						try {
						
							wd = TextedPanel.getText();
							ans = Mayth.Redondear(Parser.Calculadora(wd),11);
							TextResult.setText("= "+ans);
							
							for (int i=0; i<Mecanics.Archive.size(); i++){
								
								if (Mecanics.Archive.get(i).getOperacion().equals(wd)==true){Mecanics.Archive.remove(i);break;}
								
							}
							
							Mecanics.Archive.add(new Archivo(wd,ans));
							Mecanics.setFile(true);
							wd="";
							
							
						}catch(Exception a){
							
							TextResult.setText("Error");
							
						}
						
						Equals.setSize(60,60);
						
					}
					
				}
				
				repaint();
				
			}
			
			public void keyReleased(KeyEvent e) {
				
				Equals.setSize(70,70);
				
            }
			
		});
		
		TextPanel.addKeyListener(new KeyAdapter(){
            
            public void keyPressed(KeyEvent e){
				
				if (e.isAltDown()==false){
					
					if (ed==true && wd.length()<=limit){
				
						if (e.getKeyCode() == KeyEvent.VK_ENTER){
							
							try {
							
								ans = Mayth.Redondear(Parser.Calculadora(wd),11);
								TextResult.setText("= "+ans);

								for (int i=0; i<Mecanics.Archive.size(); i++){
									
									if (Mecanics.Archive.get(i).getOperacion().equals(wd)==true){Mecanics.Archive.remove(i);break;}
									
								}
								
								Mecanics.Archive.add(new Archivo(wd,ans));
								Mecanics.setFile(true);
								wd="";
								
								
							}catch(Exception a){
								
								TextResult.setText("Error");
								
							}
							
							Equals.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
							
							if (wd!="" && wd.length()!=1){
							
								if (wd.contains("{") || wd.contains("|")){
									
									if (wd.charAt(wd.length()-1)==')'){
										
										if (wd.charAt(wd.length()-2)=='}' || wd.charAt(wd.length()-2)=='|'){
											
											if (wd.charAt(wd.length()-2)=='}'){
												
												do{
													
													wd = Mayth.DeleteChar(wd,wd.length()-1);
													
												}while(wd.charAt(wd.length()-1)!=',');
												
												wd = Mayth.DeleteChar(wd,wd.length()-1);
												
												for (int i=wd.length()-1; i>=0; i--){
													
													if (wd.charAt(i)=='{'){
														
														wd = Mayth.DeleteChar(wd,i);i--;
														
														if (wd.charAt(i)=='('){wd = Mayth.DeleteChar(wd,i);i--;}
														
														if (wd.charAt(i)=='g'){
															
															wd = Mayth.DeleteChar(wd,i);i--;
															wd = Mayth.DeleteChar(wd,i);i--;
															wd = Mayth.DeleteChar(wd,i);i--;
															wd = Mayth.DeleteChar(wd,i);i--;
															
														}
														
														break;
														
													}
													
												}
												
											}else if (wd.charAt(wd.length()-2)=='|'){
												
												wd = Mayth.DeleteChar(wd,wd.length()-1);
												wd = Mayth.DeleteChar(wd,wd.length()-1);
												
												for (int i=wd.length()-1; i>=0; i--){
													
													if (wd.charAt(i)=='|'){
														
														wd = Mayth.DeleteChar(wd,i);i--;
														wd = Mayth.DeleteChar(wd,i);i--;
														break;
														
													}
													
												}
												
											}
											
										}else{
											
											wd = Mayth.DeleteChar(wd,wd.length()-1);
											
										}
										
									}else if (wd.charAt(wd.length()-1)=='('){
										
										do{
											
											wd = Mayth.DeleteChar(wd,wd.length()-1);
											
											if (wd.length()==0){break;}
											
										}while(wd.charAt(wd.length()-1)!='√' && wd.charAt(wd.length()-1)!='^' && wd.charAt(wd.length()-1)!='+' && wd.charAt(wd.length()-1)!='-' && wd.charAt(wd.length()-1)!='x' && wd.charAt(wd.length()-1)!='/' && wd.charAt(wd.length()-1)!='%');
										
									}else{
										
										wd = Mayth.DeleteChar(wd,wd.length()-1);
										
									}
									
								}else if (wd.charAt(wd.length()-1)=='('){
									
									do{
										
										wd = Mayth.DeleteChar(wd,wd.length()-1);
										
										if (wd.length()==0){break;}
										
									}while(wd.charAt(wd.length()-1)!='√' && wd.charAt(wd.length()-1)!='^' && wd.charAt(wd.length()-1)!='+' && wd.charAt(wd.length()-1)!='-' && wd.charAt(wd.length()-1)!='x' && wd.charAt(wd.length()-1)!='/' && wd.charAt(wd.length()-1)!='%');
									
								}else{
								
									wd = Mayth.DeleteChar(wd,wd.length()-1);
									
								}
								
								TextPanel.setText(Adaptable(wd));
								
								if (wd.length()==0){
								
									wd = "";
									TextPanel.setText(Adaptable("0"));
									
								}
								
							}else if (wd.length()==1){
								
								wd = "";
								TextPanel.setText(Adaptable("0"));
								
							}
							
							Delete.setSize(60,60);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD0){
							
							wd+="0";
							TextPanel.setText(Adaptable(wd));
							
							Zero.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD1){
							
							wd+="1";
							TextPanel.setText(Adaptable(wd));
							
							One.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD2){
							
							wd+="2";
							TextPanel.setText(Adaptable(wd));
							
							Two.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD3){
			
							wd+="3";
							TextPanel.setText(Adaptable(wd));
							
							Three.setSize(60,60);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD4){
							
							wd+="4";
							TextPanel.setText(Adaptable(wd));
							
							Four.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD5){
							
							wd+="5";
							TextPanel.setText(Adaptable(wd));
							
							Five.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD6){
							
							wd+="6";
							TextPanel.setText(Adaptable(wd));
							
							Six.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD7){
							
							wd+="7";
							TextPanel.setText(Adaptable(wd));
							
							Seven.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD8){
							
							wd+="8";
							TextPanel.setText(Adaptable(wd));
							
							Eight.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD9){
							
							wd+="9";
							TextPanel.setText(Adaptable(wd));
							
							Nine.setSize(80,80);
							
						}else if (e.getKeyCode() == KeyEvent.VK_X){
							
							wd+="x";
							TextPanel.setText(Adaptable(wd));
							
							Multiplication.setSize(80,80);
							
						}
						
					}
					
				}
				
				repaint();
				
            }
			
			public void keyTyped(KeyEvent e){
				
				if (ed==true && wd.length()<=limit){
					
					if (e.getKeyChar() == '.') {
						
						wd += ".";
						TextPanel.setText(Adaptable(wd));
						
						Dot.setSize(80,80);
						
					}else if (e.getKeyChar() == '+'){
						
						wd += "+";
						TextPanel.setText(Adaptable(wd));
						
						Addition.setSize(80,80);
						
					}else if (e.getKeyChar() == '-'){
						
						wd += "-";
						TextPanel.setText(Adaptable(wd));
						
						Sustraction.setSize(80,80);
						
					}else if (e.getKeyChar() == '/'){
						
						wd += "/";
						TextPanel.setText(Adaptable(wd));
						
						Division.setSize(80,80);
						
					}else if (e.getKeyChar() == '*'){
						
						wd += "x";
						TextPanel.setText(Adaptable(wd));
						
						Multiplication.setSize(80,80);
						
					}else if (e.getKeyChar() == '^'){
	
						wd += "^";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '('){
						
						wd += "(";
						TextPanel.setText(Adaptable(wd));
						
						LeftParenthesis.setSize(60,60);
						
					}else if (e.getKeyChar() == ')'){

						wd += ")";
						TextPanel.setText(Adaptable(wd));
						
						RightParenthesis.setSize(60,60);
						
					}else if (e.getKeyChar() == '!'){

						wd += "!";
						TextPanel.setText(Adaptable(wd));
						
					}
					
				}
				
				repaint();
				
			}
			
			public void keyReleased(KeyEvent e) {
				
                Edit.setSize(20,20);
				Zero.setSize(70,70);
				One.setSize(70,70);
				Two.setSize(70,70);
				Three.setSize(70,70);
				Four.setSize(70,70);
				Five.setSize(70,70);
				Six.setSize(70,70);
				Seven.setSize(70,70);
				Eight.setSize(70,70);
				Nine.setSize(70,70);
				Addition.setSize(70,70);
				Sustraction.setSize(70,70);
				Multiplication.setSize(70,70);
				Division.setSize(70,70);
				Dot.setSize(70,70);
				Equals.setSize(70,70);
				LeftParenthesis.setSize(50,50);
				RightParenthesis.setSize(50,50);
				Delete.setSize(50,50);
				Ans.setSize(70,70);
				
            }
			
        });
		
		Settings.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				Settings.setText(AjustesTexto[l]);
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Settings.setSize(81, 32);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Settings.setSize(71, 22);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				Settings.setText("");
				
				repaint();
				
			}
			
		});
		
		History.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				History.setText(HistorialTexto[l]);
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				History.setSize(81, 32);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				History.setSize(71, 22);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				History.setText("");
				
				repaint();
				
			}
			
		});
		
		Edit.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Edit.setSize(30,30);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Edit.setSize(20,20);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Zero.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Zero.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Zero.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		One.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				One.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				One.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Two.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Two.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Two.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Three.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Three.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Three.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Four.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Four.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Four.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Five.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Five.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Five.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Six.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Six.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Six.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Seven.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Seven.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Seven.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Eight.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Eight.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Eight.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Nine.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Nine.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Nine.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Addition.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Addition.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Addition.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Sustraction.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Sustraction.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Sustraction.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Multiplication.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Multiplication.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Multiplication.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Division.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Division.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Division.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Dot.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Dot.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Dot.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Equals.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Equals.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Equals.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Clear.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Clear.setSize(60,60);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Clear.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		LeftParenthesis.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				LeftParenthesis.setSize(60,60);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				LeftParenthesis.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		RightParenthesis.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				RightParenthesis.setSize(60,60);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				RightParenthesis.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Ans.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Ans.setSize(80,80);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Ans.setSize(70,70);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Delete.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Delete.setSize(60,60);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Delete.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		TextPanel.addMouseListener(new MouseAdapter() {
			
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
		
		TextedPanel.addMouseListener(new MouseAdapter() {
			
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