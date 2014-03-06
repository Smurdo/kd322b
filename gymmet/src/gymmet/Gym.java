package gymmet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;

public class Gym extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gym frame = new Gym();
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
	public Gym() {
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(this, popupMenu);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenu mnSkrivUt = new JMenu("Skriv ut");
		mnArkiv.add(mnSkrivUt);
		
		JMenu mnAvsluta = new JMenu("Avsluta");
		mnArkiv.add(mnAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenu mnNyMedlem = new JMenu("Ny medlem");
		mnMedlem.add(mnNyMedlem);
		
		JMenu mnHittaMedlem = new JMenu("Hitta medlem");
		mnMedlem.add(mnHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenu mnOmProgrammet = new JMenu("Om programmet");
		mnHjlp.add(mnOmProgrammet);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Jonas", "9104043816", "skutsargatan 11B", "0763262322", "piraten@hotmail.com"},
				{"Klas", "9106068615", "lantmanagatan 54", "0708994575", "klaspower@hotmail.com"},
				{"Tobias", "8605152156", "nobelv\u00E4gen 12", "0701542584", "tobiasking@hotmail.com"},
				{"Erik", "9211051557", "amrialsgatan", "0765482637", "erik@hotmail.com"},
				{"Birgitta", "5707015864", "Bagaregatan 5", "0735112655", "birgitta-dickson@hotmail.com"},
			},
			new String[] {
				"Namn", "Personummer", "Adress", "Telefon", "e-post"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(97);
		table.getColumnModel().getColumn(4).setPreferredWidth(149);
		scrollPane.setViewportView(table);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
