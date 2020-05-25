import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class GUI {

	private JFrame frmReihenrechnerRgb;
	private JTextField texteingabe;
	

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmReihenrechnerRgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReihenrechnerRgb = new JFrame();
		frmReihenrechnerRgb.setFont(new Font("Ink Free", Font.BOLD, 12));
		frmReihenrechnerRgb.setTitle("ReihenRechner");
		frmReihenrechnerRgb.setBounds(100, 100, 450, 300);
		frmReihenrechnerRgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReihenrechnerRgb.getContentPane().setLayout(null);
		
		JLabel labelOp1 = new JLabel("Operant 1");
		labelOp1.setBounds(62, 50, 89, 55);
		frmReihenrechnerRgb.getContentPane().add(labelOp1);
		
		JLabel labelOp2 = new JLabel("Operand 2");
		labelOp2.setBounds(294, 51, 89, 52);
		frmReihenrechnerRgb.getContentPane().add(labelOp2);
		
		texteingabe = new JTextField();
		texteingabe.setBounds(174, 119, 89, 41);
		frmReihenrechnerRgb.getContentPane().add(texteingabe);
		texteingabe.setColumns(10);
		
		JButton btnNewButton = new JButton("\u00DCberpr\u00FCfen");
		btnNewButton.setBackground(new Color(0, 139, 139));
		btnNewButton.setForeground(new Color(178, 34, 34));
		btnNewButton.setBounds(174, 184, 89, 23);
		frmReihenrechnerRgb.getContentPane().add(btnNewButton);
		
		JLabel labelOperator = new JLabel("*");
		labelOperator.setFont(new Font("Tahoma", Font.PLAIN, 70));
		labelOperator.setBounds(197, 64, 38, 52);
		frmReihenrechnerRgb.getContentPane().add(labelOperator);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(75, 11, 293, 42);
		frmReihenrechnerRgb.getContentPane().add(lblNewLabel);
	}
}
