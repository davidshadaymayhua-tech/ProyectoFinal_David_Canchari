package www.cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class ejercicio1 {

	private JFrame frmMochila;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_4;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 window = new ejercicio1();
					window.frmMochila.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMochila = new JFrame();
		frmMochila.setTitle("Mochila");
		frmMochila.setBounds(100, 100, 450, 300);
		frmMochila.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMochila.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 10, 44, 12);
		frmMochila.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(10, 32, 44, 12);
		frmMochila.getContentPane().add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Porta", "Adidas", "Nike"}));
		comboBox.setBounds(103, 6, 96, 20);
		frmMochila.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(103, 29, 96, 18);
		frmMochila.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Proccesar");
		btnNewButton.setBounds(231, 6, 84, 20);
		frmMochila.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setBounds(231, 28, 84, 20);
		frmMochila.getContentPane().add(btnNewButton_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(425, 146, 1, 1);
		frmMochila.getContentPane().add(scrollPane);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(215, 252, 1, 1);
		frmMochila.getContentPane().add(scrollPane_1);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(405, 86, 1, 1);
		frmMochila.getContentPane().add(scrollPane_2);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(382, 211, 44, 0);
		frmMochila.getContentPane().add(scrollPane_3);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 54, 416, 199);
		frmMochila.getContentPane().add(scrollPane_4);
		
		textArea = new JTextArea();
		scrollPane_4.setViewportView(textArea);
	}
}
