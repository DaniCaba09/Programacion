import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiseñoLogin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	static DiseñoLogin vP;
	static DiseñoLogin vS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vP = new DiseñoLogin();
					vP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DiseñoLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 550, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRAR NUEVO USUARIO");
		lblNewLabel.setForeground(new Color(64, 128, 128));
		lblNewLabel.setBounds(94, 23, 345, 28);
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 23));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(70, 79, 107, 35);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(128, 86, 286, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 290, 274, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		lblNewLabel_2.setBounds(72, 141, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 138, 286, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_3 = new JLabel("Correo Electrónico:");
		lblNewLabel_3.setBounds(70, 187, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 184, 242, 20);
		contentPane.add(textField_2);
		
		lblNewLabel_4 = new JLabel("Teléfono:");
		lblNewLabel_4.setBounds(70, 244, 92, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 241, 286, 20);
		contentPane.add(textField_3);
		
		lblNewLabel_5 = new JLabel("Contraseña:");
		lblNewLabel_5.setBounds(70, 293, 72, 14);
		contentPane.add(lblNewLabel_5);
		
		Button button = new Button("Registrarse");
		button.setFont(new Font("Impact", Font.PLAIN, 18));
		button.setBackground(new Color(64, 128, 128));
		button.setBounds(219, 346, 107, 48);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(contentPane, "Se ha registrado en la web correctamente", "Registro de Usuario", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame= new IniciarSesion();
				frame.setVisible(true);
				vP.setVisible(false);
			}
		});
		btnIniciarSesion.setBackground(new Color(224, 255, 255));
		btnIniciarSesion.setFont(new Font("Impact", Font.ITALIC, 14));
		btnIniciarSesion.setBounds(383, 414, 120, 23);
		contentPane.add(btnIniciarSesion);
		
		
		
	}
}
