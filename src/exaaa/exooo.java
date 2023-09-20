package exaaa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exooo {

	private JFrame frmZignoZodiacal;
	private JTextField txtDia;
	private JTextField txtMes;
	private JButton btnCalc;
	private JButton btnBor;
	private JLabel lblFec;
	private JLabel lblZig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exooo window = new exooo();
					window.frmZignoZodiacal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public exooo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZignoZodiacal = new JFrame();
		frmZignoZodiacal.setTitle("Zigno zodiacal");
		frmZignoZodiacal.setBounds(100, 100, 557, 340);
		frmZignoZodiacal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZignoZodiacal.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(" D I A ");
		lblNewLabel.setBounds(53, 45, 46, 14);
		frmZignoZodiacal.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(" M E S");
		lblNewLabel_1.setBounds(53, 89, 46, 14);
		frmZignoZodiacal.getContentPane().add(lblNewLabel_1);

		txtDia = new JTextField();
		txtDia.setBounds(128, 45, 131, 14);
		frmZignoZodiacal.getContentPane().add(txtDia);
		txtDia.setColumns(10);

		txtMes = new JTextField();
		txtMes.setBounds(128, 89, 131, 14);
		frmZignoZodiacal.getContentPane().add(txtMes);
		txtMes.setColumns(10);

		btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dia = Integer.parseInt(txtDia.getText());
				int mes = Integer.parseInt(txtMes.getText());
				if ((dia > 20 && mes == 1) || (dia < 18 && mes == 2)) {
					lblZig.setText("Acuario");
					if (mes == 1) {
						lblFec.setText(dia + " Enero");
					}
					if (mes == 2) {
						lblFec.setText(dia + " Febrero");
					}
				} else if ((dia > 19 && mes == 2) || (dia <= 20 && mes == 3)) {
					lblZig.setText("Picis");
					if (mes == 2) {
						lblFec.setText(dia + " Febrero");
					}
					if (mes == 3) {
						lblFec.setText(dia + " Marzo");
					}
				} else if ((dia > 22 && mes == 12) || (dia <= 19 && mes == 1)) {
					lblZig.setText("Capricornio");
					if(mes==12) {
						lblFec.setText(dia+" Diciembre");
						}
						if(mes==1) {
							lblFec.setText(dia+" Enero");
							}
				} else if ((dia > 22 && mes == 11) || (dia <= 21 && mes == 12)) {
					lblZig.setText("Sagitario");
					if(mes==11) {
						lblFec.setText(dia+" Noviembre");
						}
						if(mes==12) {
							lblFec.setText(dia+" Diciembre");
							}
				} else if ((dia > 23 && mes == 10) || (dia <= 21 && mes == 11)) {
					lblZig.setText("Escorpio");
					if(mes==10) {
						lblFec.setText(dia+" Octubre");
						}
						if(mes==11) {
							lblFec.setText(dia+" Noviembre");
							}
				} else if ((dia > 23 && mes == 9) || (dia < 22 && mes == 10)) {
					lblZig.setText("Libra");
					if(mes==9) {
						lblFec.setText(dia+" Septiembre");
						}
						if(mes==10) {
							lblFec.setText(dia+" Octubre");
							}
				} else if ((dia > 23 && mes == 8) || (dia < 22 && mes == 9)) {
					lblZig.setText("Virgo");
					if(mes==8) {
						lblFec.setText(dia+" Agosto");
						}
						if(mes==9) {
							lblFec.setText(dia+" Septimbre");
							}
				} else if ((dia > 23 && mes == 7) || (dia < 22 && mes == 8)) {
					lblZig.setText("Leo");
					if(mes==7) {
						lblFec.setText(dia+" Julio");
						}
						if(mes==8) {
							lblFec.setText(dia+" Agosto");
							}
				} else if ((dia > 21 && mes == 6) || (dia < 22 && mes == 7)) {
					lblZig.setText("Cancer");
					if(mes==6) {
						lblFec.setText(dia+" Junio");
						}
						if(mes==7) {
							lblFec.setText(dia+" Julio");
							}
				} else if ((dia > 21 && mes == 5) || (dia < 20 && mes == 6)) {
					lblZig.setText("Geminis");
					if(mes==5) {
						lblFec.setText(dia+" Mayo");
						}
						if(mes==6) {
							lblFec.setText(dia+" Junio");
							}
				} else if ((dia > 20 && mes == 4) || (dia < 20 && mes == 5)) {
					lblZig.setText("Tauro");
					if(mes==4) {
						lblFec.setText(dia+" Abril");
						}
						if(mes==5) {
							lblFec.setText(dia+" Mayo");
							}
				} else if ((dia > 21 && mes == 3) || (dia < 19 && mes == 4)) {
					lblZig.setText("Aries");
					if(mes==3) {
						lblFec.setText(dia+" Marzo");
						}
						if(mes==4) {
							lblFec.setText(dia+" Abril");
							}
				}
			}
		});
		btnCalc.setBounds(38, 146, 101, 30);
		frmZignoZodiacal.getContentPane().add(btnCalc);

		btnBor = new JButton("Borrar");
		btnBor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDia.setText("");
				txtMes.setText("");
				lblZig.setText("");
				lblFec.setText("");
			}
		});
		btnBor.setBounds(162, 146, 101, 30);
		frmZignoZodiacal.getContentPane().add(btnBor);

		lblFec = new JLabel("    Fecha : ");
		lblFec.setBounds(51, 199, 208, 33);
		frmZignoZodiacal.getContentPane().add(lblFec);

		lblZig = new JLabel("     Zigno");
		lblZig.setBounds(53, 243, 208, 33);
		frmZignoZodiacal.getContentPane().add(lblZig);
	}
}
