package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_05.ArregloPrecios;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_5_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_5_2 frame = new Propuesto_5_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_5_2() {
		setTitle("Propuesto_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(45, 11, 95, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(176, 11, 95, 23);
		contentPane.add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		btnNewButton = new JButton("Generar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(317, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	ArregloPrecios ap = new ArregloPrecios();
	
	
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		//Listar
		txtS.setText("");
		for(int i = 0; i < ap.tamanio(); i++) {
			imprimir("n[" + i + "] :  " + ap.obtener(i));
		}
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		//Reporte
		imprimir("Cantidad de Precios\t\t\t: " + ap.tamanio());
		imprimir("Precio Promedio\t\t\t\t: " + ap.precioPromedio());
		imprimir("Precio Mayor\t\t\t\t: " + ap.precioMayor());
		imprimir("Precio Menor\t\t\t\t: " + ap.precioMenor());
		imprimir("Cantidad mayor o igual al promedio\t: " + ap.cantMayoresPrecioPromedio());
		imprimir("Cantidad menor al promedio\t\t: " + ap.cantMenoresPrecioPromedio());
		imprimir("Posición del primer precio mayor al segundo: " + ap.posPrimerPrecioMayorAlSegundo());
		imprimir("Posición del último precio menor al penultimo: " + ap.posUltimoPrecioMenorAlPenultimo());
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		//Generar
		ap.generarPrecios();
		imprimir();
		imprimir("Los precios han sido cambiadas. Click en [Listar]");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
}