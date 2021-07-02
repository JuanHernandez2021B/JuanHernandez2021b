  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import invernadero.planta; <-Clase padre del proyecto anterior (no puedo añadir a este proyecto por tener dos clases Main que no se relacionan)

import javax.swing.*;

public class Second extends JFrame implements ActionListener{
	private JLabel label;
	private JPanel panel;
	private JButton b1,b2,b3;
	//private JOptionPane m;
	
	public Second() {
		setTitle("Interfaz de Manejo de Planta");
		this.label=new JLabel("Seleccione su opción");
		this.panel=new JPanel();
		this.b1=new JButton("Añadir");
		this.b2=new JButton("Modificar");
		this.b3=new JButton("Eliminar");
		
		this.panel.setVisible(true);
		this.panel.add(label);
		this.panel.add(b1);
		this.panel.add(b2);
		this.panel.add(b3);
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b1.setBounds(100, 250, 200, 200);
		this.b2.setBounds(150, 250, 200, 200);
		this.b3.setBounds(200, 250, 200, 200);
		this.panel.setBounds(100, 200, 300, 300);
		setSize(400, 400);
		this.label.setBounds(100, 200, 250, 250);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		this.panel.setLayout(null);
		setContentPane(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			/*if(P[9]==null){ <-Lógica
			 * Añadir(); <- Método de  la clase Planta
			 * }else{
			 * m.showMessageDialog(null, "No se puede añadir más Plantas.", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			 * }*/
		}
		if(e.getSource()==b2) {
			//Modificar();
		}
		if(e.getSource()==b3) {
			/*if(P[0]!=null){
			 * Eliminar();
			 * }else{
			 * m.ShowMessageDialog(null, "No se puede eliminar las Plantas", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
			 * }*/
		}
	}
}