package www.cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ejercicio2 implements ActionListener {

	private JFrame frmEmpresa;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 window = new ejercicio2();
					window.frmEmpresa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpresa = new JFrame();
		frmEmpresa.setTitle("Personas");
		frmEmpresa.setBounds(100, 100, 450, 300);
		frmEmpresa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpresa.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(10, 10, 115, 12);
		frmEmpresa.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Proccesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(342, 6, 84, 20);
		frmEmpresa.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(342, 28, 84, 20);
		frmEmpresa.getContentPane().add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 76, 416, 177);
		frmEmpresa.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("Stanford");
		comboBox.setBounds(75, 6, 70, 20);
		frmEmpresa.getContentPane().add(comboBox);
		
		lblNewLabel_1 = new JLabel("M");
		lblNewLabel_1.setBounds(11, 36, 44, 12);
		frmEmpresa.getContentPane().add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		// Declaración de Variable
		String nomApe;
		int anioNaci;
		double pesoKilog;
		
		// Entrada de Datos
		nomApe = txtNombreApellido.getText();
		anioNaci = Integer.parseInt(txtAnioNacimiento.getText());
		pesoKilog = Double.parseDouble(txtPesoKilogramo.getText());
	
		// Procceso de cálculo
		
		// Salida de resultados 
		textArea.setText("DATOS INGRESADOS\n\n");
		textArea.append("Nombres y apellidos \t: " + nomApe + "\n" );
		textArea.append("Año de nacimiento \t: " + anioNaci + "\n");
		textArea.append("Peso en kilogramos \t: " + pesoKilog);
		
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		txtNombreApellido.setText("");
		txtAnioNacimiento.setText("");
		txtPesoKilogramo.setText("");
		textArea.setText("");
	}
}
