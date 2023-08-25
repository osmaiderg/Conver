package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JComboBox Opciones;
	private JLabel txtResultado;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Conversor ONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Conversor Moneda");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 24, 146, 27);
		contentPane.add(lblNewLabel);

		Opciones = new JComboBox();
		Opciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Opciones.setModel(new DefaultComboBoxModel(new String[] { "De Pesos a Dolares", "De pesos a Euros",
				"De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos",
				"De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos" }));
		Opciones.setBounds(22, 66, 172, 22);
		contentPane.add(Opciones);

		JLabel lblNewLabel_1 = new JLabel("Ingrese un Monto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(22, 99, 146, 32);
		contentPane.add(lblNewLabel_1);

		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtValor.setColumns(10);
		txtValor.setBounds(203, 108, 146, 20);
		contentPane.add(txtValor);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor2 = txtValor.getText();
				double valorNum = Double.parseDouble(valor2);

				double dolar = 3962.49;
				double euro = 4334.01;
				double libraEsterlina = 5023.17;
				double yenJapones = 27.7467;
				double wonCoreano = 3.02;

				double resultadoFinal = 0;

				DecimalFormat formatear = new DecimalFormat("0.00");

				if (Opciones.getSelectedIndex() == 0) {
					resultadoFinal = (valorNum / dolar);
					txtResultado.setText(formatear.format(resultadoFinal) + " Dolares");
				}

				if (Opciones.getSelectedIndex() == 1) {
					resultadoFinal = (valorNum / euro);
					txtResultado.setText(formatear.format(resultadoFinal) + " Euro");
				}

				if (Opciones.getSelectedIndex() == 2) {
					resultadoFinal = (valorNum / libraEsterlina);
					txtResultado.setText(formatear.format(resultadoFinal) + " Libra Esterlina");
				}

				if (Opciones.getSelectedIndex() == 3) {
					resultadoFinal = (valorNum / yenJapones);
					txtResultado.setText(formatear.format(resultadoFinal) + " Yen Japones");
				}

				if (Opciones.getSelectedIndex() == 4) {
					resultadoFinal = (valorNum / wonCoreano);
					txtResultado.setText(formatear.format(resultadoFinal) + " Won Coreano");
				}

				if (Opciones.getSelectedIndex() == 5) {
					resultadoFinal = (valorNum * dolar);
					txtResultado.setText(formatear.format(resultadoFinal) + " Pesos");
				}

				if (Opciones.getSelectedIndex() == 6) {
					resultadoFinal = (valorNum * euro);
					txtResultado.setText(formatear.format(resultadoFinal) + " Pesos");
				}
				
				if (Opciones.getSelectedIndex() == 7) {
					resultadoFinal = (valorNum * libraEsterlina);
					txtResultado.setText(formatear.format(resultadoFinal) + " Pesos");
				}
				
				if (Opciones.getSelectedIndex() == 8) {
					resultadoFinal = (valorNum * yenJapones);
					txtResultado.setText(formatear.format(resultadoFinal) + " Pesos");
				}
				
				if (Opciones.getSelectedIndex() == 9) {
					resultadoFinal = (valorNum * wonCoreano);
					txtResultado.setText(formatear.format(resultadoFinal) + " Pesos");
				}

			}
		});
		btnConvertir.setBounds(47, 158, 89, 23);
		contentPane.add(btnConvertir);

		txtResultado = new JLabel("0");
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResultado.setBounds(173, 156, 267, 27);
		contentPane.add(txtResultado);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(173, 218, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Osmaider\\Pictures\\aluraoracle.png"));
		lblNewLabel_2.setBounds(256, 0, 184, 93);
		contentPane.add(lblNewLabel_2);
	}
}
