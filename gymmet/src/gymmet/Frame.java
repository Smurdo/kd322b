package gymmet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(5, 32, 102, 81);
		contentPane.add(btnSpara);
		
		table = new JTable();
		table.setBounds(5, 5, 424, 16);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Joans", "9104043816", "lantmanagatan54", "0768061892", "priaten@hotmail.com"},
			},
			new String[] {
				"Namn", "Personummer", "Adress", "Telefon", "e-post"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.getColumnModel().getColumn(3).setPreferredWidth(77);
		table.getColumnModel().getColumn(4).setPreferredWidth(108);
		table.getColumnModel().getColumn(4).setMaxWidth(2147483646);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Frame.class.getResource("/images/h\u00E4mta.jpg")));
		lblNewLabel.setBounds(131, 32, 298, 220);
		contentPane.add(lblNewLabel);
	}
}
