import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JViewport;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Historial extends JFrame{
	
	private int m = Mecanics.getMode(true);//siempre es 0 o 1
	private int l = Mecanics.getLanguage(true);//siempre es 0 o 1
	private int sizze = 20;
	private int pantalla;
	
	private JPanel contentPane;
	private JLabel Wallpaper;
	
	private JScrollPane Table;
	private DefaultTableModel Tablita;
	private JTable Tablitita;
	private JTextArea TextPanel;
	private JLabel TextResult;
	
	private JButton BackReturn;
	private JButton Erase;
	private JButton Delete;
	private JButton Recover;
	
	private String[] HistorialTitulo = {"Historial","History"};
	private String[] AtrasTexto = {"Atrás","Back"};
	private String[] BorrarTodoTexto = {"Borrar Todo","Delete all"};
	private String[] BorrarTexto = {"Borrar","Delete"};
	private String[] RecuperarTexto = {"Recuperar","Recover"};
	private String[][] ColumnaNombre = {{"Operación","Resultado"},{"Operation","Result"}};
	
	
	private String[] HistorialFondo = {"C:\\BotonesCalculadora\\TelefonoLight.png","C:\\BotonesCalculadora\\TelefonoDark.png"};
	private String[] HistorialAtras = {"C:\\ResourcePack\\BackLight.png","C:\\ResourcePack\\BackDark.png"};
	private String[] HistorialBorrarTodo = {"C:\\BotonesCalculadora\\EraseLight.png","C:\\BotonesCalculadora\\EraseDark.png"};
	private String[] HistorialRecuperar = {"C:\\BotonesCalculadora\\RecuperarLight.png","C:\\BotonesCalculadora\\RecuperarDark.png"};
	
	public Historial(int p){
		
		pantalla = p;
		
		setResizable(false);
		setTitle(HistorialTitulo[l]);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\BotonesCalculadora\\Icono.png"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,420,830);//x,y,w,h
		setLocationRelativeTo(null);

		contentPane = FondoPantalla();
		BackReturn = Atras();
		Table = Tabla();
		Erase = BorrarTodo();
		Delete = Borrar();
		Recover = Recuperar();
		TextPanel = PanelTexto();
		TextResult = ResultadoTexto();
		
		contentPane.add(BackReturn);
		contentPane.add(Erase);
		contentPane.add(Table);
		contentPane.add(Delete);
		contentPane.add(Recover);
		contentPane.add(TextPanel);
		contentPane.add(TextResult);
		
		contentPane.setLayout(null);

		contentPane.setComponentZOrder(BackReturn, 0);
		contentPane.setComponentZOrder(Table, 1);
		contentPane.setComponentZOrder(Erase, 2);
		contentPane.setComponentZOrder(Delete, 3);
		contentPane.setComponentZOrder(Recover, 4);
		contentPane.setComponentZOrder(TextPanel, 5);
		contentPane.setComponentZOrder(TextResult, 6);

		BackReturn.setVisible(true);
		Table.setVisible(true);
		Erase.setVisible(true);
		Delete.setVisible(true);
		Recover.setVisible(true);
		TextPanel.setVisible(true);
		TextResult.setVisible(true);
		
		Actions();
		
		this.setContentPane(contentPane);
		
		setVisible(true);
		
	}
	
	private JPanel FondoPantalla(){
		
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(0, 0, 0, 0));
		
		Wallpaper = new JLabel();
		
		Wallpaper.setBounds(0, 0, 410, 800);
		ImageIcon fondo = new ImageIcon(new ImageIcon(HistorialFondo[m]).getImage().getScaledInstance(Wallpaper.getWidth(), Wallpaper.getHeight(), Image.SCALE_DEFAULT));
		
		Wallpaper.setIcon(fondo);
		contentPane.add(Wallpaper);
		
		return contentPane;
		
	}
	
	private JTextArea PanelTexto(){
		
		JTextArea TextPanel = new JTextArea("");
		
		if (m==0){
			
			TextPanel.setForeground(Color.BLACK);
			TextPanel.setBackground(Color.WHITE);
			
			
		}else if (m==1){
			
			TextPanel.setForeground(Color.WHITE);
			TextPanel.setBackground(Color.BLACK);
			
		}
		
		TextPanel.setAlignmentX(0);
		TextPanel.setAlignmentY(0);
		TextPanel.setOpaque(true);
		TextPanel.setFont(new Font("Clarendon Blk BT", Font.BOLD, sizze));
		TextPanel.setBounds(65, 520, 300, 50);
		TextPanel.setEditable(false);
		TextPanel.setWrapStyleWord(true);
		TextPanel.setLineWrap(true);
		
		return TextPanel;
		
	}
	
	private JLabel ResultadoTexto(){
		
		JLabel TextResult = new JLabel("");
		
		if (m==0){
			
			TextResult.setForeground(Color.BLACK);
			TextResult.setBackground(Color.WHITE);
			
		}else if (m==1){
			
			TextResult.setForeground(Color.WHITE);
			TextResult.setBackground(Color.BLACK);
			
		}
		
		TextResult.setHorizontalAlignment(SwingConstants.LEFT);
		TextResult.setOpaque(true);
		TextResult.setFont(new Font("Clarendon Blk BT", Font.BOLD, 20));
		TextResult.setBounds(65, 567, 300, 30);
		
		return TextResult;
		
	}
	
	private JScrollPane Tabla(){
		
		String[] Column = {ColumnaNombre[l][0],ColumnaNombre[l][1]};
        Object[][] Data = new Object[Mecanics.Archive.size()][2];
		
		if (Mecanics.Archive.size()!=0){
		
			for (int i=0; i<Mecanics.Archive.size(); i++){
				
				Data[i][0] = Mecanics.Archive.get(i).getOperacion();
				Data[i][1] = Mecanics.Archive.get(i).getResultado();
				
			}
			
		}
		
		Tablita = new DefaultTableModel(Data,Column);
		Tablitita = new JTable(Tablita);
		
		DefaultTableCellRenderer Render = new DefaultTableCellRenderer(){
			
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
				
				Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				
				if (m==0){
			
					component.setForeground(Color.BLACK);
					
				}else if (m==1){
					
					component.setForeground(Color.WHITE);
					
				}
				
				if (row==-1){
					
					if (m==0){
						
						component.setBackground(new Color(0, 0, 0, 0));
						component.setForeground(Color.BLACK);
						
					}else if (m==1){
						
						component.setBackground(new Color(0, 0, 0, 0));
						component.setForeground(Color.WHITE);
						
					}
					
				}
				
				return component;
				
			}
		};
		
		if (m==0){
			
			Render.setBackground(Color.WHITE);
			
		}else if (m==1){
			
			Render.setBackground(Color.BLACK);
			
		}
		
		for (int i = 0; i < Tablitita.getColumnCount(); i++) {
			
			Tablitita.getColumnModel().getColumn(i).setCellRenderer(Render);
			
		}
		
		JViewport viewport = new JViewport();
		viewport.setView(Tablitita);
		
		if (m==0){
			
			viewport.setBackground(Color.WHITE);
			
		}else if (m==1){
			
			viewport.setBackground(Color.BLACK);
			
		}

		JScrollPane Table = new JScrollPane();
		Table.setViewport(viewport);
		Table.setBounds(40, 100, 320, 300);
		
		return Table;
		
	}
	
	private JButton Atras(){
		
		JButton BackReturn = new JButton("");
		
		if (m==0){
			
			BackReturn.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			BackReturn.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(HistorialAtras[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(20, 20, Image.SCALE_SMOOTH);

        BackReturn.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(HistorialAtras[m]);
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
	
	private JButton BorrarTodo(){
		
		JButton Erase = new JButton(BorrarTodoTexto[l]);
		
		if (m==0){
			
			Erase.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Erase.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(HistorialBorrarTodo[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        Erase.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(HistorialBorrarTodo[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		
		Erase.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Erase.setVerticalTextPosition(JButton.CENTER);
        Erase.setHorizontalTextPosition(JButton.RIGHT);
		Erase.setHorizontalAlignment(JButton.LEFT);
        Erase.setBounds(40, 440, 120, 32);
		Erase.setBackground(new Color(0, 0, 0, 0));
		Erase.setFocusable(false);
		
		Erase.setOpaque(true);
        Erase.setContentAreaFilled(false);
		Erase.setBorder(null);
        Erase.setBorderPainted(false);

		return Erase;
		
	}
	
	private JButton Borrar(){
		
		JButton Delete = new JButton(BorrarTexto[l]);
		
		if (m==0){
			
			Delete.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Delete.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(HistorialBorrarTodo[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        Delete.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(HistorialBorrarTodo[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		
		Delete.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Delete.setVerticalTextPosition(JButton.CENTER);
        Delete.setHorizontalTextPosition(JButton.RIGHT);
		Delete.setHorizontalAlignment(JButton.LEFT);
        Delete.setBounds(160, 440, 90, 32);
		Delete.setBackground(new Color(0, 0, 0, 0));
		Delete.setFocusable(false);
		
		Delete.setOpaque(true);
        Delete.setContentAreaFilled(false);
		Delete.setBorder(null);
        Delete.setBorderPainted(false);

		return Delete;
		
	}
	
	private JButton Recuperar(){
		
		JButton Recover = new JButton(RecuperarTexto[l]);
		
		if (m==0){
			
			Recover.setForeground(Color.BLACK);
			
		}else if (m==1){
			
			Recover.setForeground(Color.WHITE);
			
		}
		
        ImageIcon icono = new ImageIcon(HistorialRecuperar[m]);
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);

        Recover.setIcon(new ImageIcon(imagenRedimensionada));
		
		icono = new ImageIcon(HistorialRecuperar[m]);
        imagen = icono.getImage();
        imagenRedimensionada = imagen.getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		
		Recover.setPressedIcon(new ImageIcon(imagenRedimensionada));
		
        Recover.setVerticalTextPosition(JButton.CENTER);
        Recover.setHorizontalTextPosition(JButton.RIGHT);
		Recover.setHorizontalAlignment(JButton.LEFT);
        Recover.setBounds(260, 440, 110, 32);
		Recover.setBackground(new Color(0, 0, 0, 0));
		Recover.setFocusable(false);
		
		Recover.setOpaque(true);
        Recover.setContentAreaFilled(false);
		Recover.setBorder(null);
        Recover.setBorderPainted(false);

		return Recover;
		
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
	
	private void Actions(){
		
		BackReturn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (pantalla==1){
					
					CalculadoraEstandar v1=new CalculadoraEstandar("0","");
					
					v1.setVisible(true);

					v1.setLocationRelativeTo(null);

					dispose();
					
				}else if (pantalla==2){
					
					CalculadoraCientifica v3=new CalculadoraCientifica("0","");

					v3.setVisible(true);

					v3.setLocationRelativeTo(null);

					dispose();
					
				}
				
			}
			
		});
		
		Recover.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int row = Tablitita.getSelectedRow();
				
				if (row<0){row=0;}

				Object[] value = new Object[2];
				
				value[0] = Tablitita.getValueAt(row, 0);
				value[1] = Tablitita.getValueAt(row, 1);
				
				if (pantalla==1){
					
					CalculadoraEstandar v1=new CalculadoraEstandar(value[0].toString(),value[1].toString());
					
					v1.setVisible(true);

					v1.setLocationRelativeTo(null);
					
					CalculadoraEstandar.ans = Double.parseDouble(value[1].toString());

					dispose();
					
				}else if (pantalla==2){
					
					CalculadoraCientifica v3=new CalculadoraCientifica(value[0].toString(),value[1].toString());
					
					v3.setVisible(true);

					v3.setLocationRelativeTo(null);
					
					CalculadoraCientifica.ans = Double.parseDouble(value[1].toString());

					dispose();
					
				}
				
			}
			
		});
		
		Erase.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Tablita.setRowCount(0);
				Mecanics.Archive.clear();
				
				TextPanel.setText(Adaptable(""));
				TextResult.setText("");
				
				Mecanics.setFile(true);
				
			}
			
		});
		
		Delete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int selectedRow = Tablitita.getSelectedRow();
				
				if (selectedRow!=-1){
					
					Tablita.removeRow(selectedRow);
					Mecanics.Archive.remove(selectedRow);
					
					TextPanel.setText(Adaptable(""));
					TextResult.setText("");
					
					Mecanics.setFile(true);
					
				}
				
			}
			
		});
		
		Tablitita.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				
				repaint();
				
			}
			
			public void mouseClicked(MouseEvent e){
				
				if (e.getButton() == MouseEvent.BUTTON1){
				
					int row = Tablitita.getSelectedRow();

					Object[] value = new Object[2];
					
					value[0] = Tablitita.getValueAt(row, 0);
					value[1] = Tablitita.getValueAt(row, 1);
					
					TextPanel.setText(Adaptable(value[0].toString()));
					TextResult.setText("= "+value[1].toString());
					
				}
				
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
		
		Erase.addMouseListener(new MouseAdapter() {
			
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
		
		Delete.addMouseListener(new MouseAdapter() {
			
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
		
		Recover.addMouseListener(new MouseAdapter() {
			
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