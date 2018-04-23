package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class UICola extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panelColaColores;
	private JButton btnSeleccionarColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UICola frame = new UICola();
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
	public UICola() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 152, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{307, 30, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		panelColaColores = new JPanel();
		GridBagConstraints gbc_panelColaColores = new GridBagConstraints();
		gbc_panelColaColores.fill = GridBagConstraints.VERTICAL;
		gbc_panelColaColores.insets = new Insets(0, 0, 5, 0);
		gbc_panelColaColores.gridx = 0;
		gbc_panelColaColores.gridy = 0;
		panel.add(panelColaColores, gbc_panelColaColores);
		panelColaColores.setLayout(new BoxLayout(panelColaColores, BoxLayout.Y_AXIS));
		
		JPanel panelBotonColores = new JPanel();
		GridBagConstraints gbc_panelBotonColores = new GridBagConstraints();
		gbc_panelBotonColores.fill = GridBagConstraints.BOTH;
		gbc_panelBotonColores.gridx = 0;
		gbc_panelBotonColores.gridy = 1;
		panel.add(panelBotonColores, gbc_panelBotonColores);
		panelBotonColores.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnSeleccionarColor = new JButton("Seleccionar Color");
		btnSeleccionarColor.setName("btnSeleccionarColor");
		panelBotonColores.add(btnSeleccionarColor);
	}

	public JPanel getPanelColaColores() {
		return panelColaColores;
	}
	
	public JButton getBtnSeleccionarColor() {
		return btnSeleccionarColor;
	}

	public JPanel getPanel() {
		return panel;
	}

}
