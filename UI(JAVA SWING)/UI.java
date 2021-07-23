import javax.swing.*;
import java.awt.event.*;

public class UI extends JFrame implements ActionListener{
	
	private JLabel label;
	private JButton b1, b2;
	private JPanel panel = new JPanel();
	
	public UI() {
		setTitle("APP Invernadero");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		panel.setVisible(true);
		
		this.label=new JLabel("Bienvenido a la aplicación");
		this.label.setBounds(300, 50, 80, 50);
		this.label.setVisible(true);
		panel.add(label);
		this.b1=new JButton("Manejar Planta del invernadero");
		this.b2=new JButton("Mostrar Lista");
		this.b1.setBounds(250, 150, 80, 25);
		this.b2.setBounds(350, 150, 80, 25);
		this.b1.setVisible(true);
		this.b2.setVisible(true);
		panel.add(b1);
		panel.add(b2);
		add(panel);
		
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new Second();
		}
		if(e.getSource()==b2) {
			new Lista();
		}
	}
}