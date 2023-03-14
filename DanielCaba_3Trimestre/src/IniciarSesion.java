
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;

public class IniciarSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static IniciarSesion vS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vS = new IniciarSesion();
					vS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESIÓN");
		lblNewLabel.setBackground(new Color(135, 206, 235));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(153, 102, 51));
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 30));
		lblNewLabel.setBounds(109, 26, 208, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo Electrónico:");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 84, 138, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(178, 86, 208, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre de Usuario:");
		lblNewLabel_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(35, 127, 138, 27);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 129, 208, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(35, 165, 138, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 167, 249, 20);
		contentPane.add(textField_2);
		
		Button button = new Button("COMENZAR");
		button.setForeground(new Color(139, 69, 19));
		button.setFont(new Font("Georgia", Font.BOLD, 15));
		button.setBackground(new Color(250, 250, 210));
		button.setBounds(163, 205, 107, 35);
		contentPane.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame= new Comenzar();
				frame.setVisible(true);
				vS.setVisible(false);
			}
		});
		
		
		
	}

}
