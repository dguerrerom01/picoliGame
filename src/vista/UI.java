package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modelo.Colores;
import utiles.Constantes;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;

public class UI extends JFrame {

	private JPanel contentPane;
	private JPanel panelCola;
	private JPanel panelBotones;
	private JPanel panelPila;
	private JPanel panelLista;
	private JPanel panelBotonSeleccion;
	private JPanel panelMensaje;
	protected JLabel lblContenidoMensaje;
	private JPanel panelSeleccionBoton;
	protected LinkedList<JButton> botones;
	private JButton btnSeleccionarColor;
	private JButton btnBorrarColor;
	private JButton btnBarajarPilas;
	private JButton btnPedirColor;
	private JPanel panelPilaDos;
	private JPanel panelPilaUno;
	private JLabel lblMonedas;
	private JPanel panel;
	private JComboBox comboBox;
	private JButton btnOk;
	protected JProgressBar progressBarMonedas;
	protected JProgressBar progressBar;
	private JComboBox<Colores> comboPedir;
	private JComboBox<Colores> comboBorrar;

	public LinkedList<JButton> getBotones() {
		return botones;
	}

	public JLabel getLblMonedas() {
		return lblMonedas;
	}

	public void setLblMonedas(JLabel lblMonedas) {
		this.lblMonedas = lblMonedas;
	}

	public JPanel getPanelPilaDos() {
		return panelPilaDos;
	}

	public JPanel getPanelPilaUno() {
		return panelPilaUno;
	}

	public JPanel getPanelLista() {
		return panelLista;
	}

	public JPanel getPanelCola() {
		return panelCola;
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 120, 160, 250, 0 };
		gbl_contentPane.rowHeights = new int[] { 120, 233, 0, 55, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		panelCola = new JPanel();
		panelCola.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelCola = new GridBagConstraints();
		gbc_panelCola.gridheight = 3;
		gbc_panelCola.insets = new Insets(0, 0, 5, 5);
		gbc_panelCola.fill = GridBagConstraints.BOTH;
		gbc_panelCola.gridx = 0;
		gbc_panelCola.gridy = 0;
		contentPane.add(panelCola, gbc_panelCola);
		panelCola.setLayout(new BoxLayout(panelCola, BoxLayout.Y_AXIS));

		panelPila = new JPanel();
		panelPila.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelPila = new GridBagConstraints();
		gbc_panelPila.gridheight = 2;
		gbc_panelPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelPila.fill = GridBagConstraints.BOTH;
		gbc_panelPila.gridx = 1;
		gbc_panelPila.gridy = 0;
		contentPane.add(panelPila, gbc_panelPila);
		GridBagLayout gbl_panelPila = new GridBagLayout();
		gbl_panelPila.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelPila.rowHeights = new int[] { 0, 0 };
		gbl_panelPila.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelPila.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelPila.setLayout(gbl_panelPila);

		panelPilaUno = new JPanel();
		GridBagConstraints gbc_panelPilaUno = new GridBagConstraints();
		gbc_panelPilaUno.insets = new Insets(0, 0, 0, 5);
		gbc_panelPilaUno.fill = GridBagConstraints.BOTH;
		gbc_panelPilaUno.gridx = 1;
		gbc_panelPilaUno.gridy = 0;
		panelPila.add(panelPilaUno, gbc_panelPilaUno);
		panelPilaUno.setLayout(new BoxLayout(panelPilaUno, BoxLayout.Y_AXIS));

		panelPilaDos = new JPanel();
		GridBagConstraints gbc_panelPilaDos = new GridBagConstraints();
		gbc_panelPilaDos.insets = new Insets(0, 0, 0, 5);
		gbc_panelPilaDos.fill = GridBagConstraints.BOTH;
		gbc_panelPilaDos.gridx = 3;
		gbc_panelPilaDos.gridy = 0;
		panelPila.add(panelPilaDos, gbc_panelPilaDos);
		panelPilaDos.setLayout(new BoxLayout(panelPilaDos, BoxLayout.Y_AXIS));

		panelLista = new JPanel();
		panelLista.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelLista = new GridBagConstraints();
		gbc_panelLista.gridheight = 2;
		gbc_panelLista.insets = new Insets(0, 0, 5, 0);
		gbc_panelLista.fill = GridBagConstraints.BOTH;
		gbc_panelLista.gridx = 2;
		gbc_panelLista.gridy = 0;
		contentPane.add(panelLista, gbc_panelLista);
		panelLista.setLayout(new GridLayout(5, 5, 0, 0));

		progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.BOTH;
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 1;
		gbc_progressBar.gridy = 2;
		contentPane.add(progressBar, gbc_progressBar);
		progressBar.setMinimum(0);
		progressBar.setForeground(new Color(150, 30, 30));
		progressBar.setMaximum(Constantes.TAMANO_LISTA_LADO * Constantes.TAMANO_LISTA_LADO);

		progressBarMonedas = new JProgressBar();
		GridBagConstraints gbc_progressBarMonedas = new GridBagConstraints();
		gbc_progressBarMonedas.fill = GridBagConstraints.BOTH;
		gbc_progressBarMonedas.insets = new Insets(0, 0, 5, 0);
		gbc_progressBarMonedas.gridx = 2;
		gbc_progressBarMonedas.gridy = 2;
		contentPane.add(progressBarMonedas, gbc_progressBarMonedas);
		progressBarMonedas.setMinimum(0);
		progressBarMonedas.setForeground(new Color(83, 199, 59));
		progressBarMonedas.setMaximum(Constantes.CANTIDAD_MAX_MONEDAS);

		panelBotonSeleccion = new JPanel();
		GridBagConstraints gbc_panelBotonSeleccion = new GridBagConstraints();
		gbc_panelBotonSeleccion.insets = new Insets(0, 0, 5, 5);
		gbc_panelBotonSeleccion.fill = GridBagConstraints.BOTH;
		gbc_panelBotonSeleccion.gridx = 0;
		gbc_panelBotonSeleccion.gridy = 3;
		contentPane.add(panelBotonSeleccion, gbc_panelBotonSeleccion);
		panelBotonSeleccion.setLayout(new CardLayout(0, 0));

		panelSeleccionBoton = new JPanel();
		panelBotonSeleccion.add(panelSeleccionBoton, "panelSeleccion_Boton");
		panelSeleccionBoton.setLayout(new GridLayout(0, 1, 0, 0));

		btnSeleccionarColor = new JButton("Seleccionar Color");
		btnSeleccionarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (panelBotonSeleccion.getLayout());
				c.show(panelBotonSeleccion, "panelSeleccion_Combo");

			}
		});
		btnSeleccionarColor.setName("btnSeleccionarColor");
		panelSeleccionBoton.add(btnSeleccionarColor);

		panelBotones = new JPanel();
		panelBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelBotones = new GridBagConstraints();
		gbc_panelBotones.insets = new Insets(0, 0, 5, 0);
		gbc_panelBotones.gridwidth = 2;
		gbc_panelBotones.fill = GridBagConstraints.BOTH;
		gbc_panelBotones.gridx = 1;
		gbc_panelBotones.gridy = 3;
		contentPane.add(panelBotones, gbc_panelBotones);
		panelBotones.setLayout(new GridLayout(0, 5, 0, 0));

		btnPedirColor = new JButton("Pedir Color (x" + Constantes.PETICION_COLOR_MAX + ")");
		btnPedirColor.setName("btnPedirColor");

		panelBotones.add(btnPedirColor);
		comboPedir = new JComboBox<Colores>();
		panelBotones.add(comboPedir);
		addColores(comboPedir);
		
		btnBarajarPilas = new JButton("Barajar Pilas (x" + Constantes.PETICION_BARAJAR_MAX + ")");
		btnBarajarPilas.setName("btnBarajarPilas");
		panelBotones.add(btnBarajarPilas);

		btnBorrarColor = new JButton("Borrar Color (x" + Constantes.PETICION_BORRAR_MAX + ")");
		btnBorrarColor.setName("btnBorrarColor");
		panelBotones.add(btnBorrarColor);
		botones = new LinkedList<JButton>();
		botones.add(btnSeleccionarColor);

		panel = new JPanel();
		panelBotonSeleccion.add(panel, "panelSeleccion_Combo");
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		comboBox = new JComboBox<Object>();
		panel.add(comboBox);

		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) (panelBotonSeleccion.getLayout());
				c.show(panelBotonSeleccion, "panelSeleccion_Boton");
			}
		});
		panel.add(btnOk);
		btnOk.setName("btnOKSeleccion");
		botones.add(btnPedirColor);
		botones.add(btnBarajarPilas);
		botones.add(btnBorrarColor);

		comboBorrar = new JComboBox<Colores>();
		panelBotones.add(comboBorrar);
		addColores(comboBorrar);
		
		botones.add(btnOk);

		panelMensaje = new JPanel();
		GridBagConstraints gbc_panelMensaje = new GridBagConstraints();
		gbc_panelMensaje.gridwidth = 3;
		gbc_panelMensaje.fill = GridBagConstraints.BOTH;
		gbc_panelMensaje.gridx = 0;
		gbc_panelMensaje.gridy = 4;
		contentPane.add(panelMensaje, gbc_panelMensaje);
		GridBagLayout gbl_panelMensaje = new GridBagLayout();
		gbl_panelMensaje.columnWidths = new int[] { 89, 305, 0, 9, 0 };
		gbl_panelMensaje.rowHeights = new int[] { 14, 0 };
		gbl_panelMensaje.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelMensaje.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelMensaje.setLayout(gbl_panelMensaje);

		JLabel lblMensaje = new JLabel("Mensaje:");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.fill = GridBagConstraints.VERTICAL;
		gbc_lblMensaje.anchor = GridBagConstraints.EAST;
		gbc_lblMensaje.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensaje.gridx = 0;
		gbc_lblMensaje.gridy = 0;
		panelMensaje.add(lblMensaje, gbc_lblMensaje);

		lblContenidoMensaje = new JLabel("   ");
		GridBagConstraints gbc_lblContenidoMensaje = new GridBagConstraints();
		gbc_lblContenidoMensaje.insets = new Insets(0, 0, 0, 5);
		gbc_lblContenidoMensaje.fill = GridBagConstraints.VERTICAL;
		gbc_lblContenidoMensaje.anchor = GridBagConstraints.WEST;
		gbc_lblContenidoMensaje.gridx = 1;
		gbc_lblContenidoMensaje.gridy = 0;
		panelMensaje.add(lblContenidoMensaje, gbc_lblContenidoMensaje);

		JLabel lblTextMonedas = new JLabel("Monedas:");
		GridBagConstraints gbc_lblTextMonedas = new GridBagConstraints();
		gbc_lblTextMonedas.insets = new Insets(0, 0, 0, 5);
		gbc_lblTextMonedas.gridx = 2;
		gbc_lblTextMonedas.gridy = 0;
		panelMensaje.add(lblTextMonedas, gbc_lblTextMonedas);

		lblMonedas = new JLabel("0");
		GridBagConstraints gbc_lblMonedas = new GridBagConstraints();
		gbc_lblMonedas.gridx = 3;
		gbc_lblMonedas.gridy = 0;
		panelMensaje.add(lblMonedas, gbc_lblMonedas);
	}

	private void addColores(JComboBox<Colores> combo) {
		combo.addItem(Colores.rojo);
		combo.addItem(Colores.amarillo);
		combo.addItem(Colores.azul);
		combo.addItem(Colores.verde);
		combo.addItem(Colores.naranja);
	}

	public JComboBox<Colores> getComboPedir() {
		return comboPedir;
	}

	public JComboBox<Colores> getComboBorrar() {
		return comboBorrar;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

}
