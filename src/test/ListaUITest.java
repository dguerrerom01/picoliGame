package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Game;
import modelo.Colores;
import utiles.Constantes;
import vista.ListaUI;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ListaUITest extends JFrame {
	
	//No funciona la prueba
	
	private JPanel contentPane;
	private Game game;
	private ListaUI listaUI;
	private ListaUITest Test = this;
	private JComboBox comboBox;

	public JComboBox getComboBox() {
		return comboBox;
	}

	public ListaUI getListaUI() {
		return listaUI;
	}

	public Game getGame() {
		return game;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaUITest frame = new ListaUITest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaUITest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JPanel ListaUI = new ListaUI(Constantes.TAMANO_LISTA_LADO);
		GridBagConstraints gbc_ListaUI = new GridBagConstraints();
		gbc_ListaUI.insets = new Insets(0, 0, 5, 0);
		gbc_ListaUI.fill = GridBagConstraints.BOTH;
		gbc_ListaUI.gridx = 0;
		gbc_ListaUI.gridy = 0;
		contentPane.add(ListaUI, gbc_ListaUI);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Hecho");
				new AccionListaUITest(Test);
				//Comprobar duplicados
				
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Colores.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 2;
		contentPane.add(btnAdd, gbc_btnAdd);
	}

	public void AgregaColor(ListaUI listaUI) {

	}

}
