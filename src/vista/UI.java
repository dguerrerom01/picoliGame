package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utiles.Constantes;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.BevelBorder;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JPanel panelCola;
	private JPanel panelBotones;
	private JPanel panelPila;
	private JPanel panelLista;
	protected UIBotones uibotones=new UIBotones();
	public UICola uicola = new UICola();

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {120, 160, 250, 0};
		gbl_contentPane.rowHeights = new int[] {120, 325, 55, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		panelCola = new JPanel();
		panelCola.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//panelCola.add(uicola.getPanel());
		GridBagConstraints gbc_panelCola = new GridBagConstraints();
		gbc_panelCola.gridheight = 3;
		gbc_panelCola.insets = new Insets(0, 0, 0, 5);
		gbc_panelCola.fill = GridBagConstraints.BOTH;
		gbc_panelCola.gridx = 0;
		gbc_panelCola.gridy = 0;
		contentPane.add(panelCola, gbc_panelCola);
		
		panelPila = new JPanel();
		panelPila.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelPila = new GridBagConstraints();
		gbc_panelPila.gridheight = 2;
		gbc_panelPila.insets = new Insets(0, 0, 5, 5);
		gbc_panelPila.fill = GridBagConstraints.BOTH;
		gbc_panelPila.gridx = 1;
		gbc_panelPila.gridy = 0;
		contentPane.add(panelPila, gbc_panelPila);
		
		//panelLista = new JPanel();
		panelLista = new ListaUI(Constantes.TAMANO_LISTA_LADO);
		panelLista.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelLista = new GridBagConstraints();
		gbc_panelLista.gridheight = 2;
		gbc_panelLista.insets = new Insets(0, 0, 5, 0);
		gbc_panelLista.fill = GridBagConstraints.BOTH;
		gbc_panelLista.gridx = 2;
		gbc_panelLista.gridy = 0;
		contentPane.add(panelLista, gbc_panelLista);
		
		panelBotones = new JPanel();
		//panelBotones.add(uibotones.getPanel());
		panelBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panelBotones = new GridBagConstraints();
		gbc_panelBotones.gridwidth = 2;
		gbc_panelBotones.fill = GridBagConstraints.BOTH;
		gbc_panelBotones.gridx = 1;
		gbc_panelBotones.gridy = 2;
		contentPane.add(panelBotones, gbc_panelBotones);
	}

}
