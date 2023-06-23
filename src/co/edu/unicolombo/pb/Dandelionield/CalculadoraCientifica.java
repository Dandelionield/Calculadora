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

public class CalculadoraCientifica extends JFrame{
	
	private int m = Mecanics.getMode(true);
	private int l = Mecanics.getLanguage(true);
	public static int Contador = -1;
	private int sizze = 20;
	private int Counter = 0;
	private boolean ed = true;
	private boolean nd = true;
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
	private JButton Pi;
	private JButton Euler;
	private JButton Gamma;
	private JButton Aureo;
	private JButton Factorial;
	private JButton ln;
	private JButton Power2;
	private JButton Root2;
	private JButton Absolute;
	private JButton Continue;
	private JButton Logarithm;
	private JButton LogarithmP;
	private JButton Logarithm10;
	private JButton Power;
	private JButton Root;
	private JButton Shift;
	private JButton Alpha;
	private JButton Rest;
	private JButton Sen;
	private JButton Cos;
	private JButton Tan;
	private JButton Csc;
	private JButton Sec;
	private JButton Cot;
	private JButton Arcsen;
	private JButton Arccos;
	private JButton Arctan;
	private JButton Arccsc;
	private JButton Arcsec;
	private JButton Arccot;
	private JButton Switch;
	private JButton Senh;
	private JButton Cosh;
	private JButton Tanh;
	private JButton Csch;
	private JButton Sech;
	private JButton Coth;
	private JButton Arcsenh;
	private JButton Arccosh;
	private JButton Arctanh;
	private JButton Arccsch;
	private JButton Arcsech;
	private JButton Arccoth;
	private JButton Zeta;
	
	private String[] CalculadoraTitulo = {"Calculadora Científica","Scientific Calculator"};
	private String[] AjustesTexto = {"Ajustes","Settings"};
	private String[] HistorialTexto = {"Historial","History"};
	
	private String[] CalculadoraFondo = {"C:\\BotonesCalculadora\\HTelefonoLight.png","C:\\BotonesCalculadora\\HTelefonoDark.png"};
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
	private String[] CalculadoraPi = {"C:\\BotonesCalculadora\\PiLight.png","C:\\BotonesCalculadora\\PiDark.png"};
	private String[] CalculadoraEuler = {"C:\\BotonesCalculadora\\EulerLight.png","C:\\BotonesCalculadora\\EulerDark.png"};
	private String[] CalculadoraGamma = {"C:\\BotonesCalculadora\\GammaLight.png","C:\\BotonesCalculadora\\GammaDark.png"};
	private String[] CalculadoraAureo = {"C:\\BotonesCalculadora\\AureoLight.png","C:\\BotonesCalculadora\\AureoDark.png"};
	private String[] CalculadoraFactorial = {"C:\\BotonesCalculadora\\FactorialLight.png","C:\\BotonesCalculadora\\FactorialDark.png"};
	private String[] CalculadoraLn = {"C:\\BotonesCalculadora\\lnLight.png","C:\\BotonesCalculadora\\lnDark.png"};
	private String[] CalculadoraPotencia2 = {"C:\\BotonesCalculadora\\Potencia2Light.png","C:\\BotonesCalculadora\\Potencia2Dark.png"};
	private String[] CalculadoraRaiz2 = {"C:\\BotonesCalculadora\\RaizCuadradaLight.png","C:\\BotonesCalculadora\\RaizCuadradaDark.png"};
	private String[] CalculadoraAbsoluto = {"C:\\BotonesCalculadora\\ValorAbsolutoLight.png","C:\\BotonesCalculadora\\ValorAbsolutoDark.png"};
	private String[] CalculadoraContinuar = {"C:\\BotonesCalculadora\\ContinuarLight.png","C:\\BotonesCalculadora\\ContinuarDark.png"};
	private String[] CalculadoraLogaritmo = {"C:\\BotonesCalculadora\\LogLight.png","C:\\BotonesCalculadora\\LogDark.png"};
	private String[] CalculadoraLogaritmoPi = {"C:\\BotonesCalculadora\\LogPiLight.png","C:\\BotonesCalculadora\\LogPiDark.png"};
	private String[] CalculadoraLogaritmo10 = {"C:\\BotonesCalculadora\\Log10Light.png","C:\\BotonesCalculadora\\Log10Dark.png"};
	private String[] CalculadoraPotencia = {"C:\\BotonesCalculadora\\PotenciaLight.png","C:\\BotonesCalculadora\\PotenciaDark.png"};
	private String[] CalculadoraRaiz = {"C:\\BotonesCalculadora\\RaizLight.png","C:\\BotonesCalculadora\\RaizDark.png"};
	private String[] CalculadoraShift = {"C:\\BotonesCalculadora\\ShiftLight.png","C:\\BotonesCalculadora\\ShiftDark.png"};
	private String[] CalculadoraAlpha = {"C:\\BotonesCalculadora\\AlphaLight.png","C:\\BotonesCalculadora\\AlphaDark.png"};
	private String[] CalculadoraResiduo = {"C:\\BotonesCalculadora\\ResiduoLight.png","C:\\BotonesCalculadora\\ResiduoDark.png"};
	private String[] CalculadoraSen = {"C:\\BotonesCalculadora\\SenoLight.png","C:\\BotonesCalculadora\\SenoDark.png"};
	private String[] CalculadoraCos = {"C:\\BotonesCalculadora\\CosenoLight.png","C:\\BotonesCalculadora\\CosenoDark.png"};
	private String[] CalculadoraTan = {"C:\\BotonesCalculadora\\TangenteLight.png","C:\\BotonesCalculadora\\TangenteDark.png"};
	private String[] CalculadoraCsc = {"C:\\BotonesCalculadora\\CosecanteLight.png","C:\\BotonesCalculadora\\CosecanteDark.png"};
	private String[] CalculadoraSec = {"C:\\BotonesCalculadora\\SecanteLight.png","C:\\BotonesCalculadora\\SecanteDark.png"};
	private String[] CalculadoraCot = {"C:\\BotonesCalculadora\\CotangenteLight.png","C:\\BotonesCalculadora\\CotangenteDark.png"};
	private String[] CalculadoraArcsen = {"C:\\BotonesCalculadora\\ArcosenoLight.png","C:\\BotonesCalculadora\\ArcosenoDark.png"};
	private String[] CalculadoraArccos = {"C:\\BotonesCalculadora\\ArcocosenoLight.png","C:\\BotonesCalculadora\\ArcocosenoDark.png"};
	private String[] CalculadoraArctan = {"C:\\BotonesCalculadora\\ArcotangenteLight.png","C:\\BotonesCalculadora\\ArcotangenteDark.png"};
	private String[] CalculadoraArccsc = {"C:\\BotonesCalculadora\\ArcocosecanteLight.png","C:\\BotonesCalculadora\\ArcocosecanteDark.png"};
	private String[] CalculadoraArcsec = {"C:\\BotonesCalculadora\\ArcosecanteLight.png","C:\\BotonesCalculadora\\ArcosecanteDark.png"};
	private String[] CalculadoraArccot = {"C:\\BotonesCalculadora\\ArcocotangenteLight.png","C:\\BotonesCalculadora\\ArcocotangenteDark.png"};
	private String[] CalculadoraCambio = {"C:\\BotonesCalculadora\\SwitchLight.png","C:\\BotonesCalculadora\\SwitchDark.png"};
	private String[] CalculadoraSenh = {"C:\\BotonesCalculadora\\SenohLight.png","C:\\BotonesCalculadora\\SenohDark.png"};
	private String[] CalculadoraCosh = {"C:\\BotonesCalculadora\\CosenohLight.png","C:\\BotonesCalculadora\\CosenohDark.png"};
	private String[] CalculadoraTanh = {"C:\\BotonesCalculadora\\TangentehLight.png","C:\\BotonesCalculadora\\TangentehDark.png"};
	private String[] CalculadoraCsch = {"C:\\BotonesCalculadora\\CosecantehLight.png","C:\\BotonesCalculadora\\CosecantehDark.png"};
	private String[] CalculadoraSech = {"C:\\BotonesCalculadora\\SecantehLight.png","C:\\BotonesCalculadora\\SecantehDark.png"};
	private String[] CalculadoraCoth = {"C:\\BotonesCalculadora\\CotangentehLight.png","C:\\BotonesCalculadora\\CotangentehDark.png"};
	private String[] CalculadoraArcsenh = {"C:\\BotonesCalculadora\\ArcosenohLight.png","C:\\BotonesCalculadora\\ArcosenohDark.png"};
	private String[] CalculadoraArccosh = {"C:\\BotonesCalculadora\\ArcocosenohLight.png","C:\\BotonesCalculadora\\ArcocosenohDark.png"};
	private String[] CalculadoraArctanh = {"C:\\BotonesCalculadora\\ArcotangentehLight.png","C:\\BotonesCalculadora\\ArcotangentehDark.png"};
	private String[] CalculadoraArccsch = {"C:\\BotonesCalculadora\\ArcocosecantehLight.png","C:\\BotonesCalculadora\\ArcocosecantehDark.png"};
	private String[] CalculadoraArcsech = {"C:\\BotonesCalculadora\\ArcosecantehLight.png","C:\\BotonesCalculadora\\ArcosecantehDark.png"};
	private String[] CalculadoraArccoth = {"C:\\BotonesCalculadora\\ArcocotangentehLight.png","C:\\BotonesCalculadora\\ArcocotangentehDark.png"};
	private String[] CalculadoraZetaReimann	= {"C:\\BotonesCalculadora\\ZetaReimannLight.png","C:\\BotonesCalculadora\\ZetaReimannDark.png"};
	//private String[] Calculadora = {"C:\\BotonesCalculadora\\a.png","C:\\BotonesCalculadora\\a.png"};
	
	
	public CalculadoraCientifica(String p, String r){
		
		op = p;
		R = r;
		
		setResizable(false);
		setTitle(CalculadoraTitulo[l]);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\BotonesCalculadora\\Icono.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,880,500);//x,y,w,h347
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
		Pi = Pi();
		Euler = Euler();
		Gamma = Gamma();
		Aureo = Aureo();
		Factorial = Factorial();
		ln = ln();
		Power2 = Potencia2();
		Root2 = Raiz2();
		Absolute = Absoluto();
		Continue = Continuar();
		Logarithm = Logaritmo();
		LogarithmP = LogaritmoPi();
		Logarithm10 = Logaritmo10();
		Power = Potencia();
		Root = Raiz();
		Rest = Residuo();
		Shift = Shift();
		Alpha = Alpha();
		Sen = Seno();
		Cos = Coseno();
		Tan = Tangente();
		Csc = Cosecante();
		Sec = Secante();
		Cot = Cotangente();
		Arcsen = Arcoseno();
		Arccos = Arcocoseno();
		Arctan = Arcotangente();
		Arccsc = Arcocosecante();
		Arcsec = Arcosecante();
		Arccot = Arcocotangente();
		Switch = Cambio();
		Senh = Senoh();
		Cosh = Cosenoh();
		Tanh = Tangenteh();
		Csch = Cosecanteh();
		Sech = Secanteh();
		Coth = Cotangenteh();
		Arcsenh = Arcosenoh();
		Arccosh = Arcocosenoh();
		Arctanh = Arcotangenteh();
		Arccsch = Arcocosecanteh();
		Arcsech = Arcosecanteh();
		Arccoth = Arcocotangenteh();
		Zeta = ZetaReimann();
		
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
		contentPane.add(Pi);
		contentPane.add(Euler);
		contentPane.add(Gamma);
		contentPane.add(Aureo);
		contentPane.add(Factorial);
		contentPane.add(ln);
		contentPane.add(Power2);
		contentPane.add(Root2);
		contentPane.add(Absolute);
		contentPane.add(Continue);
		contentPane.add(Logarithm);
		contentPane.add(LogarithmP);
		contentPane.add(Logarithm10);
		contentPane.add(Power);
		contentPane.add(Root);
		contentPane.add(Rest);
		contentPane.add(Shift);
		contentPane.add(Alpha);
		contentPane.add(Sen);
		contentPane.add(Cos);
		contentPane.add(Tan);
		contentPane.add(Csc);
		contentPane.add(Sec);
		contentPane.add(Cot);
		contentPane.add(Arcsen);
		contentPane.add(Arccos);
		contentPane.add(Arctan);
		contentPane.add(Arccsc);
		contentPane.add(Arcsec);
		contentPane.add(Arccot);
		contentPane.add(Switch);
		contentPane.add(Senh);
		contentPane.add(Cosh);
		contentPane.add(Tanh);
		contentPane.add(Csch);
		contentPane.add(Sech);
		contentPane.add(Coth);
		contentPane.add(Arcsenh);
		contentPane.add(Arccosh);
		contentPane.add(Arctanh);
		contentPane.add(Arccsch);
		contentPane.add(Arcsech);
		contentPane.add(Arccoth);
		contentPane.add(Zeta);
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
		contentPane.setComponentZOrder(Pi, 26);
		contentPane.setComponentZOrder(Euler, 27);
		contentPane.setComponentZOrder(Gamma, 28);
		contentPane.setComponentZOrder(Aureo, 29);
		contentPane.setComponentZOrder(Factorial, 30);
		contentPane.setComponentZOrder(ln, 31);
		contentPane.setComponentZOrder(Power2, 32);
		contentPane.setComponentZOrder(Root2, 33);
		contentPane.setComponentZOrder(Absolute, 34);
		contentPane.setComponentZOrder(Continue, 35);
		contentPane.setComponentZOrder(Logarithm, 36);
		contentPane.setComponentZOrder(LogarithmP, 37);
		contentPane.setComponentZOrder(Logarithm10, 38);
		contentPane.setComponentZOrder(Power, 39);
		contentPane.setComponentZOrder(Root, 40);
		contentPane.setComponentZOrder(Rest, 41);
		contentPane.setComponentZOrder(Shift, 42);
		contentPane.setComponentZOrder(Alpha, 43);
		contentPane.setComponentZOrder(Sen, 44);
		contentPane.setComponentZOrder(Cos, 45);
		contentPane.setComponentZOrder(Tan, 46);
		contentPane.setComponentZOrder(Csc, 47);
		contentPane.setComponentZOrder(Sec, 48);
		contentPane.setComponentZOrder(Cot, 49);
		contentPane.setComponentZOrder(Arcsen, 50);
		contentPane.setComponentZOrder(Arccos, 51);
		contentPane.setComponentZOrder(Arctan, 52);
		contentPane.setComponentZOrder(Arccsc, 53);
		contentPane.setComponentZOrder(Arcsec, 54);
		contentPane.setComponentZOrder(Arccot, 55);
		contentPane.setComponentZOrder(Switch, 56);
		contentPane.setComponentZOrder(Senh, 57);
		contentPane.setComponentZOrder(Cosh, 58);
		contentPane.setComponentZOrder(Tanh, 59);
		contentPane.setComponentZOrder(Csch, 60);
		contentPane.setComponentZOrder(Sech, 61);
		contentPane.setComponentZOrder(Coth, 62);
		contentPane.setComponentZOrder(Arcsenh, 63);
		contentPane.setComponentZOrder(Arccosh, 64);
		contentPane.setComponentZOrder(Arctanh, 65);
		contentPane.setComponentZOrder(Arccsch, 66);
		contentPane.setComponentZOrder(Arcsech, 67);
		contentPane.setComponentZOrder(Arccoth, 68);
		contentPane.setComponentZOrder(Zeta, 69);
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
		Pi.setVisible(true);
		Euler.setVisible(true);
		Gamma.setVisible(true);
		Aureo.setVisible(true);
		Factorial.setVisible(true);
		ln.setVisible(true);
		Power2.setVisible(true);
		Root2.setVisible(true);
		Absolute.setVisible(true);
		Continue.setVisible(true);
		Logarithm.setVisible(true);
		Power.setVisible(true);
		Root.setVisible(true);
		LogarithmP.setVisible(true);
		Logarithm10.setVisible(true);
		Rest.setVisible(true);
		Shift.setVisible(true);
		Alpha.setVisible(true);
		Sen.setVisible(nd);
		Cos.setVisible(nd);
		Tan.setVisible(nd);
		Csc.setVisible(nd);
		Sec.setVisible(nd);
		Cot.setVisible(nd);
		Arcsen.setVisible(nd);
		Arccos.setVisible(nd);
		Arctan.setVisible(nd);
		Arccsc.setVisible(nd);
		Arcsec.setVisible(nd);
		Arccot.setVisible(nd);
		Switch.setVisible(true);
		Senh.setVisible(!nd);
		Cosh.setVisible(!nd);
		Tanh.setVisible(!nd);
		Csch.setVisible(!nd);
		Sech.setVisible(!nd);
		Coth.setVisible(!nd);
		Arcsenh.setVisible(!nd);
		Arccosh.setVisible(!nd);
		Arctanh.setVisible(!nd);
		Arccsch.setVisible(!nd);
		Arcsech.setVisible(!nd);
		Arccoth.setVisible(!nd);
		Zeta.setVisible(true);
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
		
		Wallpaper.setBounds(0, 0, 850, 460);
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
		TextPanel.setBounds(80, 100, 600, 47);
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
		TextedPanel.setBounds(80, 100, 600, 30);
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
		TextResult.setBounds(80, 140, 300, 30);
		
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
        Settings.setBounds(42, 47, 71, 22);
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
        History.setHorizontalTextPosition(JButton.LEFT);
		History.setHorizontalAlignment(JButton.RIGHT);
        History.setBounds(665, 150, 71, 22);
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
		
		Edit.setBounds(50, 103, 20, 20);
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
		
		Zero.setBounds(600, 380, 40, 40);
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
		
		One.setBounds(550, 330, 40, 40);
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
		
		Two.setBounds(600, 330, 40, 40);
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
		
		Three.setBounds(650, 330, 40, 40);
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
		
		Four.setBounds(550, 280, 40, 40);
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
		
		Five.setBounds(600, 280, 40, 40);
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
		
		Six.setBounds(650, 280, 40, 40);
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
		
		Seven.setBounds(550, 230, 40, 40);
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
		
		Eight.setBounds(600, 230, 40, 40);
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
		
		Nine.setBounds(650, 230, 40, 40);
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
	
	private JButton Pi(){
		
		JButton Pi = new JButton("");
		
		Pi.setBounds(500, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraPi[m]).getImage().getScaledInstance(Pi.getWidth(), Pi.getHeight(), Image.SCALE_SMOOTH));
		Pi.setIcon(icono);

		Pi.setBackground(new Color(0, 0, 0, 0));
		Pi.setFocusable(false);		
		Pi.setOpaque(true);
        Pi.setContentAreaFilled(false);
		Pi.setBorder(null);
        Pi.setBorderPainted(false);
		Pi.setVisible(false);
		
		return Pi;
		
	}
	
	private JButton Euler(){
		
		JButton Euler = new JButton("");
		
		Euler.setBounds(500, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraEuler[m]).getImage().getScaledInstance(Euler.getWidth(), Euler.getHeight(), Image.SCALE_SMOOTH));
		Euler.setIcon(icono);

		Euler.setBackground(new Color(0, 0, 0, 0));
		Euler.setFocusable(false);		
		Euler.setOpaque(true);
        Euler.setContentAreaFilled(false);
		Euler.setBorder(null);
        Euler.setBorderPainted(false);
		Euler.setVisible(false);
		
		return Euler;
		
	}
	
	private JButton Gamma(){
		
		JButton Gamma = new JButton("");
		
		Gamma.setBounds(500, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraGamma[m]).getImage().getScaledInstance(Gamma.getWidth(), Gamma.getHeight(), Image.SCALE_SMOOTH));
		Gamma.setIcon(icono);

		Gamma.setBackground(new Color(0, 0, 0, 0));
		Gamma.setFocusable(false);		
		Gamma.setOpaque(true);
        Gamma.setContentAreaFilled(false);
		Gamma.setBorder(null);
        Gamma.setBorderPainted(false);
		Gamma.setVisible(false);
		
		return Gamma;
		
	}
	
	private JButton Aureo(){
		
		JButton Aureo = new JButton("");
		
		Aureo.setBounds(500, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraAureo[m]).getImage().getScaledInstance(Aureo.getWidth(), Aureo.getHeight(), Image.SCALE_SMOOTH));
		Aureo.setIcon(icono);

		Aureo.setBackground(new Color(0, 0, 0, 0));
		Aureo.setFocusable(false);		
		Aureo.setOpaque(true);
        Aureo.setContentAreaFilled(false);
		Aureo.setBorder(null);
        Aureo.setBorderPainted(false);
		Aureo.setVisible(false);
		
		return Aureo;
		
	}
	
	private JButton Suma(){
		
		JButton Addition = new JButton("");
		
		Addition.setBounds(700, 330, 40, 40);
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
		
		Sustraction.setBounds(700, 230, 40, 40);
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
		
		Multiplication.setBounds(700, 280, 40, 40);
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
		
		Division.setBounds(700, 180, 40, 40);
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
		
		Dot.setBounds(650, 380, 40, 40);
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
		
		Equals.setBounds(700, 380, 40, 40);
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
		
		Clear.setBounds(500, 180, 40, 40);
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
		
		LeftParenthesis.setBounds(550, 180, 40, 40);
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
		
		RightParenthesis.setBounds(600, 180, 40, 40);
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
		
		Delete.setBounds(650, 180, 40, 40);
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
		
		Ans.setBounds(550, 380, 40, 40);
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
	
	private JButton Continuar(){
		
		JButton Continue = new JButton("");
		
		Continue.setBounds(420, 180, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraContinuar[m]).getImage().getScaledInstance(Continue.getWidth(), Continue.getHeight(), Image.SCALE_SMOOTH));
		Continue.setIcon(icono);

		Continue.setBackground(new Color(0, 0, 0, 0));
		Continue.setFocusable(false);		
		Continue.setOpaque(true);
        Continue.setContentAreaFilled(false);
		Continue.setBorder(null);
        Continue.setBorderPainted(false);
		Continue.setVisible(false);
		Continue.setEnabled(false);
		
		return Continue;
		
	}
	
	private JButton Shift(){
		
		JButton Shift = new JButton("");
		
		Shift.setBounds(370, 180, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraShift[m]).getImage().getScaledInstance(Shift.getWidth(), Shift.getHeight(), Image.SCALE_SMOOTH));
		Shift.setIcon(icono);

		Shift.setBackground(new Color(0, 0, 0, 0));
		Shift.setFocusable(false);		
		Shift.setOpaque(true);
        Shift.setContentAreaFilled(false);
		Shift.setBorder(null);
        Shift.setBorderPainted(false);
		Shift.setVisible(false);
		Shift.setEnabled(false);
		
		return Shift;
		
	}
	
	private JButton Alpha(){
		
		JButton Alpha = new JButton("");
		
		Alpha.setBounds(320, 180, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraAlpha[m]).getImage().getScaledInstance(Alpha.getWidth(), Alpha.getHeight(), Image.SCALE_SMOOTH));
		Alpha.setIcon(icono);

		Alpha.setBackground(new Color(0, 0, 0, 0));
		Alpha.setFocusable(false);		
		Alpha.setOpaque(true);
        Alpha.setContentAreaFilled(false);
		Alpha.setBorder(null);
        Alpha.setBorderPainted(false);
		Alpha.setVisible(false);
		Alpha.setEnabled(false);
		
		return Alpha;
		
	}
	
	private JButton ln(){
		
		JButton ln = new JButton("");
		
		ln.setBounds(420, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraLn[m]).getImage().getScaledInstance(ln.getWidth(), ln.getHeight(), Image.SCALE_SMOOTH));
		ln.setIcon(icono);

		ln.setBackground(new Color(0, 0, 0, 0));
		ln.setFocusable(false);		
		ln.setOpaque(true);
        ln.setContentAreaFilled(false);
		ln.setBorder(null);
        ln.setBorderPainted(false);
		ln.setVisible(false);
		
		return ln;
		
	}
	
	private JButton Logaritmo(){
		
		JButton Logarithm = new JButton("");
		
		Logarithm.setBounds(370, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraLogaritmo[m]).getImage().getScaledInstance(Logarithm.getWidth(), Logarithm.getHeight(), Image.SCALE_SMOOTH));
		Logarithm.setIcon(icono);

		Logarithm.setBackground(new Color(0, 0, 0, 0));
		Logarithm.setFocusable(false);		
		Logarithm.setOpaque(true);
        Logarithm.setContentAreaFilled(false);
		Logarithm.setBorder(null);
        Logarithm.setBorderPainted(false);
		Logarithm.setVisible(false);
		
		return Logarithm;
		
	}
	
	private JButton LogaritmoPi(){
		
		JButton LogarithmPi = new JButton("");
		
		LogarithmPi.setBounds(320, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraLogaritmoPi[m]).getImage().getScaledInstance(LogarithmPi.getWidth(), LogarithmPi.getHeight(), Image.SCALE_SMOOTH));
		LogarithmPi.setIcon(icono);

		LogarithmPi.setBackground(new Color(0, 0, 0, 0));
		LogarithmPi.setFocusable(false);		
		LogarithmPi.setOpaque(true);
        LogarithmPi.setContentAreaFilled(false);
		LogarithmPi.setBorder(null);
        LogarithmPi.setBorderPainted(false);
		LogarithmPi.setVisible(false);
		
		return LogarithmPi;
		
	}
	
	private JButton Logaritmo10(){
		
		JButton Logarithm10 = new JButton("");
		
		Logarithm10.setBounds(320, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraLogaritmo10[m]).getImage().getScaledInstance(Logarithm10.getWidth(), Logarithm10.getHeight(), Image.SCALE_SMOOTH));
		Logarithm10.setIcon(icono);

		Logarithm10.setBackground(new Color(0, 0, 0, 0));
		Logarithm10.setFocusable(false);		
		Logarithm10.setOpaque(true);
        Logarithm10.setContentAreaFilled(false);
		Logarithm10.setBorder(null);
        Logarithm10.setBorderPainted(false);
		Logarithm10.setVisible(false);
		
		return Logarithm10;
		
	}
	
	private JButton Potencia2(){
		
		JButton Power2 = new JButton("");
		
		Power2.setBounds(420, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraPotencia2[m]).getImage().getScaledInstance(Power2.getWidth(), Power2.getHeight(), Image.SCALE_SMOOTH));
		Power2.setIcon(icono);

		Power2.setBackground(new Color(0, 0, 0, 0));
		Power2.setFocusable(false);		
		Power2.setOpaque(true);
        Power2.setContentAreaFilled(false);
		Power2.setBorder(null);
        Power2.setBorderPainted(false);
		Power2.setVisible(false);
		
		return Power2;
		
	}
	
	private JButton Potencia(){
		
		JButton Power = new JButton("");
		
		Power.setBounds(370, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraPotencia[m]).getImage().getScaledInstance(Power.getWidth(), Power.getHeight(), Image.SCALE_SMOOTH));
		Power.setIcon(icono);

		Power.setBackground(new Color(0, 0, 0, 0));
		Power.setFocusable(false);		
		Power.setOpaque(true);
        Power.setContentAreaFilled(false);
		Power.setBorder(null);
        Power.setBorderPainted(false);
		Power.setVisible(false);
		
		return Power;
		
	}
	
	private JButton Raiz2(){
		
		JButton Root2 = new JButton("");
		
		Root2.setBounds(420, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraRaiz2[m]).getImage().getScaledInstance(Root2.getWidth(), Root2.getHeight(), Image.SCALE_SMOOTH));
		Root2.setIcon(icono);

		Root2.setBackground(new Color(0, 0, 0, 0));
		Root2.setFocusable(false);		
		Root2.setOpaque(true);
        Root2.setContentAreaFilled(false);
		Root2.setBorder(null);
        Root2.setBorderPainted(false);
		Root2.setVisible(false);
		
		return Root2;
		
	}
	
	private JButton Raiz(){
		
		JButton Root = new JButton("");
		
		Root.setBounds(370, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraRaiz[m]).getImage().getScaledInstance(Root.getWidth(), Root.getHeight(), Image.SCALE_SMOOTH));
		Root.setIcon(icono);

		Root.setBackground(new Color(0, 0, 0, 0));
		Root.setFocusable(false);		
		Root.setOpaque(true);
        Root.setContentAreaFilled(false);
		Root.setBorder(null);
        Root.setBorderPainted(false);
		Root.setVisible(false);
		
		return Root;
		
	}
	
	private JButton Absoluto(){
		
		JButton Absolute = new JButton("");
		
		Absolute.setBounds(420, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraAbsoluto[m]).getImage().getScaledInstance(Absolute.getWidth(), Absolute.getHeight(), Image.SCALE_SMOOTH));
		Absolute.setIcon(icono);

		Absolute.setBackground(new Color(0, 0, 0, 0));
		Absolute.setFocusable(false);		
		Absolute.setOpaque(true);
        Absolute.setContentAreaFilled(false);
		Absolute.setBorder(null);
        Absolute.setBorderPainted(false);
		Absolute.setVisible(false);
		
		return Absolute;
		
	}
	
	private JButton Factorial(){
		
		JButton Factorial = new JButton("");
		
		Factorial.setBounds(370, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraFactorial[m]).getImage().getScaledInstance(Factorial.getWidth(), Factorial.getHeight(), Image.SCALE_SMOOTH));
		Factorial.setIcon(icono);

		Factorial.setBackground(new Color(0, 0, 0, 0));
		Factorial.setFocusable(false);		
		Factorial.setOpaque(true);
        Factorial.setContentAreaFilled(false);
		Factorial.setBorder(null);
        Factorial.setBorderPainted(false);
		Factorial.setVisible(false);
		
		return Factorial;
		
	}
	
	private JButton Residuo(){
		
		JButton Rest = new JButton("");
		
		Rest.setBounds(320, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraResiduo[m]).getImage().getScaledInstance(Rest.getWidth(), Rest.getHeight(), Image.SCALE_SMOOTH));
		Rest.setIcon(icono);

		Rest.setBackground(new Color(0, 0, 0, 0));
		Rest.setFocusable(false);		
		Rest.setOpaque(true);
        Rest.setContentAreaFilled(false);
		Rest.setBorder(null);
        Rest.setBorderPainted(false);
		Rest.setVisible(false);
		
		return Rest;
		
	}
	
	private JButton Seno(){
		
		JButton Sen = new JButton("");
		
		Sen.setBounds(140, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSen[m]).getImage().getScaledInstance(Sen.getWidth(), Sen.getHeight(), Image.SCALE_SMOOTH));
		Sen.setIcon(icono);

		Sen.setBackground(new Color(0, 0, 0, 0));
		Sen.setFocusable(false);		
		Sen.setOpaque(true);
        Sen.setContentAreaFilled(false);
		Sen.setBorder(null);
        Sen.setBorderPainted(false);
		Sen.setVisible(false);
		
		return Sen;
		
	}
	
	private JButton Cosecante(){
		
		JButton Csc = new JButton("");
		
		Csc.setBounds(140, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCsc[m]).getImage().getScaledInstance(Csc.getWidth(), Csc.getHeight(), Image.SCALE_SMOOTH));
		Csc.setIcon(icono);

		Csc.setBackground(new Color(0, 0, 0, 0));
		Csc.setFocusable(false);		
		Csc.setOpaque(true);
        Csc.setContentAreaFilled(false);
		Csc.setBorder(null);
        Csc.setBorderPainted(false);
		Csc.setVisible(false);
		
		return Csc;
		
	}
	
	private JButton Arcoseno(){
		
		JButton Arcsen = new JButton("");
		
		Arcsen.setBounds(140, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArcsen[m]).getImage().getScaledInstance(Arcsen.getWidth(), Arcsen.getHeight(), Image.SCALE_SMOOTH));
		Arcsen.setIcon(icono);

		Arcsen.setBackground(new Color(0, 0, 0, 0));
		Arcsen.setFocusable(false);		
		Arcsen.setOpaque(true);
        Arcsen.setContentAreaFilled(false);
		Arcsen.setBorder(null);
        Arcsen.setBorderPainted(false);
		Arcsen.setVisible(false);
		
		return Arcsen;
		
	}
	
	private JButton Arcocosecante(){
		
		JButton Arccsc = new JButton("");
		
		Arccsc.setBounds(140, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccsc[m]).getImage().getScaledInstance(Arccsc.getWidth(), Arccsc.getHeight(), Image.SCALE_SMOOTH));
		Arccsc.setIcon(icono);

		Arccsc.setBackground(new Color(0, 0, 0, 0));
		Arccsc.setFocusable(false);		
		Arccsc.setOpaque(true);
        Arccsc.setContentAreaFilled(false);
		Arccsc.setBorder(null);
        Arccsc.setBorderPainted(false);
		Arccsc.setVisible(false);
		
		return Arccsc;
		
	}
	
	private JButton Coseno(){
		
		JButton Cos = new JButton("");
		
		Cos.setBounds(190, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCos[m]).getImage().getScaledInstance(Cos.getWidth(), Cos.getHeight(), Image.SCALE_SMOOTH));
		Cos.setIcon(icono);

		Cos.setBackground(new Color(0, 0, 0, 0));
		Cos.setFocusable(false);		
		Cos.setOpaque(true);
        Cos.setContentAreaFilled(false);
		Cos.setBorder(null);
        Cos.setBorderPainted(false);
		Cos.setVisible(false);
		
		return Cos;
		
	}
	
	private JButton Secante(){
		
		JButton Sec = new JButton("");
		
		Sec.setBounds(190, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSec[m]).getImage().getScaledInstance(Sec.getWidth(), Sec.getHeight(), Image.SCALE_SMOOTH));
		Sec.setIcon(icono);

		Sec.setBackground(new Color(0, 0, 0, 0));
		Sec.setFocusable(false);		
		Sec.setOpaque(true);
        Sec.setContentAreaFilled(false);
		Sec.setBorder(null);
        Sec.setBorderPainted(false);
		Sec.setVisible(false);
		
		return Sec;
		
	}
	
	private JButton Arcocoseno(){
		
		JButton Arccos = new JButton("");
		
		Arccos.setBounds(190, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccos[m]).getImage().getScaledInstance(Arccos.getWidth(), Arccos.getHeight(), Image.SCALE_SMOOTH));
		Arccos.setIcon(icono);

		Arccos.setBackground(new Color(0, 0, 0, 0));
		Arccos.setFocusable(false);		
		Arccos.setOpaque(true);
        Arccos.setContentAreaFilled(false);
		Arccos.setBorder(null);
        Arccos.setBorderPainted(false);
		Arccos.setVisible(false);
		
		return Arccos;
		
	}
	
	private JButton Arcosecante(){
		
		JButton Arcsec = new JButton("");
		
		Arcsec.setBounds(190, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArcsec[m]).getImage().getScaledInstance(Arcsec.getWidth(), Arcsec.getHeight(), Image.SCALE_SMOOTH));
		Arcsec.setIcon(icono);

		Arcsec.setBackground(new Color(0, 0, 0, 0));
		Arcsec.setFocusable(false);		
		Arcsec.setOpaque(true);
        Arcsec.setContentAreaFilled(false);
		Arcsec.setBorder(null);
        Arcsec.setBorderPainted(false);
		Arcsec.setVisible(false);
		
		return Arcsec;
		
	}
	
	private JButton Tangente(){
		
		JButton Tan = new JButton("");
		
		Tan.setBounds(240, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraTan[m]).getImage().getScaledInstance(Tan.getWidth(), Tan.getHeight(), Image.SCALE_SMOOTH));
		Tan.setIcon(icono);

		Tan.setBackground(new Color(0, 0, 0, 0));
		Tan.setFocusable(false);		
		Tan.setOpaque(true);
        Tan.setContentAreaFilled(false);
		Tan.setBorder(null);
        Tan.setBorderPainted(false);
		Tan.setVisible(false);
		
		return Tan;
		
	}
	
	private JButton Cotangente(){
		
		JButton Cot = new JButton("");
		
		Cot.setBounds(240, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCot[m]).getImage().getScaledInstance(Cot.getWidth(), Cot.getHeight(), Image.SCALE_SMOOTH));
		Cot.setIcon(icono);

		Cot.setBackground(new Color(0, 0, 0, 0));
		Cot.setFocusable(false);		
		Cot.setOpaque(true);
        Cot.setContentAreaFilled(false);
		Cot.setBorder(null);
        Cot.setBorderPainted(false);
		Cot.setVisible(false);
		
		return Cot;
		
	}
	
	private JButton Arcotangente(){
		
		JButton Arctan = new JButton("");
		
		Arctan.setBounds(240, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArctan[m]).getImage().getScaledInstance(Arctan.getWidth(), Arctan.getHeight(), Image.SCALE_SMOOTH));
		Arctan.setIcon(icono);

		Arctan.setBackground(new Color(0, 0, 0, 0));
		Arctan.setFocusable(false);		
		Arctan.setOpaque(true);
        Arctan.setContentAreaFilled(false);
		Arctan.setBorder(null);
        Arctan.setBorderPainted(false);
		Arctan.setVisible(false);
		
		return Arctan;
		
	}
	
	private JButton Arcocotangente(){
		
		JButton Arccot = new JButton("");
		
		Arccot.setBounds(240, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccot[m]).getImage().getScaledInstance(Arccot.getWidth(), Arccot.getHeight(), Image.SCALE_SMOOTH));
		Arccot.setIcon(icono);

		Arccot.setBackground(new Color(0, 0, 0, 0));
		Arccot.setFocusable(false);		
		Arccot.setOpaque(true);
        Arccot.setContentAreaFilled(false);
		Arccot.setBorder(null);
        Arccot.setBorderPainted(false);
		Arccot.setVisible(false);
		
		return Arccot;
		
	}
	
	private JButton Cambio(){
		
		JButton Switch = new JButton("");
		
		Switch.setBounds(140, 180, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCambio[m]).getImage().getScaledInstance(Switch.getWidth(), Switch.getHeight(), Image.SCALE_SMOOTH));
		Switch.setIcon(icono);

		Switch.setBackground(new Color(0, 0, 0, 0));
		Switch.setFocusable(false);		
		Switch.setOpaque(true);
        Switch.setContentAreaFilled(false);
		Switch.setBorder(null);
        Switch.setBorderPainted(false);
		Switch.setVisible(false);
		
		return Switch;
		
	}
	
	private JButton Senoh(){
		
		JButton Senh = new JButton("");
		
		Senh.setBounds(140, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSenh[m]).getImage().getScaledInstance(Senh.getWidth(), Senh.getHeight(), Image.SCALE_SMOOTH));
		Senh.setIcon(icono);

		Senh.setBackground(new Color(0, 0, 0, 0));
		Senh.setFocusable(false);		
		Senh.setOpaque(true);
        Senh.setContentAreaFilled(false);
		Senh.setBorder(null);
        Senh.setBorderPainted(false);
		Senh.setVisible(false);
		
		return Senh;
		
	}
	
	private JButton Cosecanteh(){
		
		JButton Csch = new JButton("");
		
		Csch.setBounds(140, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCsch[m]).getImage().getScaledInstance(Csch.getWidth(), Csch.getHeight(), Image.SCALE_SMOOTH));
		Csch.setIcon(icono);

		Csch.setBackground(new Color(0, 0, 0, 0));
		Csch.setFocusable(false);		
		Csch.setOpaque(true);
        Csch.setContentAreaFilled(false);
		Csch.setBorder(null);
        Csch.setBorderPainted(false);
		Csch.setVisible(false);
		
		return Csch;
		
	}
	
	private JButton Arcosenoh(){
		
		JButton Arcsenh = new JButton("");
		
		Arcsenh.setBounds(140, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArcsenh[m]).getImage().getScaledInstance(Arcsenh.getWidth(), Arcsenh.getHeight(), Image.SCALE_SMOOTH));
		Arcsenh.setIcon(icono);

		Arcsenh.setBackground(new Color(0, 0, 0, 0));
		Arcsenh.setFocusable(false);		
		Arcsenh.setOpaque(true);
        Arcsenh.setContentAreaFilled(false);
		Arcsenh.setBorder(null);
        Arcsenh.setBorderPainted(false);
		Arcsenh.setVisible(false);
		
		return Arcsenh;
		
	}
	
	private JButton Arcocosecanteh(){
		
		JButton Arccsch = new JButton("");
		
		Arccsch.setBounds(140, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccsch[m]).getImage().getScaledInstance(Arccsch.getWidth(), Arccsch.getHeight(), Image.SCALE_SMOOTH));
		Arccsch.setIcon(icono);

		Arccsch.setBackground(new Color(0, 0, 0, 0));
		Arccsch.setFocusable(false);		
		Arccsch.setOpaque(true);
        Arccsch.setContentAreaFilled(false);
		Arccsch.setBorder(null);
        Arccsch.setBorderPainted(false);
		Arccsch.setVisible(false);
		
		return Arccsch;
		
	}
	
	private JButton Cosenoh(){
		
		JButton Cosh = new JButton("");
		
		Cosh.setBounds(190, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCosh[m]).getImage().getScaledInstance(Cosh.getWidth(), Cosh.getHeight(), Image.SCALE_SMOOTH));
		Cosh.setIcon(icono);

		Cosh.setBackground(new Color(0, 0, 0, 0));
		Cosh.setFocusable(false);		
		Cosh.setOpaque(true);
        Cosh.setContentAreaFilled(false);
		Cosh.setBorder(null);
        Cosh.setBorderPainted(false);
		Cosh.setVisible(false);
		
		return Cosh;
		
	}
	
	private JButton Secanteh(){
		
		JButton Sech = new JButton("");
		
		Sech.setBounds(190, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraSech[m]).getImage().getScaledInstance(Sech.getWidth(), Sech.getHeight(), Image.SCALE_SMOOTH));
		Sech.setIcon(icono);

		Sech.setBackground(new Color(0, 0, 0, 0));
		Sech.setFocusable(false);		
		Sech.setOpaque(true);
        Sech.setContentAreaFilled(false);
		Sech.setBorder(null);
        Sech.setBorderPainted(false);
		Sech.setVisible(false);
		
		return Sech;
		
	}
	
	private JButton Arcocosenoh(){
		
		JButton Arccosh = new JButton("");
		
		Arccosh.setBounds(190, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccosh[m]).getImage().getScaledInstance(Arccosh.getWidth(), Arccosh.getHeight(), Image.SCALE_SMOOTH));
		Arccosh.setIcon(icono);

		Arccosh.setBackground(new Color(0, 0, 0, 0));
		Arccosh.setFocusable(false);		
		Arccosh.setOpaque(true);
        Arccosh.setContentAreaFilled(false);
		Arccosh.setBorder(null);
        Arccosh.setBorderPainted(false);
		Arccosh.setVisible(false);
		
		return Arccosh;
		
	}
	
	private JButton Arcosecanteh(){
		
		JButton Arcsech = new JButton("");
		
		Arcsech.setBounds(190, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArcsech[m]).getImage().getScaledInstance(Arcsech.getWidth(), Arcsech.getHeight(), Image.SCALE_SMOOTH));
		Arcsech.setIcon(icono);

		Arcsech.setBackground(new Color(0, 0, 0, 0));
		Arcsech.setFocusable(false);		
		Arcsech.setOpaque(true);
        Arcsech.setContentAreaFilled(false);
		Arcsech.setBorder(null);
        Arcsech.setBorderPainted(false);
		Arcsech.setVisible(false);
		
		return Arcsech;
		
	}
	
	private JButton Tangenteh(){
		
		JButton Tanh = new JButton("");
		
		Tanh.setBounds(240, 230, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraTanh[m]).getImage().getScaledInstance(Tanh.getWidth(), Tanh.getHeight(), Image.SCALE_SMOOTH));
		Tanh.setIcon(icono);

		Tanh.setBackground(new Color(0, 0, 0, 0));
		Tanh.setFocusable(false);		
		Tanh.setOpaque(true);
        Tanh.setContentAreaFilled(false);
		Tanh.setBorder(null);
        Tanh.setBorderPainted(false);
		Tanh.setVisible(false);
		
		return Tanh;
		
	}
	
	private JButton Cotangenteh(){
		
		JButton Coth = new JButton("");
		
		Coth.setBounds(240, 280, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraCoth[m]).getImage().getScaledInstance(Coth.getWidth(), Coth.getHeight(), Image.SCALE_SMOOTH));
		Coth.setIcon(icono);

		Coth.setBackground(new Color(0, 0, 0, 0));
		Coth.setFocusable(false);		
		Coth.setOpaque(true);
        Coth.setContentAreaFilled(false);
		Coth.setBorder(null);
        Coth.setBorderPainted(false);
		Coth.setVisible(false);
		
		return Coth;
		
	}
	
	private JButton Arcotangenteh(){
		
		JButton Arctanh = new JButton("");
		
		Arctanh.setBounds(240, 330, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArctanh[m]).getImage().getScaledInstance(Arctanh.getWidth(), Arctanh.getHeight(), Image.SCALE_SMOOTH));
		Arctanh.setIcon(icono);

		Arctanh.setBackground(new Color(0, 0, 0, 0));
		Arctanh.setFocusable(false);		
		Arctanh.setOpaque(true);
        Arctanh.setContentAreaFilled(false);
		Arctanh.setBorder(null);
        Arctanh.setBorderPainted(false);
		Arctanh.setVisible(false);
		
		return Arctanh;
		
	}
	
	private JButton Arcocotangenteh(){
		
		JButton Arccoth = new JButton("");
		
		Arccoth.setBounds(240, 380, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraArccoth[m]).getImage().getScaledInstance(Arccoth.getWidth(), Arccoth.getHeight(), Image.SCALE_SMOOTH));
		Arccoth.setIcon(icono);

		Arccoth.setBackground(new Color(0, 0, 0, 0));
		Arccoth.setFocusable(false);		
		Arccoth.setOpaque(true);
        Arccoth.setContentAreaFilled(false);
		Arccoth.setBorder(null);
        Arccoth.setBorderPainted(false);
		Arccoth.setVisible(false);
		
		return Arccoth;
		
	}
	
	private JButton ZetaReimann(){
		
		JButton Zeta = new JButton("");
		
		Zeta.setBounds(190, 180, 40, 40);
		ImageIcon icono = new ImageIcon(new ImageIcon(CalculadoraZetaReimann[m]).getImage().getScaledInstance(Zeta.getWidth(), Zeta.getHeight(), Image.SCALE_SMOOTH));
		Zeta.setIcon(icono);

		Zeta.setBackground(new Color(0, 0, 0, 0));
		Zeta.setFocusable(false);		
		Zeta.setOpaque(true);
        Zeta.setContentAreaFilled(false);
		Zeta.setBorder(null);
        Zeta.setBorderPainted(false);
		Zeta.setVisible(false);
		
		return Zeta;
		
	}
	
	private String Adaptable(String wd){
		
		String nw="",ln="";
		int limite = 0;
		
		if (wd.length()<=54){limite=-2;sizze=20;}
		if (sizze<=20 && wd.length()>54){limite=54;}
		if (sizze<=20 && wd.length()>108){limite=108;sizze=15;}
		
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
	
	private int limit = 148;
	
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
		
		Pi.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="P";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Euler.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="e";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Gamma.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="G";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Aureo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="A";
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
		
		Rest.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="%";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		ln.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="ln(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Logarithm10.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="log(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		LogarithmP.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="lg(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Power2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="^2";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Power.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="^";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Root2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit && wd!=""){
				
					if (wd.charAt(wd.length()-1)==')'){
						
						Counter++;
						
						for (int i=wd.length()-2; i>=0; i--){
							
							if (wd.charAt(i)=='('){
								
								Counter--;
								
								if (Counter==0){
									
									wd = Mayth.ReplaceChar(wd,i,"2√"+wd.charAt(i));
									wd+= "";
									
								}
								
							}else if (wd.charAt(i)==')'){Counter++;}
							
						}
						
					}else if (wd.charAt(wd.length()-1)=='e' || wd.charAt(wd.length()-1)=='P' || wd.charAt(wd.length()-1)=='G' || wd.charAt(wd.length()-1)=='A'){
						
						wd = Mayth.ReplaceChar(wd,wd.length()-1,"2√"+wd.charAt(wd.length()-1)+"");
						
					}else{
						
						for (int i=wd.length()-1; i>=0; i--){
							
							if (Mayth.Allowed(wd.charAt(i)+"")==false && (wd.charAt(i)+"").equals(".")==false){
								
								wd = Mayth.ReplaceChar(wd,i,wd.charAt(i)+"2√");
								wd+= "";
								break;
								
							}
							
							if (i==0){wd = "2√"+wd+"";}
							
						}
						
					}
					
					Counter = 0;
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Root.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="√";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Absolute.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit && wd!=""){
				
					if (wd.charAt(wd.length()-1)==')'){
						
						Counter++;
						
						for (int i=wd.length()-2; i>=0; i--){
							
							if (wd.charAt(i)=='('){
								
								Counter--;
								
								if (Counter==0){
									
									wd = Mayth.ReplaceChar(wd,i,"(|"+wd.charAt(i));
									wd+= "|)";
									
								}
								
							}else if (wd.charAt(i)==')'){Counter++;}
							
						}
						
					}else if (wd.charAt(wd.length()-1)=='e' || wd.charAt(wd.length()-1)=='P' || wd.charAt(wd.length()-1)=='G' || wd.charAt(wd.length()-1)=='A'){
						
						wd = Mayth.ReplaceChar(wd,wd.length()-1,"(|"+wd.charAt(wd.length()-1)+"|)");
						
					}else{
						
						for (int i=wd.length()-1; i>=0; i--){
							
							if (Mayth.Allowed(wd.charAt(i)+"")==false && (wd.charAt(i)+"").equals(".")==false){
								
								if ((wd.charAt(i)+"").equals("-")==true){
								
									wd = Mayth.ReplaceChar(wd,i,"(|"+wd.charAt(i));
									wd+= "|)";
									
								}else{
									
									wd = Mayth.ReplaceChar(wd,i,wd.charAt(i)+"(|");
									wd+= "|)";
									
								}
								
								
								break;
								
							}
							
							if (i==0){wd = "(|"+wd+"|)";}
							
						}
						
					}
					
					
					Counter = 0;
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Factorial.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="!";
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
		
		Sen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Sen(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Cos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Cos(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Tan.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Tan(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Csc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Csc(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Sec.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Sec(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Cot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Cot(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arcsen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arcsen(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccos(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arctan.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arctan(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccsc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccsc(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arcsec.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arcsec(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccot(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Switch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					nd = !nd;
					
					Sen.setVisible(nd);
					Cos.setVisible(nd);
					Tan.setVisible(nd);
					Csc.setVisible(nd);
					Sec.setVisible(nd);
					Cot.setVisible(nd);
					Arcsen.setVisible(nd);
					Arccos.setVisible(nd);
					Arctan.setVisible(nd);
					Arccsc.setVisible(nd);
					Arcsec.setVisible(nd);
					Arccot.setVisible(nd);
					
					Senh.setVisible(!nd);
					Cosh.setVisible(!nd);
					Tanh.setVisible(!nd);
					Csch.setVisible(!nd);
					Sech.setVisible(!nd);
					Coth.setVisible(!nd);
					Arcsenh.setVisible(!nd);
					Arccosh.setVisible(!nd);
					Arctanh.setVisible(!nd);
					Arccsch.setVisible(!nd);
					Arcsech.setVisible(!nd);
					Arccoth.setVisible(!nd);
					
					
				}
				
				repaint();
				
			}
			
		});
		
		Senh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Senh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Cosh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Cosh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Tanh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Tanh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Csch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Csch(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Sech.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Sech(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Coth.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Coth(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arcsenh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arcsenh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccosh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccosh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arctanh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arctanh(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccsch.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccsch(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arcsech.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arcsech(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Arccoth.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Arccoth(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		Zeta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (ed==true && wd.length()<=limit){
				
					wd+="Z(";
					TextPanel.setText(Adaptable(wd));
					
				}
				
				repaint();
				
			}
			
		});
		
		TextedPanel.addKeyListener(new KeyAdapter(){
			
			public void keyPressed(KeyEvent e){
				
				if (ed==false){
				
					if (e.getKeyCode() == KeyEvent.VK_ENTER){
						
						Equals.setSize(50,50);
						
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
						
					}
					
				}
				
				repaint();
				
			}
			
			public void keyReleased(KeyEvent e) {
				
				Equals.setSize(40,40);
				
            }
			
		});
		
		TextPanel.addKeyListener(new KeyAdapter(){
            
            public void keyPressed(KeyEvent e){
				
				if (e.isAltDown()==false){
					
					if (ed==true && wd.length()<=limit){
				
						if (e.getKeyCode() == KeyEvent.VK_ENTER){
							
							Equals.setSize(50,50);
							
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
							
						}else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
							
							Delete.setSize(50,50);
							
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
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD0){
							
							Zero.setSize(50,50);
							
							wd+="0";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD1){
							
							One.setSize(50,50);
							
							wd+="1";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD2){
							
							Two.setSize(50,50);
							
							wd+="2";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD3){
							
							Three.setSize(50,50);
			
							wd+="3";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD4){
							
							Four.setSize(50,50);
							
							wd+="4";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD5){
							
							Five.setSize(50,50);
							
							wd+="5";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD6){
							
							Six.setSize(50,50);
							
							wd+="6";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD7){
							
							Seven.setSize(50,50);
							
							wd+="7";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD8){
							
							Eight.setSize(50,50);
							
							wd+="8";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_NUMPAD9){
							
							Nine.setSize(50,50);
							
							wd+="9";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_E){
							
							Euler.setSize(50,50);
							
							wd+="e";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_P){
							
							Pi.setSize(50,50);
							
							wd+="P";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_G){
							
							Gamma.setSize(50,50);
							
							wd+="G";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_A){
							
							Aureo.setSize(50,50);
							
							wd+="A";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_X){
							
							Multiplication.setSize(50,50);
							
							wd+="x";
							TextPanel.setText(Adaptable(wd));
							
						}else if (e.getKeyCode() == KeyEvent.VK_Z){
							
							Zeta.setSize(50,50);
							
							wd+="Z(";
							TextPanel.setText(Adaptable(wd));
							
							
						}
						
					}
					
				}
				
				repaint();
				
            }
			
			public void keyTyped(KeyEvent e){
				
				if (ed==true && wd.length()<=limit){
					
					if (e.getKeyChar() == '.'){
						
						Dot.setSize(50,50);
						
						wd += ".";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '+'){
						
						Addition.setSize(50,50);
						
						wd += "+";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '-'){
						
						Sustraction.setSize(50,50);
						
						wd += "-";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '/'){
						
						Division.setSize(50,50);
						
						wd += "/";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '*'){
						
						Multiplication.setSize(50,50);
						
						wd += "x";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '^'){
	
						wd += "^";
						TextPanel.setText(Adaptable(wd));
						
						Power.setSize(50,50);
						
					}else if (e.getKeyChar() == '('){
						
						LeftParenthesis.setSize(50,50);
						
						wd += "(";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == ')'){

						RightParenthesis.setSize(50,50);

						wd += ")";
						TextPanel.setText(Adaptable(wd));
						
					}else if (e.getKeyChar() == '!'){
						
						Factorial.setSize(50,50);

						wd += "!";
						TextPanel.setText(Adaptable(wd));
						
					}
					
				}
				
				repaint();
				
			}
			
			public void keyReleased(KeyEvent e) {
				
                Edit.setSize(20,20);
				Zero.setSize(40,40);
				One.setSize(40,40);
				Two.setSize(40,40);
				Three.setSize(40,40);
				Four.setSize(40,40);
				Five.setSize(40,40);
				Six.setSize(40,40);
				Seven.setSize(40,40);
				Eight.setSize(40,40);
				Nine.setSize(40,40);
				Addition.setSize(40,40);
				Sustraction.setSize(40,40);
				Multiplication.setSize(40,40);
				Division.setSize(40,40);
				Dot.setSize(40,40);
				Equals.setSize(40,40);
				Clear.setSize(40,40);
				LeftParenthesis.setSize(40,40);
				RightParenthesis.setSize(40,40);
				Delete.setSize(40,40);
				Ans.setSize(40,40);
				Pi.setSize(40,40);
				Euler.setSize(40,40);
				Gamma.setSize(40,40);
				Aureo.setSize(40,40);
				Factorial.setSize(40,40);
				ln.setSize(40,40);
				Power2.setSize(40,40);
				Root2.setSize(40,40);
				Absolute.setSize(40,40);
				Continue.setSize(40,40);
				Logarithm.setSize(40,40);
				LogarithmP.setSize(40,40);
				Logarithm10.setSize(40,40);
				Power.setSize(40,40);
				Root.setSize(40,40);
				Rest.setSize(40,40);
				Shift.setSize(40,40);
				Alpha.setSize(40,40);
				Sen.setSize(40,40);
				Cos.setSize(40,40);
				Tan.setSize(40,40);
				Csc.setSize(40,40);
				Sec.setSize(40,40);
				Cot.setSize(40,40);
				Arcsen.setSize(40,40);
				Arccos.setSize(40,40);
				Arctan.setSize(40,40);
				Arccsc.setSize(40,40);
				Arcsec.setSize(40,40);
				Arccot.setSize(40,40);
				Switch.setSize(40,40);
				Senh.setSize(40,40);
				Cosh.setSize(40,40);
				Tanh.setSize(40,40);
				Csch.setSize(40,40);
				Sech.setSize(40,40);
				Coth.setSize(40,40);
				Arcsenh.setSize(40,40);
				Arccosh.setSize(40,40);
				Arctanh.setSize(40,40);
				Arccsch.setSize(40,40);
				Arcsech.setSize(40,40);
				Arccoth.setSize(40,40);
				Zeta.setSize(40,40);
				
            }
			
        });
		
		Settings.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Configuraciones v1=new Configuraciones(2);

				v1.setVisible(true);

				v1.setLocationRelativeTo(null);
				
				repaint();

				dispose();
				
			}
			
		});
		
		History.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Historial v2=new Historial(2);

				v2.setVisible(true);

				v2.setLocationRelativeTo(null);
				
				repaint();

				dispose();
				
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
				
				Zero.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Zero.setSize(40,40);
				
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
				
				One.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				One.setSize(40,40);
				
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
				
				Two.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Two.setSize(40,40);
				
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
				
				Three.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Three.setSize(40,40);
				
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
				
				Four.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Four.setSize(40,40);
				
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
				
				Five.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Five.setSize(40,40);
				
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
				
				Six.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Six.setSize(40,40);
				
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
				
				Seven.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Seven.setSize(40,40);
				
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
				
				Eight.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Eight.setSize(40,40);
				
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
				
				Nine.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Nine.setSize(40,40);
				
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
				
				Addition.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Addition.setSize(40,40);
				
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
				
				Sustraction.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Sustraction.setSize(40,40);
				
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
				
				Multiplication.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Multiplication.setSize(40,40);
				
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
				
				Division.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Division.setSize(40,40);
				
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
				
				Dot.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Dot.setSize(40,40);
				
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
				
				Equals.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Equals.setSize(40,40);
				
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
				
				Clear.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Clear.setSize(40,40);
				
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
				
				LeftParenthesis.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				LeftParenthesis.setSize(40,40);
				
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
				
				RightParenthesis.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				RightParenthesis.setSize(40,40);
				
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
				
				Ans.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Ans.setSize(40,40);
				
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
				
				Delete.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Delete.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Pi.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Pi.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Pi.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Euler.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Euler.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Euler.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Gamma.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Gamma.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Gamma.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Aureo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Aureo.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Aureo.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Factorial.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Factorial.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Factorial.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		ln.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				ln.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				ln.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Power2.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Power2.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Power2.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Root2.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Root2.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Root2.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Absolute.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Absolute.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Absolute.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Continue.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Continue.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Continue.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Logarithm.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Logarithm.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Logarithm.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		LogarithmP.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				LogarithmP.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				LogarithmP.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Logarithm10.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Logarithm10.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Logarithm10.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Power.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Power.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Power.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Root.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Root.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Root.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Shift.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Shift.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Shift.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Alpha.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Alpha.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Alpha.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Rest.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Rest.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Rest.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Sen.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Sen.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Sen.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Cos.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Cos.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Cos.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Tan.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Tan.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Tan.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Csc.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Csc.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Csc.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Sec.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Sec.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Sec.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Cot.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Cot.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Cot.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arcsen.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arcsen.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arcsen.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccos.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccos.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccos.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arctan.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arctan.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arctan.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccsc.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccsc.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccsc.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arcsec.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arcsec.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arcsec.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccot.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccot.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccot.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Switch.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Switch.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Switch.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Senh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Senh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Senh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Cosh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Cosh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Cosh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Tanh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Tanh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Tanh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Csch.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Csch.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Csch.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Sech.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Sech.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Sech.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Coth.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Coth.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Coth.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arcsenh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arcsenh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arcsenh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccosh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccosh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccosh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arctanh.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arctanh.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arctanh.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccsch.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccsch.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccsch.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arcsech.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arcsech.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arcsech.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Arccoth.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Arccoth.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Arccoth.setSize(40,40);
				
				repaint();
				
			}
			
			public void mouseExited(MouseEvent e) {
				
				repaint();
				
			}
			
		});
		
		Zeta.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mousePressed(MouseEvent e){
				
				Zeta.setSize(50,50);
				
				repaint();
				
			}
			
			public void mouseReleased(MouseEvent e) {
				
				Zeta.setSize(40,40);
				
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