package loginSistema;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import recamaristaLogin.InicioRecamarista;
import recepcionLogin.InicioRecepcion;
import supervisorRecamaras.InicioSupervisor;

import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class LoginSys {

	private JFrame frameLogin;
	private JTextField campoUsuario;
	private JPasswordField campoPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSys window = new LoginSys();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.setResizable(false);
		frameLogin.getContentPane().setForeground(Color.GRAY);
		frameLogin.setTitle("SISTEMA DE LIMPIEZA DE CUARTOS");
		frameLogin.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frameLogin.setForeground(Color.BLACK);
		frameLogin.setBounds(200, 200, 500, 300);
		frameLogin.getContentPane().setLayout(null);
		
		JLabel welcome = new JLabel("BIENVENIDO AL SISTEMA");
		welcome.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		welcome.setBounds(135, 23, 276, 35);
		frameLogin.getContentPane().add(welcome);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		labelUsuario.setBounds(111, 97, 70, 14);
		frameLogin.getContentPane().add(labelUsuario);
		
		JLabel labelPassword = new JLabel("Contrase\u00F1a");
		labelPassword.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		labelPassword.setBounds(88, 122, 93, 14);
		frameLogin.getContentPane().add(labelPassword);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(191, 94, 160, 20);
		frameLogin.getContentPane().add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoPassword = new JPasswordField();
		campoPassword.setBounds(191, 119, 160, 20);
		frameLogin.getContentPane().add(campoPassword);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(Color.BLACK);
		btnEntrar.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrasena = campoPassword.getText();
				String usuario = campoUsuario.getText();
				
				if(contrasena.contains("procesos")&& usuario.contains("1212")) {
					campoPassword.setText(null);
					campoUsuario.setText(null);
					
				//	InicioSupervisor inicio = new InicioSupervisor();
					InicioSupervisor.main(null);
				}
				if(contrasena.contains("casita") && usuario.contains("2121"))
				{
				//	InicioRecamarista inicioRec = new InicioRecamarista();
					InicioRecamarista.main(null);
				}
				if(contrasena.contains("perro") && usuario.contains("8858"))
				{
					//InicioRecepcion inicioRp = new InicioRecepcion();
					InicioRecepcion.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta", "Error ingreso al sistema", JOptionPane.ERROR_MESSAGE);
					campoPassword.setText(null);
					campoUsuario.setText(null);
				}
			}
			}
		);
		btnEntrar.setBounds(261, 150, 96, 23);
		frameLogin.getContentPane().add(btnEntrar);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				campoUsuario.setText(null);
				campoPassword.setText(null);
			}
		});
		btnBorrar.setBounds(261, 184, 96, 23);
		frameLogin.getContentPane().add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(378, 238, 96, 23);
		frameLogin.getContentPane().add(btnSalir);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 220, 429, 7);
		frameLogin.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 51, 429, 7);
		frameLogin.getContentPane().add(separator_1);
	}
}
